/*
 * Model class
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/Model.java,v 1.1.1.1.4.2 2005/04/29 02:33:41 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: Model.java,v $
 * Revision 1.1.1.1.4.2  2005/04/29 02:33:41  vinoshan
 * *** empty log message ***
 *
 */

package lqnModel;

import java.util.*;
import java.io.*;
import lqnXML.*;

/**
 * A Layered Queueing Network.
 * <p>
 * Class Diagram Overview:
 * <p>
 * <IMG SRC = Model.gif>
 * <p>
 */
public class Model implements Serializable {
	/**
	 * Default print interval = 1
	 */
	public static final int DFL_VAL_INTERVAL = 1;

	/**
	 * Default relaxation = (float)0.9
	 */
	public static final float DFL_VAL_RELAXATION = (float) 0.9;

	/**
	 * Added by Jing Xu, Aug 03, 2006 Default convergence = (float)1e-06
	 */
	public static final float DFL_VAL_CONVERGENCE = (float) 1e-06;

	/**
	 * Added by Jing Xu, Aug 03, 2006 Default iteration = 100
	 */
	public static final int DFL_VAL_ITERATION = 100;

	/**
	 * Model comment
	 */
	private String comment;

	/**
	 * LQX String?
	 */
	public String lqxString;

	/**
	 * Iteration limit. Used by solver
	 */
	private Integer iteration;

	/**
	 * Intermediate result print interval. Used by solver
	 */
	private Integer interval;

	/**
	 * Under-relaxation coefficient. Used by solver.
	 */
	private Float relaxation;

	/**
	 * Convergence value. Used by solver.
	 */
	private Float convergence;

	/**
	 * Number of lowest layer in model.
	 */
	private int numberOfLayer;

	/**    */
	private String namePrefix; // the symbol that gets appended to all names

	/**
	 * Model processors.
	 * <p>
	 * Key: processor name, Value: processor object
	 * 
	 * @see Processor
	 */
	protected HashMap processors;

	/**
	 * Model tasks.
	 * <p>
	 * Key: task name. Value: task object
	 * 
	 * @see Task
	 */
	protected HashMap tasks;

	/**
	 * Model entries.
	 * <p>
	 * Key: entry name, Value: entry object
	 * 
	 * @see Entry
	 */
	protected HashMap entries;

	/**
	 * Model variables.
	 * <p>
	 * Variables are string objects.
	 */
	protected Vector variableList;

	/**
	 * Model variable mapping offset = 5000
	 */
	static final int VARLIST_OFFSET = 5000;

	// Nov. 23, 2003: for component based models list of Slots are needed.
	protected HashMap slotList;

	public boolean isSubModel; // Indicate if this model is a submodel or not

	// private SubModelInterface subInterface;
	private HashMap subParams;

	/**
	 * These Tasks are only here for the Layer view purpose. We are considering
	 * each Slots/ Sub-Models as dummy Tasks for display purpose only...
	 */
	private HashMap pseudoTasks;

	/**
	 * These Entries are only here for the Layer view purpose. We are
	 * considering each Ports (IN-Port and OUT-Port) of Slots/ Sub-Models as
	 * dummy Entries for display purpose only...
	 * 
	 */
	private HashMap pseudoEntries;

	private SubModel subM;

	public boolean results;

	/**
	 * Class constructor
	 */
	public Model() {
		processors = new HashMap();
		tasks = new HashMap();
		entries = new HashMap();
		slotList = new HashMap();
		isSubModel = false;
		results = false;
		subParams = null;
		setValues(DFL_VAL_CONVERGENCE, DFL_VAL_ITERATION, DFL_VAL_RELAXATION,
				DFL_VAL_INTERVAL);
		comment = new String();
		variableList = new Vector();
		namePrefix = new String();
		pseudoTasks = new HashMap();
		pseudoEntries = new HashMap();
		subM = null;
	}

	/**
	 * Sets values for the model attributes concerned with the solver
	 * 
	 * @param c
	 *            convergence
	 * @param i
	 *            iteration limit
	 * @param u
	 *            under-relaxation coefficient
	 * @param itrvl
	 *            intermediate print interval
	 */
	public void setValues(float c, int i, float u, int itrvl) {
		convergence = new Float(c);
		iteration = new Integer(i);
		interval = new Integer(itrvl);
		relaxation = new Float(u);
	}

	/**
	 * Sets model comment
	 * 
	 * @param s
	 *            model comment
	 */
	public void setComment(String s) {
		comment = new String(s);
	}

	public void setLqxString(String s) {
		lqxString = new String(s);
	}

	/**
	 * Gets model comment
	 * 
	 * @return model comment
	 */
	public String getComment() {
		return comment;
	}
	
	public String getLqxString() {
		return lqxString;
	}

	/**
	 * Sets solver iteration limit
	 * 
	 * @param limit
	 *            iteration limit
	 */
	public void setIterationLimit(int limit) {
		iteration = new Integer(limit);
	}

	/**
	 * Gets solver iteration limit
	 * 
	 * @return iteration limit
	 */
	public int getIterationLimit() {
		return iteration.intValue();
	}

	/**
	 * Sets solver print interval.
	 * 
	 * @param inter
	 *            print interval
	 */
	public void setPrintInterval(int inter) {
		interval = new Integer(inter);
	}

	/**
	 * Gets solver print interval.
	 * 
	 * @return print interval
	 */
	public int getPrintInterval() {
		return interval.intValue();
	}

	/**
	 * Sets solver convergence limit.
	 * 
	 * @param conv
	 *            convergence value
	 */
	public void setConvergence(float conv) {
		convergence = new Float(conv);
	}

	/**
	 * Gets solver convergence limit.
	 * 
	 * @return convergence limit
	 */
	public float getConvergence() {
		return convergence.floatValue();
	}

	/**
	 * Sets solver under-relaxation value
	 * 
	 * @param relax
	 *            under-relaxation value
	 */
	public void setRelaxation(float relax) {
		relaxation = new Float(relax);
	}

	/**
	 * Gets solver under-relaxation value.
	 * 
	 * @return under-relaxation value
	 */
	public float getRelaxation() {
		return relaxation.floatValue();
	}

	/**
	 * Gets the number of layers in model.
	 * 
	 * @return number of layers
	 */
	public int getNumberOfLayers() {
		return numberOfLayer;
	}

	public void setNumberOfLayer(int num) {
		numberOfLayer = num;
	}

	/**
	 * Gets the number of processors in model
	 * 
	 * @return number of processors
	 */
	public int getNumberProcessor() {
		return processors.size();
	}

	/**
	 * Gets the number of tasks in model
	 * 
	 * @return number of tasks
	 */
	public int getNumberTask() {
		return tasks.size();
	}

	/**
	 * Gets number of entries in model.
	 * 
	 * @return number of entries
	 */
	public int getNumberEntry() {
		return entries.size();
	}

	public int getNumOfSlots() {
		return slotList.size();
	}

	/**
	 * Sets the prefix identifier. It is used by parser to identify all names
	 * within this model. An underscore character is appended to the argument
	 * value. For example, if the passed value is "Example", the name prefix
	 * will become "Example_".
	 * 
	 * @param pre
	 *            the prefix value
	 */
	public void setNamePrefix(String pre) {
		if (pre != null && pre.length() > 0)
			namePrefix = new String(pre + String.valueOf('_'));
		else
			namePrefix = new String();
	}

	/**
	 * Gets the prefix identifier.
	 * 
	 * @return the name prefix
	 */
	public String getNamePrefix() {
		return new String(namePrefix);
	}

	/**
	 * Creates a new processor in this model
	 * 
	 * @param name
	 *            the name of the processor to be added
	 * @return the processor that is created in the model or <code>null</code>
	 *         if the model already contains a processor with the same name
	 */
	public Processor addProcessor(String name) {
		if (processors.containsKey(name))
			return null;
		else {
			Processor proc = new Processor(name);
			processors.put(proc.getName(), proc);
			return proc;
		}
	}

	/**
	 * Adds processor to this model
	 * 
	 * @param proc
	 *            the processor to be added
	 * @return <code>true</code> if the processor is added to the model or
	 *         <code>false</code> if the model already contains a processor
	 *         with the same name
	 */
	public boolean addProcessor(Processor proc) {
		if (processors.containsKey(proc.getName()))
			return false;
		else {
			processors.put(proc.getName(), proc);
			return true;
		}
	}

	/**
	 * Gets a processor from this model
	 * 
	 * @param name
	 *            the name of the processor
	 * @return the processor or <code>null</code> if the model does not
	 *         contain the processor
	 */
	public Processor getProcessor(String name) {
		return (Processor) processors.get(name);
	}

	/**
	 * Removes processor from this model. If any tasks use the processor, their
	 * processor is set to <code>null</code>
	 * 
	 * @param proc
	 *            the processor to be removed
	 */
	public void removeProcessor(Processor proc) {
		this.removeProcessor(proc.getName());
	}

	/**
	 * Removes processor from this model. If any tasks use the processor, their
	 * processor is set to <code>null</code>
	 * 
	 * @param name
	 *            the name of the processor to be removed
	 */
	public void removeProcessor(String name) {
		Processor proc = (Processor) processors.remove(name);
		if (proc != null) {
			Vector tasks = proc.getTasks();
			for (int i = 0; i < tasks.size(); i++) {
				((Task) tasks.elementAt(i)).setProcessor(null);
			}
		}
	}

	/**
	 * Creates a new task in this model.
	 * 
	 * @param name
	 *            the name of the task
	 * @return the task that is created in the model or <code>null</code> if
	 *         the model already contains a task with the same name
	 */
	public Task addTask(String name) {
		if (tasks.containsKey(name))
			return null;
		else {
			Task task = new Task(name);
			tasks.put(task.getName(), task);
			return task;
		}
	}

	/**
	 * Adds a task and all it's entries to this model.
	 * 
	 * @param tsk
	 *            the task
	 * @return <code>true</code> if task and all it's entries added to the
	 *         model or <code>false</code> if the model already contains a
	 *         task or enties with the same name
	 */
	public boolean addTask(Task tsk) {
		if (tasks.containsKey(tsk.getName()))
			return false;
		else {
			Vector entrs = tsk.getEntries();
			for (int i = 0; i < entrs.size(); i++) {
				if (entries.containsKey(((Entry) entrs.elementAt(i)).getName()))
					return false;
			}
			for (int i = 0; i < entrs.size(); i++)
				entries.put(((Entry) entrs.elementAt(i)).getName(),
						(Entry) entrs.elementAt(i));
			tasks.put(tsk.getName(), tsk);

			return true;
		}
	}

	/**
	 * Gets a task from this model.
	 * 
	 * @param name
	 *            the name of the task
	 * @return the task or <code>null</code> if the model does not contain the
	 *         task
	 */
	public Task getTask(String name) {
		return (Task) tasks.get(name);
	}

	/**
	 * Removes task and all its entries and activites from model. NOTE: Calls
	 * made from the task are not disconnected.
	 * 
	 * @param task
	 *            the task to be removed
	 */
	public void removeTask(Task task) {
		this.removeTask(task.getName());
	}

	/**
	 * Removes task and all its entries and activites from model. Calls from
	 * tasks are disconnected. If the task is the only task on its processor,
	 * the processor is also removed
	 * 
	 * @param name
	 *            the task name
	 */
	public void removeTask(String name) {
		Task task = (Task) tasks.remove(name);
		// if task removed clean up calls, entries, processor links
		if (task != null) {
			// remove task entries from model
			Vector entries = task.getEntries();
			for (int i = 0; i < entries.size(); i++) {
				Entry entr = (Entry) entries.elementAt(i);
				// 'disconnect' entry
				entr.disconnect();

				// remove entry from model
				this.entries.remove(entr.getName());
			}
			// 'disconnect' the calls made by task activities
			for (Iterator i = (task.getActivities().values()).iterator(); i
					.hasNext();) {
				Activity act = (Activity) i.next();
				act.disconnect();
			}
			// remove the task from its processor
			Processor taskProc = task.getProcessor();
			if (taskProc != null) {
				taskProc.removeTask(task);
				// remove the processor if there are no tasks associated with it
				/**
				 * J Xu TODO maybe we should leave the processor or ask the use
				 * wether would like to keep the processor or not, cause task
				 * maybe added to the processor later
				 */
				if (taskProc.getTasks().isEmpty())
					processors.remove(taskProc.getName());
			}
		}
	}

	/**
	 * Creates a new entry in this model
	 * 
	 * @param name
	 *            the name of the entry to be added
	 * @return the entry that is created in the model or <code>null</code> if
	 *         the model already contains an entry with the same name
	 */
	public Entry addEntry(String name) {
		if (entries.containsKey(name))
			return null;
		else {
			Entry entry = new Entry(name);
			entries.put(entry.getName(), entry);
			return entry;
		}
	}

	/**
	 * Check if a entry exisist in this model.
	 * 
	 * @param name
	 *            the name of the entry
	 * @return true or false wether the entry exists in the model or not
	 */
	public boolean checkEntry(String name) {
		return (boolean) entries.containsKey(name);
	}
	/**
	 * Gets an entry from this model.
	 * 
	 * @param name
	 *            the name of the entry
	 * @return the task or <code>null</code> if the model does not contain the
	 *         entry
	 */
	public Entry getEntry(String name) {
		return (Entry) entries.get(name);
	}

	/**
	 * Removes entry from model. NOTE: Calls are not disconnected.
	 * 
	 * @param entry
	 *            the entry to be removed
	 */
	public void removeEntry(Entry entry) {
		this.removeEntry(entry.getName());
	}

	/**
	 * Removes entry from model. Calls are disconnected.
	 * 
	 * @param name
	 *            the entry name
	 */
	public void removeEntry(String name) {
		Entry entr = (Entry) entries.remove(name);
		if (entr != null) {
			// diconnect calls
			entr.disconnect();
			// remove entry from task
			Task tsk = entr.getTask();
			tsk.removeEntry(entr);
		}
	}

	/**
	 * Combines all processors, tasks and entries of the sub-model with those of
	 * this model. NOTE: This model's processors, tasks or entries are replaced
	 * by the sub-model's if both objects are keyed with the same name.
	 * 
	 * @param subModel
	 *            the model to be added
	 */
	protected void mergeWith(Model subModel) {
		processors.putAll(subModel.getProcessors());
		tasks.putAll(subModel.getTasks());
		entries.putAll(subModel.getEntries());
	}

	/**
	 * Gets the collection of processors of this model
	 * 
	 * @return collect of this model's processors
	 * @see #processors
	 */
	public HashMap getProcessors() {
		return processors;
	}

	/**
	 * Gets the collection of tasks of this model.
	 * 
	 * @return collection of this model's tasks
	 * @see #tasks
	 */
	public HashMap getTasks() {
		return tasks;
	}

	/**
	 * Gets the collection of entries of this model.
	 * 
	 * @return collection of this model's entries
	 * @see #entries
	 */
	public HashMap getEntries() {
		return entries;
	}

	/**
	 * Converts the model object to LQNS input file format.
	 * 
	 * @return the LQNS input file format of the model
	 */
	public String toString() {
		String stringTask, stringProc, stringEntry, stringActivity;
		StringTokenizer st;
		StringBuffer sb;
		String s = new String();

		stringProc = new String();
		TreeMap sortedProcessors = new TreeMap(processors);
		for (Iterator i = (sortedProcessors.values()).iterator(); i.hasNext();) {
			Processor proc = (Processor) i.next();
			sb = new StringBuffer();
			st = new StringTokenizer(proc.toString(), " ", true);
			while (st.hasMoreTokens()) {
				s = st.nextToken();
				if (s.startsWith("-") && !s.equals("-1"))
					s = getVariable(s);
				sb.append(s);
			}
			stringProc = stringProc.concat(sb.toString()).concat("\n");
		}

		stringTask = new String();
		TreeMap sortedTasks = new TreeMap(tasks);
		for (Iterator i = (sortedTasks.values()).iterator(); i.hasNext();) {
			sb = new StringBuffer();
			st = new StringTokenizer(((Task) i.next()).toString(), " ", true);
			while (st.hasMoreTokens()) {
				s = st.nextToken();
				if (s.startsWith("-") && !s.equals("-1"))
					s = getVariable(s);
				sb.append(s);
			}
			stringTask = stringTask.concat(sb.toString()).concat("\n");
		}

		stringEntry = new String();
		TreeMap sortedEntries = new TreeMap(entries);
		for (Iterator i = (sortedEntries.values()).iterator(); i.hasNext();) {
			sb = new StringBuffer();
			st = new StringTokenizer(((Entry) i.next()).toString(), " \n", true);
			while (st.hasMoreTokens()) {
				s = st.nextToken();
				if (s.startsWith("-") && !s.equals("-1"))
					s = getVariable(s);
				sb.append(s);
			}
			stringEntry = stringEntry.concat(sb.toString());
		}

		stringActivity = new String();
		for (Iterator i = (sortedTasks.values()).iterator(); i.hasNext();) {
			Task task = (Task) i.next();
			if (task.hasActivities()) {
				stringActivity = stringActivity.concat("A " + task.getName()
						+ "\n");
				TreeMap sortedActs = new TreeMap(task.getActivities());
				for (Iterator j = (sortedActs.values()).iterator(); j.hasNext();) { // for
																					// each
																					// activity
																					// of
																					// that
																					// task
					sb = new StringBuffer();
					st = new StringTokenizer(((Activity) j.next()).toString(),
							" \n", true);
					while (st.hasMoreTokens()) {
						s = st.nextToken();
						if (s.startsWith("-") && !s.equals("-1"))
							s = getVariable(s);
						sb.append(s);
					}
					stringActivity = stringActivity.concat(sb.toString());
				}
				String actConn = new String(task.getActivityConnections());
				if (actConn.trim().length() != 0) {
					stringActivity = stringActivity.concat(":\n"
							+ task.getActivityConnections() + "\n");
				}
				stringActivity = stringActivity.concat("-1\n");
			}
		}
		String converStr = (new Float(getConvergence())).toString();
		String iterateStr = (new Integer(getIterationLimit())).toString();
		String printInterStr = (new Integer(getPrintInterval())).toString();
		String relaxStr = (new Float(getRelaxation())).toString();

		return new String("G\n" + "\"" + getComment() + "\"\n" + converStr
				+ "\n" + iterateStr + "\n" + printInterStr + "\n" + relaxStr
				+ "\n-1\n\nP " + (new Integer(0)).toString() + "\n"
				+ stringProc + "-1\n\nT " + (new Integer(0)).toString() + "\n"
				+ stringTask + "-1\n\nE " + (new Integer(0)).toString() + "\n"
				+ stringEntry + "-1\n\n" + stringActivity);

	}

	/**
	 * Casts string representation of an integer number to int type. Variable
	 * substitution may occur.
	 * 
	 * @param value
	 *            the number string to convert
	 * @exception NumberFormatException
	 *                when invalid number string given
	 * @return int value
	 */
	public int toInt(String value) throws NumberFormatException {
		int ret;
		if (value.trim().startsWith("$")) { // check to see if string is a
											// varaible
			String index = addToVariableList(value);
			ret = new Float(index).intValue();
		} else {
			try {
				ret = Integer.parseInt(value);
			} catch (NumberFormatException e) { // incorrect parameter format
				throw new NumberFormatException(
						"Positive integer or variable excepted (" + value + ")");
			}
			if (ret < 0)
				throw new NumberFormatException(
						"Positive integer or variable excepted (" + value + ")");
		}
		return ret;
	}

	/**
	 * Casts string representation of an float number to float type. Variable
	 * substitution may occur.
	 * 
	 * @param value
	 *            the float string to convert
	 * @exception NumberFormatException
	 *                when invalid number string given
	 * @return float value
	 */
	public float toFloat(String value) throws NumberFormatException {
		float ret;
		if (value.trim().startsWith("$")) { // check to see if string is a
											// variable
			String index = addToVariableList(value);
			ret = new Float(index).intValue();
		} else {
			value = value.toLowerCase();
			for (int i = 0; i < value.length(); i++)
				if (!((Character.isDigit(value.charAt(i))
						|| (value.charAt(i) == '.') || (value.charAt(i) == '-') || (value
						.charAt(i) == 'e'))))
					throw new NumberFormatException(
							"Positive float or variable excepted (" + value
									+ ")");
			ret = new Float(value).floatValue();
			if (ret < 0)
				throw new NumberFormatException(
						"Positive float or variable excepted (" + value + ")");
		}
		return ret;
	}

	/**
	 * Adds a variable to the variable list of this model. If variable has
	 * already been defined in the variable list for this model, the index of
	 * the original variable is returned.
	 * 
	 * @param var
	 *            variable to add
	 * @return the negative of the index into the variable list corresponding to
	 *         where the variable is stored.
	 */
	public String addToVariableList(String var) {
		if (!variableList.contains(var))
			variableList.addElement(new String(var));
		Integer index = new Integer(-1
				* (variableList.indexOf(var) + VARLIST_OFFSET)); // create
																	// negative
																	// index
		return index.toString();
	}

	/**
	 * Gets a variable from the variable list based on an index
	 * 
	 * @param index
	 *            the index of the variable. Always negative.
	 * @return the string representation of the variable corresponding to the
	 *         passed index value.
	 */
	public String getVariable(String index) {
		String var;
		int varIndex = new Float(index).intValue();
		varIndex = (-1 * varIndex) - VARLIST_OFFSET; // make into positive,
														// zero-based index
		if (varIndex < 0 || (varIndex > variableList.size() - 1)) // not a
																	// valid
																	// variable
																	// index
			var = new String();
		else
			var = (String) variableList.elementAt(varIndex);
		return var;
	}

	/**
	 * 
	 * @param aSlot
	 *            Slot
	 * @return boolean
	 */
	public boolean addSlot(Slot aSlot) {
		if (slotList.containsKey(aSlot.getID()))
			return false;
		slotList.put(aSlot.getID(), aSlot);
		return true;
	}

	/**
	 * 
	 * @param name
	 *            String
	 * @return boolean
	 */
	public boolean removeSlot(String name) {
		if (!slotList.containsKey(name))
			return false;
		slotList.remove(name);
		return true;
	}

	/**
	 * 
	 * @return boolean
	 */
	public boolean hasSlot() {
		return !(slotList.isEmpty());
	}

	/**
	 * 
	 * @return HashMap
	 */
	public HashMap getSlots() {
		return slotList;
	}

	/**
	 * 
	 * @return boolean
	 */
	public boolean isSubModel() {
		return isSubModel;
	}

	public SubModel getSubModel() {
		return subM;
	}

	public void setSubModel(SubModel inSubM) {
		subM = inSubM;
	}

	/**
	 * 
	 * @return HashMap
	 */
	public HashMap getSubParams() {
		return subParams;
	}

	public HashMap getPseudoTasks() {
		return pseudoTasks;
	}

	/**
	 * 1. Go through the subModel and create Two pseudo Tasks with <subModel
	 * name>_IN and <subModel name>_OUT. 2. Make the <subModel name>_IN as the
	 * Reference Task..With out this we can't Evaluate the Layer Numbers.. 3. Go
	 * Through the IN-PORTS and OUT-PORTS of the subModel and create pseudo
	 * Entries 4. Set-up the connection between the pseudo Entries and Tasks 5.
	 * Create EntryCalls for the port-connections..... and set them up with the
	 * Entries...
	 */
	public void createPseudosForSubModel() {
		if (subM == null)
			return;// do nothing
		Task inPoTask = new Task();
		inPoTask.setName(subM.getName() + "_INPorts_p");
		inPoTask.setScheduling('r');// This will be always firts in the layer
		inPoTask.setPseudo(true);// Make this Task as pseudo
		inPoTask.setWhatPseudoType(ModelNode.subModelPseudoType);
		inPoTask.setWhatPseudoType(ModelNode.subModelPseudoType);
		// add it to the Collection
		this.pseudoTasks.put(inPoTask.getName(), inPoTask);
		// Repeat the above steps for the out Ports....
		Task outPoTask = new Task();
		outPoTask.setName(subM.getName() + "_OUTPorts_p");
		outPoTask.setPseudo(true);
		outPoTask.setWhatPseudoType(ModelNode.subModelPseudoType);
		outPoTask.setWhatPseudoType(ModelNode.subModelPseudoType);
		this.pseudoTasks.put(outPoTask.getName(), outPoTask);
		// Now create the Entries for each Ports
		// These 2 while loops could be made into a single function.. do it
		// later....
		Iterator inPi = subM.getSubInterface().getInPorts().values().iterator();
		while (inPi.hasNext()) {
			Port inPo = (Port) inPi.next();
			Entry inEn = new Entry(inPo.getName());
			// set up the backward link
			inEn.setTask(inPoTask);
			inEn.setWhatPseudoType(ModelNode.subModelPseudoType);
			inPoTask.addEntry(inEn);
			inEn.setPseudo(true);
			inEn.setWhatPseudoType(ModelNode.subModelPseudoType);
			this.pseudoEntries.put(inEn.getName(), inEn);
			// We have to create the calls here....
			// Get the Destination Entry object

			Entry destEn = this.getEntry(inPo.getConnection());
			EntryCall ec = new EntryCall(inEn, destEn);
			try {
				inEn.addCallOut(ec, 1);
			} catch (Exception e) {
				Thread.dumpStack();
			}
		}// end of while for InPorts
		Iterator outPi = subM.getSubInterface().getOutPorts().values()
				.iterator();
		while (outPi.hasNext()) {
			Port outPo = (Port) outPi.next();
			Entry outEn = new Entry(outPo.getName());
			// set up the backward link
			outEn.setTask(outPoTask);
			outEn.setWhatPseudoType(ModelNode.subModelPseudoType);
			outPoTask.addEntry(outEn);
			outEn.setPseudo(true);
			outEn.setWhatPseudoType(ModelNode.subModelPseudoType);
			this.pseudoEntries.put(outEn.getName(), outEn);
			// We have to create the calls here....
			// Get the Destination Entry object
			Entry srcEntry = this.getEntry(outPo.getConnection());
			EntryCall ec = new EntryCall(srcEntry, outEn);
			try {
				srcEntry.addCallOut(ec, 1);
			} catch (Exception e) {
				// Do nothing
			}
		}
	}

	/**
	 * 1. Check if we have any slots in this model. 2. If we don't have any
	 * slots do nothing. 3. If we DO have slots, For each Slots: 1. Create a
	 * pseudo Task and set its type as "SlotPseudo" 2. For each Inport of this
	 * Slot: 1. Create a pseudo Entry 2. For the entry connection of this
	 * in-port create a call and set it up properly. 3. For each Outport of this
	 * Slot ... Do the same thing as in-port Note: we don't have to create a
	 * separate pseudo Call since we can easily find out wheather this call is
	 * pseudo or not by its source or destination. If the src or destination of
	 * a call is pseudo Node, then the call is a pseudo.
	 */
	public void createPseudosForAllSlots() {
		if (!this.hasSlot())
			return;
		Iterator iSlot = this.getSlots().values().iterator();
		while (iSlot.hasNext()) {
			Slot sl = (Slot) iSlot.next();
			Task sdt = new Task(sl.getID() + "_p");
			sdt.setPseudo(true);
			sdt.setWhatPseudoType(ModelNode.slotPseudoType);
			// get the interface and then ports
			Iterator iInPorts = sl.getSlotInterface().getInPorts().values()
					.iterator();
			while (iInPorts.hasNext()) {
				Port inPor = (Port) iInPorts.next();
				Entry inEntry = new Entry(inPor.getName() + "_InPort_p");
				inEntry.setPseudo(true);
				inEntry.setWhatPseudoType(ModelNode.slotPseudoType);
				// add this entry to the Task
				sdt.addEntry(inEntry);
				// now get the port connection, find the entry Create a Call
				if (inPor.getConnection() != null) {
					Entry srcEn = this.getEntry(inPor.getConnection());
					EntryCall inPortCall = new EntryCall(srcEn, inEntry);
					// setup the link
					try {
						srcEn.addCallOut(inPortCall, 1);
					} catch (Exception e) {
						// Do Nothing
					}
				}
			}
			Iterator iOutPorts = sl.getSlotInterface().getOutPorts().values()
					.iterator();
			while (iOutPorts.hasNext()) {
				Port outPort = (Port) iOutPorts.next();
				Entry outEntry = new Entry(outPort.getName() + "_OutPort_p");
				outEntry.setPseudo(true);
				outEntry.setWhatPseudoType(ModelNode.slotPseudoType);
				sdt.addEntry(outEntry);
				if (outPort.getConnection() != null) {
					Entry destEn = this.getEntry(outPort.getConnection());
					EntryCall outPortCall = new EntryCall(outEntry, destEn);
					// setup the link
					try {
						outEntry.addCallOut(outPortCall, 1);
					} catch (Exception e) {
						// Do Nothing
					}
				}
			}
			// add it to the pseudoTask HashMap
			pseudoTasks.put(sdt.getName(), sdt);
		}// end of while-Slot iterator
	}

	/***************************************************************************
	 * Added by Jing Xu, Aug 29, 2005***** fix the links between entries and
	 * phases, and between phases and calls
	 */
	public void fixLinks() {
		Iterator iEntries = entries.values().iterator();
		while (iEntries.hasNext()) {
			Entry en = (Entry) iEntries.next();
			en.fixLinks();
		}// end with entries loop
	}

	/** **************************************** */

	/***************************************************************************
	 * Added by Jing Xu, Dec 29, 2005** Rename a processor
	 */
	public Processor renameProcessor(String oldName, String newName)
			throws ObjectNotFoundException {
		Processor proc = null;
		// if newName exists, return null; else
		if (!processors.containsKey(newName)) {
			proc = (Processor) processors.remove(oldName);
			if (proc != null) {
				// if oldName exists, rename the processor
				proc.setName(newName);
				processors.put(newName, proc);
			} else {
				// if oldName doesn't exist, throw exception
				throw new ObjectNotFoundException("Processor not found:"
						+ oldName);
			}
		}
		return proc;
	}// end rename a processor

	/***************************************************************************
	 * Rename a task
	 */
	public Task renameTask(String oldName, String newName)
			throws ObjectNotFoundException {
		Task task = null;
		// if newName exists, return null; else
		if (!tasks.containsKey(newName)) {
			task = (Task) tasks.remove(oldName);
			if (task != null) {
				// if oldName exists, rename the task
				task.setName(newName);
				tasks.put(newName, task);
			} else {
				// if oldName doesn't exist, throw exception
				throw new ObjectNotFoundException("Task not found:" + oldName);
			}
		}
		return task;
	}

	/***************************************************************************
	 * Get all reference tasks in the model
	 * 
	 * @return reference tasks in a vector
	 */
	public Vector getRefTasks() {
		Vector refTasks = new Vector();
		Iterator iTasks = tasks.values().iterator();
		while (iTasks.hasNext()) {
			Task t = (Task) iTasks.next();
			if (t.getScheduling() == 'r') {
				refTasks.add(t);
			}
		}
		return refTasks;
	}

	/** * end added by Jing Xu ** */

	// Nikhil:Used to get the tree structure of the model
	public Vector getTreeModel()
	{
		Vector v = new Vector();
		String s = new String();
		boolean b;
		
		TreeMap sortedProcessors = new TreeMap(processors);
		for (Iterator i = (sortedProcessors.values()).iterator(); i.hasNext();)
		{
			Vector v1 = new Vector();
			Vector vt = new Vector();

			Processor proc = (Processor) i.next();
			s = proc.getName();
			v1.add(s);
			vt = proc.getTasks();
			// 	Add all the tasks to v1
			for(int j = 0; j<vt.size(); j++)
			{
				Vector v2 = new Vector();
				Vector ve = new Vector();
				
				Task tsk = (Task) vt.get(j);
				s = tsk.getName();
				b = tsk.isReferenceTask();
				v2.add(s);
				if (b) v2.add("Y"); else v2.add("N");
				
				ve = tsk.getEntries();
				// Add all the entries to v2
				for(int k = 0; k<ve.size(); k++)
				{
					Entry ent = (Entry) ve.get(k);
					s = ent.getName();
					v2.add(s);
				}
				
				v1.add(v2);
			}

			v.add(v1);
		}

		return v;
	}
	
//	 Nikhil:Used to get the task list of model

	public Vector getTaskList(String n)
	{
		Vector v = new Vector();

		TreeMap sortedTasks = new TreeMap(tasks);
		for (Iterator i = (sortedTasks.values()).iterator(); i.hasNext();)
		{
			Task t = (Task) i.next();
			String s = t.getName();
			
			if (s == n) continue;
			
			v.add(s);
		}

		return v;
	}

	public Vector getTaskList(String n, Vector l)
	{
		Vector v = new Vector();

		TreeMap sortedTasks = new TreeMap(tasks);
		for (Iterator i = (sortedTasks.values()).iterator(); i.hasNext();)
		{
			Task t = (Task) i.next();
			String s = t.getName();
			
			if (s == n) continue;
			if (l.contains(s)) continue;
			
			v.add(s);
		}

		return v;
	}

	//	 Nikhil:Used to get the entry list of model
	public Vector getEntryList1()
	{
		Vector v = new Vector();

		TreeMap sortedEntries = new TreeMap(entries);
		for (Iterator i = (sortedEntries.values()).iterator(); i.hasNext();)
		{
			Entry e = (Entry) i.next();
			Vector l = new Vector();
			String s = e.getName();
			l.add(s);

			Vector pl = e.getPhases();
			for(int j=0; j<pl.size(); j++)
			{
				Phase p = (Phase) pl.get(j);
				Vector c = p.getCallsOut();
				
				for(int k=0; k<c.size(); k++)
				{
					GenericCall g = (GenericCall) c.get(k);
					s= g.getDestinationName();
					l.add(s);
				}
			}
			
			v.add(l);
		}

		return v;
	}
	
	public Vector getEntryList2(Vector r)
	{
		Vector v = new Vector();
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		
		int q=0;
		TreeMap sortedEntries = new TreeMap(entries);
		for (Iterator i = (sortedEntries.values()).iterator(); i.hasNext();)
		{
			v1 = new Vector();
			Entry e = (Entry) i.next();
			String s = e.getName();
			v1.add(s);
			
			if (r.contains(s))
			{
				Vector pl = e.getPhases();
				for(int j=0; j<pl.size(); j++)
				{
					Phase p = (Phase) pl.get(j);
					Vector c = p.getCallsOut();
					
					v2 = new Vector();					
					GenericCall g = (GenericCall) c.get(0);
					v2.add(s);
					v2.add(g.getDestinationName());
					v1.add(v2);
				}
			}
			else
			{
				q=1;
				Vector pl = e.getPhases();
				for(int j=0; j<pl.size(); j++)
				{
					Phase p = (Phase) pl.get(j);
					Vector c = p.getCallsOut();
					
					for(int k=0; k<c.size(); k++)
					{
						v2 = new Vector();					
						GenericCall g = (GenericCall) c.get(k);
						String s1 = new String(s+"_"+q);					
						String s2 = g.getDestinationName();
						q++;
						v2.add(s1);
						v2.add(s2);
						v1.add(v2);
					}
				}
			}
			
			v.add(v1);
		}

		return v;
	}
	
}// end of Model Class

