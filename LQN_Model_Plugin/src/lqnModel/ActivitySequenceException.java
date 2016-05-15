package lqnModel;

/**
 * Used to indicate that a problem occurred while performing an indexed
 * operation.
 * 
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class ActivitySequenceException extends Exception {

	/**
	 * Class constructor
	 */
	ActivitySequenceException() {
		this("Error in adding removing an Activity");
	}

	/**
	 * Class constructor
	 * 
	 * @param msg
	 *            description of exception
	 */
	ActivitySequenceException(String msg) {
		super(msg);
	}
}
