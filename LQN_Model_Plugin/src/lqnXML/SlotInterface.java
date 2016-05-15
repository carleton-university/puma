package lqnXML;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */
import java.util.HashMap;

public class SlotInterface {
	// List of incomming ports of this Slot
	private HashMap inPorts;

	// List of out comming ports of this Slot
	private HashMap outPorts;

	public SlotInterface() {
		inPorts = new HashMap();
		outPorts = new HashMap();
	}

	public boolean addInPort(Port inPort) {
		if (!inPorts.containsKey(inPort.getName())) {
			inPorts.put(inPort.getName(), inPort);
			return true;
		} else
			return false;
	}

	public void addOutPort(Port outPort) {
		outPorts.put(outPort.getName(), outPort);
	}

	public HashMap getInPorts() {
		return inPorts;
	}

	public void setInPort(HashMap inports) {
		inPorts = inports;
	}

	public void setOutPorts(HashMap outports) {
		outPorts = outports;
	}

	public HashMap getOutPorts() {
		return outPorts;
	}

}
