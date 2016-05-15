package lqnModel;

import java.util.*;

public class EvaluateLayer {

	public static Vector pureServers = new Vector();

	public static Vector referenceTasks = new Vector();

	public static Vector clients = new Vector();

	private static Model model;

	/***************************************************************************
	 * Update layer properties for tasks, constructing a deeper tree, so that a
	 * callee task is always in a lower layer than its caller task, i.e. no task
	 * will call another task in the same layer
	 * 
	 * @param _model
	 */
	public static void updateDeeperTree(Model _model) {

		model = _model;
		HashMap tasks = model.getTasks();
		// Sub-Modle or Slot Related Pseudo Tasks.....
		model.createPseudosForAllSlots();
		if (model.getPseudoTasks() != null)
			tasks.putAll(model.getPseudoTasks());

		Iterator iterator = tasks.values().iterator();
		while (iterator.hasNext()) {
			Task task = (Task) iterator.next();
			task.setLayer(-1);
			if (task.isReferenceTask()) {
				referenceTasks.add(task);
			}
		}// end of while

		Enumeration enmReferenTasks = referenceTasks.elements();
		while (enmReferenTasks.hasMoreElements()) {
			Task referenceTask = (Task) enmReferenTasks.nextElement();
			traverseTree(referenceTask, 0);
		}

		// here handle all unhandled tasks
		tasks = model.getTasks();
		iterator = tasks.values().iterator();
		while (iterator.hasNext()) {
			Task task = (Task) iterator.next();
			if (task.getLayer() == -1) {
				traverseTree(task, 0);
			}
		}

		model.setNumberOfLayer(getNumberOfLayers() + 1);

	}

	private static void traverseTree(Task subRoot, int layerNum) {
		if (subRoot.getLayer() > layerNum) {
			return;
		} else {
			subRoot.setLayer(layerNum);
			Vector vecReceivers = EvaluateTask.getReceivingTasks(subRoot);
			Enumeration enmRecTasks = vecReceivers.elements();
			while (enmRecTasks.hasMoreElements()) {
				Task receivingTask = (Task) enmRecTasks.nextElement();
				traverseTree(receivingTask, layerNum + 1);
			}
		}

	}

	public static Model update(Model _model) {

		model = _model;
		HashMap tasks = model.getTasks();
		// Sub-Modle or Slot Related Pseudo Tasks.....
		model.createPseudosForAllSlots();
		if (model.getPseudoTasks() != null)
			tasks.putAll(model.getPseudoTasks());
		Iterator iterator = tasks.values().iterator();

		while (iterator.hasNext()) {
			Task task = (Task) iterator.next();
			task.setLayer(-1);
			if (task.isReferenceTask()) {
				referenceTasks.add(task);
			}

			else if (!EvaluateTask.isClient(task)) {
				pureServers.add(task);
			} else {
				clients.add(task);
			}
		}// end of while

		for (int index = 0; index < referenceTasks.size(); index++) {
			Task task = (Task) referenceTasks.elementAt(index);
			task.setLayer(0);
		}

		Enumeration enumeration = referenceTasks.elements();
		while (enumeration.hasMoreElements()) {
			Task referenceTask = (Task) enumeration.nextElement();
			Vector taskVector = EvaluateTask.getReceivingTasks(referenceTask);
			Enumeration enumeration1 = taskVector.elements();
			while (enumeration1.hasMoreElements()) {
				Task receivingTask = (Task) enumeration1.nextElement();
				if (receivingTask.getLayer() < 0) {
					update1Layer(receivingTask);
				}
			}
		}

		tasks = model.getTasks();
		iterator = tasks.values().iterator();
		while (iterator.hasNext()) {
			Task task = (Task) iterator.next();
			if (task.getLayer() == -1) {
				task.setLayer(0);
			}
		}

		model.setNumberOfLayer(getNumberOfLayers() + 1);
		return model;

	}

	// determines if there are tasks remaining
	public static boolean taskRemaining() {
		boolean result = false;

		HashMap tasks = model.getTasks();
		Iterator iterator = tasks.values().iterator();
		for (; iterator.hasNext();) {
			Task task = (Task) iterator.next();
			if (task.getLayer() == -1) {
				result = true;
				break;
			}
		}
		return result;
	}

	public static void updateTask(Task currentTask) {
		System.out.println(currentTask.getName() + " :>"
				+ currentTask.getLayer());
		if (taskRemaining()) {
			System.out.println("the tasks are remaining");
			Vector vector = EvaluateTask.getReceivingTasks(currentTask);
			System.out.println(currentTask.getName() + " has " + vector.size()
					+ " elements");
			if (vector.size() != 0) {

				for (int index = 0; index < vector.size(); index++) {
					Task task = (Task) vector.elementAt(index);
					System.out
							.println("EvaluateLayer::updateTask :> The destination task is "
									+ task.getName());
					if ((task.getLayer() <= currentTask.getLayer())
							&& (!task.isReferenceTask())) {
						task.setLayer(currentTask.getLayer() + 1);
						System.out
								.println("EvaluateLayer::updateTask :> The destination entry is "
										+ task.getName()
										+ " and is layer is "
										+ task.getLayer());
						// updateTask(task);
					} else {
						// updateTask(task);
					}
				}
			}
		}
		System.out.println(currentTask.getName() + " :>"
				+ currentTask.getLayer());
	}

	public static int getNumberOfLayers() {
		int result = 0;
		HashMap tasks = model.getTasks();
		Iterator iterator = tasks.values().iterator();
		for (; iterator.hasNext();) {
			Task task = (Task) iterator.next();
			if (task.getLayer() > result) {
				result = task.getLayer();
			}
		}
		return result;

	}

	public static int getLayer(Task currentTask) {

		Vector parents = new Vector();
		Vector entries = currentTask.getEntries();
		Enumeration enumeration = entries.elements();
		for (; enumeration.hasMoreElements();) {
			Entry entry = (Entry) enumeration.nextElement();
			Vector callers = entry.getCallers();
			// System.out.println("Num of callers for " +
			// currentTask.getName()+" "+entry.getName() +" "+ callers.size());
			for (int i = 0; i < callers.size(); i++) {
				Object object = callers.elementAt(i);
				if (object instanceof Entry) {
					Entry entryObject = (Entry) object;
					Task caller = entryObject.getTask();
					if (!parents.contains(caller)) {
						parents.add(caller);
					}
				} else if (object instanceof Activity) {
					Activity activityObject = (Activity) object;
					Task caller = activityObject.getTask();
					if (!parents.contains(caller)) {
						parents.add(caller);
					}
				}
			}// end of for loop
		}// end of for loop

		int layer = 0;
		// System.out.println("the parents vector size is "+parents.size()+"of
		// task "+currentTask.getName());
		for (int i = 0; i < parents.size(); i++) {
			Task task = (Task) parents.elementAt(i);
			if (task.getLayer() >= layer) {
				layer = task.getLayer() + 1;
			}
		}

		return layer;

	}

	public static void update1Layer(Task task) {
		// System.out.println("Entering the update1Layer method with task :>
		// "+task.getName()+" and layer "+task.getLayer());
		task.setLayer(getLayer(task));
		// System.out.println("After the getLayer(task) method the layer of task
		// :> "+task.getName()+" has been changed to "+task.getLayer());
		Vector tasks = EvaluateTask.getReceivingTasks(task);
		Enumeration enumeration1 = tasks.elements();
		while (enumeration1.hasMoreElements()) {
			Task receivingTask = (Task) enumeration1.nextElement();
			if (receivingTask.getLayer() < 0) {
				// System.out.println("Doing recursive function on the receiving
				// task :>"+receivingTask.getName()+" and its layer is "+
				// receivingTask.getLayer());
				update1Layer(receivingTask);
				// System.out.println("The update on the receiving task :>
				// "+receivingTask.getName()+" is done and its layer is
				// "+receivingTask.getLayer());
			}
		}
	}

	public static void pureClients(Task task) {
		task.setLayer(0);
	}

}
