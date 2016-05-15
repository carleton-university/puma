/*
 * Activity: A single phase with other attributes
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/Activity.java,v 1.1.1.1.4.2 2005/04/29 02:33:41 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: Activity.java,v $
 * Revision 1.1.1.1.4.2  2005/04/29 02:33:41  vinoshan
 * *** empty log message ***
 *
 *
 */

package lqnModel;

import java.util.*;

// import java.text.DecimalFormat; // for rounding off doubles after dividing

/**
 * An activity in a Layered Queuing Network model
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class Activity extends Phase {

	boolean enableLogging = false;
	/**
	 * Default probabality = 1.0
	 */
	public static final double DFL_VAL_PROBABILITY = 1.0;

	/**
	 * Default repeat = 1.0
	 */
	public static final double DFL_VAL_REPEAT = 1.0;

	/**
	 * Name of activity
	 */
	private String id;

	/**
	 * Back link to task that owns this activity
	 */
	private Task task; // back link to task

	/**
	 * Type of connection made from previous Activity. Either "next", "ANDfork"
	 * "ANDjoin", "ORfork", "ORjoin"
	 */
	private String prevConnection;

	/**
	 * Type of connection made to next Activity. Either "next", "ANDfork"
	 * "ANDjoin", "ORfork", "ORjoin"
	 */
	private String nextConnection;

	/**
	 * Vector of activities that proceed the current activity
	 */
	private Vector previous;

	/**
	 * Vector of activities that follow the current activity
	 */
	private Vector next;

	/**
	 * Vector of probabilities associated with each Activity in the vector
	 * previous
	 */
	private Vector prevProbabilities;

	/**
	 * Vector of probabilities associated with each Activity in the vector next
	 */
	private Vector nextProbabilities;

	/**
	 * Boolean indicating whether Activity replies to an entry or not
	 */
	private boolean replyActivity;

	/**
	 * The entry to which the Activity replies. Null if Activity is not a
	 * replyActivity
	 */
	// private Entry replyEntry;
	/**
	 * A vector of entries to which the Activity replies.
	 */
	private Vector replyEntries;

	/**
	 * Boolean indicating whether Activity is start of a sequence of Activities
	 * which must be repeated.
	 */
	private boolean repeatStart;

	/**
	 * Boolean indicating whether Activity is end of a sequence of Activities
	 * which must be repeated.
	 */
	private boolean repeatEnd;

	/**
	 * The number of times a sequence of activities must be repeated. One (by
	 * default) if activity is not repeated.
	 */
	private double repeat;

	/**
	 * Boolean variable used in printing activities to indicate whether it has
	 * been printed or not
	 */
	private boolean marked;

	/**
	 * This String variable will represent to Which entry this activity is bound
	 * to, if any.
	 * 
	 */

	private String boundToEntry;

	/**
	 * A string alias that will be the name which will apear on the sctivity
	 * preceding diagram
	 */
	private String alias;

	public static int count = 0;

	/**
	 * Default class constructor - All connections types are null by default and
	 * all booleans are false
	 */
	public Activity() {
		super();
		this.id = new String();
		this.task = null;

		this.prevConnection = new String();
		this.nextConnection = new String();
		this.previous = new Vector();
		this.next = new Vector();
		this.prevProbabilities = new Vector();
		this.nextProbabilities = new Vector();
		this.replyEntries = new Vector();
		this.boundToEntry = new String();
		setPrevConnection(null);
		setNextConnection(null);
		marked = false;
		replyActivity = false;
		repeatStart = false;
		repeatEnd = false;
		repeat = DFL_VAL_REPEAT;
		this.alias = new String("a" + Activity.count);
		count++;

	}

	/**
	 * Class constructor
	 * 
	 * @param name
	 *            activity name
	 * @param tsk
	 *            parent task
	 */
	public Activity(String name, Task tsk) {
		super();
		this.id = new String(name);
		this.task = tsk;
		this.boundToEntry = new String();
		this.prevConnection = new String();
		this.nextConnection = new String();
		this.previous = new Vector();
		this.next = new Vector();
		this.prevProbabilities = new Vector();
		this.nextProbabilities = new Vector();
		this.replyEntries = new Vector();
		setPrevConnection(null);
		setNextConnection(null);
		marked = false;
		replyActivity = false;
		repeatStart = false;
		repeatEnd = false;
		repeat = DFL_VAL_REPEAT;
		this.alias = new String("a" + Activity.count);
		count++;

	}

	/**
	 * Gets name.
	 * 
	 * @return name of activity
	 */
	public String getName() {
		return new String(id);
	}

	/**
	 * Sets name.
	 * 
	 * @param name
	 *            name of activity
	 */
	public void setName(String name) {
		this.id = new String(name);
	}

	/**
	 * Gets the parent task
	 * 
	 * @return parent task
	 */
	public Task getTask() {
		return this.task;
	}

	/**
	 * Sets parent task.
	 * 
	 * @param t
	 *            parent task
	 */
	public void setTask(Task t) {
		this.task = t;
	}

	/**
	 * Gets the connection type going into the Activity.
	 * 
	 * @return prevConnection type
	 */
	public String getPrevConnection() {
		if (prevConnection == null)
			return null;
		else
			return new String(prevConnection);
	}

	/**
	 * Called from setNextConnection. Sets the connection type going into the
	 * Activity.
	 * 
	 * @param prevConnect
	 *            string
	 */
	private void setPrevConnection(String prevConnect) {
		if (prevConnect == null)
			this.prevConnection = null;
		else if ((prevConnect.equals("next"))
				|| (prevConnect.equals("ANDfork"))
				|| (prevConnect.equals("ANDjoin"))
				|| (prevConnect.equals("ORfork"))
				|| (prevConnect.equals("ORjoin")))
			this.prevConnection = new String(prevConnect);

	}

	/**
	 * Gets the connection type going out of the Activity.
	 * 
	 * @return nextConnection type
	 */
	public String getNextConnection() {
		if (nextConnection == null)
			return null;
		else
			return new String(nextConnection);
	}

	/**
	 * Sets the connection type going out of the Activity. Also sets the
	 * prevConnection for all the activities that follow current activity.
	 * 
	 * @param nextConnect
	 *            string
	 */
	public void setNextConnection(String nextConnect) {
		if (nextConnect == null)
			this.nextConnection = null;
		else if ((nextConnect.equals("next"))
				|| (nextConnect.equals("ANDfork"))
				|| (nextConnect.equals("ANDjoin"))
				|| (nextConnect.equals("ORfork"))
				|| (nextConnect.equals("ORjoin")))
			this.nextConnection = new String(nextConnect);

		// for each activity that follows, set the prevConnection

		Enumeration e = getNext().elements();
		while (e.hasMoreElements()) {

			Activity activity = (Activity) e.nextElement();
			activity.setPrevConnection(this.nextConnection);
		}

	}

	/**
	 * Gets a vector of the activities that preceed the current activity.
	 * 
	 * @return Vector in
	 */
	public Vector getPrevious() {
		return previous;
	}

	/**
	 * Sets the vector of preceeding activities.
	 * 
	 * @param vect -
	 *            vector of activities that preceed the current activity
	 */
	public void setPrevious(java.util.Vector vect) {
		previous = vect;
	}

	public void setBoundToEntry(String entName) {
		boundToEntry = entName;
	}

	public String getBoundToEntry() {
		return boundToEntry;
	}

	/**
	 * Gets a vector of the activities that follow the current activity.
	 * 
	 * @return Vector out
	 */
	public Vector getNext() {
		return next;
	}

	/**
	 * Clears the vector, next, and sets it to the vector passed in. If the
	 * connection type is set to next, ANDjoin, or ORjoin, only the first
	 * activity in the vector is put in the next vector. Note: the connection
	 * type is not set, nor are the probabilities
	 * 
	 * @param vect :
	 *            vector of activities that follow the current activity
	 */
	public void setNext(java.util.Vector vect) {
		clearNext(); // removes connections with all old following activities

		if (vect != null)
			;
		{
			// if the connectin type has already been set to next, or a join,
			// can only have one activity, so take first activity from vector
			// passed in
			// 09/08/01
			if ((nextConnection != null)
					&& ((nextConnection.equals("next"))
							|| (nextConnection.equals("ANDjoin")) || (nextConnection
							.equals("ORjoin"))))
				next.addElement(vect.firstElement());
			else
				next = vect;

			int i, j;
			// for each activity that follows set the previous activity
			Enumeration e = next.elements(); // use next not vect //09/08/01
			while (e.hasMoreElements()) {
				Activity activity = (Activity) e.nextElement();
				activity.previous.addElement(this); // back connection
				activity.setPrevConnection(this.nextConnection); // back
				// connection
				// type
				// //09/08/01
				if (enableLogging){
					System.out.println("activity.getPrevConn: "+ activity.getPrevConnection());
				}
			}

		}

	}

	/**
	 * Sets the vector of preceeding probabilities.
	 * 
	 * @param vect -
	 *            Vector of probabilities corresponding to activities that
	 *            preceed the current activity
	 */
	private void setPrevProbabilities(Vector vect) {
		prevProbabilities = vect;
	}

	/**
	 * Gets a vector of the probabilities corresponding to the activities that
	 * preceed the current activity.
	 * 
	 * @return Vector prevProbabilties
	 */
	public Vector getPrevProbabilities() {
		return prevProbabilities;
	}

	/**
	 * Sets nextProbabilities to the vector passed in. For each activity that
	 * follows the previous probability is set. Note: it is assumed the next
	 * vector of activities has been set and the number of next activities
	 * corresponds with the number of probabilities.
	 * 
	 * @param vect -
	 *            vector of activities that follow the current activity
	 */
	public void setNextProbabilities(Vector vect) {
		if (enableLogging){
			System.out.println("this.getNext(): " + this.getNext());
		}
		nextProbabilities = vect;
		// for each activity that follows set the previous probability
		Enumeration e = next.elements();
		int i, j;
		while (e.hasMoreElements()) {
			Activity activity = (Activity) e.nextElement();
			i = next.indexOf(activity); // pos of activity
			j = activity.previous.indexOf(this); // pos of activity in
			// previous
			// if at that index, there is nothing or if the size is smaller so
			// nothing
			// can be at index, add() to prevProbabilities instead of
			// setElementAt()
			if ((activity.prevProbabilities.size() - 1 < j) || (activity.prevProbabilities.elementAt(j) == null)) {
				if (enableLogging){
					System.out.println("this" + this);
					System.out.println("nextProbs: " + this.nextProbabilities);
					System.out.println("activity" + activity);
					System.out.println("prevProbs: " + activity.prevProbabilities);
				}
				activity.prevProbabilities.add(j, this.nextProbabilities
						.elementAt(i)); // 14/08/01
			} else {
				if (enableLogging){
					System.out.println();
					System.out.println("this" + this);
					System.out.println("nextProbs: " + this.nextProbabilities);
					System.out.println("activity" + activity);
					System.out.println("prevProbs: " + activity.prevProbabilities);
				}
				activity.prevProbabilities.setElementAt(this.nextProbabilities
						.elementAt(i), j);
				// activity.prevProbabilities.removeElementAt(j);
				// activity.prevProbabilities.add(j,
				// this.nextProbabilities.elementAt(i));
			}
		}

	}

	/**
	 * Gets a vector of the probabilities corresponding to the activities that
	 * follow the current activity.
	 * 
	 * @return Vector nextProbabilties
	 */
	public Vector getNextProbabilities() {
		return nextProbabilities;
	}

	/**
	 * Sets the boolean; <code>true</code> if the Activity replies to an
	 * entry, <code>false</code> if it does not reply.
	 * 
	 * @param b -
	 *            boolean indicating whether Activity replies to an Entry or not
	 */
	public void setReplyActivity(boolean b) {
		replyActivity = b;
	}

	/**
	 * <code>True</code> if the Activity replies to an entry,
	 * <code>false</code> if it does not.
	 * 
	 * @return boolean replyActivity
	 */
	public boolean isReplyActivity() {
		return replyActivity;
	}

	/**
	 * Sets replyEntry to the Entry to which the Activity replies
	 * 
	 * @param Entry
	 *            the Entry to which the Activity replies
	 */
	/*
	 * public void setReplyEntry(Entry e) { replyEntry = e; }
	 */

	/**
	 * Sets the vector replyEntries.
	 * 
	 * @param entries
	 *            a vector of Entries to which the Activity replies
	 */

	public void setReplyEntries(Vector entries) {
		setReplyActivity(true);
		replyEntries = entries;
	}

	/**
	 * Gets the Entry to which Activity replies.
	 * 
	 * @return Entry the replyEntry
	 */
	/*
	 * public Entry getReplyEntry() { return replyEntry; }
	 */

	/**
	 * Gets the Vector of Entries to which Activity replies.
	 * 
	 * @return Vector of entries
	 */
	public Vector getReplyEntries() {
		return replyEntries;
	}

	/**
	 * Sets the boolean; <code>true</code> if the Activity is the start of a
	 * repeat sequence <code>false</code> if it is not the start.
	 * 
	 * @param b -
	 *            boolean indicating whether Activity is start of repeat
	 *            sequence or not
	 */

	public void setRepeatStart(boolean b) {
		repeatStart = b;
	}

	/**
	 * <code>True</code> if the Activity is start of repeat sequence,
	 * <code>false</code> if it is not.
	 * 
	 * @return boolean repeatStart
	 */
	public boolean isRepeatStart() {
		return repeatStart;
	}

	/**
	 * Sets the boolean; <code>true</code> if the Activity is the end of a
	 * repeat sequence, ie, first activity after a repeat sequence,
	 * <code>false</code> if it is not.
	 * 
	 * @param b -
	 *            boolean indicating whether Activity is first activity after of
	 *            repeat sequence or not
	 */

	public void setRepeatEnd(boolean b) {
		repeatEnd = b;
	}

	/**
	 * <code>True</code> if the Activity is the end of (the first activity
	 * after) a repeat sequence, <code>false</code> if it is not.
	 * 
	 * @return boolean repeatEnd
	 */
	public boolean isRepeatEnd() {
		return repeatEnd;
	}

	/**
	 * Sets the number of times an Activity is to be repeated if it is in a
	 * repeat sequence.
	 * 
	 * @param d -
	 *            the number of times the Activity is repeated
	 */
	public void setRepeat(double d) {
		repeat = d;
	}

	/**
	 * Gets the number of times the Activity is to be repeated if it in a repeat
	 * sequence.
	 * 
	 * @return repeat - the number of times the Activity is repeated.
	 */
	public double getRepeat() {
		return repeat;
	}

	/**
	 * Used in printing activities
	 * 
	 * @return boolean true if the activity has been printed false if the
	 *         activity has not been printed
	 */

	public boolean getMarked() {
		return marked;
	}

	/**
	 * Used in printing Sets the boolean marked to true
	 */

	public void setMarked() {
		marked = true;
	}

	/**
	 * Used in printing Sets the boolean marked to false
	 */

	public void unsetMarked() {
		marked = false;
	}

	/**
	 * Does nothing. Overridden method.
	 * 
	 * @param i
	 */
	public void setIndex(int i) {
		/** * override Phase method to do nothing ** */
	}

	/**
	 * Returns a boolean indicating if there are more activities that follow the
	 * current
	 * 
	 * @return boolean is true if there are more activities false if no more
	 */
	public boolean hasMoreActivities() {
		return (next.size() > 0);
	}

	/**
	 * Adds the activity and sets the connections between the activities. Also
	 * adds the probabilty, in this case the DFL_VAL_PROBABILITY.
	 * 
	 * @param nextType -
	 *            the type of connection coming out of the current activity
	 * @param activity -
	 *            the activity to follow the current activity
	 */
	public void addActivity(String nextType, Activity activity) {
		addActivity(nextType, activity, DFL_VAL_PROBABILITY);

	}

	/**
	 * Adds the activity and sets the connections between the activities. Also
	 * adds the probability of the activity added.
	 * 
	 * @param nextType -
	 *            the type of connection coming out of the current activity
	 * @param activity -
	 *            the activity to follow the current activity
	 * @param probability -
	 *            of the activity coming after the current activity
	 */
	public void addActivity(String nextType, Activity activity,
			double probability) {
		// sets the nextConnection for the currentActivity and the
		// prevConnection for the activity being added
		setNextConnection(nextType);
		addActivity(activity, probability);

	}

	/**
	 * Adds the activity. Also adds the probabilty, in this case the
	 * DFL_VAL_PROBABILITY.
	 * 
	 * @param a -
	 *            Activity that comes after the current activity
	 */

	public void addActivity(Activity a) {
		addActivity(a, DFL_VAL_PROBABILITY);
	}

	/**
	 * Adds the activity and the probability. Also adds the probability of the
	 * activity added.
	 * 
	 * @param a -
	 *            Activity that comes after the current activity
	 * @param p -
	 *            double probability of that activity coming after the current
	 *            activity
	 */
	public void addActivity(Activity a, double p) {
		next.addElement(a); // adds activity to next
		a.setPrevConnection(this.getNextConnection()); // backlink

		// set its prevConnection assuming prev activity's conn is set
		a.previous.addElement(this);

		int i = next.indexOf(a); // get index of activity
		nextProbabilities.insertElementAt(new Double(p), i);// at same index put
		// prob

		// assuming the activity has been added to previous, add prevProbability
		int j = a.previous.indexOf(this);
		a.prevProbabilities.insertElementAt(new Double(p), j);
	}

	/**
	 * Sets the Next activities and the probabilities to the default
	 * probability. String connections between activities are also set.
	 * 
	 * Note: All next activities and probabilities are overwritten.
	 * 
	 * @param nextType -
	 *            the type of connection coming out of the current activity
	 * @param activities -
	 *            vector of activities to follow the current activity
	 */
	public void addActivity(String nextType, Vector activities) {
		// Gets a vector with only DFL_VAL_PROBABILITY, the same size as the
		// vector of activities passed in
		Vector probabilities = defaultProbabilities(activities);
		addActivity(nextType, activities, probabilities);
	}

	/**
	 * Sets the Next activities and the probabilities. String connections
	 * between activities are also set.
	 * 
	 * Note: All next activities and probabilities are overwritten.
	 * 
	 * @param nextType -
	 *            the type of connection coming out of the current activity
	 * @param activities -
	 *            vector of activities to follow the current activity
	 * @param probabilities -
	 *            vector of probabilites corresponding to the activity vector
	 *            passed in
	 */
	public void addActivity(String nextType, Vector activities,
			Vector probabilities) {
		// sets the vector to vector passed in
		setNext(activities);
		// sets probabilities to probability vector passed in, or default values
		setNextProbabilities(probabilities); // must be done AFTER next()
		// activities set
		setNextConnection(nextType); // must be done AFTER next() activities
		// set

	}

	/**
	 * Adds a basic/sequential connection to the activity specified
	 * 
	 * @param activity -
	 *            the activity to be added to the current activity
	 * @throws ActivitySequenceException
	 *             if activity is null or activiyt cannot be added
	 * @return boolean, if activity was added successfully returns true
	 */

	public boolean addBasicConnection(Activity activity)
			throws ActivitySequenceException {

		// make sure activity is not null
		if (activity == null)
			throw new ActivitySequenceException(
					"A null activity cannot be added");
		else {
			// create a string connection type
			String connectionType = new String("next");

			// the activity to be added on to is not in an activiyt connectoin
			boolean before = false;

			// the activity being added is not in an activity connection
			boolean after = false;

			// the activity adding on to is connected to others
			if (this.isConnected())
				before = true; // check if connected

			// the activity we are adding is connected to others
			if (activity.isConnected())
				after = true; // check if connected

			// can't add two already connected activities to eachother
			// if (addingAfter && addingBefore && connectionType.equals("next"))
			// return false;

			// can't add an activity that is already connected after, to an
			// activity
			// already connected from before
			// if (this.getNextConnection()!=null &&
			// activity.getPrevConnection()!=null)
			// return false;

			// can only have z.add(a) where z is not connected for a "next"
			// conn, if a is the first activity in seq
			// if(connectionType.equals("next") && after)
			// if (activity.getPrevious().size()>0 ||
			// activity.getPrevConnection()!=null
			// || activity.getPrevProbabilities().size()>0)
			// return false;

			// if the activity to add onto is not connected, and activity
			// after is connected but in a join, or fork, can't make it into
			// a next
			if (!before
					&& after
					&& ((activity.getPrevConnection().equals("ORjoin")) || (activity
							.getPrevConnection().equals("ANDjoin"))
					// || (activity.getPrevConnection().equals("ORfork"))
					// || (activity.getPrevConnection().equals("ANDfork"))
					)) {
				throw new ActivitySequenceException(
						"A basic connection cannot be added because a join or fork connection already precedes this activity.");
			}

			// initialize vars to hold activities that must be transfered
			// from one activity's connections to others
			Vector acts = null;
			String conn = null;
			Vector probs = null;
			Activity act = null;

			// the one to be added on is not connected so must take care of
			// connections after it
			// the case wehre A->B and a.add(z);
			if (!after && this.getNext().size() > 0) {
				// get the acts, probs and conn coming after activity to
				// add onto
				acts = new Vector(this.getNext());
				probs = new Vector(this.getNextProbabilities());
				conn = new String(this.getNextConnection());
			}

			// the case where a->b and z.add(b);
			// we are adding on to a notConnected activity
			// must take care of activities that came before b
			if (!before && activity.getPrevious() != null) {
				if (activity.getPrevious().size() > 0) {
					act = (Activity) activity.getPrevious().firstElement();
					// conn = new String(this.getNextConnection());
					Vector v2 = null;
					Vector probs3 = null;
					// act.setNextConnection(connectionType);
					// we know its a next for sure
					if (act.getNextConnection() != null
							&& act.getNextConnection().equals("next")) {
						// set the preceeding activitiy to go to
						// hte newly added activity (z)
						v2 = new Vector();
						v2.addElement(this);
						probs3 = new Vector();
						probs3.addElement(new Double(DFL_VAL_PROBABILITY));

					}

					else {
						//
						v2 = new Vector(act.getNext());
						int index = v2.indexOf(activity);
						v2.removeElement(activity); // remove the activity
						v2.insertElementAt(this, index);// put in the new
						// activity in the same
						// place
						if (enableLogging){
							System.out.println("v2: " + v2);
						}
						probs3 = new Vector(act.getNextProbabilities());
						if (enableLogging){
							System.out.println("probs3" + probs3);
						}
					}

					// all activities that were following are cleared
					act.setNext(v2);

					act.setNextProbabilities(probs3);

					// if the activity was in a repeat loop and not the end,
					// the activity added, is also in repeat loop
					if ((act.getRepeat() != 1) && (!act.isRepeatEnd()))
						activity.repeat = act.repeat;

				}
			}
			// set type of connection
			this.setNextConnection(connectionType);
			if (enableLogging){
				System.out.println("***this: " + this);
			
				System.out.println("this.nextconn: " + this.getNextConnection());
			}
			Vector v = new Vector();
			v.addElement(activity);
			// all activities that were following are cleared
			this.setNext(v);
			if (enableLogging){
				System.out.println("v.getConn" + activity.getPrevConnection());
				System.out.println("v:" + v);
			}
			// set up the probabilities
			Vector probs2 = defaultProbabilities(v);
			this.setNextProbabilities(probs2);

			if (!after && acts != null && conn != null && probs != null) {
				activity.setNextConnection(conn);
				activity.setNext(acts);
				activity.setNextProbabilities(probs);
			}
			// if (!before && act!=null && conn!=null)
			// {

			// System.out.println("v.getConn" + activity.getPrevConnection());

			// }

			return true;

		}

	}

	public boolean addANDJoinConnection(Activity activity)
			throws ActivitySequenceException {
		if (activity == null)
			throw new ActivitySequenceException(
					"A null activity cannot be added");
		else
			return addAnActivity("ANDjoin", activity);
	}

	public boolean addORJoinConnection(Activity activity)
			throws ActivitySequenceException {
		if (activity == null)
			throw new ActivitySequenceException(
					"A null activity cannot be added");
		else
			return addAnActivity("ORjoin", activity);
	}

	private boolean addAnActivity(String connectionType, Activity activity)
			throws ActivitySequenceException {

		// boolean removed = true;
		// the preceeding activiyt is connected
		boolean before = false;
		// the succeeding activity is connected
		boolean after = false;
		if (enableLogging){
			System.out.println("inside the addActivitymethod");
		}
		// activity previously connected

		// the activity adding on to is connected to others
		if (this.isConnected())
			before = true;

		// the activity we are adding is connected to others
		if (activity.isConnected())
			after = true;

		// for the case where z.add(b) and b is already connected
		// if (!before && activity.getPrevConnection()!=null)
		if (activity.getPrevConnection() != null)

		{
			if ((activity.getPrevConnection().equals("ANDfork"))
					|| (activity.getPrevConnection().equals("ORfork"))) {
				throw new ActivitySequenceException(
						"A join cannot be added because a fork connection already precedes this activity.");
			}
		}

		// z.add(b) where b is connected, but z is not
		if (!before && after) {
			throw new ActivitySequenceException(
					"An activity succeeded by a join must have preceding connections.");
		}

		// the activity we are adding on to was previously connected,
		// give its connections to the new activity

		Vector acts = null;
		String conn = null;
		Vector probs = null;
		// the one to be added on is not connected so must take care of
		// connections after it
		// for the case where a->b and a.add(z);
		if (!after && this.getNext().size() > 0) {
			acts = new Vector(this.getNext());
			conn = new String(this.getNextConnection());
			probs = new Vector(this.getNextProbabilities());
		}
		/*
		 * Activity act = null; // the case where a->b and z.add(b); if (!before &&
		 * (activity.getPrevConnection().equals("next")) ) { if
		 * (activity.getPrevious().size()>0) { act =
		 * (Activity)activity.getPrevious().firstElement(); Vector v2 = null;
		 * Vector probs3 = null;
		 * 
		 * //act.setNextConnection(connectionType); // we know its a next for
		 * sure //if (act.getNextConnection().equals("next")) // { v2 = new
		 * Vector(); v2.addElement(this); probs3 = new Vector();
		 * probs3.addElement(new Double(DFL_VAL_PROBABILITY)); // } // all
		 * activities that were following are cleared act.setNext(v2);
		 * 
		 * act.setNextProbabilities(probs3); } }
		 */

		// set type of connection
		this.setNextConnection(connectionType);
		if (enableLogging){
			System.out.println("***this: " + this);
			System.out.println("this.nextconn: " + this.getNextConnection());
		}
		Vector v = new Vector();
		v.addElement(activity);
		// all activities that were following are cleared
		this.setNext(v);
		if (enableLogging){
			System.out.println("v:" + v);
		}
		// set up the probabilities
		Vector probs2 = defaultProbabilities(v);
		this.setNextProbabilities(probs2);

		// if the activity was in a repeat loop and not the end,
		// the activity added, is also in repeat loop
		if ((this.getRepeat() != 1) && (!this.isRepeatEnd()))
			activity.repeat = this.repeat;

		if (!after && probs != null && acts != null && conn != null) {
			activity.setNextConnection(conn);
			activity.setNext(acts);
			activity.setNextProbabilities(probs);
		}
		// if (!before && act!=null)
		// {
		// }

		return true;

	}

	// else
	// return false;
	// }

	public boolean addANDForkActivity(Activity activity)
			throws ActivitySequenceException {
		if (activity == null)
			throw new ActivitySequenceException(
					"A null activity cannot be added to the fork");
		else if (this.getNextConnection() == null)
			throw new ActivitySequenceException(
					"A fork connection must be created before single activities can be added to it");
		// return false;
		else if (!this.getNextConnection().equals("ANDfork")
				|| (this.getNext().size() < 2))
			throw new ActivitySequenceException(
					"A fork connection must exist before a single activity can be added to it");

		// return false;

		// activity previously connected

		/*
		 * else if ( (activity.getNextConnection()!=null) ||
		 * (activity.getPrevConnection()!=null) ||
		 * (activity.getPrevious().size()>0) || (activity.getNext().size()>0) ||
		 * (activity.getPrevProbabilities().size()>0) ||
		 * (activity.getNextProbabilities().size()>0) ) return false;
		 */
		else if (activity.isConnected())
			throw new ActivitySequenceException(
					"The activity being added to the fork cannot have any existing connections");
		else {
			Vector acts = new Vector(this.getNext());
			Vector probs = new Vector(this.getNextProbabilities());
			acts.addElement(activity);
			probs.addElement(new Double(DFL_VAL_PROBABILITY));

			this.setNext(acts);
			this.setNextProbabilities(probs);

			// if the activity was in a repeat loop and not the end,
			// the activity added, is also in repeat loop
			if ((this.getRepeat() != 1) && (!this.isRepeatEnd()))
				activity.repeat = this.repeat;
			return true;
		}

	}

	public boolean addORForkActivity(Activity activity, double probability)
			throws ActivitySequenceException {
		if (activity == null)
			throw new ActivitySequenceException(
					"A null activity cannot be added to the fork");
		else if (probability <= 0)
			throw new ActivitySequenceException(
					"The OR fork probability must be greater than zero");
		else if (this.getNextConnection() == null)
			throw new ActivitySequenceException(
					"A fork connection must be created before single activities can be added to it");
		// return false;
		else if (!this.getNextConnection().equals("ORfork")
				|| (this.getNext().size() < 2))
			throw new ActivitySequenceException(
					"A fork connection must exist before a single activity can be added to it");

		// activity previously connected
		else if (activity.isConnected())
			throw new ActivitySequenceException(
					"The activity being added to the fork cannot have any existing connections");

		/*
		 * else if ( (activity.getNextConnection()!=null) ||
		 * (activity.getPrevConnection()!=null) ||
		 * (activity.getPrevious().size()>0) || (activity.getNext().size()>0) ||
		 * (activity.getPrevProbabilities().size()>0) ||
		 * (activity.getNextProbabilities().size()>0) ) return false;
		 */

		else {
			Vector acts = new Vector(this.getNext());
			Vector probs = new Vector(this.getNextProbabilities());
			acts.addElement(activity);
			probs.addElement(new Double(probability));

			this.setNext(acts);
			this.setNextProbabilities(probs);
			/*
			 * Vector normalizedProbs =
			 * normalizeProbabilities(this.nextProbabilities);
			 * 
			 * if (this.getPrevConnection()!=null &&
			 * this.getPrevConnection().equals("ORfork")) { Double prob =
			 * (Double)this.getPrevProbabilities().firstElement(); //double prob =
			 * probab.doubleValue(); // must recalculate probability by
			 * multiplying with before prob Enumeration enum6 =
			 * normalizedProbs.elements(); while (enum6.hasMoreElements()) {
			 * Double doub = (Double)enum6.nextElement(); int i =
			 * normalizedProbs.indexOf(doub);
			 * 
			 * double newProb = doub.doubleValue() * prob.doubleValue(); Double
			 * D = new Double(newProb); DecimalFormat df = new
			 * DecimalFormat("0.000"); normalizedProbs.setElementAt(new
			 * Double(D.parseDouble(df.format(D))), i );
			 *  } }
			 * 
			 * this.setNextProbabilities(normalizedProbs);
			 * 
			 */

			// if the activity was in a repeat loop and not the end,
			// the activity added, is also in repeat loop
			if ((this.getRepeat() != 1) && (!this.isRepeatEnd()))
				activity.repeat = this.repeat;
			return true;
		}

	}

	// can't give a vector with less than 2 activities
	public boolean addANDForkConnection(Vector activities)
			throws ActivitySequenceException {
		if (activities == null)
			throw new ActivitySequenceException(
					"The activity to be added was null.");
		// return false;
		else if (activities.size() < 2)
			throw new ActivitySequenceException(
					"A fork can only be added if more than one activity is provided.");

		else {
			Vector probs = defaultProbabilities(activities);
			return addActivities("ANDfork", activities, probs);
		}
	}

	// can't give a vector with less than 2 activities
	public boolean addORForkConnection(Vector activities, Vector probabilities)
			throws ActivitySequenceException {

		if (activities == null)
			throw new ActivitySequenceException(
					"The activity to be added was null.");
		// return false;
		else if (activities.size() < 2)
			throw new ActivitySequenceException(
					"A fork can only be added if more than one activity is provided.");

		else {
			// make sure no negative or zero probs
			Enumeration probs = probabilities.elements();
			while (probs.hasMoreElements()) {
				Double d = (Double) probs.nextElement();
				if (d.doubleValue() <= 0)
					throw new ActivitySequenceException(
							"The probability for a fork cannot be negative");
				// return false;
			}

			return addActivities("ORfork", activities, probabilities);
		}
	}

	private boolean addActivities(String connectionType, Vector activities,
			Vector probabilities) throws ActivitySequenceException {
		// boolean removed = true;
		Enumeration actElements = activities.elements();
		// check that each activity to be added, is removed from all previous
		// connections
		// while (enum.hasMoreElements() && removed)
		while (actElements.hasMoreElements()) {
			Activity act = (Activity) actElements.nextElement();
			// activity previously connected

			/*
			 * if ( (act.getNextConnection()!=null) ||
			 * (act.getPrevConnection()!=null) || (act.getPrevious().size()>0) ||
			 * (act.getNext().size()>0) || (act.getPrevProbabilities().size()>0) ||
			 * (act.getNextProbabilities().size()>0) ) // removed =
			 * act.getTask().removeActivityConnections(act);
			 */
			if (act.isConnected())
				throw new ActivitySequenceException(
						"Activities added to the fork cannot have existing connections");

		}

		// if (removed)
		// {
		String conn = null;
		Vector acts = null;
		Vector probs = null;

		// if the activity to be added to is followed by a fork
		// a fork cannot be followed by another fork
		if (this.getNextConnection() != null) {
			if ((this.getNextConnection().equals("ANDfork"))
					|| (this.getNextConnection().equals("ORfork")))
				throw new ActivitySequenceException(
						"A fork already follows the activity");

			else {
				conn = new String(this.getNextConnection());
				probs = new Vector(this.getNextProbabilities());
				acts = new Vector(this.getNext());
			}
		}
		if ((this.getRepeat() != 1) && (!this.isRepeatEnd())) {
			Enumeration enum3 = activities.elements();
			// set each activity's repeat field to include in the repeat
			// sequence
			while (enum3.hasMoreElements()) {
				Activity act = (Activity) enum3.nextElement();
				act.setRepeat(this.getRepeat());
			}
		}
		this.setNextConnection(connectionType);
		this.setNext(activities);
		if (acts != null && conn != null && probs != null) {
			Enumeration enum2 = activities.elements();
			// set each activity's connection to the old activity's next
			// connections
			// if the activity was followed by a simple "next"connection,
			// it now becomes a join
			while (enum2.hasMoreElements()) {
				Activity act = (Activity) enum2.nextElement();
				if (conn.equals("next") || (conn.equals("ANDjoin")))
					act.setNextConnection("ANDjoin");
				else if (conn.equals("ORjoin"))

					act.setNextConnection("ORjoin");

				act.setNext(acts);
				// Vector probs = defaultProbabilities(act.getNext());
				// Vector probs = new Vector(this.getNextProbabilities());
				act.setNextProbabilities(probs);
			}
		}

		// make sure activiites and probabilities vectors are the same size
		// if probabilties are less, add default probabilities
		// if probabilities are more, remove from the end
		while (activities.size() > probabilities.size())
			probabilities.addElement(new Double(DFL_VAL_PROBABILITY));
		while (activities.size() < probabilities.size())
			probabilities.removeElementAt(probabilities.size() - 1);

		// normalize the probabilites, so thely add to 1
		/*
		 * if (connectionType.equals("ORfork") ) { Vector normalizedProbs =
		 * normalizeProbabilities(probabilities); if
		 * (this.getPrevConnection()!=null &&
		 * this.getPrevConnection().equals("ORfork")) { Double prob =
		 * (Double)this.getPrevProbabilities().firstElement(); //double prob =
		 * probab.doubleValue(); // must recalculate probability by multiplying
		 * with before prob Enumeration enum6 = normalizedProbs.elements();
		 * while (enum6.hasMoreElements()) { Double doub =
		 * (Double)enum6.nextElement(); int i = normalizedProbs.indexOf(doub);
		 * 
		 * double newProb = doub.doubleValue() * prob.doubleValue(); Double D =
		 * new Double(newProb); DecimalFormat df = new DecimalFormat("0.000");
		 * normalizedProbs.setElementAt(new Double(D.parseDouble(df.format(D))),
		 * i );
		 *  } }
		 * 
		 * this.setNextProbabilities(normalizedProbs); } else {
		 */
		this.setNextProbabilities(probabilities);
		// }

		return true;
		// }
	}

	// each case described. In description Z is the activity to be removed
	public boolean removeActivityConnections() throws ActivitySequenceException {
		String prevConn = this.getPrevConnection();
		String nextConn = this.getNextConnection();
		Vector prevActs = this.getPrevious();
		Vector nextActs = this.getNext();
		Activity prevActivity = null;
		Activity nextActivity = null;
		if ((prevActs != null) && (prevActs.size() > 0))
			prevActivity = (Activity) prevActs.firstElement();
		if ((nextActs != null) && (nextActs.size() > 0))
			nextActivity = (Activity) nextActs.firstElement();

		// can't remove an activity that is the start or end
		// of a repeat sequence
		if ((nextActivity != null && nextActivity.isRepeatStart())
				|| this.isRepeatStart() || this.isRepeatEnd())
			// return false;
			throw new ActivitySequenceException(
					"An activity that starts or ends a repeat sequence cannot be removed");

		// start activity can be removed, if setting start activity to null
		// but should make sure all others are removed
		/*
		 * //check if the activty is a start activity boolean start = false;
		 * Task t = this.getTask(); Enumeration ents =
		 * t.getEntries().elements(); while(ents.hasMoreElements() && !start) {
		 * Entry e = (Entry)ents.nextElement(); if(e.getStartActivity()==this)
		 * start = true; } // if it is a start activiyt, cannot remove if
		 * (start) return false;
		 */

		// treat any joins that only have one previous as "next" connections
		// but do not change the actual connection (ie don't use
		// setNextConnection)
		if ((nextConn != null
				&& (nextConn.equals("ORjoin") || nextConn.equals("ANDjoin")) && (nextActivity.previous
				.size() < 2)))
			nextConn = new String("next");

		// no connections exist
		if ((prevConn == null) && (nextConn == null)) {
			this.removeConnsAndProbs(); // make sure all vectors are cleared
			return true;
		}

		// case of : Z->A
		// the activity after becoems the first in connection
		else if ((prevConn == null) && (nextConn.equals("next"))) {
			nextActivity.previous.clear();
			nextActivity.prevProbabilities.clear();
			nextActivity.setPrevConnection(null);
			this.removeConnsAndProbs();
			return true;
		}
		// case of Z & B -> A or Z + B -> A
		else if ((prevConn == null)
				&& ((nextConn.equals("ANDjoin")) || (nextConn.equals("ORjoin")))) {
			int i = nextActivity.previous.indexOf(this);
			nextActivity.prevProbabilities.removeElementAt(i);
			nextActivity.previous.remove(this);

			this.removeConnsAndProbs();
			return true;
		}
		// case of Z-> A & B; or Z->(prbA) A + (prbB)B
		// can't remove an activity that forks into more
		// unless there is an activity before it
		else if ((prevConn == null)
				&& ((nextConn.equals("ANDfork")) || (nextConn.equals("ORfork"))))
			// return false;
			throw new ActivitySequenceException(
					"An activity that forks and has no preceding activity cannot be removed");

		// A - > Z
		// activity before becomes the last
		else if ((prevConn.equals("next")) && (nextConn == null)) {
			prevActivity.next.clear();
			prevActivity.nextProbabilities.clear();
			prevActivity.setNextConnection(null);
			this.removeConnsAndProbs();
			return true;
		}

		// case of A -> Z -> B
		// middle activity is removed
		else if ((prevConn.equals("next")) && (nextConn.equals("next"))) {
			prevActivity.setNextConnection("next");

			int i = nextActivity.previous.indexOf(this);
			nextActivity.prevProbabilities.removeElementAt(i);
			nextActivity.previous.remove(this);
			prevActivity.setNext(nextActs);
			Vector probs = new Vector();
			probs.add(new Double(DFL_VAL_PROBABILITY));
			prevActivity.setNextProbabilities(probs);

			// in the case that there is only one activity coming into a join
			// treat like a next, but keep connection as a join, do NOT
			// change to next connection type
			if ((this.getNextConnection().equals("ORjoin"))
					|| (this.getNextConnection().equals("ANDjoin"))) {
				String s = new String(this.getNextConnection());
				prevActivity.setNextConnection(s);
			}
			this.removeConnsAndProbs();
			return true;
		}
		// case of A -> Z & C -> B or A -> Z + C - > B
		else if ((nextConn != null)
				&& ((nextConn.equals("ANDjoin")) || (nextConn.equals("ORjoin")))
				&& (nextActivity.previous.size() == 1))
			throw new ActivitySequenceException(
					"The only activity in a join cannot be removed");
		// case of A -> Z & C -> B or A -> Z + C - > B
		else if ((prevConn.equals("next"))
				&& ((nextConn.equals("ANDjoin")) || (nextConn.equals("ORjoin")))) {
			int i = nextActivity.previous.indexOf(this);
			nextActivity.previous.removeElementAt(i);
			nextActivity.prevProbabilities.removeElementAt(i);

			prevActivity.setNext(nextActs);
			Vector probs = defaultProbabilities(nextActs);
			prevActivity.setNextProbabilities(probs);
			String s = new String(nextConn);
			prevActivity.setNextConnection(s);
			this.removeConnsAndProbs();
			return true;
		}
		// case of A -> Z -> B & C or A -> Z -> B + C
		else if ((prevConn.equals("next"))
				&& ((nextConn.equals("ANDfork")) || (nextConn.equals("ORfork")))) {
			Enumeration actElements = nextActs.elements();
			Vector probs = new Vector();
			Vector acts = new Vector();
			// for eahc activity in the fork, reset its prev Activity
			while (actElements.hasMoreElements()) {
				Activity a = (Activity) actElements.nextElement();
				int i = a.previous.indexOf(this);
				a.previous.removeElementAt(i);
				probs.add(a.prevProbabilities.elementAt(i));
				a.prevProbabilities.removeElementAt(i);
				acts.addElement(a);
			}

			prevActivity.setNextConnection(nextConn);
			prevActivity.setNext(acts); // sets the prev for all acts in fork
			prevActivity.setNextProbabilities(probs); // sets prev probs for
			// all acts
			this.removeConnsAndProbs();
			return true;
		}

		// all cases where A & B -> Z ( the activity to remove is the join)
		// any activity preceeded by a join cannot be removed
		else if (((prevConn.equals("ANDjoin")) || (prevConn.equals("ORjoin")))
				&& (nextConn == null) && (prevActs.size() == 1)) {
			prevActivity.setNextConnection(null);
			Vector acts = new Vector();
			Vector probs = new Vector();
			prevActivity.setNext(acts);
			prevActivity.setNextProbabilities(probs);
			this.removeConnsAndProbs();
			return true;
		}
		// all cases where A & B -> Z ->C ( the activity to remove is the join)
		// any activity preceeded by a join cannot be removed
		else if (((prevConn.equals("ANDjoin")) || (prevConn.equals("ORjoin")))
				&& (nextConn == null) && (prevActs.size() > 1))
			// return false;
			throw new ActivitySequenceException(
					"An activity that is preceded by more than one joining activity cannot be removed");

		// all cases where A & B -> Z ->C ( the activity to remove is the join)
		// any activity preceeded by a join cannot be removed
		else if (((prevConn.equals("ANDjoin")) || (prevConn.equals("ORjoin")))
				&& (nextConn != null))
			// return false;
			throw new ActivitySequenceException(
					"An activity that is preceded by a join and succeeded by any other connection cannot be removed");

		// case of A-> Z & X & Y or A - > Z + X + Y
		else if (((prevConn.equals("ANDfork")) || (prevConn.equals("ORfork")))
				&& (nextConn == null)) {
			if (prevActivity.next.size() == 2 && prevConn.equals("ORfork"))
				throw new ActivitySequenceException(
						"The OR fork activity cannot be removed since an OR fork can only exist with at least two activities");

			int i = prevActivity.next.indexOf(this);
			prevActivity.nextProbabilities.removeElementAt(i);
			prevActivity.next.remove(this);

			// if the fork only has one activity left, make it a "next"
			// connection
			if (prevActivity.next.size() < 2) {
				prevActivity.setNextConnection("next"); // sets prev Connection
				// for next acti
				prevActivity
						.setNextProbabilities(defaultProbabilities(prevActivity.next));
			}
			// if more that one act still in fork, normalize the probabilities,
			// so
			// the remaining probs still add to one.
			// Divide each prob, by the sum of all the probs
			/*
			 * else {
			 * 
			 * Vector normalizedProbs =
			 * normalizeProbabilities(prevActivity.nextProbabilities);
			 * 
			 * 
			 * if (this.getPrevConnection()!=null &&
			 * this.getPrevConnection().equals("ORfork")) { Double prob =
			 * (Double)this.prevProbabilities.firstElement(); //double prob =
			 * probab.doubleValue(); // must recalculate probability by
			 * multiplying with before prob Enumeration enum =
			 * normalizedProbs.elements(); while (enum.hasMoreElements()) {
			 * Double doub = (Double)enum.nextElement(); int k =
			 * normalizedProbs.indexOf(doub);
			 * 
			 * double newProb = doub.doubleValue() * prob.doubleValue(); Double
			 * D = new Double(newProb); DecimalFormat df = new
			 * DecimalFormat("0.000"); normalizedProbs.setElementAt(new
			 * Double(D.parseDouble(df.format(D))), k );
			 *  } }
			 * 
			 * 
			 * //} // set the new probs
			 * prevActivity.setNextProbabilities(normalizedProbs); }
			 */
			this.removeConnsAndProbs();
			return true;
		}

		// case of A -> Z & X & Y where Z -> B
		else if (((prevConn.equals("ANDfork")) || (prevConn.equals("ORfork")))
				&& (nextConn.equals("next"))) {
			// activity is removed from fork but its prob remains
			int i = prevActivity.next.indexOf(this);
			prevActivity.next.removeElementAt(i);
			prevActivity.next.insertElementAt(nextActivity, i);
			// move the next activity into the fork leavign the prob
			nextActivity.setPrevConnection(new String(prevActivity
					.getNextConnection()));
			nextActivity.previous.remove(this);
			nextActivity.previous.add(prevActivity);
			int j = nextActivity.previous.indexOf(prevActivity);
			nextActivity.prevProbabilities.setElementAt(
					prevActivity.nextProbabilities.elementAt(i), j);

			this.removeConnsAndProbs();
			return true;
		}
		// case of A - > Z & X & Y where Z & X & Y -> B
		else if (((prevConn.equals("ANDfork")) || (prevConn.equals("ORfork")))
				&& ((nextConn.equals("ANDjoin")) || (nextConn.equals("ORjoin")))) {
			// if (prevActivity.next.size()==2 && prevConn.equals("ORfork"))
			// throw new ActivitySequenceException("The OR fork activity cannot
			// be removed since an OR fork can only exist with at least two
			// activities");

			// can only remove , if all in fork join to same activity
			boolean allJoin = true;
			Enumeration actElements = prevActivity.next.elements();
			while (actElements.hasMoreElements() && allJoin) {
				Activity a = (Activity) actElements.nextElement();
				// see if all fork activities are followd by the join activity
				allJoin = nextActivity.previous.contains(a);
			}
			if (!allJoin)
				// return false;
				throw new ActivitySequenceException(
						"An activity cannot be removed if it is in a fork where all activities do not join to the same activity");

			int i = prevActivity.next.indexOf(this);
			prevActivity.nextProbabilities.removeElementAt(i);
			prevActivity.next.remove(this);

			int j = nextActivity.previous.indexOf(this);
			nextActivity.prevProbabilities.removeElementAt(j);
			nextActivity.previous.remove(this);

			// if no more acts left in fork, make into next connecton
			if (prevActivity.next.size() < 2) {
				prevActivity.setNextConnection("next");
				Vector prob = new Vector();
				prob.addElement(new Double(DFL_VAL_PROBABILITY));
				prevActivity.setNextProbabilities(prob);
			}
			// normalize the probs of the remaining acts, so add to 1
			/*
			 * else { //normalizedProbs.addElement(new
			 * Double(D.parseDouble(df.format(D))) ); // have to multiply its
			 * prob with the previous prob // normalizedProbs.addElement(new
			 * Double(D.parseDouble(df.format(D))) );
			 * 
			 * Vector normalizedProbs =
			 * normalizeProbabilities(prevActivity.nextProbabilities); if
			 * (this.getPrevConnection()!=null &&
			 * this.getPrevConnection().equals("ORfork")) { Double prob =
			 * (Double)this.prevProbabilities.firstElement(); //double prob =
			 * probab.doubleValue(); // must recalculate probability by
			 * multiplying with before prob Enumeration enum2 =
			 * normalizedProbs.elements(); while (enum2.hasMoreElements()) {
			 * Double doub = (Double)enum2.nextElement(); int m =
			 * normalizedProbs.indexOf(doub);
			 * 
			 * double newProb = doub.doubleValue() * prob.doubleValue(); Double
			 * D = new Double(newProb); DecimalFormat df = new
			 * DecimalFormat("0.000"); normalizedProbs.setElementAt(new
			 * Double(D.parseDouble(df.format(D))), m );
			 *  } }
			 * 
			 * 
			 * prevActivity.setNextProbabilities(normalizedProbs); }
			 */

			this.removeConnsAndProbs();
			return true;
		}

		// case of A -> Z & X & Y where Z -> C & D & E
		else if (((prevConn.equals("ANDfork")) && (nextConn.equals("ANDfork")))
				|| ((prevConn.equals("ORfork")) && (nextConn.equals("ORfork")))) {
			// remove the activity and its probs
			int i = prevActivity.next.indexOf(this);
			double prob = ((Double) prevActivity.nextProbabilities.elementAt(i))
					.doubleValue();
			prevActivity.nextProbabilities.removeElementAt(i);
			prevActivity.next.remove(this);

			Vector acts = new Vector();
			Enumeration enum1 = prevActivity.next.elements();
			while (enum1.hasMoreElements())
				acts.add((Activity) enum1.nextElement());

			Vector probs = new Vector();
			Enumeration enum2 = prevActivity.nextProbabilities.elements();
			while (enum2.hasMoreElements())
				probs.add((Double) enum2.nextElement());

			// add each activity in the second fork, to the acts in the first
			// fork
			// calculate corresponding probs by multiplying the prob of the
			// deleted activity
			// with each one in the second fork

			Enumeration enum3 = nextActs.elements();
			while (enum3.hasMoreElements()) {
				Activity a = (Activity) enum3.nextElement();
				int j = a.previous.indexOf(this);

				a.previous.remove(this);
				acts.add(a);
				// double newProb =
				// ((Double)a.prevProbabilities.firstElement()).doubleValue() *
				// prob;
				probs.add((Double) a.prevProbabilities.elementAt(j));
				a.prevProbabilities.removeElementAt(j); // now remove
				// probability, after
				// calculation
				// probs.add(new Double(newProb) );
			}

			prevActivity.setNext(acts); // sets connections and probs for next
			// acts
			prevActivity.setNextProbabilities(probs);

			this.removeConnsAndProbs();
			return true;
		} else if (((prevConn.equals("ANDfork")) && (nextConn.equals("ORfork")))
				|| ((prevConn.equals("ORfork")) && (nextConn.equals("ANDfork"))))
			throw new ActivitySequenceException(
					"An activity preceeded and succeeded by forks can only be removed if the forks types are the same");

		// return false;
		throw new ActivitySequenceException("The activity could not be removed");
	}

	private void removeConnsAndProbs() {
		/*
		 * Vector prevActs = this.getPrevious(); Vector nextActs =
		 * this.getNext();
		 * 
		 * Enumeration enum = prevActs.elements(); while
		 * (enum.hasMoreElements()) { Activity preceeding = (Activity)
		 * enum.nextElement(); int i = preceeding.next.indexOf(this);
		 * preceeding.nextProbabilities.removeElementAt(i);
		 * preceeding.next.removeElement(this); preceeding.nextConnection =
		 * null; } Enumeration enum2 = nextActs.elements(); while
		 * (enum2.hasMoreElements()) { Activity succeeding = (Activity)
		 * enum2.nextElement(); int i = succeeding.previous.indexOf(this);
		 * succeeding.prevProbabilities.removeElementAt(i);
		 * succeeding.previous.removeElement(this); succeeding.prevConnection =
		 * null; }
		 */
		// basically resets the Activity 's connections
		this.next.clear();
		this.previous.clear();
		this.nextProbabilities.clear();
		this.prevProbabilities.clear();
		this.setNextConnection(null);
		this.setPrevConnection(null);
		this.setRepeat(1);
		this.setRepeatStart(false);
		this.setRepeatEnd(false);
		this.setReplyActivity(false);

	}

	/*
	 * public Vector normalizeProbabilities(Vector probs) { double sum=0;
	 * Enumeration enum = probs.elements(); while (enum.hasMoreElements()) { sum +=
	 * ((Double)enum.nextElement()).doubleValue(); } Vector normalizedProbs =
	 * new Vector();
	 * 
	 * Enumeration enum2 = probs.elements(); while (enum2.hasMoreElements()) {
	 * double d = ((Double)enum2.nextElement()).doubleValue();
	 * //normalizedProbs.addElement(new Double(d/sum)); // to get rid of
	 * decimals need to create a DecimalFormat // text representation, and put
	 * it into the Double DecimalFormat df = new DecimalFormat("0.000"); Double
	 * D = new Double(d/sum); //normalizedProbs.addElement(new
	 * Double(D.parseDouble(df.format(D))) ); // have to multiply its prob with
	 * the previous prob
	 * 
	 * normalizedProbs.addElement(new Double(D.parseDouble(df.format(D))) ); }
	 * 
	 * return normalizedProbs; }
	 */

	public boolean isConnected() {
		if ((this.getNextConnection() != null)
				|| (this.getPrevConnection() != null)
				|| (this.getPrevious().size() > 0)
				|| (this.getNext().size() > 0)
				|| (this.getPrevProbabilities().size() > 0)
				|| (this.getNextProbabilities().size() > 0))
			return true;
		else
			return false;
	}

	/**
	 * Clears the vector of next activities by calling removeActivity for each
	 * Activity in the vector, next. Note: the nextConnection field is not set
	 * to null, it stays the same.
	 * 
	 */
	public void clearNext() {

		/*
		 * if (getNext().size()>0) {
		 * //removeActivity((Activity)next.firstElement()); // need this, for
		 * some reason Enumeration e = getNext().elements(); while
		 * (e.hasMoreElements()) { Activity a = (Activity)e.nextElement();
		 * 
		 * removeActivity(a); } } System.out.println("after clearing: " +
		 * this.getNext());
		 * 
		 * if (next!=null) { Enumeration e2 = next.elements(); while
		 * (e2.hasMoreElements()) { Activity a = (Activity)e2.nextElement();
		 * 
		 * removeActivity(a); } }
		 */
		while (next.size() > 0)
			removeActivity((Activity) next.firstElement());

		// System.out.println("after clearing: " + this.getNext());

	}

	/**
	 * Removes an activity and its corresponding probability. Also removes
	 * "this" from the vector of previous activities for the second activity and
	 * its corresponding probability in the vector, prevProbabilities.
	 * 
	 * Sets the removed activity's prevConnection to null, but does not change
	 * the current activity's nextConnection.
	 * 
	 * @param a -
	 *            Activity that comes after the current activity
	 */
	private void removeActivity(Activity a) {
		int i = next.indexOf(a);
		// System.out.println(nextProbabilities.removeElementAt(i));
		nextProbabilities.remove(i);
		next.removeElement(a);
		// setNextConnection(null);

		int j = a.previous.indexOf(this); // 01/09/01
		// if (j!=-1)
		// {
		// a.prevProbabilities.removeElementAt(j); //first remove probability
		// //01/09/01
		a.prevProbabilities.remove(j); // first remove probability //01/09/01
		a.setPrevConnection(null);
		a.previous.removeElement(this); // now remove activity
		// }
		// System.out.println("this.getNext()" + this.getNext());

	}

	/**
	 * Clears the vector of previous probabilities
	 * 
	 */

	private void clearPrevProbabilities() {
		prevProbabilities.removeAllElements();

	}

	/**
	 * Clears the vector of next probabilities
	 * 
	 */
	private void clearNextProbabilities() {
		nextProbabilities.removeAllElements();

	}

	/**
	 * Clears the vector of previous activities
	 * 
	 */

	private void clearPrevious() {
		previous.removeAllElements();

	}

	/**
	 * Creates a vector which contains only the element DFL_VAL_PROBABILITY and
	 * is the same size as the vector passed in
	 * 
	 * @param v -
	 *            Vector used to create a corresponding vector of probabilities
	 *            that is the same size
	 */
	public Vector defaultProbabilities(Vector v) {
		int i = v.size();

		Vector vector = new Vector();
		int count = vector.size();
		while (count < i) {
			vector.addElement(new java.lang.Double(DFL_VAL_PROBABILITY));
			count = vector.size();
		}
		return vector;
	}

	/**
	 * Adds call made to entry.
	 * 
	 * @param dest
	 *            the destination entry
	 * @param rdv
	 *            type of call: if <code>true</code> call is synchronous,
	 *            otherwise it is asynchronous
	 * @param meancalls
	 *            the mean number of calls
	 */
	public void addCall(Entry dest, boolean rdv, String meancallsString) {
		ActivityCall call = new ActivityCall(this, dest, rdv, meancallsString);
		this.addCallOut(call);
	}

	public void addCallNum(Entry dest, boolean rdv, float meancalls)
	{
		ActivityCall call = new ActivityCall(this, dest, rdv, Float.toString(meancalls));
		this.addCallOut(call);
	}
	
	// /**
	// * Add call made to entry
	// *
	// * @param dest the destination entry
	// * @param probForwd the probability of forwarding
	// * @param rdvI type of call: if true calls is synchronous, if false,
	// asynchronous
	// * @param meancalls the mean number of calls
	// * @param fanIn the fanIn
	// * @param fanOut the fanOut
	// *
	// */
	// public void addCallOut(Entry dest, float probForwd, boolean rdvI, float
	// meancalls, int fanIn, int fanOut){
	// ActivityCall call = new ActivityCall(this, dest, probForwd, rdvI,
	// meancalls, fanIn, fanOut);
	// this.addCallOut(call);
	// }

	/**
	 * Remove call based on call object.
	 * 
	 * @param call
	 *            the call to be removed
	 */
	public void removeCallOut(ActivityCall call) {
		super.removeCallOut(call);
	}

	/**
	 * Disconnect the destination end of all calls made by this activity.
	 */
	public void disconnect() {
		for (int j = 0; j < callsOut.size(); j++) {
			ActivityCall call = (ActivityCall) callsOut.elementAt(j);
			call.getDestination().removeCaller(call.getSource());
		}
	}

	/**
	 * Converts this activity to its LQNS input file format text representation.
	 * 
	 * @return LQNS input file format text
	 */
	public String toString() {
		String s = new String();
		// Service time is mandatory, and must always been printed
		s = s.concat("s " + id + " " + servTime.toString() + "\n");
		if (coefVariation.floatValue() != DFL_VAL_COEFVARIATION)
			s = s.concat("c " + id + " " + coefVariation.toString() + "\n");
		if (stochastic != DFL_VAL_STOCHASTIC) // only print when deterministic
			s = s.concat("f " + id + " " + (stochastic ? "0" : "1") + "\n");
		if (thinkTime.floatValue() != DFL_VAL_THINKTIME)
			s = s.concat("Z " + id + " " + thinkTime.toString() + "\n");
		// the calls
		CallList cl = new CallList(this);
		s = s.concat(cl.toString());
		return s;
	}

	// /** *
	// */
	// public Phase copy(){
	// Activity act = (Activity)this.copy();
	// act.setName(this.getName());
	// act.setTask(this.getTask());
	// return act;
	// }

	/**
	 * getter for the activity alias
	 */
	public String getAlias() {
		return alias;
	}

	public static void main(String[] args) {

		Activity a1 = new Activity("a1", new Task());
		Activity a2 = new Activity("a2", new Task());
		Activity a3 = new Activity("a3", new Task());

		Vector acts = new Vector();
		acts.addElement(a2);
		acts.addElement(a3);
		/*
		 * //a1.setNext(acts); a1.setNextConnection("next"); a1.setNext(acts);
		 * 
		 * Vector v = new Vector(); v.addElement(a1); v.addElement(a2);
		 * 
		 * v.addElement(a3);
		 */
		a1.addActivity("ORfork", acts);

		Vector v = new Vector();
		v.addElement(a1);
		v.addElement(a2);
		v.addElement(a3);
		Enumeration vEelements = v.elements();
		while (vEelements.hasMoreElements()) {
			Activity a = (Activity) vEelements.nextElement();
			
			System.out.println("name: " + a.getName());
			System.out.println("task: " + a.getTask());
			System.out.println("prevConnection: " + a.getPrevConnection());
			System.out.println("nextConnection: " + a.getNextConnection());
			System.out.println("marked: " + a.getMarked());
			System.out.println("previous: ");
			Enumeration e = a.getPrevious().elements();
			while (e.hasMoreElements()) {
				System.out.println((Activity) e.nextElement());

			}
			System.out.println("next: ");
			Vector hmm = a.getNext();
			System.out.println(hmm);
			Enumeration e2 = a.getNext().elements();
			while (e2.hasMoreElements()) {
				System.out.println((Activity) e2.nextElement());

			}
			System.out.println("prevProbabilities: ");
			Enumeration e3 = a.getPrevProbabilities().elements();
			while (e3.hasMoreElements()) {
				System.out.println(e3.nextElement());

			}
			System.out.println("nextProbabilities: ");
			Enumeration e4 = a.getNextProbabilities().elements();
			while (e4.hasMoreElements()) {
				System.out.println(e4.nextElement());

			}

		}// big while

	}

}
