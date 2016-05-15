/*
 * Processor class
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/Processor.java,v 1.1.1.1.4.2 2005/04/29 02:33:42 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: Processor.java,v $
 * Revision 1.1.1.1.4.2  2005/04/29 02:33:42  vinoshan
 * *** empty log message ***
 *
 *
 */

package lqnModel;

import java.util.*;

/**
 * A processor entity in a Layered Queueing Network model.
 * <p>
 * <IMG SRC = Processor.gif>
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class Processor extends ModelNode {
	/**
	 * Default time-slice = 0
	 */
	public static final float DFL_VAL_QUANTUM = 0;

	/**
	 * Default multiplicity = 1
	 */
	public static final int DFL_VAL_MULTISERVER = 1;

	/**
	 * Default replication = 1
	 */
	public static final int DFL_VAL_REPLICA = 1;

	/**
	 * Default relative CPU rate = 1
	 */
	public static final float DFL_VAL_RATE = 1;

	/**
	 * Scheduling flag.
	 * <p>
	 * f=first come first served, h= head of line, p=priority, r=random
	 * scheduling, s=processor sharing
	 */
	private char scheduling;

	/**
	 * CPU time-slice value (quantum)
	 */
	private Float quantum;

	/**
	 * Number of servers (multiplicity).
	 * <p>
	 * 0 for infinite
	 */
	private Integer multiServer;
	private String  multiServerString;

	/**
	 * Number of replications
	 */
	private Integer replica;

	/**
	 * Relative processor speed - CPU rate
	 */
	private Float rate;

	/**
	 * List of this processor's tasks
	 * 
	 * @see Task
	 */
	private Vector tasks;

	/**
	 * Added by Jing Xu, Feb 24, 2007 Limitation for multi sever 0 means no
	 * limit
	 */
	private int multiServerLimit = 0;

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
	public Processor() {
		setValues("", 'f', DFL_VAL_QUANTUM, Integer.toString(DFL_VAL_MULTISERVER), DFL_VAL_REPLICA, DFL_VAL_RATE);
	}

	/**
	 * Class constructor
	 * 
	 * @param name
	 *            name of processor
	 */
	public Processor(String name) {
		setValues(name, 'f', DFL_VAL_QUANTUM, Integer.toString(DFL_VAL_MULTISERVER), DFL_VAL_REPLICA, DFL_VAL_RATE);
	}

	/**
	 * Class constructor
	 * 
	 * @param i
	 *            name of processor
	 * @param s
	 *            scheduling type: f=first come first served, h= head of line,
	 *            p=priority, r=random scheduling, s=processor sharing
	 * @param qt
	 *            the quantum
	 * @param m
	 *            the number of servers: 0 for infinite
	 * @param r
	 *            the number of replications
	 * @param ra
	 *            the relative processor speed (CPU rate)
	 */
	public Processor(String i, char s, float qt, String m, int r, float ra) {

		setValues(i, s, qt, m, r, ra);
	}

	/**
	 * Sets values of attributes of this processor.
	 * 
	 * @param i
	 *            name of processor
	 * @param s
	 *            scheduling type: f=first come first served, h= head of line,
	 *            p=priority, r=random scheduling, s=processor sharing
	 * @param q
	 *            the time-slice value
	 * @param m
	 *            the number of servers: 0 for infinite
	 * @param r
	 *            the number of replications
	 * @param ra
	 *            the relative processor speed (CPU rate)
	 */
	public void setValues(String i, char s, float q, String m, int r, float ra) {
		id = new String(i);
		scheduling = s;
		replica = new Integer(r);
		rate = new Float(ra);
		quantum = new Float(q);
		tasks = new Vector();
		super.resultsNode = null;
		
		multiServerString = new String(m);

		try
		{
			multiServer = new Integer(multiServerString);
		}
		catch(Exception e)
		{
			multiServer = new Integer(-1);
		}

	}
	
	public void updateValues(String i, char s, float q, String m, int r, float ra) {
		id = new String(i);
		scheduling = s;
		replica = new Integer(r);
		rate = new Float(ra);
		quantum = new Float(q);

		multiServerString = new String(m);

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
	 * Gets the tasks that use this processor.
	 * 
	 * @return vector of task objects
	 * @see #tasks
	 */
	public Vector getTasks() {
		return tasks;
	}

	/**
	 * Adds a task to this processor. If task already uses this processor, the
	 * task is not added again. Task is notified to set it's processor to this
	 * processor.
	 * 
	 * @param tsk
	 *            task to be added
	 */
	public void addTask(Task tsk) {
		if (!tasks.contains(tsk))
			if (tasks.add(tsk))
				tsk.setProcessor(this);
	}

	/**
	 * Removes a task from this processor. If the task uses this processor, the
	 * task is notified to set it's processor to null. If task does not use this
	 * processor' nothing happens.
	 * 
	 * @param tsk
	 *            the task to be removed
	 */
	public void removeTask(Task tsk) {
		if (tasks.remove(tsk))
			tsk.setProcessor(null);
	}

	/**
	 * Removes a task from this processor. If the task uses this processor, the
	 * task is notified to set it's processor to null. If task does not use this
	 * processor' nothing happens.
	 * 
	 * @param name
	 *            the name of the task
	 */
	public void removeTask(String name) {
		for (Enumeration e = tasks.elements(); e.hasMoreElements();) {
			Task tsk = (Task) e.nextElement();
			if (tsk.getName() == name)
				if (tasks.remove(tsk))
					tsk.setProcessor(null);
			return;
		}
	}

	/**
	 * Removes all tasks from this processor. All tasks are notified to set
	 * their processors to null.
	 */
	public void removeAllTasks() {
		for (Enumeration e = tasks.elements(); e.hasMoreElements();) {
			Task tsk = (Task) e.nextElement();
			if (tasks.remove(tsk))
				tsk.setProcessor(null);
		}
	}

	/**
	 * Gets the scheduling type.
	 * 
	 * @return the scheduling type
	 */
	public char getScheduling() {
		return scheduling;
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
	 * Gets the time-slice value.
	 * 
	 * @return the time-slice value
	 */
	public float getQuantum() {
		return quantum.floatValue();
	}

	/**
	 * Sets the time-slice value
	 * 
	 * @param q
	 *            the time-slice
	 */
	public void setQuantum(float q) {
		quantum = new Float(q);
	}

	/**
	 * Gets the multiplicity factor.
	 * 
	 * @return the multiplicity factor
	 */
	public String getMultiServer() {
		return multiServerString;
	}

	public int getMultiServerNum() {
		return multiServer.intValue();	}

	/**
	 * Sets the multiplicity factor.
	 * 
	 * @param num
	 *            the multiplicity factor
	 */
	public void setMultiServer(String m) {

		multiServerString = new String(m);

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
	 * Gets the replication factor.
	 * 
	 * @return the replication factor
	 */
	public int getReplication() {
		return replica.intValue();
	}

	/**
	 * Sets the replication factor
	 * 
	 * @param rep
	 *            the replication factor
	 */
	public void setReplication(int rep) {
		replica = new Integer(rep);
	}

	/**
	 * Gets the relative processor rate.
	 * 
	 * @return the relative processor rate
	 */
	public float getCpuRate() {
		return rate.floatValue();
	}

	/**
	 * Sets the processor rate.
	 * 
	 * @param r
	 *            the processor rate
	 */
	public void setCpuRate(float r) {
		rate = new Float(r);
	}

	/**
	 * Converts this processor to LQNS input file format text representaion.
	 * 
	 * @return the LQNS input file format of the processor
	 */
	public String toString() {
		String multiServerFlag, replicationFlag, procRate, quantumS;

		if (quantum.floatValue() == DFL_VAL_QUANTUM)
			quantumS = new String();
		else
			quantumS = new String(" " + quantum.toString());
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
		if (rate.floatValue() == DFL_VAL_RATE)
			procRate = new String();
		else
			procRate = new String(" R " + rate.toString());
		return new String("p " + id + " " + scheduling + quantumS
				+ multiServerFlag + replicationFlag + procRate);
	}

	/** ********Added by Jing Xu, Aug 25, 2005********** */
	public Object clone() {
		Processor p = (Processor) super.clone();
		p.multiServer = this.multiServer;
		p.quantum = this.quantum;
		p.rate = this.rate;
		p.replica = this.replica;
		p.scheduling = this.scheduling;
		p.tasks = (Vector) this.tasks.clone();
		p.multiServerLimit = this.multiServerLimit;
		return p;
	}

	public int getMultiServerLimit() {
		return multiServerLimit;
	}

	public void setMultiServerLimit(int multiServerLimit) {
		this.multiServerLimit = multiServerLimit;
	}

}
