package lqnModel;

import java.util.*;

public class EvaluateTask {

	public static boolean isClient(Task task) {
		Vector entries = task.getEntries();
		HashMap activities = task.getActivities();
		boolean result = false;

		for (Enumeration e = entries.elements(); e.hasMoreElements();) {
			Entry entry = (Entry) e.nextElement();
			result = makesCall(entry);
			if (result == true) {
				break;
			}
		}

		if (!result) {
			for (Iterator iterator = activities.values().iterator(); iterator
					.hasNext();) {
				Activity activity = (Activity) iterator.next();
				result = makesCall(activity);
				if (result == true) {
					break;
				}
			}
		}

		return result;

	}

	public static boolean makesCall(Object object) {
		boolean result = false;

		if (object instanceof Entry) {
			Entry entry = (Entry) object;
			if (entry.getNumberOfCalls() == 0) {
				result = false;
			} else {
				result = true;
			}

		}

		else if ((object instanceof Activity) && (result == false)) {
			Activity activity = (Activity) object;
			Vector vector = activity.getCallsOut();
			if (vector.size() == 0) {
				result = false;
			} else {
				result = true;
			}

		}
		return result;
	}

	// Here what you need to add is that you receive the Calls vector
	// both from the entry and the activity
	// and if not already in the vector add the task
	public static Vector getReceivingTasks(Task task) {
		Vector returnVector = new Vector();

		Vector entries = task.getEntries();
		HashMap activities = task.getActivities();
		// boolean result = false;

		for (Enumeration e = entries.elements(); e.hasMoreElements();) {
			Entry entry = (Entry) e.nextElement();
			Vector phases = entry.getPhases();
			for (Enumeration e1 = phases.elements(); e1.hasMoreElements();) {
				Phase phase = (Phase) e1.nextElement();
				Vector calls = phase.getCallsOut();
				for (Enumeration e2 = calls.elements(); e2.hasMoreElements();) {
					GenericCall call = (GenericCall) e2.nextElement();
					Entry entry1 = call.getDestination();
					Task destinationTask = entry1.getTask();
					// System.out.println("EvaluateTask::getReceivingTask :> The
					// destination task is "+ destinationTask.getName());
					if (!returnVector.contains(destinationTask)) {

						returnVector.add(destinationTask);
					}
				}

			}
		}

		for (Iterator iterator = activities.values().iterator(); iterator
				.hasNext();) {
			Activity activity = (Activity) iterator.next();
			Vector calls = activity.getCallsOut();
			for (Enumeration e2 = calls.elements(); e2.hasMoreElements();) {
				GenericCall call = (GenericCall) e2.nextElement();
				Entry entry1 = call.getDestination();
				Task destinationTask = entry1.getTask();
				if (!returnVector.contains(destinationTask)) {
					returnVector.add(destinationTask);
				}
			}

		}

		return returnVector;

	}

}
