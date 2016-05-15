/**
 *  This class is part of the package lqnXML.
 *  It records the port info for a slot or a sub-model.
 */
package lqnXML;

import java.util.Vector;

public class Port {
	private String name;

	private String connection;

	private String description; // this variable applies to sub-model ports

	public Port(String inname, String con) {
		name = inname;
		connection = con;
		description = " ";
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String con) {
		connection = con;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

} // end of class Port
