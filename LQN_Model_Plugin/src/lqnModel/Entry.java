/*
 * Entry class
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/Entry.java,v 1.3.4.2 2005/04/29 02:33:41 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: Entry.java,v $
 * Revision 1.3.4.2  2005/04/29 02:33:41  vinoshan
 * 
 ***********************************************************************
 * Modification Log (from newest changes to oldest changes)
 ***********************************************************************
 * Change/Created by  Ref#(#yyyyddmm)  Description
 * -----------------  --------------  ----------------------------------
 * Jing XU            #20071115        Add design change factors
 *                                    - code tightening factors and asyn factors			  
 ***********************************************************************
 */

package lqnModel;

import java.util.*;

/**
 * An entry entity in a Layered Queueing Network.
 * <p>
 * <IMG SRC = Entry.gif>
 * <p>
 * NOTE: Entry field "callers" appears twice in class diagram. It is actually
 * only one vector data structure that may contain entry and/or activity
 * objects. That is, both entries and activities may call an entry.
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class Entry extends ModelNode {
	/**
	 * Maximum number of phases = 3
	 */
	public static final int MAXPHASE = 3;

	/**
	 * Default open arrival rate = 0
	 */
	public static final float DFL_VAL_ARRIVALRATE = 0;

	/**
	 * Default priority = 0
	 */
	public static final int DFL_VAL_PRIORITY = 0;

	public static int MAXCALL = 1000;

	/**
	 * Open arrival rate to this entry.
	 */
	private Float arrivalRate;

	/**
	 * Priority.
	 */
	private Integer priority;

	/**
	 * Back link to this entry's task.
	 * 
	 * @see Task
	 */
	private Task task;

	/**
	 * Start activity of this entry.
	 * 
	 * @see Activity
	 */
	private Activity startActivity;

	/**
	 * Collection of phases of this entry.
	 * 
	 * @see Phase
	 */
	private Vector phases;

	/**
	 * List of callers to this entry. They may be either entry or activity
	 * objects.
	 * 
	 * @see Entry
	 * @see Activity
	 */
	private Vector callers;

	/**
	 * #20071115 The portion that execution demand can be tightened 0.2 means
	 * the total execution demand can be shorten by 20%
	 */
	private float fdCodeTightenFactor = 0.2f;

	/**
	 * #20071115 The portion that out going calls can be tightened 0.2 means 20%
	 * of out going calls can be tightened (erased)
	 */
	private float fcCodeTightenFactor = 0.2f;

	/**
	 * #20071115 The portion of first phase that can be moved to second phase
	 * 50% of first execution demand can be move to second phase
	 */
	private float fdAsynFactor = 0.5f;

	/**
	 * #20071115 The portion of first phase calls that can be moved to second
	 * phase 50% of outgoing calls in first execution can be move to second
	 * phase
	 */
	private float fcAsynFactor = 0.5f;

	/**
	 * Default class constructor
	 */
	public Entry() {
		this.phases = new Vector();
		this.callers = new Vector();
		this.phases.add(new Phase());
		this.setValues("", DFL_VAL_ARRIVALRATE, DFL_VAL_PRIORITY);
		this.startActivity = null;
	}

	/**
	 * Class constructor
	 * 
	 * @param name
	 *            the name of the entry
	 */
	public Entry(String name) {
		this.phases = new Vector();
		this.callers = new Vector();
		this.phases.add(new Phase());
		this.setValues(name, DFL_VAL_ARRIVALRATE, DFL_VAL_PRIORITY);
		this.startActivity = null;
	}

	/**
	 * Sets values of the attributes
	 * 
	 * @param i
	 *            the name
	 * @param arrival
	 *            the open arrival rate
	 * @param prior
	 *            the priority
	 */
	public void setValues(String i, float arrival, int prior) {
		this.id = new String(i);
		this.arrivalRate = new Float(arrival);
		this.priority = new Integer(prior);
	}

	/**
	 * Sets the open arrival rate
	 * 
	 * @param ar
	 *            the open arrival rate
	 */
	public void setArrivalRate(float ar) {
		this.arrivalRate = new Float(ar);
	}

	/**
	 * Gets the open arrival rate
	 * 
	 * @return the open arrival rate
	 */
	public float getArrivalRate() {
		return this.arrivalRate.floatValue();
	}

	/**
	 * Sets the open arrival rate to the default value
	 */
	public void clearArrivalRate() {
		this.arrivalRate = new Float(DFL_VAL_ARRIVALRATE);
	}

	/**
	 * Sets the priority.
	 * 
	 * @param pri
	 *            the priority
	 */
	public void setPriority(int pri) {
		this.priority = new Integer(pri);
	}

	/**
	 * Gets the priority
	 * 
	 * @return the priority
	 */
	public int getPriority() {
		return this.priority.intValue();
	}

	/**
	 * Sets the task on which this entry is located.
	 * 
	 * @param tsk
	 *            the task
	 */
	public void setTask(Task tsk) {
		this.task = tsk;
	}

	/**
	 * Gets the task on which this entry is located
	 * 
	 * @return the task that owns this entry of <code>null</code> if task is
	 *         not defined
	 */
	public Task getTask() {
		return this.task;
	}

	/**
	 * Sets the start activity
	 * 
	 * @param sa
	 *            the start activity
	 */
	public void setStartActivity(Activity sa) {
		if (sa != null) {
			// remove all phases except the first one
			for (int i = phases.size() - 1; i > 0; i--)
				this.removePhase();
			// examine any remaining calls and only keep forwarding calls
			if (!phases.isEmpty()) {
				Vector calls = ((Phase) phases.firstElement()).getCallsOut();
				for (Enumeration e = calls.elements(); e.hasMoreElements();) {
					EntryCall c = (EntryCall) e.nextElement();
					if (c.getProbForwarding() > 0) {
						c.setToForwardingOnlyCall(c.getProbForwarding());
					} else
						((Phase) phases.firstElement()).removeCallOut(c);
				}
			}
			// set startActivity
			this.startActivity = sa;
		}
	}

	/**
	 * Gets the start activity
	 * 
	 * @return the start activity or <code>null</code> if there is no start
	 *         activity defined
	 */
	public Activity getStartActivity() {
		return this.startActivity;
	}

	/**
	 * Sets start activity to <code>null</code>.
	 */
	public void removeStartActivity() {
		this.startActivity = null;
	}

	/**
	 * Determines if this entry has a start activity.
	 * 
	 * @return <code>true</code> if this entry has a start activity,
	 *         <code>false</code> otherwise
	 */
	public boolean hasStartActivity() {
		return (this.startActivity != null);
	}

	/**
	 * Gets the number of defined phases for this entry
	 * 
	 * @return the number of phases in this entry
	 */
	public int getNumberOfPhases() {
		return this.phases.size();
	}

	/**
	 * Gets the collection of phase objects of this entry. Same as
	 * <code>getAllPhases()</code>.
	 * 
	 * @return the phase objects of this entry
	 * @see #phases
	 */
	public Vector getPhases() {
		return this.phases;
	}

	/**
	 * Determines if this entry has callers.
	 * 
	 * @return <code>true</code> if this entry has at least one caller,
	 *         <code>false</code> if entry is not called
	 */
	public boolean hasCallers() {
		return (!callers.isEmpty());
	}

	/**
	 * Gets the collection of this entry's callers. The vector may contain both
	 * entry and activity objects.
	 * 
	 * @return the collection of this entry's callers
	 * @see #callers
	 */
	public Vector getCallers() {
		return this.callers;
	}

	/**
	 * Sets Coeficient of Variation for all phases. Used by parser.
	 * 
	 * @param coefVars
	 *            vector of String type representations of Coeficient of
	 *            Variation values: <code>float</code>"
	 */
	public void setCoefVariations(Vector coefVars) {
		// make sure there are enough phases
		while ((this.phases.size() < coefVars.size())
				&& (this.phases.size() < MAXPHASE))
			addPhase();
		for (int i = 0; (i < this.phases.size() && i < coefVars.size()); i++) {
			Float coefVar = new Float((String) coefVars.elementAt(i));
			((Phase) phases.elementAt(i))
					.setCoefVariation(coefVar.floatValue());
		}
	}

	/**
	 * Sets Phase Type Flags for all phases. Used by parser.
	 * 
	 * @param phaseFlags
	 *            vector of String type representations of Phase Type Flag
	 *            values "0" or "1"
	 */
	public void setPhaseTypeFlags(Vector phaseFlags) {
		// make sure there are enough phases
		while ((this.phases.size() < phaseFlags.size())
				&& (this.phases.size() < MAXPHASE))
			addPhase();
		for (int i = 0; (i < this.phases.size() && i < phaseFlags.size()); i++) {
			Integer flag = new Integer((String) phaseFlags.elementAt(i));
			((Phase) phases.elementAt(i)).setStochastic((flag.intValue() == 0));
		}
	}

	/**
	 * Sets Service Times for all phases. Used by parser.
	 * 
	 * @param servTimes
	 *            vector of String type representations of Service Time values:
	 *            <code>float</code>
	 */
	public void setServiceTimes(Vector servTimes) {
		// make sure there are enough phases
		while ((this.phases.size() < servTimes.size())
				&& (this.phases.size() < MAXPHASE))
			addPhase();
		for (int i = 0; (i < this.phases.size() && i < servTimes.size()); i++) {
			Float servTime = new Float((String) servTimes.elementAt(i));
			((Phase) phases.elementAt(i)).setServiceTime(servTime.floatValue());
		}
	}

	/**
	 * Sets Maximum Service Times for all phases. Used by parser.
	 * 
	 * @param maxServTimes
	 *            vector of String type representations of Maximum Service Time
	 *            values: <code>float</code>
	 */
	public void setMaxServiceTimes(Vector maxServTimes) {
		// make sure there are enough phases
		while ((this.phases.size() < maxServTimes.size())
				&& (this.phases.size() < MAXPHASE))
			addPhase();
		for (int i = 0; (i < this.phases.size() && i < maxServTimes.size()); i++) {
			Float maxServTime = new Float((String) maxServTimes.elementAt(i));
			((Phase) phases.elementAt(i)).setMaxServiceTime(maxServTime
					.floatValue());
		}
	}

	/**
	 * Sets Think Times for all phases. Used by parser.
	 * 
	 * @param thinkTimes
	 *            vector of String type representations of Think Time values:
	 *            <code>float</code>
	 */
	public void setThinkTimes(Vector thinkTimes) {
		// make sure there are enough phases
		while ((this.phases.size() < thinkTimes.size())
				&& (this.phases.size() < MAXPHASE))
			addPhase();
		for (int i = 0; (i < this.phases.size() && i < thinkTimes.size()); i++) {
			Float thinkTime = new Float((String) thinkTimes.elementAt(i));
			((Phase) phases.elementAt(i)).setThinkTime(thinkTime.floatValue());
		}
	}

	/**
	 * Adds a call to entry. Used by parser.
	 * 
	 * @param dest
	 *            destination of the call
	 * @param rdv
	 *            type of call, if true call is synchronous, if false,
	 *            asynchronous
	 * @param phaseMeanCalls
	 *            vector of String type representations of Mean Call values:
	 *            <code>float</code>
	 */
	public void addCall(Entry dest, boolean rdv, Vector phaseMeanCalls) {
		for (int i = 0; (i < this.phases.size() && i < phaseMeanCalls.size()); i++) {
			boolean found = false;
			// check to see if call exists in this phase
			Vector calls = ((Phase) phases.elementAt(i)).getCallsOut();
			String meanCallsString = new String((String) phaseMeanCalls.elementAt(i));
					
			for (int j = 0; j < calls.size(); j++) {
				EntryCall call = (EntryCall) calls.elementAt(j);
				if (call.getDestination() == dest) {
					call.setMeanCallsString(meanCallsString);
					call.setRendezvous(rdv);
					found = true;
				}
			}
			float f = Float.parseFloat(meanCallsString);
			if (!found && (f!=EntryCall.DFL_VAL_MEANCALL)) { // call
				// doesn't
				// exist so
				// add it,
				// if
				// necessary
				// if meanCalls < 0, it is a variable
				((Phase) phases.elementAt(i)).addCallOut(this, dest, rdv,
						meanCallsString);
			}

		}
	}

	/**
	 * Adds a forwarding call to entry. Used by parser.
	 * 
	 * @param dest
	 *            destination of the call
	 * @param probForward
	 *            the probability of forwarding
	 */
	public void addForwardingCall(Entry dest, float probForward) {
		Phase firstPhase = (Phase) phases.firstElement();
		Vector calls = firstPhase.getCallsOut();
		boolean found = false;
		for (int j = 0; j < calls.size(); j++) {
			GenericCall call = (GenericCall) calls.elementAt(j);
			if (call.getDestination() == dest) {
				call.setProbForwarding(probForward);
				found = true;
			}
		}
		if (!found && probForward != GenericCall.DFL_VAL_PROBFORWARD) { // call
			// doesn't
			// exist
			// so
			// add
			// it,
			// if
			// necessary
			// if probForwarding < 0, it is a variable
			firstPhase.addCallOut(this, dest, probForward,
					GenericCall.DFL_VAL_RDV, Float.toString(GenericCall.DFL_VAL_MEANCALL),
					Integer.toString(GenericCall.DFL_VAL_FANIN), Integer.toString(GenericCall.DFL_VAL_FANOUT));
		}
	}

	/**
	 * Sets FanIn values of a call for all phases of entry. Used by parser.
	 * NOTE: if call does not exist, it is created.
	 * 
	 * @param dest
	 *            destination of the call
	 * @param fanIn
	 *            vector of String type representations of FanIn values:
	 *            <code>integer</code>
	 */
	public void setCallFanIn(Entry dest, Vector fanIn) {
		for (int i = 0; (i < this.phases.size() && i < fanIn.size()); i++) {
			boolean found = false;
			// check to see if call exists in this phase
			Vector calls = ((Phase) phases.elementAt(i)).getCallsOut();
			String fan = new String((String) fanIn.elementAt(i));
			int fanInt = Integer.parseInt(fan);
			
			for (int j = 0; j < calls.size(); j++) {
				GenericCall call = (GenericCall) calls.elementAt(j);
				if (call.getDestination() == dest) {
					call.setFanInString(fan);
					found = true;
				}
			}
			if (!found && fanInt > GenericCall.DFL_VAL_FANIN) { // call doesn't
				// exist so add it,
				// if necessary
				((Phase) phases.elementAt(i)).addCallOut(this, dest, fan, true);
			}
		}
	}

	/**
	 * Sets FanOut values of a call for all phases of entry. Used by parser.
	 * NOTE: if call does not exist, it is created.
	 * 
	 * @param dest
	 *            destination of the call
	 * @param fanOut
	 *            vector of String type representations of FanOut values:
	 *            <code>integer</code>
	 */
	public void setCallFanOut(Entry dest, Vector fanOut) {
		for (int i = 0; (i < this.phases.size() && i < fanOut.size()); i++) {
			boolean found = false;
			// check to see if call exists in this phase
			Vector calls = ((Phase) phases.elementAt(i)).getCallsOut();
			String fan = new String((String) fanOut.elementAt(i));
			int fanInt = Integer.parseInt(fan);
			
			for (int j = 0; j < calls.size(); j++) {
				GenericCall call = (GenericCall) calls.elementAt(j);
				if (call.getDestination() == dest) {
					call.setFanOutString(fan);
					found = true;
				}
			}
			if (!found && fanInt > GenericCall.DFL_VAL_FANOUT) { // call doesn't
				// exist so add
				// it, if
				// necessary
				((Phase) phases.elementAt(i)).addCallOut(this, dest, fan, false);
			}
		}
	}

	/**
	 * Gets a particular phase based on index. if index is negative or greater
	 * than the number of phases of this entry, <code>null</code> is returned.
	 * 
	 * @param index
	 *            the index of the phase (zero-based)
	 * @return the phase object if index is valid, <code>null</code> otherwise
	 */
	public Phase getPhase(int index) {
		if (index >= 0 && index < this.phases.size())
			return (Phase) phases.get(index);
		else
			return null;
	}

	/**
	 * Removes the last phase from the end of this entry's phase vector.
	 */
	public void removePhase() {
		if (!phases.isEmpty()) {
			Phase lastPhase = (Phase) phases.lastElement();
			lastPhase.removeAllCallsOut();
			this.phases.remove(lastPhase);
			// if last phase was removed add a default phase
			if (phases.isEmpty())
				phases.add(new Phase());
		}
	}

	/**
	 * Adds new phase to the end of the phase vector up to a maximum number of
	 * phases, the phase index number is set.
	 */
	public void addPhase() {
		if (this.phases.size() < MAXPHASE) {
			Phase p = new Phase();
			p.setIndex(phases.size());
			this.phases.add(p);
		}
	}

	/**
	 * Adds phase object (np) to the end of the phase vector. The phase index is
	 * set and the destination entry of any calls out are notified of the call.
	 * If the entry already has the maximum number of phases allowed, nothing
	 * happens.
	 * 
	 * @param np
	 *            the phase to be added
	 */
	public void addPhase(Phase np) {
		if (this.phases.size() < MAXPHASE) {
			np.setIndex(this.phases.size());
			if (!(np.getCallsOut().isEmpty()))
				np.setCallsOut(np.getCallsOut());
			phases.add(np);
		}
	}

	/**
	 * Added by Jing Xu, Aug 25, 2005 set a phase object (np) to the position
	 * specified by the phase number. The phase index is set and the destination
	 * entry of any calls out are notified of the call. If the entry already has
	 * the maximum number of phases allowed, nothing happens.
	 * 
	 * @param np
	 *            the phase to be set
	 */
	public void setPhase(Phase np) {
		if (phases == null) {
			phases = new Vector();
		}

		// if a phase with given phase index exists
		// update that phase information
		if (phases.size() > np.getIndex()) {
			phases.setElementAt(np, np.getIndex());
			// System.out.println("Phase " + np.getName() + " parsed.");
			// System.out.println("Phase index: " + np.getIndex());
			// System.out.println("calls out: " + np.callsOut.size());

		} else {
			while (phases.size() < np.getIndex()) {
				Phase dph = new Phase();
				phases.add(dph);

				// System.out.println("Default phase added-");
				// System.out.println("Phase index: " + dph.getIndex());
				// System.out.println("calls out: " + dph.callsOut.size());
			}
			addPhase(np);
			// System.out.println("Phase " + np.getName() + " parsed.");
			// System.out.println("Phase index: " + np.getIndex());
			// System.out.println("calls out: " + np.callsOut.size());

		}
	}// end setPhase

	/**
	 * Gets the entire vector of Phase objects for this entry. Same as
	 * <code>getPhases()</code>
	 * 
	 * @return the phase objects of this entry
	 * @see #phases
	 */
	public Vector getAllPhases() {
		return phases;
	}

	/**
	 * Sets the phse vector of this entry to the passed vector. NOTE: There is
	 * no notification made to the destination entries of any calls made during
	 * any phase
	 * 
	 * @param phaseVector
	 *            the vector of phases to be used by this entry
	 * @see Phase
	 */
	public void setAllPhases(Vector phaseVector) {
		if (!phases.isEmpty())
			this.clearAllPhases();
		for (int i = 0; i < phaseVector.size(); i++)
			((Phase) phaseVector.elementAt(i)).setIndex(i);
		phases = phaseVector;
		// make sure phases has at least one phase
		if (phases.isEmpty())
			phases.add(new Phase());
	}

	/**
	 * Add existing EntryCall to a particular phase.
	 * 
	 * @exception BadIndexException
	 *                when invalid phase index used
	 * @param phaseIndex -
	 *            phase index of phase to which the call is added
	 * @param call -
	 *            EntryCall that is to be added to the phase
	 */
	public void addCallOut(EntryCall call, int phaseIndex)
			throws BadIndexException {
		if ((phaseIndex >= 0) && (phaseIndex + 1 <= MAXPHASE)) {
			while (this.phases.size() < (phaseIndex + 1))
				addPhase();
			// if( (phaseIndex >= 0) && (phaseIndex + 1 <=
			// (this.phases.size()-1) ) )
			Phase p = (Phase) phases.get(phaseIndex); // has the phase the
														// call
			// is made in
			p.addCallOut((GenericCall) call);
		} else
			throw new BadIndexException();
	}

	/**
	 * Add call to a particular phase.
	 * 
	 * @exception BadIndexException
	 *                when invalid phase index used
	 * @param phase
	 *            index of phase to which the call is added
	 * @param dest
	 *            the destination entry
	 * @param probForwd
	 *            the probability of forwarding
	 * @param rdvI
	 *            type of call: if <code>true</code> call is synchronous, if
	 *            <code>false</code>, asynchronous
	 * @param meancalls
	 *            the mean number of calls
	 * @param fanIn
	 *            the fanIn
	 * @param fanOut
	 *            the fanOut
	 */
	public void addCallOut(int phase, Entry dest, float probForwd,
			boolean rdvI, String meancallsString, String fanIn, String fanOut)
			throws BadIndexException {
		if (phase >= 0 && phase < this.phases.size()) { // add call out only if
			// the entry
			Phase p = (Phase) phases.get(phase); // has the phase the call is
			// made in
			p.addCallOut(this, dest, probForwd, rdvI, meancallsString, fanIn, fanOut);
		} else
			throw new BadIndexException();
	}

	public void addCallOutNum(int phase, Entry dest, float probForwd,
			boolean rdvI, int meancalls, int fanIn, int fanOut)
			throws BadIndexException {
		String meancallsString = new String(Integer.toString(meancalls));
		addCallOut(phase,dest,probForwd,rdvI,meancallsString,Integer.toString(fanIn),Integer.toString(fanOut));
	}

	public void addCallOutNum(int phase, Entry dest, float probForwd,
			boolean rdvI, float meancalls, int fanIn, int fanOut)
			throws BadIndexException {
		addCallOut(phase,dest,probForwd,rdvI,Float.toString(meancalls),Integer.toString(fanIn),Integer.toString(fanOut));
	}

	/**
	 * Removes all calls to a particular destination from all phases.
	 * 
	 * @param call
	 *            the call to be removed. Similar calls (ie same source and
	 *            destination) will also be removed
	 */
	public void removeCallOut(EntryCall call) {
		for (Enumeration e = this.phases.elements(); e.hasMoreElements();) {
			Phase p = (Phase) e.nextElement();
			for (Enumeration ec = p.getCallsOut().elements(); ec
					.hasMoreElements();) {
				EntryCall c = (EntryCall) ec.nextElement();
				if (callsAreSimilar(c, call))
					p.removeCallOut(c);
			}
		}
	}

	/**
	 * Removes all calls to a particular destination from all phases.
	 * 
	 * @param dest
	 *            the destination entry of call to be removed
	 */
	public void removeCallOut(Entry dest) {
		for (Enumeration e = this.phases.elements(); e.hasMoreElements();) {
			Phase p = (Phase) e.nextElement();
			for (Enumeration ec = p.getCallsOut().elements(); ec
					.hasMoreElements();) {
				EntryCall c = (EntryCall) ec.nextElement();
				if (c.getDestination() == dest) {
					p.removeCallOut(c);
				}
			}
		}
	}

	/**
	 * Remove call from a particular phase.
	 * 
	 * @exception BadIndexException
	 *                when invalid phase index is used
	 * @param phase
	 *            index of phase from which call is removed (zero-based)
	 * @param call
	 *            the call to be removed
	 */
	public void removeCallOut(int phase, EntryCall call)
			throws BadIndexException {
		if (phase >= 0 && phase < this.phases.size()) {
			Phase p = (Phase) phases.get(phase);
			p.removeCallOut(call);
		} else
			throw new BadIndexException();
	}

	/**
	 * Remove call based on destination entry from a particular phase
	 * 
	 * @exception BadIndexException
	 *                when an invalid phase index is used
	 * @param phase
	 *            index of phase from which call is removed (zero-based)
	 * @param dest
	 *            the destination entry of the call
	 */
	public void removeCallOut(int phase, Entry dest) throws BadIndexException {
		if (phase >= 0 && phase < this.phases.size()) {
			Phase p = (Phase) phases.get(phase);
			p.removeCallOut(dest);
		} else
			throw new BadIndexException();
	}

	/**
	 * Removes all calls (inCalls and outCalls) from this entry. It disconnects
	 * this entry from all callers and callees.
	 */
	public void disconnect() {
		this.removeAllCallsOut();
		this.removeAllCallers();
	}

	/**
	 * Remove all outCall arcs.
	 */
	private void removeAllCallsOut() {
		for (Enumeration e = this.phases.elements(); e.hasMoreElements();) {
			Phase p = (Phase) e.nextElement();
			p.removeAllCallsOut();
		}
	}

	/**
	 * Remove all calls of a particular phase
	 * 
	 * @param phase
	 *            the phase index (zero-based)
	 */
	public void removeAllCallsOut(int phase) {
		Phase p = (Phase) phases.get(phase);
		p.removeAllCallsOut();
	}

	/**
	 * Adds caller to this entry. Callers may be either Entry or Activity
	 * objects. Caller is not added if it is already a caller of this entry.
	 * 
	 * @param caller
	 *            the source of the call
	 */
	public void addCaller(Object caller) {
		if (!this.callers.contains(caller)) {
			this.callers.add(caller);
		}
	}

	/**
	 * Removes entry caller from this entry.
	 * 
	 * @param caller
	 *            the entry source of the call
	 */
	public void removeCaller(Entry caller) {
		this.callers.remove(caller);
	}

	/**
	 * Removes activity caller from this entry.
	 * 
	 * @param caller
	 *            the activity source of the call
	 */
	public void removeCaller(Activity caller) {
		this.callers.remove(caller);
	}

	/**
	 * Removes all the calls made to this entry by its callers.
	 */
	private void removeAllCallers() {
		/***********************************************************************
		 * Fixed bug here (By J Xu, Aug 25, 2006) Enumeration e was used before.
		 * However, once a caller is removed, e got changed by shifting all the
		 * elements one position ahead. Meanwhile, the nextElement() operation
		 * has moved the cursor to the second place, which cause the last
		 * element never being removed. The function removeCallOut() also
		 * removes the caller from this entry's callers list.
		 */
		while (callers.size() > 0) {
			Object caller = callers.elementAt(0);
			if (caller instanceof Entry) {
				((Entry) caller).removeCallOut(this);
			} else if (caller instanceof Activity)
				((Activity) caller).removeCallOut(this);
		}// end while
	}

	/**
	 * Converts this entry to the LQNS input file format text representation
	 * 
	 * @return The LQNS input file format text representation of this entry
	 *         object
	 */
	public String toString() {

		String s = new String();

		if (getStartActivity() == null) { // a regular entry

			/** Open arrival rate * */
			if (arrivalRate.floatValue() != DFL_VAL_ARRIVALRATE)
				s = s.concat("a " + id + " " + arrivalRate.toString() + "\n");
			/** Priority * */
			if (priority.intValue() != DFL_VAL_PRIORITY)
				s = s.concat("p " + id + " " + priority.toString() + "\n");

			if (phases.size() > 0) {

				/** Service times * */
				Vector phServiceTime = new Vector();
				for (Enumeration e = phases.elements(); e.hasMoreElements();)
					phServiceTime.add(new Float(((Phase) e.nextElement())
							.getServiceTime()));
				// Service time is mandatory, and must always been printed
				s = s.concat("s " + id);
				for (Enumeration e = phServiceTime.elements(); e
						.hasMoreElements();)
					s = s.concat(" " + ((Float) e.nextElement()).toString());
				s = s.concat(" -1\n");

				/** Phase flags * */
				Vector phStochastic = new Vector();
				for (Enumeration e = phases.elements(); e.hasMoreElements();)
					phStochastic.add(new Boolean(((Phase) e.nextElement())
							.isStochastic()));
				if (!isDefaultValue(phStochastic, Phase.DFL_VAL_STOCHASTIC)) {
					s = s.concat("f " + id);
					for (Enumeration e = phStochastic.elements(); e
							.hasMoreElements();)
						s = s
								.concat(" "
										+ ((((Boolean) e.nextElement())
												.booleanValue()) ? "0" : "1"));
					s = s.concat(" -1\n");
				}

				/** Coeficient of Variation * */
				Vector phCoefVariation = new Vector();
				for (Enumeration e = phases.elements(); e.hasMoreElements();)
					phCoefVariation.add(new Float(((Phase) e.nextElement())
							.getCoefVariation()));
				if (!isDefaultValue(phCoefVariation,
						Phase.DFL_VAL_COEFVARIATION)) {
					s = s.concat("c " + id);
					for (Enumeration e = phCoefVariation.elements(); e
							.hasMoreElements();)
						s = s
								.concat(" "
										+ ((Float) e.nextElement()).toString());
					s = s.concat(" -1\n");
				}

				/** Maximum Service Times * */
				Vector phMaxServTime = new Vector();
				for (Enumeration e = phases.elements(); e.hasMoreElements();)
					phMaxServTime.add(new Float(((Phase) e.nextElement())
							.getMaxServiceTime()));
				if (!isDefaultValue(phMaxServTime, Phase.DFL_VAL_MAXSERVTIME)) {
					s = s.concat("M " + id);
					for (Enumeration e = phMaxServTime.elements(); e
							.hasMoreElements();)
						s = s
								.concat(" "
										+ ((Float) e.nextElement()).toString());
					s = s.concat(" -1\n");
				}

				/** Think Time * */
				Vector phThinkTime = new Vector();
				for (Enumeration e = phases.elements(); e.hasMoreElements();)
					phThinkTime.add(new Float(((Phase) e.nextElement())
							.getThinkTime()));
				if (!isDefaultValue(phThinkTime, Phase.DFL_VAL_THINKTIME)) {
					s = s.concat("Z " + id);
					for (Enumeration e = phThinkTime.elements(); e
							.hasMoreElements();)
						s = s
								.concat(" "
										+ ((Float) e.nextElement()).toString());
					// if(isActivity) s=s.concat("\n");
					// else
					s = s.concat(" -1\n");
				}
			}
			// feret out the calls from phases to produce a set of calls with
			// phases
			CallList cl = new CallList(phases);
			s = s.concat(cl.toString());
		} else { // entry with start activity

			/** Start Activity Declaration* */
			s = s.concat("A " + id + " " + startActivity.getName() + "\n");

			/** Entries with a start activity may only make forwarding calls * */
			CallList cl = new CallList(phases);
			for (Iterator i = (cl.values()).iterator(); i.hasNext();) {
				PrintableCall pc = (PrintableCall) i.next();
				if (pc.getProbForwarding() > 0)
					s = s.concat(pc.toString());
			}
		}
		return s;
	}

	/**
	 * Removes all the phases and all calls made from the phases. Clears the
	 * phase vector.
	 */
	private void clearAllPhases() {
		// remove all calls
		for (Enumeration e = this.phases.elements(); e.hasMoreElements();) {
			Phase p = (Phase) e.nextElement();
			p.removeAllCallsOut();
		}
		// clear phase vector
		this.phases.clear();
		// there is always at least one phase to an entry
		this.phases.add(new Phase());
	}

	private int timeCreated;

	private int timeEOP1; // time where the phase 1 ends

	// here time is reffered to time stamp from the trace
	// it has nothing to do with how attributes of lqn itself

	public int getTimeCreated() {
		return timeCreated;
	}

	public int getTimeEOP1() {
		return timeEOP1;
	}

	public void setTimeCreated(int time) {
		timeCreated = time;
	}

	public void setTimeEOP1(int time) {
		timeEOP1 = time;
	}

	public String getId() {
		return id;
	}

	/**
	 * Determines if two calls have the same source and destination
	 * 
	 * @param call1
	 *            a call
	 * @param call2
	 *            a call
	 * @return <code>true</code> if both calls have the same sources and
	 *         destinations, <code>false</code> otherwise.
	 */
	static boolean callsAreSimilar(GenericCall call1, GenericCall call2) {
		if (call1 instanceof ActivityCall && call2 instanceof ActivityCall)
			return (((ActivityCall) call1).getSource() == ((ActivityCall) call2)
					.getSource() && call1.getDestination() == call2
					.getDestination());
		else if (call1 instanceof EntryCall && call2 instanceof EntryCall)
			return (((EntryCall) call1).getSource() == ((EntryCall) call2)
					.getSource() && call1.getDestination() == call2
					.getDestination());
		else
			return false;
	}

	/**
	 * Determines that all variables in the vector are all equal to a default
	 * value.
	 * 
	 * @param variables
	 *            the variables
	 * @param defaultVal
	 *            the default value
	 * @return <code>true</code> if all variables equal the default value,
	 *         <code>false</code> otherwise.
	 */
	public static boolean isDefaultValue(Vector variables, float defaultVal) {
		for (int i = 0; i < variables.size(); i++)
			if (((Float) variables.elementAt(i)).floatValue() != defaultVal)
				return false;
		return true;
	}

	/**
	 * Determines that all values in the variable vector are equal to a default
	 * value
	 * 
	 * @param variables
	 *            the variables
	 * @param defaultVal
	 *            the default value
	 * @return <code>true</code> if all variables equal the default value,
	 *         <code>false</code> otherwise
	 */
	public static boolean isDefaultValue(Vector variables, boolean defaultVal) {
		for (int i = 0; i < variables.size(); i++)
			if (((Boolean) variables.elementAt(i)).booleanValue() != defaultVal)
				return false;
		return true;
	}

	/**
	 * Determines that all values in the variable vector are equal to the
	 * default value.
	 * 
	 * @param variables
	 *            the variables
	 * @param defaultVal
	 *            the default value
	 * @return <code>true</code> if all variables equal the default values,
	 *         <code>false</code> otherwise
	 */
	public static boolean isDefaultValue(Vector variables, int defaultVal) {
		for (int i = 0; i < variables.size(); i++)
		{
			int k = Integer.parseInt((String) variables.elementAt(i));
			if (k != defaultVal) return false;
		}
		return true;
	}

	/***************************************************************************
	 * Get number of callers
	 * 
	 * @return
	 */
	public int getNumOfCallers() {
		return callers.size();
	}

	/***************************************************************************
	 * Get total number of calls that going out of the entries including all
	 * phases
	 * 
	 * @return
	 */
	public int getNumberOfCalls() {
		int number = 0;
		Enumeration phases = getPhases().elements();
		while (phases.hasMoreElements()) {
			Phase phase = (Phase) phases.nextElement();
			number += phase.getCallsOut().size();
		}
		return number;
	}

	/*
	 * This function will return all the Calls this Entry send out
	 * 
	 */

	public Vector getCallOuts() {
		Vector callOuts = new Vector();
		Enumeration phases = getPhases().elements();
		while (phases.hasMoreElements()) {
			Phase phase = (Phase) phases.nextElement();
			callOuts.addAll(phase.getCallsOut());
		}
		return callOuts;
	}

	/*
	 * This function will return a collection of Forwarding Calls this Entry has
	 * 
	 */
	public Vector getForwarCalls() {
		Vector forwardCalls = new Vector();
		Iterator allCallI = this.getCallOuts().iterator();
		while (allCallI.hasNext()) {
			GenericCall ec = (GenericCall) allCallI.next();
			if (ec.getProbForwarding() != GenericCall.DFL_VAL_PROBFORWARD)// This
																			// is a
																			// Forwarding
																			// Call
				forwardCalls.add(ec);
		}
		return forwardCalls;
	}

	/** ********Added by Jing Xu, Aug 25, 2005********** */
	public Object clone() {
		Entry en = (Entry) super.clone();
		en.arrivalRate = this.arrivalRate;
		en.callers = (Vector) this.callers.clone();
		en.phases = (Vector) this.phases.clone();
		en.priority = this.priority;
		en.startActivity = (Activity) this.startActivity.clone();
		en.task = (Task) this.task.clone();
		return en;
	}

	/***************************************************************************
	 * Added by Jing Xu, Aug 29, 2005***** * Fix links between this entry
	 * and its phases and between phases and calls
	 */
	public void fixLinks() {
		Iterator iPhases = phases.iterator();
		while (iPhases.hasNext()) {
			Phase ph = (Phase) iPhases.next();
			ph.setEntry(this);
			ph.fixLinks();
		}// end while
	}// end fixLinks

	/** ******************************************** */

	/***************************************************************************
	 * Added by J Xu, Mar 10, 2006***** * Change name of an entry
	 * 
	 * @param newName
	 */
	public void rename(String newName) {
		this.id = new String(newName);
	}

	/***************************************************************************
	 * Added by J Xu, Jul 03, 2007 *********** Get total service time (demand)
	 * of all phases
	 */
	public float getServiceTime() {
		float st = 0;
		for (int i = 0; i < phases.size(); i++) {
			Phase ph = (Phase) phases.get(i);
			st += ph.getServiceTime();
		}
		return st;
	}

	public float getDCodeTightenFactor() { // #20071115
		return fdCodeTightenFactor;
	}

	public void setDCodeTightenFactor(float fdCodeTightenFactor) {// #20071115
		this.fdCodeTightenFactor = fdCodeTightenFactor;
	}

	public float getCCodeTightenFactor() {// #20071115
		return fcCodeTightenFactor;
	}

	public void setCCodeTightenFactor(float fcCodeTightenFactor) {// #20071115
		this.fcCodeTightenFactor = fcCodeTightenFactor;
	}

	public float getDAsynFactor() {// #20071115
		return fdAsynFactor;
	}

	public void setDAsynFactor(float fdAsynFactor) {// #20071115
		this.fdAsynFactor = fdAsynFactor;
	}

	public float getCAsynFactor() {// #20071115
		return fcAsynFactor;
	}

	public void setCAsynFactor(float fcAsynFactor) {// #20071115
		this.fcAsynFactor = fcAsynFactor;
	}

}
