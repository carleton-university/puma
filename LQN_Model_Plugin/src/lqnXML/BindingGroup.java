package lqnXML;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */
import java.util.Vector;

public class BindingGroup {
	// List of parmeters that belongs to this BindingGroup
	private Vector param;

	// List of Processor Bindings that needs to be done
	private Vector processorBindings;

	// List of port Bindings that needs to be done.
	private Vector portBindings;

	public BindingGroup() {
		param = new Vector();
		processorBindings = new Vector();
		portBindings = new Vector();
	}

	public void addParam(Parameter aParam) {
		param.add(param);
	}

	public void addProcessorBind(Binding proBind) {
		processorBindings.add(proBind);
	}

	public void addPortBind(Binding portBind) {
		portBindings.add(portBind);
	}

}
