/*
 * Task class
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/Task.java,v 1.2.4.2 2005/04/29 02:33:42 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: Task.java,v $
 * Revision 1.2.4.2  2005/04/29 02:33:42  vinoshan
 * *** empty log message ***
 *
 *
 */

package lqnModel;

import java.util.*;
// DOM
import org.w3c.dom.*;

/**
 * A task entity in a Layered Queueing Network.
 * <p>
 * <IMG SRC = Task.gif>
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class Task extends ModelNode {

	/**
	 * Fan-In and Fan-Out Task Names and Values
	 */
	public Vector FanInName = new Vector();
	public Vector FanInValue = new Vector();

	public Vector FanOutName = new Vector();
	public Vector FanOutValue = new Vector();

	/**
	 * Default priority = 0
	 */
	public static final int DFL_VAL_PRIORITY = 0;

	/**
	 * Default thinktime = 0
	 */
	public static final float DFL_VAL_THINKTIME = 0;

	/**
	 * Default multiplicity = 1
	 */
	public static final int DFL_VAL_MULTISERVER = 1;

	/**
	 * Default replication factor = 1
	 */
	public static final int DFL_VAL_REPLICA = 1;

	/**
	 * Default scheduling type = f (FIFO)
	 */
	public static final char DFL_VAL_SCHEDULING = 'f';

	/**
	 * Processor of this task
	 */
	private Processor proc; // Reference to processor

	/**
	 * Scheduling type.
	 * <p>
	 * r=reference task, n=non reference task, h=head of line, f=FIFO
	 * scheduling, p=polled scheduling at entries, b=bursty reference,
	 * i=infinite multiserver
	 */
	private char scheduling;

	/**
	 * Task priority.
	 */
	private Integer priority;

	/**
	 * Number of servers (multiplicity).
	 * <p>
	 * 0 for infinite
	 */
	private Integer multiServer;
	private String  multiServerString;

	/**
	 * Number of replications.
	 */
	private Integer replica;

	/**
	 * Task thinking time.
	 */
	private Float thinkTime;

	/**
	 * Layer of this task within the LQN model.
	 */
	private int layer;

	/**
	 * List of this task's entries.
	 * 
	 * @see Entry
	 */
	private Vector entries;

	/**
	 * Collection of activities that run in this task.
	 * <p>
	 * Key: activity's name, Value: activity object
	 * 
	 * @see Activity
	 */
	private HashMap activities;

	/**
	 * Precedence order of this task's activities.
	 */
	private String activityConnections;

	private BottleNeckStrength BNS;

	/**
	 * Added by Jing Xu, Feb 24, 2007 Max limitation for multi sever Defalut: 0
	 * means no limit
	 */
	private int multiServerLimit = 0;

	/**
	 * Added by Jing Xu, April 2007 required minimum throghput Defalut:0 means
	 * no limit
	 */
	private double minThroughput = 0;

	public double getMinThroughput() {
		return minThroughput;
	}

	public void setMinThroughput(double min_throughput) {
		this.minThroughput = min_throughput;
	}

	/**
	 * Added by Jing Xu, April 2007 Max limitation for replicas Defalut:0 means
	 * no limit
	 */
	private int replicaLimit = 0;

	public int getReplicaLimit() {
		return replicaLimit;
	}

	public void setReplicaLimit(int replicaLimit) {
		this.replicaLimit = replicaLimit;
	}

	/**
	 * Default class constructor
	 */
	public Task() {
		this("", DFL_VAL_SCHEDULING, null, DFL_VAL_PRIORITY, DFL_VAL_THINKTIME,	Integer.toString(DFL_VAL_MULTISERVER), DFL_VAL_REPLICA);
	}

	/**
	 * Class constructor
	 * 
	 * @param name
	 *            the task name
	 */
	public Task(String name) {
		this(name, DFL_VAL_SCHEDULING, null, DFL_VAL_PRIORITY, DFL_VAL_THINKTIME, Integer.toString(DFL_VAL_MULTISERVER), DFL_VAL_REPLICA);
	}

	/**
	 * Class constructor
	 * 
	 * @param name
	 *            name
	 * @param r
	 *            scheduling type
	 * @param p
	 *            processor
	 * @param pri
	 *            priority
	 * @param think
	 *            think time
	 * @param mul
	 *            multiplicity
	 * @param rep
	 *            replication factor
	 */
	public Task(String name, char r, Processor p, int pri, float think,	String mul, int rep) {
		entries = new Vector();
		activities = new HashMap();
		setValues(name, r, p, pri, think, mul, rep);
		activityConnections = new String("");
		BNS = null;
		super.resultsNode = null;
		FanInName.clear();
		FanInValue.clear();
		FanOutName.clear();
		FanOutValue.clear();
	}

	/**
	 * Set values for the attributes of this task.
	 * 
	 * @param ident
	 *            name
	 * @param r
	 *            scheduling type
	 * @param p
	 *            processor
	 * @param pri
	 *            priority
	 * @param think
	 *            think time
	 * @param mul
	 *            multiplicity
	 * @param rep
	 *            replication rate
	 */
	public void setValues(String ident, char r, Processor p, int pri,
			float think, String mul, int rep) {
		id = new String(ident);
		scheduling = r;
		proc = p;
		priority = new Integer(pri);
		replica = new Integer(rep);
		thinkTime = new Float(think);
		
		
		multiServerString = new String(mul);

		try
		{
			multiServer = new Integer(multiServerString);
		}
		catch(Exception e)
		{
			multiServer = new Integer(-1);
		}
	}

	/**
	 * Sets the processor.
	 * 
	 * @param p
	 *            the processor
	 */
	public void setProcessor(Processor p) {
		proc = p;
	}

	/**
	 * Gets the processor
	 * 
	 * @return the processor
	 */
	public Processor getProcessor() {
		return proc;
	}

	/**
	 * Sets the scheduling type.
	 * 
	 * @param sched
	 *            the scheduling type
	 */
	public void setScheduling(char sched) {
		scheduling = sched;
	}

	/**
	 * Gets the scheduling type
	 * 
	 * @return the scheduling type
	 */
	public char getScheduling() {
		return scheduling;
	}

	/**
	 * Sets the priority.
	 * 
	 * @param pri
	 *            the priority
	 */
	public void setPriority(int pri) {
		priority = new Integer(pri);
	}

	/**
	 * Gets the priority
	 * 
	 * @return the priority
	 */
	public int getPriority() {
		return priority.intValue();
	}

	/**
	 * Sets the multiplicity factor
	 * 
	 * @param multi
	 *            the multiplicity factor
	 */
	public void setMultiServer(String multi) {

		multiServerString = new String(multi);
		
		try
		{
			multiServer = new Integer(multiServerString);
		}
		catch(Exception e)
		{
			multiServer = new Integer(-1);
		}
		return;
	}

	/**
	 * Gets the multiplicity factor.
	 * 
	 * @return the multiplicity factor
	 */
	public String getMultiServer() {
		//return multiServer.intValue();
		return multiServerString;
	}

	public int getMultiServerNum() {
		return multiServer.intValue();
	}

	/**
	 * Sets the replication factor.
	 * 
	 * @param repli
	 *            the replicatin factor
	 */
	public void setReplication(int repli) {
		replica = new Integer(repli);
	}

	/**
	 * Gets the replication factor.
	 * 
	 * @return the replication factor
	 */
	public int getReplication() {
		return replica.intValue();
	}

	/**
	 * Sets the think time.
	 * 
	 * @param tt
	 *            the think time
	 */
	public void setThinkTime(float tt) {
		thinkTime = new Float(tt);
	}

	/**
	 * Gets the think time
	 * 
	 * @return the think time
	 */
	public float getThinkTime() {
		return thinkTime.floatValue();
	}

	/**
	 * Sets the layer of this task in the LQN model.
	 * 
	 * @param l
	 *            the layer value
	 */
	public void setLayer(int l) {
		layer = l;
	}

	/**
	 * Gets the layer of this task in the LQN model.
	 * 
	 * @return the layer value
	 */
	public int getLayer() {
		return layer;
	}

	/**
	 * Sets this task's entries to the passed vector of entries
	 * 
	 * @param ent
	 *            a collection of entries
	 * @see #entries
	 */
	public void setEntries(Vector ent) {
		entries = ent;
	}

	/**
	 * Gets the collection of entries of this task.
	 * 
	 * @return entries of this task
	 * @see #entries
	 */
	public Vector getEntries() {
		return entries;
	}

	/*
	 * Gets the entry object when an entry's name is given. return null if the
	 * entry is not found.
	 */
	public Entry getEntry(String entName) {
		Iterator eI = entries.iterator();
		while (eI.hasNext()) {
			Entry e = (Entry) eI.next();
			if (e.getName().equals(entName))
				return e;
		}
		return null;
	}

	/**
	 * Sets this task's activities to the passed hashmap of activities
	 * 
	 * @param act
	 *            hashmap of activities
	 * @see #activities
	 */
	public void setActivities(HashMap act) {
		activities = act;
	}

	public void setAllActivities(HashMap act) {
		activities = act;
		Iterator i = act.values().iterator();
		while (i.hasNext()) {
			Activity a = (Activity) i.next();
			a.setTask(this);
		}
	}

	public void addActivity(Activity anAct) {
		activities.put(anAct.getName(), anAct);
	}

	/**
	 * Gets this task's collection of activities
	 * 
	 * @return this task's activities
	 * @see #activities
	 */
	public HashMap getActivities() {
		return activities;
	}

	/**
	 * Sets this task's activity precedences.
	 * 
	 * @param actConn
	 *            the activity precedences
	 */
	public void setActivityConnections(String actConn) {
		activityConnections = new String(actConn);
	}

	/**
	 * Gets this task's activity precedences.
	 * 
	 * @return this task's activity precedences
	 */
	public String getActivityConnections() {
		return activityConnections;
	}

	/**
	 * Tests this tasks for presence of activities.
	 * 
	 * @return <code>true</code> if task has activities, <code>false</code>
	 *         otherwise.
	 */
	public boolean hasActivities() {
		return (activities.size() != 0);
	}

	/**
	 * Tests if task has any entries.
	 * 
	 * @return <code>true</code> if task has at least one entry,
	 *         <code>false</code> otherwise
	 */
	public boolean hasNoEntries() {
		return entries.isEmpty();
	}

	/**
	 * Tests that task has a particular entry.
	 * 
	 * @param entr
	 *            entry to be found
	 * @return <code>true</code> if task contains entry, <code>false</code>
	 *         otherwise
	 */
	public boolean containsEntry(Entry entr) {
		return entries.contains(entr);
	}

	/**
	 * Test if task is a reference task. A reference task is either a task with
	 * scheduling set to 'r' or has one or more entries that have open arrival
	 * rates.
	 * 
	 * @return <code>true</code> if task is reference task, <code>false</code>
	 *         otherwise
	 */
	public boolean isReferenceTask() {
		for (int i = 0; i < entries.size(); i++)
			if (((Entry) entries.elementAt(i)).getArrivalRate() > Entry.DFL_VAL_ARRIVALRATE)
				return true;
		return (scheduling == 'r');
	}

	/**
	 * Adds an entry to this task's collection of entries. Entry is notified
	 * that it is on this task. If task already contains entry, it is not added.
	 * 
	 * @param entr
	 *            entry to be added
	 */
	public void addEntry(Entry entr) {
		if (!entries.contains(entr)) {
			if (entries.add(entr))
				entr.setTask(this);
		}
		// updateLayer(model); // compute the layer of this task
	}

	/**
	 * Removes an entry from this task. If this task does not contain the entry,
	 * nothing happens
	 * 
	 * @param ent
	 *            entry to be removed
	 */
	public void removeEntry(Entry ent) {
		this.entries.remove(ent);
	}

	/**
	 * Removes an entry from this task. If this task does not contain entry,
	 * nothing happens.
	 * 
	 * @param name
	 *            the name of the entry
	 */
	public void removeEntry(String name) {
		for (int i = 0; i < entries.size(); i++) {
			Entry ent = (Entry) entries.elementAt(i);
			if (ent.getName() == name) {
				entries.remove(ent);
			}
		}
	}

	/**
	 * Removes all entries from this task. Each entry is notified to set it's
	 * task to null.
	 */
	public void removeAllEntries() {
		for (Enumeration e = entries.elements(); e.hasMoreElements();) {
			Entry ent = (Entry) e.nextElement();
			if (entries.remove(ent))
				ent.setTask(null);
		}
	}

	// public boolean isActivityNameUnique(String name){
	// return !activities.containsKey(name);
	// }

	// public void changeActivityKey(String oldKey, String newKey){

	// }

	/**
	 * Gets activity from this task. If an activity with the passed name
	 * parameter is not in the task, a new activity is created and added to the
	 * task.
	 * 
	 * @param name
	 * @return the requested activity
	 */
	public Activity getActivity(String name) {
		if (activities.containsKey(name))
			return (Activity) activities.get(name);
		else {
			Activity act = new Activity(name, this);
			activities.put(act.getName(), act);
			return act;
		}
	}

	/**
	 * Removes an activity from this task. If this task does not contain the
	 * activity, nothing happens.
	 * 
	 * @param act
	 *            the activity
	 */
	public void removeActivity(Activity act) {
		this.removeActivity(act.getName());
	}

	/**
	 * Removes an activity from this task. If this task does not contain the
	 * activity, nothing happens.
	 * 
	 * @param name
	 *            the name of the activity
	 */
	public void removeActivity(String name) {
		Activity act = (Activity) activities.remove(name);
		if (act != null)
			act.removeAllCallsOut();
	}

	/**
	 * Removes all the activities from this task. For each activity, all called
	 * entries are notified that the activity makes no calls to it.
	 */
	public void removeAllActivities() {
		for (Iterator i = (activities.values()).iterator(); i.hasNext();) {
			((Activity) i.next()).removeAllCallsOut();
		}
		activities.clear();
	}

	/**
	 * Converts this task object to LQNS file format text representation.
	 * 
	 * @return the LQNS file format text of this task
	 */

	public String toString() {
		String entryList, thinkFlag, priorityFlag, multiServerFlag, replicationFlag, quantumFlag;
		String processor = new String();
		int i;

		entryList = new String();
		for (i = 0; i < entries.size(); i++)
			entryList = entryList.concat(((Entry) entries.elementAt(i))
					.getName()
					+ " ");
		if (proc != null)
			processor = proc.getName();
		if (priority.intValue() == DFL_VAL_PRIORITY)
			priorityFlag = new String();
		else
			priorityFlag = new String(priority.toString());
		if (multiServer.intValue() == 0)
			multiServerFlag = new String(" i");
		else if (multiServer.intValue() == DFL_VAL_MULTISERVER)
			multiServerFlag = new String();
		else
			multiServerFlag = new String(" m " + multiServer.toString());
		if (replica.intValue() == DFL_VAL_REPLICA)
			replicationFlag = new String();
		else
			replicationFlag = new String(" r " + replica.toString());
		if (thinkTime.floatValue() == DFL_VAL_THINKTIME)
			thinkFlag = new String();
		else
			thinkFlag = new String(" z " + thinkTime.toString());
		return "t " + id + " " + scheduling + " " + entryList + " -1 "
				+ processor + " " + priorityFlag + thinkFlag + multiServerFlag
				+ replicationFlag;
	}

	// Stuff below is only SAMEtool specific

	public Entry getRightEntry(int starterTime) {
		Entry result = (Entry) entries.elementAt(0);

		for (int i = 0; i < entries.size(); i++) {
			if (i == 0) {
				result = (Entry) entries.elementAt(i);
			}

			Entry E1 = (Entry) entries.elementAt(i);

			if ((starterTime >= E1.getTimeCreated())
					&& (E1.getTimeCreated() > result.getTimeCreated())) {
				result = E1;
			}
		}

		if (starterTime < result.getTimeCreated()) {
			return null;
		}

		return result;
	}

	public int getNumOfEntries() {
		return entries.size();
	}

	public int getNumOfActivities() {
		return activities.size();
	}

	/*
	 * Method Name: getEntriesWithStartActivity This method will return a
	 * collection of entries that have start activity. precondition: NONE Input:
	 * NONE Output: Vector with Entry objects
	 */

	public Vector getEntriesWithStartActivity() {
		Vector entWithAct = new Vector();
		if (hasActivities()) {
			Iterator ei = this.entries.iterator();
			while (ei.hasNext()) {
				Entry e = (Entry) ei.next();
				if (e.hasStartActivity())
					entWithAct.add(e);
			}
		}
		return entWithAct;
	}

	/*
	 * Method Name: getActivityBoundEnty() This method will give activity name
	 * and with whom(Entry) it bound to. precondition: NONE Input:NONE Output:
	 * HashMap with Activity name as KEY and Entry name as Value
	 */

	public HashMap getActivityBoundEnty() {
		HashMap hActBoEnt = new HashMap();
		Iterator eActI = this.getEntriesWithStartActivity().iterator();
		while (eActI.hasNext()) {
			Entry e = (Entry) eActI.next();
			Activity sAct = e.getStartActivity();
			hActBoEnt.put(sAct.getName(), e.getName());
		}
		return hActBoEnt;
	}

	/**
	 * This method return the normal utilization of a Task. If it returns -1.0,
	 * consider it as Error condition.
	 * 
	 * @return double
	 */
	public double getUtilization() {
		double utilValue = -1.0;// Error condition
		if (this.hasResults()
				&& (resultsNode.getNodeName().equals("result-task"))) {
			// Utilization is an attribute of this node
			Element resultElem = (Element) resultsNode;
			String util = resultElem.getAttribute("utilization");
			// Now convert it to Double
			utilValue = Double.parseDouble(util);
		}
		return utilValue;
	}

	public BottleNeckStrength getBNS() {
		return BNS;
	}

	public void setBNS(BottleNeckStrength inBNS) {
		BNS = inBNS;
	}

	/**
	 * 
	 * @return boolean
	 */
	public boolean calculateBNS() {
		boolean rc = false;
		if (!this.hasResults())
			return rc;
		if (BNS == null) {
			BNS = new BottleNeckStrength();
		}
		HashMap desTasks = BNS.getCallOutTaNameUtil();
		Iterator enI = this.getEntries().iterator();
		while (enI.hasNext()) {
			Entry anEnt = (Entry) enI.next();
			Vector callsOut = anEnt.getCallOuts();
			// Find out the Destination Entries
			Iterator callOutIt = callsOut.iterator();
			while (callOutIt.hasNext()) {
				EntryCall ec = (EntryCall) callOutIt.next();
				// Get the Destination task
				Task destTask = ec.getDestination().getTask();
				// put the task in the HashMap
				if (!desTasks.containsKey(destTask.getName()))// We already
																// got it
					desTasks.put(destTask.getName(), new Double(destTask
							.getUtilization()));
			}// call-out
		}// Entry
		if (this.hasActivities()) {
			Iterator actI = this.getActivities().values().iterator();
			while (actI.hasNext()) {
				Activity act = (Activity) actI.next();
				// get the calls going out of this activity
				Iterator actCallOut = act.getCallsOut().iterator();
				while (actCallOut.hasNext()) {
					ActivityCall actCallout = (ActivityCall) actCallOut.next();
					Task deTask = actCallout.getDestination().getTask();
					if (!desTasks.containsKey(deTask.getName()))
						desTasks.put(deTask.getName(), new Double(deTask
								.getUtilization()));
				}// act-call-out
			}// Activity
		}
		if (!desTasks.isEmpty()) {
			// Get the Maximum Utilization
			double maxTaskUtil = 0.0, maxUtil = 0.0;
			Iterator bnsCalloutI = desTasks.values().iterator();
			while (bnsCalloutI.hasNext()) {
				Double currUtil = (Double) bnsCalloutI.next();
				if (currUtil.doubleValue() > maxUtil) {
					maxTaskUtil = currUtil.doubleValue();
				}
			}
			System.out.println("MaxUtil is  " + maxUtil);
			// get my Task's proc-utilization
			Element resElem = (Element) this.getResultNode();
			String pUtilS = resElem.getAttribute("proc-utilization");
			double procesUtil = Double.parseDouble(pUtilS);
			System.out.println("ProcessorUtil is  " + procesUtil);
			// Find out which is high
			if (maxTaskUtil > procesUtil) {
				maxUtil = maxTaskUtil;
				BNS.setClasification(BottleNeckStrength.TASK_SUPPORTED_CLASI);
			} else {
				maxUtil = procesUtil;
				BNS
						.setClasification(BottleNeckStrength.PROCESSOR_SUPPORTED_CLASI);
			}
			// get My task utilization
			double myUtil = this.getUtilization();
			if (maxUtil != 0) {
				double bnsValue = myUtil / maxUtil;
				BNS.setBNSValue(bnsValue);
				BNS.setStatus(BottleNeckStrength.VALID_STAT);
				// Now check the type of SW bottleneck
				if (bnsValue < BottleNeckStrength.SOFT_THRESHOLD
						&& bnsValue > 1.0) {
					BNS.setBNType(BottleNeckStrength.WEAK_TYPE);
				} else if (bnsValue >= BottleNeckStrength.SOFT_THRESHOLD) {
					BNS.setBNType(BottleNeckStrength.STRONG_TYPE);
				} else if (bnsValue > 0 && bnsValue < 1) {
					BNS.setBNType(BottleNeckStrength.NONE_TYPE);
				} else {
					BNS.setBNType(BottleNeckStrength.UNKNOWN);
				}
				rc = true; // we got it
			}
		}
		return rc;
	}

	/** ********Added by Jing Xu, Aug 25, 2005********** */
	public Object clone() {
		Task t = (Task) super.clone();
		t.activities = (HashMap) this.activities.clone();
		t.activityConnections = this.activityConnections;
		t.BNS = (BottleNeckStrength) this.BNS.clone();
		t.entries = (Vector) this.entries.clone();
		t.layer = this.layer;
		t.multiServer = this.multiServer;
		t.multiServerString = new String(this.multiServerString);
		t.priority = this.priority;
		t.proc = (Processor) this.proc.clone();
		t.replica = this.replica;
		t.scheduling = this.scheduling;
		t.thinkTime = this.thinkTime;
		t.multiServerLimit = this.multiServerLimit;
		return t;

	}

	public int getMultiServerLimit() {
		return multiServerLimit;
	}

	public void setMultiServerLimit(int multiServerLimit) {
		this.multiServerLimit = multiServerLimit;
	}

	/***************************************************************************
	 * Added by J Xu, Jul 03, 2007 *********** Get total service time (demand)
	 * of all entries
	 */
	public float getServiceTime() {
		float st = 0;
		for (int i = 0; i < entries.size(); i++) {
			Entry e = (Entry) entries.get(i);
			st += e.getServiceTime();
		}
		return st;
	}

}
