/*
 * ObjectNotFoundException: Exception thrown when an index is out of bounds
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * Created on Dec 29, 2005
 * 
 */
package lqnModel;

/**
 * Used to indicate that an object is not found in a model
 * 
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>J Xu
 */
public class ObjectNotFoundException extends Exception {

	/**
	 * Class constructor
	 */
	ObjectNotFoundException() {
		this("Object Not Found Error");
		Thread.dumpStack();
	}

	/**
	 * Class constructor
	 * 
	 * @param msg
	 *            description of exception
	 */
	ObjectNotFoundException(String msg) {
		super(msg);
	}
}
