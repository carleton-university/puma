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

public class Parameter {
	private String name;

	private Object value;

	public Parameter(String nameIn, Object valueIn) {
		name = nameIn;
		value = valueIn;
	}

	public String getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}

	public void setName(String inName) {
		name = inName;

	}

	public void setValue(Object inValue) {
		value = inValue;

	}

}
