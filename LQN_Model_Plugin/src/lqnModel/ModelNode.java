/*
 * ModelNode: superclass of Processor, Task and Entry
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/ModelNode.java,v 1.1.1.1.4.3 2005/06/17 01:20:39 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: ModelNode.java,v $
 * Revision 1.1.1.1.4.3  2005/06/17 01:20:39  vinoshan
 * This change set is needed to make confidence interval optional in result XML Tags.  LQNS doesn't produce confidence intervals.  So, Editor must make 95 and 99 confidence interval as optional.
 * 
 * Revision 1.1.1.1.5.0  2005/08/25 Jing Xu
 * All the model nodes should implement clonable interface, so that 
 * when the model is manipulated, it won't affect the origninal copy
 *
 */

package lqnModel;

import java.util.*;
// DOM
import org.w3c.dom.*;

/**
 * An entity of a Layered Queuing Network.
 * <p>
 * <IMG SRC = ModelNode.gif>
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class ModelNode implements java.io.Serializable, Cloneable {
	/**
	 * Name of the node.
	 * 
	 */
	protected String id = new String(); // Key value

	/**
	 * Indicates if this node is Pseudo or Not. We use the concept of pseudo
	 * Task, Entries, etc to display component based Models such as Slots and
	 * sub-models.
	 */
	protected boolean pseudo = false;

	/**
	 * This will differentiate the type of pseudo represented by this Node.
	 */
	protected String pseudoType = " ";

	public static final String subModelPseudoType = "SUB_MODEL_TYPE";

	public static final String slotPseudoType = "SLOT_TYPE";

	/**
	 * This node contains the results. This must be set to null in side subclass
	 * constroucter. *
	 * 
	 * @return String
	 */
	protected Node resultsNode;

	public static final double DEF_RESULT_VALUE_DOUBLE = -1.00;

	/**
	 * Gets the name of the node.
	 * 
	 * @return the name of the node
	 */
	public String getName() {
		return id;
	}

	/**
	 * Sets the name of the node.
	 * 
	 * @param s
	 *            the name of the node
	 */
	public void setName(String s) {
		id = new String(s);
	}

	/**
	 * Set the Pseudo value
	 * 
	 * @param ps
	 *            boolean
	 */
	public void setPseudo(boolean ps) {
		pseudo = ps;
	}

	/**
	 * Get the Pseudo value
	 * 
	 * @return boolean
	 */
	public boolean isPseudo() {
		return pseudo;
	}

	/**
	 * 
	 * @return String
	 */
	public String getWhatPseudo() {
		return pseudoType;
	}

	/**
	 * 
	 */
	public void setWhatPseudoType(String psType) {
		pseudoType = psType;
	}

	/**
	 * This method checks if any Results are available for this Model-Node.
	 * 
	 * @return boolean
	 */
	public boolean hasResults() {
		return (this.resultsNode != null) ? true : false;
	}

	/**
	 * 
	 * @param inResult
	 *            Node
	 */
	public void setResult(Node inResult) {
		resultsNode = inResult;
	}

	/**
	 * 
	 * @return Node
	 */
	public Node getResultNode() {
		return resultsNode;
	}

	/**
	 * This method finds and return 99 or 95 confidence values.
	 * 
	 * @param conf99Or95
	 *            String. This should be either result-conf-99 or result-conf-95
	 * @return HashMap
	 */
	public HashMap getConfidenceResults(String conf99Or95) {
		HashMap confResu = null;
		if (hasResults() && this.resultsNode.hasChildNodes()) {
			NodeList chList = resultsNode.getChildNodes();
			int l = chList.getLength();
			for (int i = 0; i < chList.getLength(); i++) {
				if (chList.item(i) instanceof Element) {
					Element anElem = (Element) chList.item(i);
					if (anElem.getTagName().equals(conf99Or95)
							&& anElem.hasAttributes()) {
						// we got the confidence...
						// System.out.println(" Confidence Results for " +
						// conf99Or95);
						confResu = new HashMap();
						NamedNodeMap nnmAttr = anElem.getAttributes();
						for (int j = 0; j < nnmAttr.getLength(); j++) {
							Attr anAttr = (Attr) nnmAttr.item(j);
							confResu.put(anAttr.getName(), anAttr.getValue());
							// System.out.println(anAttr.getName()+ " = "+
							// anAttr.getValue());
						}
						return confResu;
					}
				}
			}

		}
		return confResu;
	}

	/**
	 * This method go through the result DOM-Node and get the information. These
	 * information will be used to display the SWING table.
	 */
	public HashMap getNormalResults() {
		if (!hasResults())
			return null;
		HashMap normalRes = new HashMap();
		// System.out.println(" Normal Results ");
		NamedNodeMap nnmAttr = resultsNode.getAttributes();
		for (int j = 0; j < nnmAttr.getLength(); j++) {
			Attr anAttr = (Attr) nnmAttr.item(j);
			normalRes.put(anAttr.getName(), anAttr.getValue());
			// System.out.println(anAttr.getName()+ " = "+ anAttr.getValue());
		}
		return normalRes;
	}

	public HashMap getAllResults() {
		HashMap allResults = null;
		if (hasResults()) {
			allResults = new HashMap();
			HashMap nor = this.getNormalResults();
			if (nor != null)
				allResults.putAll(nor);
			allResults.put("Confidence-95", "  ");
			HashMap c95 = this.getConfidenceResults("result-conf-95");
			if (c95 != null)
				allResults.putAll(c95);
			allResults.put("Confidence-99", "  ");
			HashMap c99 = this.getConfidenceResults("result-conf-99");
			if (c99 != null)
				allResults.putAll(c99);
		}
		return allResults;
	}

	// This to test the Result Node. Must be removed after implementing SWING
	// table
	public void printResultsValues() {
		if (this.getResultNode() == null) {
			System.out.println("No Results for " + id);
			return;
		}
		System.out.println("Results for " + id);
		System.out.println("==============================");
		Iterator in = getNormalResults().keySet().iterator();
		while (in.hasNext()) {
			String keyName = (String) in.next();
			String value = (String) this.getNormalResults().get(keyName);
			System.out.println(keyName + "  =  " + value);
		}
		// For Conf-95..
		System.out.println("Confidence 95 %");
		if (this.getConfidenceResults("result-conf-95") != null
				&& this.getConfidenceResults("result-conf-95").size() > 0) {
			Iterator i95 = getConfidenceResults("result-conf-95").keySet()
					.iterator();
			while (i95.hasNext()) {
				String keyName = (String) i95.next();
				String value = (String) this.getConfidenceResults(
						"result-conf-95").get(keyName);
				System.out.println(keyName + "  =  " + value);

			}
		}
		// For Conf-99..
		if (this.getConfidenceResults("result-conf-99") != null
				&& this.getConfidenceResults("result-conf-99").size() > 0) {
			System.out.println("Confidence 99 %");
			Iterator i99 = getConfidenceResults("result-conf-99").keySet()
					.iterator();
			while (i99.hasNext()) {
				String keyName = (String) i99.next();
				String value = (String) this.getConfidenceResults(
						"result-conf-99").get(keyName);
				System.out.println(keyName + "  =  " + value);

			}
		}
	}

	public double getDoubleResultAttr(String attr) {
		Element resElement = (Element) resultsNode;
		double value = -1.00;
		if (resElement.hasAttribute(attr)) {
			String resultStr = resElement.getAttribute(attr);
			value = (Double.valueOf(resultStr)).doubleValue();
		}
		return value;
	}

	/** ********Added by Jing Xu, Aug 25, 2005********** */
	public Object clone() {
		ModelNode mn = new ModelNode();
		mn.setName(this.id);
		mn.setPseudo(this.pseudo);
		mn.setWhatPseudoType(this.getWhatPseudo());
		mn.resultsNode = this.resultsNode.cloneNode(true); // deep clone
		return mn;
	}

}// end of class

