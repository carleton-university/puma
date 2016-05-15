/*
 * ActivityCall: Call made by an Activity object
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/ActivityCall.java,v 1.1.1.1.4.2 2005/04/29 02:33:41 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: ActivityCall.java,v $
 * Revision 1.1.1.1.4.2  2005/04/29 02:33:41  vinoshan
 * *** empty log message ***
 *
 *
 */

package lqnModel;

// import Entry;
// import Activity;

/**
 * A call made by an activity.
 * <p>
 * <IMG SRC = GenericCall.gif>
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class ActivityCall extends GenericCall {

	/**
	 * Source activity of this call.
	 * 
	 */
	private Activity source;

	/**
	 * Default class constructor
	 * 
	 * @param fromActivity
	 *            the source of the call
	 * @param toEntry
	 *            the target of the call
	 */
	public ActivityCall(Activity fromActivity, Entry toEntry) {
		super(toEntry, fromActivity);
		this.source = fromActivity;// Do we need this ??
	}

	/**
	 * Class constructor
	 * 
	 * @param fromActivity
	 *            the source of the call
	 * @param toEntry
	 *            the target of the call
	 * @param rdvI
	 *            the type of call, if true call is rendezvous, if false,
	 *            send-no-reply
	 * @param meancalls
	 *            the mean number of times call made
	 */
	public ActivityCall(Activity fromActivity, Entry toEntry, boolean rdvI, String meancallsString) {
		super(toEntry, null, DFL_VAL_PROBFORWARD, rdvI, meancallsString,
				Integer.toString(DFL_VAL_FANIN), Integer.toString(DFL_VAL_FANOUT));
		this.source = fromActivity;
	}

	/**
	 * Gets the activity that makes this call.
	 * 
	 * @return activity that makes this call
	 */
	public Activity getSource() {
		return this.source;
	}

	/**
	 * Sets the activity that makes this call.
	 * 
	 * @param s
	 *            the activity that makes this call
	 */
	public void setSource(Activity s) {
		this.source = s;
	}

	/**
	 * Sets back link to call in target entry.
	 * 
	 */
	public void setDestinationLink() {
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
