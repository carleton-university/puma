/**
 * This is the LQNAssemble which assembles sub-models to a system model
 * It uses DOM level 2 and JAXP
 */
package lqnXML;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;
import org.xml.sax.SAXException;
import org.xml.sax.InputSource;

/*
 * import org.w3c.dom.Document; import org.w3c.dom.Attr; import
 * org.w3c.dom.Element; import org.w3c.dom.Text;
 */
import org.w3c.dom.*;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.dom.DOMSource;

import java.util.Vector;
import lqnModel.*;

public class LQNAssemble {
	private Vector slotsInfo; // elements are objects of Slot

	private String lqnFileName;

	private String workingDir;

	public LQNAssemble() {
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
		if (fileName == null || workingDir == null) {
			System.out.println("The assembly model file is missing");
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
		}
		return model;
	}

} // end of class LQNtest

