/*
 * BadIndexException: Exception thrown when an index is out of bounds
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/BadIndexException.java,v 1.1.1.1.4.2 2005/04/29 02:33:41 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: BadIndexException.java,v $
 * Revision 1.1.1.1.4.2  2005/04/29 02:33:41  vinoshan
 * *** empty log message ***
 *
 */

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
public class BadIndexException extends Exception {

	/**
	 * Class constructor
	 */
	BadIndexException() {
		this("Index internal error");
		Thread.dumpStack();
	}

	/**
	 * Class constructor
	 * 
	 * @param msg
	 *            description of exception
	 */
	BadIndexException(String msg) {
		super(msg);
	}
}
