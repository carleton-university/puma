/*
 * EntryCall: Call made by an Entry object
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/EntryCall.java,v 1.1.1.1.4.2 2005/04/29 02:33:41 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: EntryCall.java,v $
 * Revision 1.1.1.1.4.2  2005/04/29 02:33:41  vinoshan
 * *** empty log message ***
 *
 *
 */

package lqnModel;

/**
 * A call made by an entry.
 * <p>
 * <IMG SRC = GenericCall.gif>
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class EntryCall extends GenericCall {

	/**
	 * Source entry of this call.
	 */
	private Entry source;

	/***************************************************************************
	 * Added by Jing Xu, Aug 29, 2005 add back link to phase
	 */
	private Phase phase;

	public void setPhase(Phase ph) {
		phase = ph;
	}

	public Phase getPhase() {
		return phase;
	}

	/** *************************************** */

	/**
	 * Default class constructor
	 * 
	 * @param fromEntry
	 *            the source of the call
	 * @param toEntry
	 *            the target of the call
	 */
	public EntryCall(Entry fromEntry, Entry toEntry) {
		super(toEntry, fromEntry);
		this.source = fromEntry;
		/***********************************************************************
		 * Added by Jing Xu, Feb 13, 2006 No phase specified, set default as
		 * first phase
		 */
		setPhase(fromEntry.getPhase(0));
		/** *************************************** */
	}

	/***************************************************************************
	 * Constructor for forwarding call Added by J Xu, Mar 09, 2006
	 * 
	 * @param fromEntry
	 * @param toEntry
	 * @param forward
	 * @param fanin
	 * @param fanout
	 */
	public EntryCall(Entry fromEntry, Entry toEntry, float forward, int fanin,
			int fanout) {
		super(toEntry, fromEntry);
		this.source = fromEntry;
		this.probForward = new Float(forward);
		this.fanIn = new Integer(fanin);
		this.fanOut = new Integer(fanout);
	}

	/**
	 * Class constructor
	 * 
	 * @param fromEntry
	 *            the source of the call
	 * @param toEntry
	 *            the target of the call
	 * @param meanCalls
	 *            the mean number of calls
	 */
	public EntryCall(Entry fromEntry, Entry toEntry, String meanCalls) {
		super(toEntry, fromEntry);
		this.source = fromEntry;
		this.setMeanCallsString(meanCalls);
		/***********************************************************************
		 * Added by Jing Xu, Mar 09, 2006 No phase specified, set default as
		 * first phase
		 */
		setPhase(fromEntry.getPhase(0));
		/** *************************************** */
	}

	/**
	 * Class constructor
	 * 
	 * @param fromEntry
	 *            the source of the call
	 * @param toEntry
	 *            the target of the call
	 * @param value
	 *            the value to set the fan-in or fan-out depending on the value
	 *            of parameter 'fanin'.
	 * @param fanIn
	 *            fan type. If <code>true</code> the fan-in value is set to
	 *            the value of parameter 'value', otherwise the fan-out value is
	 *            set.
	 */
	public EntryCall(Entry fromEntry, Entry toEntry, String value, boolean fanIn) {
		super(toEntry, fromEntry);
		this.source = fromEntry;
		if (fanIn)
			this.setFanInString(value);
		else
			this.setFanOutString(value);

		/***********************************************************************
		 * Added by Jing Xu, Mar 09, 2006 No phase specified, set default as
		 * first phase
		 */
		setPhase(fromEntry.getPhase(0));
		/** *************************************** */
	}

	/**
	 * Class constructor
	 * 
	 * @param fromEntry
	 *            the source of the call
	 * @param toEntry
	 *            the target of the call
	 * @param probForwd
	 *            probability of call being forwarded
	 * @param rdvI
	 *            call type. if <code>true</code> calls is rendezvous,
	 *            otherwise call is send-no-reply.
	 * @param meancalls
	 *            mean number of times the call is made
	 * @param fanIn
	 *            fan-in value
	 * @param fanOut
	 *            fan-out value
	 */
	public EntryCall(Entry fromEntry, Entry toEntry, float probForwd,
			boolean rdvI, String meancallsString, String fanIn, String fanOut) {
		super(toEntry, fromEntry, probForwd, rdvI, meancallsString, fanIn, fanOut);
		this.source = fromEntry;
		/***********************************************************************
		 * Added by Jing Xu, Mar 09, 2006 No phase specified, set default as
		 * first phase
		 */
		try {
			setPhase(fromEntry.getPhase(0));
		}
		catch (Exception e)
		{
		}
		
		/** *************************************** */
	}

	// public void setValues (Entry fromEntry, Entry toEntry, float probForwd,
	// boolean rdvI) {
	// super.setValues (toEntry, probForwd, rdvI);
	// this.source = fromEntry;
	// }

	/**
	 * Gets the source entry of this call.
	 * 
	 * @return the source entry
	 */
	public Entry getSource() {
		return this.source;
	}

	/**
	 * Sets the source entry of this call
	 * 
	 * @param s
	 *            the source entry
	 */
	public void setSource(Entry s) {
		this.source = s;
	}

	/**
	 * Sets call to have attributes of a forwarded call. Can be used to change
	 * an existing non-forwarded call to a forwarded call.
	 * 
	 * @param probForwd
	 *            the probability of forwarding
	 */
	public void setToForwardingOnlyCall(float probForwd) {
		this.probForward = new Float(probForwd);
		this.rdv = DFL_VAL_RDV;
		this.fanIn = new Integer(DFL_VAL_FANIN);
		this.fanOut = new Integer(DFL_VAL_FANOUT);
		this.meanCall = new Float(DFL_VAL_MEANCALL);
	}

	/**
	 * Sets back link to call in target entry.
	 * 
	 */
	public void setDestinationLink() {
		if (target == null)
			System.out.println("Target is null");
		else
			this.target.addCaller(source);
	}

	/**
	 * Unsets back link to call in target entry.
	 * 
	 */
	public void unsetDestinationLink() {
		this.target.removeCaller(source);
	}
}
