/*
 * InstallException: Exception thrown a module cannot be installed into its parent
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/InstallException.java,v 1.1.1.1.4.2 2005/04/29 02:33:41 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: InstallException.java,v $
 * Revision 1.1.1.1.4.2  2005/04/29 02:33:41  vinoshan
 * *** empty log message ***
 *
 */

package lqnModel;

/**
 * Used to indicate that a problem occurred during the installation of a modules
 * sub-modules.
 * 
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class InstallException extends Exception {
	/**
	 * Class constructor
	 * 
	 */
	InstallException() {
		this("Component cannot be installed");
	}

	/**
	 * Class constructor
	 * 
	 * @param msg
	 *            description of exception
	 */
	InstallException(String msg) {
		super(msg);
	}
}
