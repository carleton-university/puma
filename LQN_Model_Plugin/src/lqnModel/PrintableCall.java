/*
 * PrintableCall: A call that has an LQN file format
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/PrintableCall.java,v 1.2.4.2 2005/04/29 02:33:42 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: PrintableCall.java,v $
 * Revision 1.2.4.2  2005/04/29 02:33:42  vinoshan
 * *** empty log message ***
 *
 *
 */

package lqnModel;

import java.util.*;

/**
 * A call object that may be printed as LQNS input file format text. It is used
 * in converting phases with calls into a call with phases.
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class PrintableCall {

	/**
	 * Source entry. It should be <code>null</code> if call is made by an
	 * activity.
	 */
	private Entry fromEntry;

	/**
	 * Source activity. It should be <code>null</code> if call is made by an
	 * entry.
	 */
	private Activity fromActivity;

	/**
	 * Destination entry.
	 */
	private Entry toEntry;

	/**
	 * Probability of forwarding.
	 */
	private Float probForward;

	/**
	 * Call type.
	 * <p>
	 * <code>true</code>: rendezvous, <code>false</code>: send-no-reply.
	 */
	private boolean rdv;

	/**
	 * Index of the phase this call is in (zero-based)
	 */
	private int numberOfPhase;

	/**
	 * Fan-in for each phase
	 */
	private String[] phFanIn;

	/**
	 * Fan-out for each phase.
	 */
	private String[] phFanOut;

	/**
	 * mean number of RNVs/phase OR number of non-blocking sends/ph
	 */
	private String[] phMeanCall;

	/**
	 * Class constructor
	 * 
	 * @param source
	 *            source entry
	 * @param destination
	 *            destination entry
	 */
	PrintableCall(Entry source, Entry destination) {
		setValues(source, destination, GenericCall.DFL_VAL_PROBFORWARD,
				GenericCall.DFL_VAL_RDV);
		phFanIn = new String[Entry.MAXPHASE];
		phFanOut = new String[Entry.MAXPHASE];
		phMeanCall = new String[Entry.MAXPHASE];

		for (int i = 0; i < Entry.MAXPHASE; i++) {
			phFanIn[i] = Integer.toString(GenericCall.DFL_VAL_FANIN);
			phFanOut[i] = Integer.toString(GenericCall.DFL_VAL_FANOUT);
			phMeanCall[i] = Float.toString(GenericCall.DFL_VAL_MEANCALL);
		}
	}

	/**
	 * Class constructor
	 * 
	 * @param source
	 *            source activity
	 * @param destination
	 *            destination entry
	 */
	PrintableCall(Activity source, Entry destination) {
		setValues(source, destination, GenericCall.DFL_VAL_PROBFORWARD,
				GenericCall.DFL_VAL_RDV);
		phFanIn = new String[Entry.MAXPHASE];
		phFanOut = new String[Entry.MAXPHASE];
		phMeanCall = new String[Entry.MAXPHASE];

		for (int i = 0; i < Entry.MAXPHASE; i++) {
			phFanIn[i] = Integer.toString(GenericCall.DFL_VAL_FANIN);
			phFanOut[i] = Integer.toString(GenericCall.DFL_VAL_FANOUT);
			phMeanCall[i] = Float.toString(GenericCall.DFL_VAL_MEANCALL);
		}
	}

	/**
	 * Sets attributes of this printableCall.
	 * 
	 * @param source
	 *            source entry
	 * @param destination
	 *            destination entry
	 * @param probForwd
	 *            probability of forwarding
	 * @param rdvI
	 *            rendezvous flag. <code>true</code>: rendezvous,
	 *            <code>false</code>: send-no-reply
	 */
	public void setValues(Entry source, Entry destination, float probForwd,
			boolean rdvI) {
		fromEntry = source;
		toEntry = destination;
		probForward = new Float(probForwd);
		rdv = rdvI;
	}

	/**
	 * Sets attributes of this printableCall.
	 * 
	 * @param source
	 *            source activity
	 * @param destination
	 *            destination entry
	 * @param probForwd
	 *            probability of forwarding
	 * @param rdvI
	 *            rendezvous flag. <code>true</code>: rendezvous,
	 *            <code>false</code>: send-no-reply
	 */
	public void setValues(Activity source, Entry destination, float probForwd,
			boolean rdvI) {
		fromActivity = source;
		toEntry = destination;
		probForward = new Float(probForwd);
		rdv = rdvI;
	}

	/**
	 * Sets attributes of this printableCall for a particular phase.
	 * 
	 * @param phase
	 *            the phase number (zero-based)
	 * @param probForwd
	 *            probabilty of forwarding
	 * @param rdvI
	 *            rendezvous flag. <code>true</code>: rendezvous,
	 *            <code>false</code>: send-no-reply
	 */
	public void setValues(int phase, float probForwd, boolean rdvI) {
		probForward = new Float(probForwd);
		rdv = rdvI;
		numberOfPhase = phase;
	}

	/**
	 * Gets the name of the source entity
	 * 
	 * @return name of source entity
	 */
	public String getSourceName() {
		if (fromEntry != null)
			return fromEntry.getName();
		else if (fromActivity != null)
			return fromActivity.getName();
		else
			return new String("NullSource");
	}

	/**
	 * Gets the name of the destination entry.
	 * 
	 * @return name of the destination entry
	 */
	public String getDestinationName() {
		return toEntry.getName();
	}

	/**
	 * Gets the probabilty of forwarding
	 * 
	 * @return probability of forwarding
	 */
	public float getProbForwarding() {
		return probForward.floatValue();
	}

	/**
	 * Sets values of phase dependant attributes for this printableCall
	 * 
	 * @param phaseIndex
	 *            phase index (zero-based)
	 * @param fanIn
	 *            fan-in
	 * @param fanOut
	 *            fan-out
	 * @param meanCalls
	 *            mean number of calls
	 */
	public void addPhaseInfo(int phaseIndex, String fanIn, String fanOut, String  meanCalls) {
		phFanIn[phaseIndex] = new String(fanIn);
		phFanOut[phaseIndex] = new String(fanOut);
		phMeanCall[phaseIndex] = new String(meanCalls);
	}

	/**
	 * Convert this call to its LQNS input file format text representation.
	 * 
	 * @return LQNS input file format text of this call
	 */
	public String toString() {
		String s = new String();
		int i;

		if (probForward.floatValue() != GenericCall.DFL_VAL_PROBFORWARD) {
			s = s.concat("F " + getSourceName() + " " + toEntry.getName() + " "
					+ probForward.toString());
			if (fromEntry != null)
				s = s.concat(" -1"); // only entries have the END_LIST symbol
			s = s.concat("\n");
		}

		if (numberOfPhase > 0) {
			Vector fanIn = new Vector();

			boolean callExists = false;
			for (i = 0; ((i < numberOfPhase) && (!callExists)); i++)
				if (Float.parseFloat(phMeanCall[i]) != GenericCall.DFL_VAL_MEANCALL)
					callExists = true;

			if (callExists) {
				s = s.concat((rdv ? "y " : "z ") + getSourceName() + " "
						+ toEntry.getName());
				for (i = 0; i < numberOfPhase; i++)
					s = s.concat(" " + phMeanCall[i]);
				if (fromEntry != null)
					s = s.concat(" -1");
				s = s.concat("\n");
			}
			for (i = 0; i < numberOfPhase; i++)
				fanIn.add(phFanIn[i]);
			if (!Entry.isDefaultValue(fanIn, GenericCall.DFL_VAL_FANIN)) {
				s = s.concat("i " + getSourceName() + " " + toEntry.getName()
						+ " " + phFanIn[numberOfPhase - 1]);
				if (fromEntry != null)
					s = s.concat(" -1");
				s = s.concat("\n");
			}

			Vector fanOut = new Vector();
			for (i = 0; i < numberOfPhase; i++)
				fanOut.add(phFanOut[i]);

			if (!Entry.isDefaultValue(fanOut, GenericCall.DFL_VAL_FANOUT)) {
				s = s.concat("o " + getSourceName() + " " + toEntry.getName()
						+ " " + phFanOut[numberOfPhase - 1]);
				if (fromEntry != null)
					s = s.concat(" -1");
				s = s.concat("\n");
			}
		}

		return s;
	}

	public boolean getRDV() {
		return rdv;
	}

	public int getNumOfPhase() {
		return numberOfPhase;

	}

	public String[] getphFanIn() {
		return phFanIn;
	}

	public String[] getphFanOut() {
		return phFanOut;
	}

	public String getphFanInAtIndex(int i) {
		if ((i >= 0) && (i < phFanIn.length)) {
			return phFanIn[i];
		} else
			return new String("-1");
	}

	public String getphFanOutAtIndex(int i) {
		if ((i >= 0) && (i < phFanOut.length)) {
			return phFanOut[i];
		} else
			return new String("-1");
	}

	public String getphMeanCallAtIndex(int i) {
		if ((i >= 0) && (i < phMeanCall.length)) {
			return phMeanCall[i];
		} else
			return new String("-1");
	}

	public void setphFanInAtIndex(int i, String value) {
		if ((i >= 0) && (i < phFanIn.length)) {
			phFanIn[i] = new String(value);
		}
	}

	public void setphFanOutAtIndex(int i, String value) {
		if ((i >= 0) && (i < phFanOut.length)) {
			phFanOut[i] = new String(value);
		}
	}

	public void setphMeanCallIndex(int i, String value) {
		if ((i >= 0) && (i < phMeanCall.length)) {
			phMeanCall[i] = new String(value);
		}
	}
}

