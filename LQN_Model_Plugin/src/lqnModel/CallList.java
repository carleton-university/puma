/*
 * CallList: helper class to arrange calls made by entries based on destination
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/CallList.java,v 1.1.1.1.4.2 2005/04/29 02:33:41 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: CallList.java,v $
 * Revision 1.1.1.1.4.2  2005/04/29 02:33:41  vinoshan
 * *** empty log message ***
 *
 *
 */

package lqnModel;

import java.util.*;

/**
 * List of PrintableCall objects of an entry or activity. It is used to convert
 * phases with calls into calls with phases to make them compatible with the
 * LQNS input file format representation of calls. That is, instead of a phase
 * having calls, a call has phases.
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class CallList {

	/**
	 * List of PrintableCall objects.
	 * <p>
	 * Key: name of destination entry, Value: printableCall object
	 * 
	 */
	private HashMap list;

	/**
	 * Class constructor. The CallList is constructed from a vector of entry
	 * phases.
	 * 
	 * @param phases
	 *            phases of an entry
	 */
	CallList(Vector phases) {
		Vector calls;
		list = new HashMap();
		int numberOfPhases = phases.size();
		for (int phaseIndex = 0; phaseIndex < phases.size(); phaseIndex++) {
			calls = new Vector();
			calls = ((Phase) phases.elementAt(phaseIndex)).getCallsOut();
			for (int callIndex = 0; callIndex < calls.size(); callIndex++) {
				EntryCall c = (EntryCall) calls.elementAt(callIndex);
				if (list.containsKey(c.getDestination().getName())) {
					PrintableCall pc = (PrintableCall) list.get(c.getDestination().getName());
					pc.addPhaseInfo(phaseIndex, c.getFanIn(), c.getFanOut(), c.getMeanCallsString());
				} else {
					PrintableCall nc;
					nc = new PrintableCall(c.getSource(), c.getDestination());
					nc.setValues(numberOfPhases, c.getProbForwarding(), c
							.isRendezvous());
					nc.addPhaseInfo(phaseIndex, c.getFanIn(), c.getFanOut(), c.getMeanCallsString());
					list.put(nc.getDestinationName(), nc);
				}
			}
		}
	}

	/**
	 * Class constructor. The call list is constructed from the calls made by an
	 * activity.
	 * 
	 * @param act
	 *            activity from which all the calls derive
	 */
	CallList(Activity act) {
		Vector calls;
		list = new HashMap();
		calls = act.getCallsOut();
		for (int callIndex = 0; callIndex < calls.size(); callIndex++) {
			ActivityCall c = (ActivityCall) calls.elementAt(callIndex);
			if (list.containsKey(c.getDestination().getName())) {
				PrintableCall pc = (PrintableCall) list.get(c.getDestination()
						.getName());
				pc.addPhaseInfo(0, c.getFanIn(), c.getFanOut(), c.getMeanCallsString());
			} else {
				PrintableCall nc;
				nc = new PrintableCall(c.getSource(), c.getDestination());
				nc.setValues(1, c.getProbForwarding(), c.isRendezvous());
				nc.addPhaseInfo(0, c.getFanIn(), c.getFanOut(), c.getMeanCallsString());
				list.put(nc.getDestinationName(), nc);
			}
		}
	}

	/**
	 * Gets the values of the list.
	 * 
	 * @return collection of calls made to a particular destination
	 * @see PrintableCall
	 * @see #list
	 */
	public Collection values() {
		return list.values();
	}

	/**
	 * Converts all the calls in list into the LQNS input file format text
	 * representation.
	 * 
	 * @return LQNS input file format text of all calls in list
	 */
	public String toString() {
		String s = new String();
		TreeMap sortedCalls = new TreeMap(list);
		for (Iterator i = (sortedCalls.values()).iterator(); i.hasNext();) {
			s = s.concat(((PrintableCall) i.next()).toString());
		}
		return s;
	}

}
