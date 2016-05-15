package lqnXML;

import java.util.Vector;
import java.util.HashMap;

public class Slot {
	// id identifies the Slot
	private String id;

	private String descrip;

	// This gives the number of Replication
	private int numOfReplic;

	// Name of the bind Target
	private String bindTarget;

	private Vector bindGroups;// Will have a list Bindings

	private SlotInterface slotInterface;

	private HashMap parameters;

	public Slot(String id, String inBtarget) {
		this.id = id;
		bindTarget = inBtarget;
		bindGroups = new Vector();
		slotInterface = new SlotInterface();
		parameters = new HashMap();
		descrip = " ";
	}

	public boolean addParameter(Parameter par) {
		if (parameters.containsKey(par.getName()))
			return false;
		parameters.put(par.getName(), par);
		return true;
	}

	public boolean removeParameter(Parameter par) {
		if (!parameters.containsKey(par.getName()))
			return false;
		parameters.remove(par.getName());
		return true;
	}

	public HashMap getParameters() {
		return parameters;
	}

	public String getID() {
		return id;
	}

	public int getNumReplic() {
		return numOfReplic;
	}

	public void setID(String inID) {
		id = inID;
	}

	public void setBindTarget(String inBindT) {
		bindTarget = inBindT;
	}

	public void setNumOfReplic(int num) {
		numOfReplic = num;
	}

	public void setInterface(SlotInterface st) {
		slotInterface = st;
	}

	public void addBindgingGP(BindingGroup bg) {
		bindGroups.add(bg);
	}

	public SlotInterface getSlotInterface() {
		return slotInterface;
	}

	public String getDescription() {
		return descrip;
	}

	public void setDescrip(String s) {
		descrip = s;
	}

	public void setParameters(HashMap pas) {
		parameters = pas;
	}
}
