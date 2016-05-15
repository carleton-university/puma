package lqnXML;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2003
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author not attributable
 * @version 1.0
 */

public class Binding {
	// Name of the sorce to be binded
	private String source;

	// Name of the target for the binding
	private String target;

	public Binding(String inSrc, String inTar) {
		source = inSrc;
		target = inTar;
	}

	public String getSRC() {
		return source;
	}

	public String getTarget() {
		return target;
	}

	public void setSRC(String inSrc) {
		source = inSrc;
	}

	public void setTarget(String inTarget) {
		target = inTarget;
	}
}
