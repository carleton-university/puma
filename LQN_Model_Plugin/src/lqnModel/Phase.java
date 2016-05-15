/*
 * Phase: A phase of an Entry Object
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/Phase.java,v 1.2.4.2 2005/04/29 02:33:41 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: Phase.java,v $
 * Revision 1.2.4.2  2005/04/29 02:33:41  vinoshan
 * *** empty log message ***
 *
 *
 */

package lqnModel;

import java.util.*;
import org.w3c.dom.*;

/**
 * A service phase of an entry.
 * <p>
 * <IMG SRC = Phase.gif>
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class Phase extends ModelNode implements java.io.Serializable {

	/**
	 * Modifed by Jing Xu, Aug 31, 2005 Default value should be true
	 * (Stochastic), instead of false(Deterministic) Default stochastic flag =
	 * true
	 */
	public static final boolean DFL_VAL_STOCHASTIC = true;

	/**
	 * Default coefficient of variation = 1
	 */
	public static final float DFL_VAL_COEFVARIATION = 1;

	/** **modified from 100 to 0 by Jing Xu, Aug 24, 2005****** */
	/**
	 * Default maximum service time = 0
	 */
	public static final float DFL_VAL_MAXSERVTIME = 0;

	/** **modified from 1 to 0 by Jing Xu, Mar 6, 2006****** */
	/**
	 * Default service time = 0.000001
	 */
	public static final float DFL_VAL_SERVTIME = 0.000001F;

	/**
	 * Default phase think time = 0
	 */
	public static final float DFL_VAL_THINKTIME = 0;

	/**
	 * Index of this phase in it's entry (zero-based)
	 */
	protected int phaseNumber; // number of this phase (zero-based)

	/**
	 * Phase type flag.
	 * <p>
	 * <code>true</code>: stochastic, <code>false</code>: deterministic
	 */
	protected boolean stochastic;

	/**
	 * Service time coefficient of variation.
	 */
	protected Float coefVariation;

	/**
	 * Maximum phase service time.
	 */
	protected Float maxServTime;

	/**
	 * Mean phase service time.
	 */
	protected Float servTime;
	public String servTimeString;

	/**
	 * Mean phase think time.
	 */
	protected Float thinkTime;

	/**
	 * List of calls made during this phase.
	 * 
	 * @see GenericCall
	 */
	protected Vector callsOut;

	/**
	 * Result DOM Nodes. Phase has 4 results( additional three Results Node)
	 * ResultActivity will be set in Super.rsultNode
	 */
	protected Node resultActivityDistribution, resultForwarding,
			resultJoinDelay;

	/***************************************************************************
	 * Added by Jing Xu, Aug 29, 2005*** add back link to entry
	 */
	protected Entry entry;

	/** ******************************************* */

	/**
	 * Added by Jing Xu, April 2007 Maximum service time, service time deadline
	 * This is different from the maxServTime This value will not be write into
	 * lqn model file Defalut:0 means no limit
	 */
	private double max_service_time = 0;

	public double getMax_service_time() {
		return max_service_time;
	}

	public void setMax_service_time(double max_service_time) {
		this.max_service_time = max_service_time;
	}

	/**
	 * Default class constructor
	 */
	public Phase() {
		this.phaseNumber = 0;
		this.stochastic = DFL_VAL_STOCHASTIC;
		this.coefVariation = new Float(DFL_VAL_COEFVARIATION);
		this.maxServTime = new Float(DFL_VAL_MAXSERVTIME);
		this.servTime = new Float(DFL_VAL_SERVTIME);
		this.servTimeString = Float.toString(DFL_VAL_SERVTIME);
		this.thinkTime = new Float(DFL_VAL_THINKTIME);
		this.callsOut = new Vector();
		super.resultsNode = null;
	}

	/**
	 * Class constructor
	 * 
	 * @param index
	 *            phase index
	 * @param stoch
	 *            stochastic flag
	 * @param service
	 *            mean service time
	 * @param think
	 *            mean think time
	 * @param maxService
	 *            maximum service time
	 * @param cv
	 *            service time coefficient service time
	 */
	public Phase(int index, boolean stoch, float service, float think,
			float maxService, float cv) {
		this.phaseNumber = index;
		this.stochastic = stoch;
		this.coefVariation = new Float(cv);
		this.maxServTime = new Float(maxService);
		this.servTime = new Float(service);
		this.servTimeString = Float.toString(service);
		this.thinkTime = new Float(think);
		this.callsOut = new Vector();
		super.resultsNode = null;
	}

	/**
	 * Gets the stochastic flag
	 * 
	 * @return if <code>true</code> phase is stochastic, otherwise it is
	 *         deterministic
	 */
	public boolean isStochastic() {
		return this.stochastic;
	}

	/**
	 * Sets the stochastic flag.
	 * <p>
	 * <code>true</code>: stochastic, <code>false</code>: deterministic
	 * 
	 * @param st
	 */
	public void setStochastic(boolean st) {
		this.stochastic = st;
	}

	/**
	 * Gets the mean service time coefficient of variation.
	 * 
	 * @return mean service time coefficient of variation
	 */
	public float getCoefVariation() {
		return this.coefVariation.floatValue();
	}

	/**
	 * Sets the mean service time coefficient of variation.
	 * 
	 * @param cv
	 *            mean service time coefficient of variation
	 */
	public void setCoefVariation(float cv) {
		this.coefVariation = new Float(cv);
	}

	/**
	 * Gets the maximum phase service time
	 * 
	 * @return max phase service time
	 */
	public float getMaxServiceTime() {
		return this.maxServTime.floatValue();
	}

	/**
	 * Sets the maximum phase service time.
	 * 
	 * @param mst
	 *            max phase service time
	 */
	public void setMaxServiceTime(float mst) {
		this.maxServTime = new Float(mst);
	}

	/**
	 * Gets the mean phase service time.
	 * 
	 * @return mean phase service time
	 */
	public float getServiceTime() {
		return this.servTime.floatValue();
	}

	public String getServiceTimeString() {
		return this.servTimeString;
	}

	/**
	 * Sets the mean phase service time.
	 * 
	 * @param st
	 *            mean phase service time
	 */
	public void setServiceTime(float st) {
		this.servTime = new Float(st);
		this.servTimeString = Float.toString(st);
	}

	public void setServiceTimeString(String s)
	{
		this.servTimeString = new String(s);

		try
		{
			this.servTime = new Float(s);
		}
		catch(Exception e)
		{
			this.servTime = new Float(-1);
		}

		return;
	}

	/**
	 * Gets the phase think time
	 * 
	 * @return phase think time
	 */
	public float getThinkTime() {
		return this.thinkTime.floatValue();
	}

	/**
	 * Sets the phase think time
	 * 
	 * @param tt
	 *            phase think time
	 */
	public void setThinkTime(float tt) {
		this.thinkTime = new Float(tt);
	}

	/**
	 * Gets the index of this phase. Index is zero-based.
	 * 
	 * @return index of phase
	 */
	public int getIndex() {
		return this.phaseNumber;
	}

	/**
	 * Sets the index of this phase. Index is zero-based.
	 * 
	 * @param i
	 *            phase index
	 */
	public void setIndex(int i) {
		this.phaseNumber = i;
	}

	/**
	 * Gets the list of calls that are made during this phase.
	 * 
	 * @return list of called entries
	 * @see #callsOut
	 */
	public Vector getCallsOut() {
		return this.callsOut;
	}

	/**
	 * Sets the list of calls made during this phase. Destination links are set.
	 * 
	 * @param calls
	 *            vector of call objects
	 * @see GenericCall
	 */
	public void setCallsOut(Vector calls) {
		this.callsOut = calls; // replace the old vector with the new one

	}

	/**
	 * Adds entry call to phase
	 * 
	 * @param src
	 *            the source entry to be added
	 * @param dest
	 *            the destination entry
	 * @param rdv
	 *            the type of call, if <code>true</code>: rendezvous,<code>false</code>:
	 *            send-no-reply
	 * @param meancalls
	 *            the mean number of calls
	 */

	public void addCallOut(Entry src, Entry dest, boolean rdv, String meancallsString) {
		EntryCall call = new EntryCall(src, dest, meancallsString);
		call.setRendezvous(rdv);
		this.addCallOut(call);
	}

	public void addCallOutNum(Entry src, Entry dest, boolean rdv, float meancalls) {
		addCallOut(src,dest,rdv,Float.toString(meancalls));
	}


	/**
	 * Adds entry call to this phase.
	 * 
	 * @param src
	 *            the source entry to be added
	 * @param dest
	 *            the destination entry
	 * @param value
	 *            the fanIn or fanOut value
	 * @param fanIn
	 *            fan flag. If <code>true</code>, set fanIn value else set
	 *            fanOut value
	 */
	public void addCallOut(Entry src, Entry dest, String value, boolean fanIn) {
		EntryCall call = new EntryCall(src, dest, value, fanIn);
		this.addCallOut(call);
	}

	/**
	 * Adds entry call to this phase.
	 * 
	 * @param src
	 *            the source entry to be added
	 * @param dest
	 *            the destination entry
	 * @param probForwd
	 *            the probability of forwarding
	 * @param rdvI
	 *            type of call: if <code>true</code> call is synchronous,
	 *            otherwise call is asynchronous
	 * @param meancalls
	 *            the mean number of calls
	 * @param fanIn
	 *            the fanIn
	 * @param fanOut
	 *            the fanOut
	 */
	public void addCallOut(Entry src, Entry dest, float probForwd,
			boolean rdvI, String meancallsString, String fanIn, String fanOut) {
		EntryCall call = new EntryCall(src, dest, probForwd, rdvI, meancallsString,	fanIn, fanOut);
		this.addCallOut(call);
	}

	public void addCallOutNum(Entry src, Entry dest, float probForwd,
			boolean rdvI, float meancalls, String fanIn, String fanOut) {
		addCallOut(src,dest,probForwd,rdvI,Float.toString(meancalls),fanIn,fanOut);
	}

	/**
	 * Removes call from phase. Unsets the destination back link.
	 * 
	 * @param call
	 *            the call to be removed
	 */
	public void removeCallOut(GenericCall call) {
		call.unsetDestinationLink();
		this.callsOut.remove(call);
	}

	/**
	 * Removes call based on destination entry. Unsets destination back link.
	 * 
	 * @param dest
	 *            the destination entry of call to be removed
	 */
	public void removeCallOut(Entry dest) {
		for (Enumeration e = callsOut.elements(); e.hasMoreElements();) {
			GenericCall call = (GenericCall) e.nextElement();
			if (call.getDestination() == dest) {
				call.unsetDestinationLink();
				this.callsOut.remove(call);
			}
		}
	}

	/**
	 * Removes all calls from this phase. Unsets all destination back links.
	 */
	public void removeAllCallsOut() {
		this.unsetCallDestinationLinks();
		this.callsOut.clear();
	}

	/**
	 * Adds a call to this phase. Call's destination link is set.
	 * 
	 * @param call
	 *            call to add
	 */
	public void addCallOut(GenericCall call) {
		call.setDestinationLink();
		this.callsOut.add(call);
	}

	/**
	 * Sets the destination links for all calls in this phase.
	 */
	private void setCallDestinationLinks() {
		for (Enumeration e = this.callsOut.elements(); e.hasMoreElements();) {
			GenericCall call = (GenericCall) e.nextElement();
			call.setDestinationLink();
		}
	}

	/**
	 * Unsets destination links for all calls in this phase.
	 */
	private void unsetCallDestinationLinks() {
		for (Enumeration e = this.callsOut.elements(); e.hasMoreElements();) {
			GenericCall call = (GenericCall) e.nextElement();
			call.unsetDestinationLink();
		}
	}

	/**
	 * Sets the ResultActiDistribution Node. This will be called by the DOM
	 * parser.
	 * 
	 * @param reActDest
	 *            Node
	 */
	public void setResultActDistriNode(Node reActDest) {
		this.resultActivityDistribution = reActDest;
	}

	/**
	 * This will be called by the DOM parser.
	 * 
	 * @param resJoinDely
	 *            Node
	 */
	public void setResultJoinDelayNode(Node resJoinDely) {
		this.resultJoinDelay = resJoinDely;
	}

	/**
	 * This will be called by the DOM parser.
	 * 
	 * @param resResFowarding
	 *            Node
	 */
	public void setResultFowarding(Node resResFowarding) {
		this.resultForwarding = resResFowarding;
	}

	/**
	 * This method computes the Fraction of Time Blocked(FTB) in each call. This
	 * FTB is used to display the Saturation Brakedown in Bottleneck View.
	 * 
	 * Allgorithm: {By: Vino Shanmugarajah} For each Call 1. Get the mean
	 * Blocking time of its destination 2. Get the Utilization of this phase 3.
	 * Get the mean Service Time for this phase. 4. Calculate FTB = step 1* step
	 * 2/ step 3 5. Store FTB in each call's "fracBlockTime" variable - This
	 * will eliminate the need for maintaing a list of FTB in Calls. We can
	 * always access the List of calls and get the FTB dynamically.
	 * 
	 * @return boolean
	 */
	public void computeFTBforEachCalls() {

		if (this.hasResults()) {// This phase has results!
			double phaseUtil = this.getDoubleResultAttr("utilization");
			double phaseMeanServiceTime = this
					.getDoubleResultAttr("service-time-variance");
			Enumeration ec = this.callsOut.elements();
			while (ec.hasMoreElements()) {
				GenericCall gc = (GenericCall) ec.nextElement();
				if (gc.hasResults()) {
					double meanBlocking = gc
							.getDoubleResultAttr("waiting-variance");
					if (phaseUtil > 0 && phaseMeanServiceTime > 0
							&& meanBlocking > 0) {
						// All the values are valid. So, we can calculate the
						// FBT.
						double fbt = (meanBlocking * phaseUtil)
								/ phaseMeanServiceTime;
						gc.setFracOfBlockTime(fbt);
						// This is for test. It must be removed.
						System.out.println("FBT for  " + gc.getSourceName()
								+ "/" + phaseNumber + "---->"
								+ gc.getDestination().getName() + " is "
								+ gc.getFracOfBlockTime());

					}// if all the numbers are valid
				}
			}// while
		}// if this has results
	}

	/***************************************************************************
	 * Added by Jing Xu, Aug 29, 2005*** add back link to entry
	 */
	public Entry getEntry() {
		return this.entry;
	}

	public void setEntry(Entry en) {
		this.entry = en;
	}

	/** ******************************************* */

	/***************************************************************************
	 * Added by Jing Xu, Aug 29, 2005***** * Fix links between this phase and
	 * its calls
	 */
	public void fixLinks() {
		Iterator iCalls = callsOut.iterator();
		while (iCalls.hasNext()) {
			Object aCall = iCalls.next();
			if (aCall instanceof EntryCall) {
				EntryCall encall = (EntryCall) aCall;
				encall.setPhase(this);
			}// end if
		}// end while
	}// end fixLinks
	/** ********************************************** */
}
