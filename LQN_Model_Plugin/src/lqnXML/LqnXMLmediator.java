/**
 * This is the LqnXMLmediator which assembles sub-models to a system model
 * It uses DOM level 2 and JAXP
 */
package lqnXML;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;
import java.io.File;
import java.util.Vector;
import lqnModel.*;

public class LqnXMLmediator {
	private Vector slotsInfo; // elements are objects of Slot

	private String lqnFileName;

	private String workingDir;

	public LqnXMLmediator() {
		slotsInfo = new Vector();
		lqnFileName = null;
		workingDir = null;

	}

	public String getOutputLQNFilename() {
		return lqnFileName;
	}

	public void setWorkingDir(String wd) {
		workingDir = wd;
	}

	public Model xmlTOjLQNparse(String fileName) {
		Model model = null;
		if (fileName == null) {
			System.out.println("The file is missing");
			return model;
		}

		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
					.newInstance();
			documentBuilderFactory.setNamespaceAware(true);
			String assembleFile = fileName;
			DocumentBuilder documentBuilder = documentBuilderFactory
					.newDocumentBuilder();
			/* Read in the assembly file and parse it */
			if (!assembleFile.endsWith(".xml"))
				assembleFile += ".xml";
			Document assembleDoc = documentBuilder
					.parse(new File(assembleFile));
			XmlParser xparse = new XmlParser(assembleDoc);
			model = xparse.parseXMLtoJLQNmodel(new File(assembleFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
}
