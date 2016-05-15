/*
 * GenericCall: Arc to an Entry object
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/GenericCall.java,v 1.1.1.1.4.2 2005/04/29 02:33:41 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: GenericCall.java,v $
 * Revision 1.1.1.1.4.2  2005/04/29 02:33:41  vinoshan
 * *** empty log message ***
 *
 *
 */

package lqnModel;

/**
 * An arc (call) from one entity to another in a Layered Queueing Network model.
 * <p>
 * <IMG SRC = GenericCall.gif>
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class GenericCall extends ModelNode implements java.io.Serializable {

	/**
	 * Default probability of forwarding = 0
	 */
	public static final float DFL_VAL_PROBFORWARD = 0;

	/**
	 * Default fan-in = 1
	 */
	public static final int DFL_VAL_FANIN = 1;

	/**
	 * Default fan-out = 1
	 */
	public static final int DFL_VAL_FANOUT = 1;

	/**
	 * Default mean number of calls = 0
	 */
	public static final float DFL_VAL_MEANCALL = 0;

	/**
	 * Default rendezvous value = true
	 */
	public static final boolean DFL_VAL_RDV = true;

	/**
	 * Destination entry of this call.
	 */
	protected Entry target;

	/**
	 * Probability of forwarding.
	 */
	protected Object source;// This could be either Entry or Activity

	protected Float probForward;

	/**
	 * Call type.
	 * <p>
	 * <code>true</code> for rendezvous (synchronous) call, <code>false</code>
	 * for send-no-reply (asynchronous) call
	 */
	protected boolean rdv;

	/**
	 * Fan-in.
	 */
	protected Integer fanIn = new Integer(GenericCall.DFL_VAL_FANIN);
	protected String  fanInString = new Integer(GenericCall.DFL_VAL_FANIN).toString();
	
	/**
	 * Fan-out.
	 */
	protected Integer fanOut = new Integer(GenericCall.DFL_VAL_FANOUT);
	protected String  fanOutString =  new Integer(GenericCall.DFL_VAL_FANOUT).toString();
	/**
	 * Mean number of RNVs OR number of non-blocking sends.
	 */
	protected Float meanCall;
	protected String meanCallString;

	/**
	 * Fraction of time blocked for this call. By: Vino Shanmugarajah
	 */
	protected double fracBlockTime;

	/**
	 * Class constructor
	 * 
	 * @param destination
	 *            destination entry
	 */
	public GenericCall(Entry destination, Object sourceI) {
		setValues(destination, sourceI, DFL_VAL_PROBFORWARD, DFL_VAL_RDV);
		fanIn = new Integer(DFL_VAL_FANIN);
		fanOut = new Integer(DFL_VAL_FANOUT);
		fanInString = Integer.toString(DFL_VAL_FANIN);
		fanOutString = Integer.toString(DFL_VAL_FANOUT);
		meanCall = new Float(DFL_VAL_MEANCALL);
		meanCallString = new String(Float.toString(DFL_VAL_MEANCALL));
		fracBlockTime = 0.0;
	}

	public GenericCall(Entry destination) {
		setValues(destination, null, DFL_VAL_PROBFORWARD, DFL_VAL_RDV);
		fanIn = new Integer(DFL_VAL_FANIN);
		fanOut = new Integer(DFL_VAL_FANOUT);
		fanInString = Integer.toString(DFL_VAL_FANIN);
		fanOutString = Integer.toString(DFL_VAL_FANOUT);
		meanCall = new Float(DFL_VAL_MEANCALL);
		meanCallString = new String(Float.toString(DFL_VAL_MEANCALL));
		fracBlockTime = 0.0;
	}

	public GenericCall() {
		// This is ONLY used in BNS View.
		probForward = new Float(DFL_VAL_PROBFORWARD);
		this.rdv = DFL_VAL_RDV;
	}

	/**
	 * Class constructor
	 * 
	 * @param destination
	 *            the destination entry
	 * @param probForwd
	 *            the probability of forwarding
	 * @param rdvI
	 *            the call type
	 * @param meanCalls
	 *            the mean number of calls
	 * @param fanIn
	 *            the fan-in value
	 * @param fanOut
	 *            the fan-out value
	 */
	public GenericCall(Entry destination, ModelNode sourceI, float probForwd,
			boolean rdvI, String meanCallsString, String fanIn, String fanOut) {
		setValues(destination, sourceI, probForwd, rdvI);
		this.meanCallString = new String(meanCallsString);

		try
		{
			this.meanCall = new Float(meanCallsString);
		}
		catch(Exception e)
		{
			this.meanCall = new Float(-1);
		}
		
		this.fanIn = new Integer(DFL_VAL_FANIN);
		this.fanOut = new Integer(DFL_VAL_FANOUT);
		this.fanInString = Integer.toString(DFL_VAL_FANIN);
		this.fanOutString = Integer.toString(DFL_VAL_FANOUT);

	}

	/**
	 * Sets the values of attributes of this call
	 * 
	 * @param destination
	 *            the destination entry
	 * @param probForwd
	 *            the probability of forwarding
	 * @param rdvI
	 *            the call type
	 */
	public void setValues(Entry destination, Object sourceI, float probForwd,
			boolean rdvI) {
		this.target = destination;
		this.source = sourceI;
		this.probForward = new Float(probForwd);
		this.rdv = rdvI;
	}

	/**
	 * Gets the destination entry
	 * 
	 * @return the destination entry
	 */
	public Entry getDestination() {
		return this.target;
	}

	/**
	 * Gets the Name of destination entry
	 * 
	 * @return name of the destination entry
	 */
	public String getDestinationName() {

		return this.target.getName();
	}

	/**
	 * Sets the destination entry.
	 * 
	 * @param e
	 *            the destination entry
	 */
	public void setDestination(Entry e) {
		this.target = e;
	}

	/**
	 * Sets the destination entry name.
	 * 
	 * @param e
	 *            the destination entry name
	 */
	public void setDestinationName(String e) {
		if (target != null)
			this.target.setName(e);
	}

	/**
	 * Gets the probability of an entry forwarding this call.
	 * 
	 * @return the probability of forwarding
	 */
	public float getProbForwarding() {
		return this.probForward.floatValue();
	}

	/**
	 * Sets the probability of an entry forwarding this call
	 * 
	 * @param prob
	 *            the probability of forwarding
	 */
	public void setProbForwarding(float prob) {
		this.probForward = new Float(prob);
	}

	/**
	 * Gets the call type.
	 * 
	 * @return <code>true</code> if the call is rendezvous, <code>false</code>
	 *         if call is send-no-reply
	 */
	public boolean isRendezvous() {
		return this.rdv;
	}

	/**
	 * Sets the type of this call
	 * 
	 * @param r
	 *            the call type
	 */
	public void setRendezvous(boolean r) {
		this.rdv = r;
	}

	/**
	 * Gets the fan-in.
	 * 
	 * @return the fan-in value
	 */
	public int getFanInNum() { return GenericCall.DFL_VAL_FANIN; }
	public String getFanIn() { return Integer.toString(GenericCall.DFL_VAL_FANIN); }
	/**
	 * Sets the fan-in.
	 * 
	 * @param fi
	 *            the fan-in
	 */
	public void setFanInString(String fi) {
		this.fanInString = Integer.toString(GenericCall.DFL_VAL_FANIN);
	}

	/**
	 * Gets the fan-out.
	 * 
	 * @return the fan-out
	 */
	public int getFanOutNum() {	return GenericCall.DFL_VAL_FANOUT; }
	public String getFanOut() { return Integer.toString(GenericCall.DFL_VAL_FANOUT); }
	
	/**
	 * Sets the fan-out
	 * 
	 * @param fo
	 *            the fan-out
	 */
	public void setFanOutString(String fo) {
		this.fanOutString = Integer.toString(GenericCall.DFL_VAL_FANOUT);
		return;
	}

	/**
	 * Gets the mean number of times this call is executed
	 * 
	 * @return the mean number of times this call is executed
	 */
	public float getMeanCalls() {
		return this.meanCall.floatValue();
	}

	public String getMeanCallsString() {
		return this.meanCallString;
	}

	/**
	 * Sets the mean number of times this call is executed.
	 * 
	 * @param mc
	 *            mean number of calls
	 */
	public void setMeanCallsString(String s) {
		this.meanCallString = new String(s);
		
		Float f;
		
		try
		{
			f = new Float(s);
			this.setMeanCalls(f.floatValue());
		}
		catch(Exception e)
		{
			this.setMeanCalls(-1);
		}
	}
	
	public void setMeanCalls(float mc) {
		this.meanCall = new Float(mc);
		this.meanCallString = new String(Float.toString(mc));
	}

	/**
	 * Set back link to call in target entry.
	 */
	public void setDestinationLink() {
	};

	/**
	 * Unset back link to call in target entry
	 */
	public void unsetDestinationLink() {
	};

	public String getSourceName() {
		if (source instanceof Entry)
			return (((Entry) (this.source)).getName());
		if (source instanceof Activity)
			return (((Activity) (this.source)).getName());
		return ("");//
	}

	public void setSourceName(String s) {
		if (source instanceof Entry)
			((Entry) source).setName(s);
		if (source instanceof Activity)
			((Activity) source).setName(s);
	}

	public void setFracOfBlockTime(double inFBT) {
		fracBlockTime = inFBT;
	}

	public double getFracOfBlockTime() {
		return fracBlockTime;
	}

}
