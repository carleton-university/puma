package lqnModel;

import java.io.*;

/**
 * Utility used to create a deep copy of an object. Uses serialization. To use
 * object returned by deepCopy(), the object must be cast to it's type. Example:
 * <p>
 * Processor origProc = new Processor("OrigProc");
 * <p>
 * Processor procCopy = (Processor)ObjectCloner.deepCopy(origProc);
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class ObjectCloner {

	/**
	 * Class constructor. Does nothing.
	 * 
	 */
	private ObjectCloner() {
	}

	/**
	 * Performs deep copy of object.
	 * 
	 * @exception Exception
	 *                when serialization fails
	 * @param oldObj
	 *            deep copy of object
	 * @return object to copy
	 */
	static public Object deepCopy(Object oldObj) throws Exception {
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(oldObj);
			oos.flush();
			ByteArrayInputStream bin = new ByteArrayInputStream(bos
					.toByteArray());
			ois = new ObjectInputStream(bin);
			return ois.readObject();
		} catch (Exception e) {
			System.out.println("Exception in ObjectCloner = " + e);
			throw (e);
		} finally {
			oos.close();
			ois.close();
		}
	}
}
