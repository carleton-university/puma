// NIKHIL: To read comments from File

/*
 * 
 ***********************************************************************
 * Modification Log (from newest changes to oldest changes)
 ***********************************************************************
 * Change/Created by  Ref#(#yyyyddmm)  Description
 * -----------------  --------------  ----------------------------------
 * Jing XU			  #20080714		   Fix Parsing forwarding call
 ***********************************************************************
 */

package lqnXML;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description: This class parse the XML/DOM file to jLqnModel objects
 * </p>
 * <p>
 * Copyright: Copyright (c) 2003
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author Vino Shanmugarajah
 * @version 1.0
 */
import javax.xml.parsers.*;
// SAX
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;
import org.xml.sax.SAXException;
import org.xml.sax.InputSource;
// DOM
import org.w3c.dom.*;
// IO
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
// Transformation
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
// Utility
import java.util.*;
// lqnModel
import lqnModel.*;

public class XmlParser {

	// NIKHIL: These vectors are used for CBML model exports
	private Vector cbmlA = new Vector();
	private Vector cbmlP = new Vector();
	private Vector cbmlI = new Vector();
	private Vector cbmlO = new Vector();
	private Vector cbmlS = new Vector();

	private Document doc;

	private Model mod;

	private SubModel subModel;

	/***************************************************************************
	 * Added by Jing Xu, Jan 18, 2007 * Add default constructor public XmlParser(){ doc=null; subModel=null; mod=null; }
	 **************************************************************************/

	public XmlParser(Model m) {
		doc = null;
		subModel = null;
		mod = m;
	}

	public XmlParser(Document inDoc) {
		doc = inDoc;
		subModel = null;
		mod = null;
	}

	private static Vector processList(String s) {
		Vector v = new Vector();

		s = s.trim();
		int i = s.indexOf(32); // Find first space
		while (i != -1) {
			v.add(s.substring(0, i));
			s = s.substring(i + 1).trim();
			i = s.indexOf(32);
		}
		v.add(s);

		return v;
	}

	public Model parseXMLtoJLQNmodel(File xmlFile) {
		if (doc == null)
			return null;
		mod = this.getTheCoreModel();
		// Changes made on April 26 to handle SUB-MODELS
		Node rootN = doc.getFirstChild();
		mod.isSubModel = false;

		mod.fixLinks();
		return mod;
	}

	// NIKHIL: Used to process the sub-model and slot interface
	private void parseCBMLtoJLQNmodel(Processor p, Model m) {
		NodeList interList = doc.getElementsByTagName("Interface");
		int k = 0; // Offset is 1 for submodel and 0 for model

		cbmlA.clear();

		if (doc.getElementsByTagName("lqn-submodel").getLength() == 1) // Set the offset and process the interface
		{
			k = 1;
			Node interNode = interList.item(0);
			NodeList portList = interNode.getChildNodes(); // Get the list of ports

			for (int i = 0; i < portList.getLength(); i++) {
				String s = new String();
				String c = new String();
				Vector v = new Vector();

				Node port = portList.item(i);

				if (port.getNodeName().equals("in-port")) // Input port
				{
					s = this.getAttributeFromNode(port, "name");
					c = this.getAttributeFromNode(port, "connect-to");
					v = processList(c);
					v.add(0, s);
					cbmlA.add(v); // Add the calllist to CBML, which will be processed later on

					// Create a new task with name _s and entry s which is a non task
					// add it to processor p
					// Add a task s with a entry _s
					Task aTask = m.addTask("__" + s);
					aTask.setScheduling('r');// -or- aTask.setScheduling('f');
					aTask.setThinkTime(0);
					aTask.setPriority(1);
					aTask.setProcessor(p);
					Entry anEntry = m.addEntry(s); // <- is a entry constructor
					anEntry.setArrivalRate(0);
					anEntry.setPriority(1);
					anEntry.setTask(aTask);// Set the task
					aTask.addEntry(anEntry);// backward link
					p.addTask(aTask);

				}
				else if (port.getNodeName().equals("out-port")) // Output port
				{
					s = this.getAttributeFromNode(port, "name");
					c = this.getAttributeFromNode(port, "connect-from");
					// Create a new task with name _s and entry s which is a non task
					// add it to processor p
					// Add a task s with a entry _s

					Task aTask = m.addTask("__" + s);
					aTask.setMultiServer(Integer.toString(Task.DFL_VAL_MULTISERVER));
					aTask.setReplication(1);
					aTask.setScheduling('f');
					aTask.setThinkTime(0);
					aTask.setPriority(1);
					aTask.setProcessor(p);
					Entry anEntry = m.addEntry(s); // <- is a entry constructor
					anEntry.setArrivalRate(0);
					anEntry.setPriority(1);
					anEntry.setTask(aTask);// Set the task
					aTask.addEntry(anEntry);// backward link
					p.addTask(aTask);
				}
			}

		}
		else
			k = 0; // Set the offset only

		NodeList slotList = doc.getElementsByTagName("slot");
		for (int j = 0; j < slotList.getLength(); j++) {
			Node slot = slotList.item(j);
			String t = this.getAttributeFromNode(slot, "id");
			Node interNode = interList.item(k + j);
			NodeList portList = interNode.getChildNodes(); // Get the list of ports

			String s = new String();
			String c = new String();
			Vector v = new Vector();

			// Create a task with name _t
			Task aTask = m.addTask("_" + t);
			aTask.setScheduling('f');
			aTask.setThinkTime(0);
			aTask.setPriority(1);
			aTask.setProcessor(p);
			p.addTask(aTask);

			for (int i = 0; i < portList.getLength(); i++) {
				Node port = portList.item(i);

				if (port.getNodeName().equals("in-port")) // Input port
				{
					s = this.getAttributeFromNode(port, "name");
					c = this.getAttributeFromNode(port, "connect-from");
					v = processList(c);

					// Create a entry e with name s
					Entry anEntry = m.addEntry(s);
					anEntry.setArrivalRate(0);
					anEntry.setPriority(1);
					anEntry.setTask(aTask);// Set the task
					aTask.addEntry(anEntry);// backward link
				}
				else if (port.getNodeName().equals("out-port")) // Output port
				{
					s = this.getAttributeFromNode(port, "name");
					c = this.getAttributeFromNode(port, "connect-to");
					v = processList(c);
					v.add(0, s);
					cbmlA.add(v); // Add the call-list to CBML, which will be processed later on

					// Create a entry e with name s
					Entry anEntry = m.addEntry(s);
					anEntry.setArrivalRate(0);
					anEntry.setPriority(1);
					anEntry.setTask(aTask);// Set the task
					aTask.addEntry(anEntry);// backward link
				}
			} // End of i
		} // End of j

		return;
	}

	/**
	 * 
	 * @return Model
	 */
	private Model getTheCoreModel() {
		// doc shouldn't be null. Its a precondition.
		Model amodel = new Model();

		NodeList processorList = doc.getElementsByTagName("processor");
		int numProcessors = processorList.getLength();
		for (int p = 0; p < numProcessors; p++) {
			Node processorNode = processorList.item(p);
			String processorName = this.getAttributeFromNode(processorNode, "name");
			// Create the Processer Object and set the parameter values
			// set the Mulitiplicity
			Processor aProcessor = new Processor(processorName);

			if (getAttributeFromNode(processorNode, "multiplicity") != null)
				aProcessor.setMultiServer(getAttributeFromNode(processorNode, "multiplicity"));

			// Set the CPU rate
			if (getAttributeFromNode(processorNode, "speed-factor") != null)
				aProcessor.setCpuRate((new Float(getAttributeFromNode(processorNode, "speed-factor"))).floatValue());

			// Set the Scheduling
			if (getAttributeFromNode(processorNode, "scheduling") != null) {
				String scheduling = getAttributeFromNode(processorNode, "scheduling");

				/***************************************************************
				 * Modified by Jing Xu********** Date: Aug 24, 2005 Scheduling flag.
				 * <p>
				 * f=first come first served, h= head of line, p=priority, r=random scheduling, s=processor sharing check the scheduling string and set to corresponding flat Default set f(first come first served)
				 */
				// if ( (scheduling.trim()).length() == 1)
				if (scheduling == null || scheduling.trim().equals("")) {
					aProcessor.setScheduling('f');
				}
				else {
					if (scheduling.trim().equals("fcfs")) {
						aProcessor.setScheduling('f');
					}
					else if (scheduling.trim().equals("ps")) {
						aProcessor.setScheduling('s');
					}
					else if (scheduling.trim().equals("hol")) {
						aProcessor.setScheduling('h');
					}
					else if (scheduling.trim().equals("rand")) {
						aProcessor.setScheduling('r');
					}
					else if (scheduling.trim().equals("pp")) {
						aProcessor.setScheduling('p');
					}
					else {
						aProcessor.setScheduling('s');
					}// end if else
				}// end if else
				/** *************************************************** */
			}
			// set the Replication
			if (getAttributeFromNode(processorNode, "replication") != null)
				aProcessor.setReplication(stringTOint(getAttributeFromNode(processorNode, "replication")));

			/** ************************************************** */
			// get the Tasks and Results
			/** ************************************************** */
			ArrayList L = new ArrayList();
			if (processorNode.hasChildNodes()) {// has Tasks
				// I have to use the filter here to avoid null child nodes from
				// white space
				NodeList taskList = processorNode.getChildNodes();
				int numChildNodes = taskList.getLength();
				for (int t = 0; t < taskList.getLength(); t++) {
					Node childNode_Processor = taskList.item(t);
					if (childNode_Processor.getNodeName().equals("task")) {
						Task aTask = this.taskHandler(childNode_Processor);
						aProcessor.addTask(aTask);
						// Set up the backward link
						aTask.setProcessor(aProcessor);
						amodel.addTask(aTask);
						// get the Entries and Task Activities
						if (childNode_Processor.hasChildNodes()) {
							NodeList taskChildList = childNode_Processor.getChildNodes();
							for (int e = 0; e < taskChildList.getLength(); e++) {
								Node tChildNode = taskChildList.item(e);
								// **** I may have to change here for
								// Task-Activities
								if (tChildNode.getNodeName().equals("task-activities")) {
									// get the taksActivities
									if (tChildNode.hasChildNodes()) {
										NodeList tActChildNodeList = tChildNode.getChildNodes();
										// 3 choice from here 1. activity
										// 2.precedence 3. reply-entry
										for (int tAct = 0; tAct < tActChildNodeList.getLength(); tAct++) {
											Node tActChildNode = tActChildNodeList.item(tAct);
											if (tActChildNode.getNodeName().equals("activity")) { // activity
												Activity ta = this.taskORentryActivityHandler(tActChildNode, aTask);
												aTask.addActivity(ta);
											}
											else if (tActChildNode.getNodeName().equals("precedence"))
												L.add(activityConnectionHandler(tActChildNode));
											else if (tActChildNode.getNodeName().equals("reply-entry"))
												L.add(this.replyEntryHandler(tActChildNode));
										}
									}
									// Nikhil: All additions to actConnection
									int LN = L.size();
									String actConnection = new String("");
									String s1 = new String();
									String s2 = new String();
									for (int i = 0; i < LN; i++) {
										s1 = (String) L.get(i);
										if (i == LN - 1) {
											s2 = s1 + "\n";
										}
										else {
											s2 = s1 + ";\n";
										}
										actConnection = actConnection.concat(s2);
									}
									L.clear();
									aTask.setActivityConnections(actConnection);
								}// Task-Activities

								// Parse Entries
								if (tChildNode.getNodeName().equals("entry")) {
									Entry anEntry = this.entryHandler(tChildNode, amodel);
									anEntry.setTask(aTask);// Set the task
									aTask.addEntry(anEntry);// backward link

									// get the Entry-Activities
									if (tChildNode.hasChildNodes()) {
										NodeList eActivityList = tChildNode.getChildNodes();
										for (int ea = 0; ea < eActivityList.getLength(); ea++) {
											Node eActivityNode = eActivityList.item(ea);
											if (eActivityNode.getNodeName().equals("activity")) {

											}// end if activity

											// else if()
										}// end for
									}// end if

								}// end if
							}// For taskChildList
						}
						// Now we have should have all the Entries and
						// Activities created for this taks.
						// So, setup the bound-to-entry connection/startActivity
						this.setStartActToEntry(aTask);
					}// Task
					else if (childNode_Processor.getNodeName().equals("result-processor")) {
						aProcessor.setResult(childNode_Processor);
						amodel.results = true;
					}// Result-Processor
				}
			}// has Task or Results

			// For test purpose
			// aProcessor.printResultsValues();
			// Process all interfaces and slots and attach it to the first processor
			if (p == 0)
				parseCBMLtoJLQNmodel(aProcessor, amodel);
			amodel.addProcessor(aProcessor);

		}// for numberOfProcessors

		// NIKHIL: Processing CBML Slot and Interface ports call list
		// System.out.println("CBML: "+cbmlA);
		for (int i = 0; i < cbmlA.size(); i++) {
			Vector v = (Vector) cbmlA.get(i);
			String srcEntryName = (String) v.get(0);
			Entry srcEntry = amodel.getEntry(srcEntryName);

			for (int j = 1; j < v.size(); j++) {
				String destEntryName = (String) v.get(j);
				Entry destEntry = amodel.getEntry(destEntryName);

				Phase jPhase = new Phase();
				jPhase.setName(destEntryName);
				jPhase.setIndex(0);
				jPhase.setServiceTimeString("0");
				jPhase.setThinkTime(0);
				GenericCall gc = new EntryCall(srcEntry, destEntry);
				gc.setRendezvous(true);
				EntryCall ec = (EntryCall) gc;
				ec.setPhase(jPhase);
				jPhase.addCallOut(ec);

				Vector p = new Vector();
				p.add("1");
				srcEntry.addCall(destEntry, true, p);
			}
		}

		// Since all the Entries are created now,
		// this is where we need to setup the calls between the entries.
		// get the Entry list from the DOM by tag name

		NodeList entryNodeList = doc.getElementsByTagName("entry");
		for (int e = 0; e < entryNodeList.getLength(); e++) {
			this.entryPhase_CallHandler(entryNodeList.item(e), amodel);
		}
		// Now process the TaskActivity Calls
		NodeList taskActivitiesList = doc.getElementsByTagName("task-activities");
		for (int ta = 0; ta < taskActivitiesList.getLength(); ta++) {
			this.activityCallHandler(taskActivitiesList.item(ta), amodel);
		}
		// Now Porcess the Slots
		/*
		 * NodeList slotList = doc.getElementsByTagName("slot"); for (int s = 0; s < slotList.getLength(); s++) { Slot aSlot = this.slotHandler(slotList.item(s)); amodel.addSlot(aSlot); }
		 */

		//
		NodeList lqxList = doc.getElementsByTagName("lqx");
		int nLqx = 0;

		amodel.setLqxString(new String(""));

		/*
		 * int nLqx = processorList.getLength();
		 * 
		 * if (nLqx==0) amodel.setLqxString(new String("")); else { Node lqxNode = lqxList.item(0).getFirstChild(); amodel.setLqxString(new String(lqxNode.getNodeValue())); }
		 */

		return amodel;
	}

	/**
	 * 
	 * @param intFaceNode
	 *            Node
	 * @return HashMap
	 */
	private HashMap getInports(Node intFaceNode) {
		// get all the in-ports
		HashMap inPorts = new HashMap();
		if (intFaceNode instanceof Element) {
			NodeList inList = ((Element) intFaceNode).getElementsByTagName("in-port");
			for (int ip = 0; ip < inList.getLength(); ip++) {
				Node inPnode = inList.item(ip);
				String pName = this.getAttributeFromNode(inPnode, "name");
				String connect = this.getAttributeFromNode(inPnode, "connect-to");
				String descrip = this.getAttributeFromNode(inPnode, "description");
				Port inPort = new Port(pName, connect);
				inPort.setDescription(descrip);
				inPorts.put(pName, inPort);
			}
		}
		return inPorts;
	}

	/**
	 * 
	 * @param intFaceNode
	 *            Node
	 * @return HashMap
	 */
	private HashMap getOutPorts(Node intFaceNode) {
		// get all the in-ports
		HashMap outPorts = new HashMap();
		if (intFaceNode instanceof Element) {
			NodeList outList = ((Element) intFaceNode).getElementsByTagName("out-port");
			for (int op = 0; op < outList.getLength(); op++) {
				Node outPnode = outList.item(op);
				String pName = this.getAttributeFromNode(outPnode, "name");
				String connect = this.getAttributeFromNode(outPnode, "connect-from");
				String descrip = this.getAttributeFromNode(outPnode, "description");
				Port outPort = new Port(pName, connect);
				outPort.setDescription(descrip);
				outPorts.put(pName, outPort);
			}
		}
		return outPorts;
	}

	public SubModel getSubModel() {
		return this.subModel;
	}

	/**
	 * 
	 * @param intFaceNode
	 *            Node
	 * @return HashMap
	 */
	private HashMap getRepProcessors(Node intFaceNode) {
		HashMap repCPUs = new HashMap();
		if (intFaceNode instanceof Element) {
			NodeList rpCPUList = ((Element) intFaceNode).getElementsByTagName("Replaceable-Processor");
			for (int rp = 0; rp < rpCPUList.getLength(); rp++) {
				Node rCPUnode = rpCPUList.item(rp);
				String cpuName = this.getAttributeFromNode(rCPUnode, "name");
				repCPUs.put(cpuName, cpuName);
			}
		}
		return repCPUs;
	}

	/**
	 * 
	 * @param doc
	 *            Document
	 * @return HashMap of Parameters
	 */
	private HashMap getParameters(Document doc) {
		HashMap paraList = new HashMap();
		NodeList parNodes = doc.getElementsByTagName("para");
		for (int pa = 0; pa < parNodes.getLength(); pa++) {
			Node par = parNodes.item(pa);
			String name = this.getAttributeFromNode(par, "name");
			// we are not sure how to process the values yet. It can hold
			// virtually any thing
			// It is difiend as Object in the data structure. Contact Prof.
			// Murray Woodside if any
			// problems are identified here. Here, I assume value is always a
			// "String".
			Object value = this.getAttributeFromNode(par, "value");
			Parameter aParameter = new Parameter(name, value);
			paraList.put(name, value);
		}
		return paraList;
	}

	private String getAttributeFromNode(Node inNode, String att) {
		return (inNode != null && (((Element) inNode).hasAttribute(att))) ? ((Element) inNode).getAttribute(att) : null;
	}

	private int stringTOint(String s) {
		return ((new Integer(s)).intValue());
	}

	private Task taskHandler(Node taskNode) {
		String taskName = this.getAttributeFromNode(taskNode, "name");
		// Create the Task Object
		Task aTask = new Task(taskName);
		// Now, set the parameter values
		if (getAttributeFromNode(taskNode, "multiplicity") != null)
			aTask.setMultiServer(getAttributeFromNode(taskNode, "multiplicity"));
		// set the Replication
		if (getAttributeFromNode(taskNode, "replication") != null)
			aTask.setReplication(stringTOint(getAttributeFromNode(taskNode, "replication")));
		// Set the Scheduling
		if (getAttributeFromNode(taskNode, "scheduling") != null) {
			String scheduling = getAttributeFromNode(taskNode, "scheduling").trim();
			if (scheduling.equals("ref"))
				aTask.setScheduling('r');
			else if (scheduling.equals("fcfs"))
				aTask.setScheduling('f');
			else if (scheduling.equals("pri"))
				aTask.setScheduling('e');// earliness
			else if (scheduling.equals("burst"))
				aTask.setScheduling('b');
			else if (scheduling.equals("hol"))
				aTask.setScheduling('h');
			else if (scheduling.equals("poll"))
				aTask.setScheduling('p');
			else if (scheduling.equals("inf"))
				aTask.setScheduling('i');
		}
		// Set the Think-time
		if (getAttributeFromNode(taskNode, "think-time") != null)
			aTask.setThinkTime((new Float(getAttributeFromNode(taskNode, "think-time"))).floatValue());
		// Set the Priority
		if (getAttributeFromNode(taskNode, "priority") != null)
			aTask.setPriority(stringTOint(getAttributeFromNode(taskNode, "priority")));
		// For the results
		if (taskNode.hasChildNodes()) {
			NodeList resultsE = ((Element) taskNode).getElementsByTagName("result-task");
			if (resultsE.getLength() == 1) {
				aTask.setResult(resultsE.item(0));
			}
		}

		// Read Fan-In and Fan-Out values
		NodeList l;
		Node n;
		int i;
		String s1 = new String();
		String s2 = new String();

		l = ((Element) taskNode).getElementsByTagName("fan-in");
		for (i = 0; i < l.getLength(); i++) {
			n = l.item(i);
			s1 = this.getAttributeFromNode(n, "source");
			s2 = this.getAttributeFromNode(n, "value");
			aTask.FanInName.add(s1);
			aTask.FanInValue.add(s2);
		}

		l = ((Element) taskNode).getElementsByTagName("fan-out");
		for (i = 0; i < l.getLength(); i++) {
			n = l.item(i);
			s1 = this.getAttributeFromNode(n, "dest");
			s2 = this.getAttributeFromNode(n, "value");
			aTask.FanOutName.add(s1);
			aTask.FanOutValue.add(s2);
		}

		return aTask;
	}

	private Entry entryHandler(Node entryNode, Model model) {
		String entryName = this.getAttributeFromNode(entryNode, "name");
		// Create the Entry Object and set the parameter values
		// This will create an Entry Object an add it to the model.
		Entry anEntry = model.addEntry(entryName);
		if (getAttributeFromNode(entryNode, "open-arrival-rate") != null)
			anEntry.setArrivalRate((new Float(getAttributeFromNode(entryNode, "open-arrival-rate"))).floatValue());
		if (getAttributeFromNode(entryNode, "priority") != null)
			anEntry.setPriority(stringTOint(getAttributeFromNode(entryNode, "priority")));
		// phase lookup for calls will be done later
		NodeList resultsE = ((Element) entryNode).getElementsByTagName("result-entry");
		if (resultsE.getLength() == 1) {
			anEntry.setResult(resultsE.item(0));
		}

		return anEntry;
	}

	// This method checks if a Node has the perticular Element
	private boolean hasThisElement(Node inNode, String tagName) {
		NodeList nList = ((Element) inNode).getElementsByTagName(tagName);
		return (nList.getLength() > 0) ? true : false;
	}

	private void entryPhase_CallHandler(Node entryNode, Model inModel) {

		NodeList entPhaseList = ((Element) entryNode).getElementsByTagName("entry-phase-activities");
		String entryName = getAttributeFromNode(entryNode, "name");
		String entryType = getAttributeFromNode(entryNode, "type");
		Entry entry = inModel.getEntry(entryName);

		if (entPhaseList.getLength() == 1) {
			Node phaseNode = entPhaseList.item(0);
			NodeList phActList = ((Element) phaseNode).getElementsByTagName("activity");
			// Now get the phase
			for (int pA = 0; pA < phActList.getLength(); pA++) {
				Node phAct = phActList.item(pA);
				Phase jPhase = new Phase();

				/***************************************************************
				 * Added by Jing Xu, Aug 24, 2005*********** get name, demand and other parameters of the phase from doc Node
				 */
				// set phase name
				String att = ((Element) phAct).getAttribute("name");
				if (att != null && !att.equals("")) {
					jPhase.setName(att);
				}

				// get phase index (0,1,2)
				att = ((Element) phAct).getAttribute("phase");
				if (att != null && !att.equals("")) {
					jPhase.setIndex(Integer.parseInt(att) - 1);
				}

				// get phase execution demand
				att = ((Element) phAct).getAttribute("host-demand-mean");
				if (att != null && !att.equals("")) {
					jPhase.setServiceTimeString(att);
				}

				// get phase think time
				att = ((Element) phAct).getAttribute("think-time");
				if (att != null && !att.equals("")) {
					jPhase.setThinkTime(Float.parseFloat(att));
				}

				// get phase execution demand cv
				att = ((Element) phAct).getAttribute("host-demand-cvsq");
				if (att != null && !att.equals("")) {
					jPhase.setCoefVariation(Float.parseFloat(att));
				}

				// get phase max service time
				att = ((Element) phAct).getAttribute("max-service-time");
				if (att != null && !att.equals("")) {
					jPhase.setMaxServiceTime(Float.parseFloat(att));
				}
				/** ******************************************************* */

				// get the call related elements - we got 3 choices
				if ((entryType != null) && entryType.equals("PH1PH2")) {

					// Handle the Synch-Calls
					NodeList synchCallNode = ((Element) phAct).getElementsByTagName("synch-call");
					for (int sC = 0; sC < synchCallNode.getLength(); sC++) {
						Element syncCall = ((Element) synchCallNode.item(sC));
						GenericCall gc = this.callProcessing(syncCall, entry, inModel);
						gc.setRendezvous(true);
						// Now, get the results for synch-Calls
						gc.setResult(this.getResultNode(syncCall, "result-call"));
						/*******************************************************
						 * Added by Jing Xu******** Set phase index parameter for the call
						 */
						EntryCall ec = (EntryCall) gc;
						ec.setPhase(jPhase);
						/** ******************************************** */
						jPhase.addCallOut(ec);

					}// for sync calls
					NodeList asynchCallNode = ((Element) phAct).getElementsByTagName("asynch-call");
					for (int asC = 0; asC < asynchCallNode.getLength(); asC++) {
						Element asyncCall = ((Element) asynchCallNode.item(asC));
						GenericCall gc = this.callProcessing(asyncCall, entry, inModel);
						gc.setRendezvous(false);
						gc.setResult(this.getResultNode(asyncCall, "result-call"));
						/*******************************************************
						 * Added by Jing Xu, Aug 27, 2005******** Set phase index parameter for the call
						 */
						EntryCall ec = (EntryCall) gc;
						ec.setPhase(jPhase);
						/** ************************************************* */
						jPhase.addCallOut(ec);

					}

					/**
					 * Result Activity
					 * 
					 */
					jPhase.setResult(this.getResultNode(phAct, "result-activity"));

					/**
					 * Result Activity Distribution
					 * 
					 */
					jPhase.setResultActDistriNode(this.getResultNode(phAct, "result-activity-distribution"));

					/**
					 * Result Forwarding
					 * 
					 */
					jPhase.setResultFowarding(this.getResultNode(phAct, "result-forwarding"));

					/**
					 * Result Join Delay
					 * 
					 */

					jPhase.setResultJoinDelayNode(this.getResultNode(phAct, "result-join-delay"));

				} // dealt with 2 choices. One more to go for the Graph
					// GRAPH not implemented yet.
				else if (hasThisElement(phAct, "call-list")) {

				}

				/***************************************************************
				 * Modified by Jing XU, Aug 26, 2005****** Use setPhase(Phase) function instead of addPhase() to addPhase function ignore the given phase index.
				 */
				// add the phase to entry
				// entry.addPhase(jPhase);
				entry.setPhase(jPhase);
				/** ********************************************* */

				// #20080714 ----------------------------- START
				NodeList fwdCalls = ((Element) entryNode).getElementsByTagName("forwarding");
				if (fwdCalls.getLength() > 0) {
					// create forwarding calls for the entry
					for (int i = 0; i < fwdCalls.getLength(); i++) {
						Node fwdNode = fwdCalls.item(i);
						String destEnName = getAttributeFromNode(fwdNode, "dest");
						Entry destEn = inModel.getEntry(destEnName);
						if (destEn == null) {
							System.out.println("WARNING: destination entry not found for forwarding call from Entry " + entryName);
						}
						float fwdProb = Float.parseFloat(getAttributeFromNode(fwdNode, "prob"));
						entry.addForwardingCall(destEn, fwdProb);
					}// end for
				}

			}

		}
	}

	private Node getResultNode(Node aNode, String resultAttName) {
		NodeList resultNodeL = ((Element) aNode).getElementsByTagName(resultAttName);
		if (resultNodeL.getLength() > 0) {// It shouldbe equal to 1.
			// But there is an error in Schema
			// saying we can have infinite number of Results

			return resultNodeL.item(0);
		}
		return null;
	}

	private void activityCallHandler(Node taskActsNode, Model inModel) {
		NodeList taskActList = ((Element) taskActsNode).getElementsByTagName("activity");
		// Get the Task Object
		String taskName = this.getAttributeFromNode(taskActsNode.getParentNode(), "name");
		Task task = inModel.getTask(taskName);
		for (int ta = 0; ta < taskActList.getLength(); ta++) {
			Node tActNode = taskActList.item(ta);
			// I have to get the Activity object
			String actName = this.getAttributeFromNode(tActNode, "name");
			Activity act = task.getActivity(actName);
			NodeList syncCallList = ((Element) tActNode).getElementsByTagName("synch-call");
			for (int sc = 0; sc < syncCallList.getLength(); sc++) {
				Element syncCall = ((Element) syncCallList.item(sc));
				GenericCall ac = this.callProcessing(syncCall, act, inModel);
				ac.setRendezvous(true);
				act.addCallOut((ActivityCall) ac);
			}
			NodeList aSyncCallList = ((Element) tActNode).getElementsByTagName("asynch-call");
			for (int asc = 0; asc < aSyncCallList.getLength(); asc++) {
				Element aSyncCall = ((Element) aSyncCallList.item(asc));
				GenericCall ac = this.callProcessing(aSyncCall, act, inModel);
				ac.setRendezvous(false);
				act.addCallOut((ActivityCall) ac);
			}

		}
	}

	private GenericCall callProcessing(Node aCall, Object src, Model aModel) {// src can be entry or activiy
		String dest = this.getAttributeFromNode(aCall, "dest");
		// get the destination Entry from the model to make the a Call object

		Entry destEntry = aModel.getEntry(dest);
		GenericCall gc;
		if (src instanceof Entry) {
			gc = new EntryCall((Entry) src, destEntry);
		}
		else {
			gc = new ActivityCall((Activity) src, destEntry);
		}

		/*
		 * NIKHIL: Fan-In and Fan-Out have been moved to Tasks if (this.getAttributeFromNode(aCall, "fanout") != null) gc.setFanOutString(getAttributeFromNode(aCall, "fanout")); if (this.getAttributeFromNode(aCall, "fanin") != null)
		 * gc.setFanInString(getAttributeFromNode(aCall, "fanin"));
		 */

		if (this.getAttributeFromNode(aCall, "calls-mean") != null)
			gc.setMeanCallsString(new String(getAttributeFromNode(aCall, "calls-mean")));

		return gc;

	}

	private Activity taskORentryActivityHandler(Node actNode, Task task) {
		Activity a = new Activity(getAttributeFromNode(actNode, "name"), task);
		if (this.getAttributeFromNode(actNode, "host-demand-mean") != null)
			a.setServiceTime(Float.valueOf(getAttributeFromNode(actNode, "host-demand-mean")).floatValue());
		if (this.getAttributeFromNode(actNode, "host-demand-cvsq") != null)
			a.setServiceTime(Float.valueOf(getAttributeFromNode(actNode, "host-demand-cvsq")).floatValue());
		if (this.getAttributeFromNode(actNode, "think-time") != null)
			a.setServiceTime(Float.valueOf(getAttributeFromNode(actNode, "think-time")).floatValue());
		if (this.getAttributeFromNode(actNode, "max-service-time") != null)
			a.setMaxServiceTime(Float.valueOf(getAttributeFromNode(actNode, "max-service-time")).floatValue());
		if (this.getAttributeFromNode(actNode, "bound-to-entry") != null)
			a.setBoundToEntry(getAttributeFromNode(actNode, "bound-to-entry"));
		return a;
	}

	private String activityConnectionHandler(Node precedence) {
		String pre = new String();
		String post = new String();

		NodeList prePostList = precedence.getChildNodes();
		for (int i = 0; i < prePostList.getLength(); i++) {
			Node precedChild = prePostList.item(i);

			switch ((precedChild.getNodeName()).hashCode()) {
			// PRE
			case (111267): {// pre
				NodeList preActList = ((Element) precedChild).getElementsByTagName("activity");
				pre = this.getAttributeFromNode(preActList.item(0), "name");

			}
				break;
			case (-980166323): {// pre-OR
				NodeList orActList = ((Element) precedChild).getElementsByTagName("activity");
				for (int orA = 0; orA < orActList.getLength(); orA++) {
					Node actNode = orActList.item(orA);
					if (!(orA + 1 == orActList.getLength())) {
						pre = pre + this.getAttributeFromNode(actNode, "name") + "+";
					}
					else
						pre = pre + this.getAttributeFromNode(actNode, "name");
				}// end of for

			}
				break;
			case (-320398451): {// pre-AND
				NodeList andActs = ((Element) precedChild).getElementsByTagName("activity");
				for (int andA = 0; andA < andActs.getLength(); andA++) {
					Node actNode = andActs.item(andA);
					if (!(andA + 1 == andActs.getLength())) {
						pre = pre + this.getAttributeFromNode(actNode, "name") + "&";
					}
					else
						pre = pre + this.getAttributeFromNode(actNode, "name");
				}// end of for

			}
				break;
			// POST
			case (-391260624): {// post-OR
				NodeList postORActList = ((Element) precedChild).getElementsByTagName("activity");
				for (int orA = 0; orA < postORActList.getLength(); orA++) {
					Node actNode = postORActList.item(orA);
					if (!(orA + 1 == postORActList.getLength())) {
						post = post + " (" + this.getAttributeFromNode(actNode, "prob") + ")" + this.getAttributeFromNode(actNode, "name") + " +";
					}
					else
						post = post + " (" + this.getAttributeFromNode(actNode, "prob") + ")" + this.getAttributeFromNode(actNode, "name");
				}// end of for

			}
				break;
			case (755809034): {// post-AND
				NodeList postANDActs = ((Element) precedChild).getElementsByTagName("activity");
				for (int andA = 0; andA < postANDActs.getLength(); andA++) {
					Node actNode = postANDActs.item(andA);
					if (!(andA + 1 == postANDActs.getLength())) {
						post = post + this.getAttributeFromNode(actNode, "name") + " & ";
					}
					else
						post = post + this.getAttributeFromNode(actNode, "name");
				}// end of for
			}
				break;
			case (1955572657): {// post-LOOP
				NodeList postLOOPActList = ((Element) precedChild).getElementsByTagName("activity");
				// String doneActivity =
				// this.getAttributeFromNode(precedChild,"done");
				for (int loopA = 0; loopA < postLOOPActList.getLength(); loopA++) {
					Node actNode = postLOOPActList.item(loopA);
					post = post + this.getAttributeFromNode(actNode, "count") + "*" + this.getAttributeFromNode(actNode, "name") + ", ";
				}// end of for
				post = post + this.getAttributeFromNode(precedChild, "end");
			}
				break;
			case (3446944): {// post
				NodeList postActList = ((Element) precedChild).getElementsByTagName("activity");
				post = this.getAttributeFromNode(postActList.item(0), "name");

			}
				break;
			default: {
			}
			}// end of Switch

		}// end of For
		return pre + "->" + post;
	}

	private String replyEntryHandler(Node repEntNode) {
		String entName = this.getAttributeFromNode(repEntNode, "name");
		String repS = new String();
		String actName = new String();
		NodeList repActList = ((Element) repEntNode).getElementsByTagName("reply-activity");
		for (int ra = 0; ra < repActList.getLength(); ra++) {
			Node repActNode = repActList.item(ra);
			actName = this.getAttributeFromNode(repActNode, "name");
			repS = repS + actName + "[" + entName + "]";
		}

		return repS;
	}

	public void setStartActToEntry(Task aTask) {
		if (aTask.hasActivities()) {
			Iterator taI = aTask.getActivities().values().iterator();
			while (taI.hasNext()) {
				Activity act = (Activity) taI.next();
				if (!act.getBoundToEntry().equals("")) {// has bound to entry
					Entry ent = aTask.getEntry(act.getBoundToEntry());
					if (ent != null)
						ent.setStartActivity(act);
				}
			}
		}
	}

	private Slot slotHandler(Node slotNode) {
		Slot aslot = new Slot("", "");
		String id, bindTarget;

		if (this.getAttributeFromNode(slotNode, "id") != null) {
			id = getAttributeFromNode(slotNode, "id");
			aslot.setID(id);
		}
		if (this.getAttributeFromNode(slotNode, "bind-target") != null) {
			bindTarget = getAttributeFromNode(slotNode, "bind-target");
			aslot.setBindTarget(bindTarget);
		}
		if (this.getAttributeFromNode(slotNode, "replic-num") != null) {
			aslot.setNumOfReplic(this.stringTOint(getAttributeFromNode(slotNode, "replic-num")));
		}
		if (slotNode.hasChildNodes()) {
			// We have to process Interface and Binding
			NodeList slotChildren = slotNode.getChildNodes();
			for (int sc = 0; sc < slotChildren.getLength(); sc++) {
				Node aNode = slotChildren.item(sc); // got the Task
				if (aNode.getNodeName().equals("binding")) {
					BindingGroup bg = this.bindingHandler(aNode);
					// Now add the bindings to the Slot
					aslot.addBindgingGP(bg);
				}
				else if (aNode.getNodeName().equals("Interface")) {
					SlotInterface sInt = processInterface(aNode);
					aslot.setInterface(sInt);
				}
			}

		}
		return aslot;
	}

	private SlotInterface processInterface(Node aNode) {
		SlotInterface sIt = new SlotInterface();
		// Now get the elements of the interface and set them in sIt
		if (aNode.hasChildNodes()) {
			NodeList portList = aNode.getChildNodes();

			for (int p = 0; p < portList.getLength(); p++) {
				Node portNode = portList.item(p);
				// Check if its inport or out-port
				if (portNode.getNodeName().equals("in-port")) {
					Port inPort = portHandler(portNode);
					sIt.addInPort(inPort);
				}

				else if (portNode.getNodeName().equals("out-port")) {
					Port outPort = portHandler(portNode);
					sIt.addOutPort(outPort);
				}
			}// end of for
		}
		return sIt;
	}

	private Port portHandler(Node portNode) {
		String name = this.getAttributeFromNode(portNode, "name");
		String connection = null;
		if (this.getAttributeFromNode(portNode, "connect-from") != null)
			connection = this.getAttributeFromNode(portNode, "connect-from");
		else if (this.getAttributeFromNode(portNode, "connect-to") != null)
			connection = this.getAttributeFromNode(portNode, "connect-to");
		String description = getAttributeFromNode(portNode, "description");
		Port aPort = null;
		if (name != null && connection != null) {
			aPort = new Port(name, connection);
			// check if port has any description
			if (description != null)
				aPort.setDescription(description);// we don't care if its NULL
													// or not
		}
		return aPort;
	}

	private BindingGroup bindingHandler(Node aNode) {
		BindingGroup bindGP = new BindingGroup();
		// Check if the binding Node has any children
		if (!aNode.hasChildNodes())
			return bindGP;// have no parameters or binding in it
		NodeList bindGPList = aNode.getChildNodes();
		for (int bg = 0; bg < bindGPList.getLength(); bg++) {
			// Here we have three elements: parameters, processor-binding
			// and port-binding.
			Node bgElem = bindGPList.item(bg);
			if (bgElem.getNodeName().equals("parameter")) {

			}
			if (bgElem.getNodeName().equals("processor-binding")) {
				Binding proBind = new Binding(getAttributeFromNode(bgElem, "source"), getAttributeFromNode(bgElem, "target"));
				// add this binding to the Vector
				bindGP.addProcessorBind(proBind);
			}
			if (bgElem.getNodeName().equals("port-binding")) {
				Binding portBind = new Binding(getAttributeFromNode(bgElem, "source"), getAttributeFromNode(bgElem, "target"));
				bindGP.addPortBind(portBind);
			}
		}// end of for "bg"

		return bindGP;
	}

	/***************************************************************************
	 * LQN to XML Model and SUB-model /
	 **************************************************************************/
	// This is for the regular model
	public boolean jLQNtoXMLmodel(File file) {
		if ((mod == null) || (file == null))
			return false;

		doc = this.createDOMobject();
		Node rootElement = doc.createElement("lqn-model");
		Attr nameAttr = this.createAttrWithValue("name", file.getName());
		Attr descptAttr = this.createAttrWithValue("description", mod.getComment());
		Attr xmlnsAttr = this.createAttrWithValue("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		Attr nameSpaceAttr = this.createAttrWithValue("xsi:noNamespaceSchemaLocation", "http://www.sce.carleton.ca/rads/lqns/lqn-schema/lqn.xsd");
		((Element) rootElement).setAttributeNode(nameAttr);
		((Element) rootElement).setAttributeNode(descptAttr);
		((Element) rootElement).setAttributeNode(xmlnsAttr);
		((Element) rootElement).setAttributeNode(nameSpaceAttr);
		//
		Element SolverElem = doc.createElement("solver-params");
		Attr commentAttr = this.createAttrWithValue("comment", " ");
		Attr conv_val_Attr = this.createAttrWithValue("conv_val", "1e-006");
		Attr it_limit_Attr = this.createAttrWithValue("it_limit", "50");
		Attr print_int_Attr = this.createAttrWithValue("print_int", "1");
		Attr underrelax_coeff_Attr = this.createAttrWithValue("underrelax_coeff", "0.9");
		((Element) SolverElem).setAttributeNode(commentAttr);
		((Element) SolverElem).setAttributeNode(conv_val_Attr);
		((Element) SolverElem).setAttributeNode(it_limit_Attr);
		((Element) SolverElem).setAttributeNode(print_int_Attr);
		((Element) SolverElem).setAttributeNode(underrelax_coeff_Attr);

		rootElement.appendChild(SolverElem);
		rootElement = this.createLQNcore(mod, rootElement, doc);
		// This is DOM to XML transformation
		doc.insertBefore(rootElement, null);
		Comment comment = doc.createComment("Created by jLQNDef - Rads Lab at Carleton University");
		doc.insertBefore(comment, rootElement);
		this.domToXMLTransformation(doc, file);
		return true;
	}

	// NIKHIL : Export to CBML
	public boolean jLQNtoCBMLmodel(Vector A, Vector P, Vector I, Vector O, Vector S, File file) {
		String s = new String("");

		cbmlA = A;
		cbmlP = P;
		cbmlI = I;
		cbmlO = O;
		cbmlS = S;

		if ((mod == null) || (file == null))
			return false;

		doc = this.createDOMobject();

		if ((I.size() == 0) && (O.size() == 0))
			s = new String("lqn-model");
		else
			s = new String("lqn-submodel");

		Node rootElement = doc.createElement(s);
		//
		rootElement = this.createLQNsubcore(mod, rootElement, doc);
		// This is DOM to XML transformation
		doc.insertBefore(rootElement, null);
		Comment comment = doc.createComment("CBML Created by jLQNDef - Rads Lab at Carleton University");
		doc.insertBefore(comment, rootElement);
		this.domToXMLTransformation(doc, file);
		return true;
	}

	// This is for the SUB-model

	/**
	 * 1. Create the lqn-submodel Element along with its attributes 2. Create an Interface Element 3. Create In-Port Elements and append them to the Interface Element 4. Create Out-Port Elements and append them to the Interface Element 5. Create Rep.Processors
	 * Elements and append them to the Interface Element 6. Append Interface Element to lqn-submodel 7. Create and Append Parameter to lqn-submodel 8. Create and append lqn-core models to lqn-submodel
	 * 
	 * @param model
	 *            Model
	 * @param file
	 *            File
	 * @param subInt
	 *            SubModelInterface
	 * @param par
	 *            Vector
	 * @param descrip
	 *            String
	 * @return boolean
	 */
	public boolean jLQNtoXMLsubModel(Model model, File file, SubModelInterface subInt, HashMap par, String descrip) {
		if ((model == null) || (file == null || subInt == null))
			return false;
		// create the dom
		doc = this.createDOMobject();
		// create the root element
		Node rootElement = doc.createElement("lqn-submodel");
		Attr subModelName = this.createAttrWithValue("name", file.getName());
		((Element) rootElement).setAttributeNode(subModelName);
		Attr descripAttr = this.createAttrWithValue("description", descrip);
		((Element) rootElement).setAttributeNode(descripAttr);
		// insert the root element to the document
		doc.insertBefore(rootElement, null);
		// insert the comments
		Comment comment = doc.createComment("This SUB-MODEL is created by jLQN EDIOTOR **** \n RADS Lab, Carleton University");
		doc.insertBefore(comment, rootElement);
		// Now create the Interface Element
		Node interfaceElem = doc.createElement("Interface");
		rootElement.appendChild(interfaceElem);
		// Go through the SubModelInterface and get and create all the ports and
		// rep.CPUs
		HashMap inPorts = subInt.getInPorts();
		Iterator inPoIt = inPorts.values().iterator();
		while (inPoIt.hasNext()) {
			Port inp = (Port) inPoIt.next();
			interfaceElem.appendChild(this.createPortNode(true, inp));
		}
		HashMap outPorts = subInt.getOutPorts();
		Iterator outPoIt = outPorts.values().iterator();
		while (outPoIt.hasNext()) {
			Port op = (Port) outPoIt.next();
			interfaceElem.appendChild(this.createPortNode(false, op));
		}
		// Create and append the Parameter Element
		if (par != null) {
			Iterator parIt = par.values().iterator();
			Node parmeterElem = doc.createElement("Parameter");
			rootElement.appendChild(parmeterElem);
			while (parIt.hasNext()) {
				Parameter parameter = (Parameter) parIt.next();
				Node paraNode = this.createParameter(parameter);
				parmeterElem.appendChild(paraNode);
			}
		}
		// Create the Model with processors, tasks, entries and etc.
		this.createLQNcore(model, rootElement, doc);
		// Now transform the DOM to XML
		domToXMLTransformation(doc, file);
		System.out.println("Check the " + file.getName() + "for more information");
		return true;
	}

	private Document createDOMobject() {
		try {
			// Find the implementation
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(false);// We don't have Namespace
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document newDoc = builder.newDocument();
			this.doc = newDoc;
			String comment = "This XML file is created by jLQN EDITOR. ";

			doc.createComment(comment);
		}
		catch (FactoryConfigurationError e) {
			System.out.println("Could not locate a JAXP factory class");
		}
		catch (ParserConfigurationException e) {
			System.out.println("Could not locate a JAXP DocumentBuilder class");
		}
		catch (DOMException e) {
			System.err.println(e);
		}

		return doc;
	}

	private Node createLQNcore(Model model, Node rootEl, Document doc) {
		Node rootElement = rootEl;
		HashMap processors = model.getProcessors();
		Vector proNodeList = new Vector();

		// start from processor
		if (!processors.isEmpty()) {
			Iterator pi = processors.values().iterator();
			while (pi.hasNext()) {
				Processor p = (Processor) pi.next();
				Node proNode = this.createProcessorNode(p);
				// Go inside the Processor and get the Tasks
				if (p.getTasks() != null) {
					Vector tv = p.getTasks();
					Iterator ti = tv.iterator();
					while (ti.hasNext()) {
						Task task = (Task) ti.next();
						Node taskNode = this.createTaskNode(task);

						// NIKHIL: Create nodes for Fan-In and Fan-Out and add to taskNode

						String s1, s2;

						String ref1 = new String(String.valueOf(GenericCall.DFL_VAL_FANIN));
						String ref2 = new String(String.valueOf(GenericCall.DFL_VAL_FANOUT));

						ref1.trim();
						ref2.trim();

						Node n;
						Attr a;
						for (int i = 0; i < task.FanInName.size(); i++) {
							s1 = new String((String) task.FanInName.elementAt(i));
							s2 = new String((String) task.FanInValue.elementAt(i));

							s1.trim();
							s2.trim();

							if (s2.equals(ref1))
								continue; // Do not write if it is default Fan In

							n = doc.createElement("fan-in");

							a = doc.createAttribute("source");
							a.setValue(s1);
							((Element) n).setAttributeNode(a);

							a = doc.createAttribute("value");
							a.setValue(s2);
							((Element) n).setAttributeNode(a);

							taskNode.appendChild(n);
						}

						for (int i = 0; i < task.FanOutName.size(); i++) {
							s1 = new String((String) task.FanOutName.elementAt(i));
							s2 = new String((String) task.FanOutValue.elementAt(i));

							s1.trim();
							s2.trim();

							if (s2.equals(ref2))
								continue; // Do not write if it is Default Fan Out

							n = doc.createElement("fan-out");

							a = doc.createAttribute("dest");
							a.setValue(s1);
							((Element) n).setAttributeNode(a);

							a = doc.createAttribute("value");
							a.setValue(s2);
							((Element) n).setAttributeNode(a);

							taskNode.appendChild(n);
						}

						// Go inside the taks and get the Entries
						if (!task.hasNoEntries()) {
							Vector ev = task.getEntries();
							Iterator ei = ev.iterator();
							while (ei.hasNext()) {
								Entry entry = (Entry) ei.next();
								Node entryNode = this.createEntryNode(entry);
								// first set up the Forward calls
								Iterator fcI = entry.getForwarCalls().iterator();
								while (fcI.hasNext()) {
									GenericCall ec = (GenericCall) fcI.next();
									Node forwardN = this.createEntForwardingCall(ec);
									entryNode.appendChild(forwardN);
								}// End of Forward Calls
								if (!entry.hasStartActivity()) {
									Node enPhaseActNode = doc.createElement("entry-phase-activities");
									// get the Phase
									Iterator phaseIr = entry.getPhases().iterator();
									int numPhase = 0;
									while (phaseIr.hasNext()) {
										Phase ph = (Phase) phaseIr.next();
										Node entActNode = this.createActivityNode(ph, entry.getName(), ++numPhase);
										// Now get the calls from the phase and
										// create the callNodes
										Iterator callIr = ph.getCallsOut().iterator();
										while (callIr.hasNext()) {
											GenericCall ec = (GenericCall) callIr.next();
											Node callNode = this.createCallNode(ec);
											// add the call Node to the
											// Activity/Phase
											entActNode.appendChild(callNode);
										}// End of Calls
										enPhaseActNode.appendChild(entActNode);
									}// End of Phase
										// Now process the Calls in the phase:
										// forward/synch/asynch
									entryNode.appendChild(enPhaseActNode);
								}
								else {
									// This need some modification DO NOT remove
									// Process for enty-activity-graph
									Node entActGraphNode = doc.createElement("entry-activity-graph");
									Task parentTask = entry.getTask();
									Iterator actIr = parentTask.getActivities().values().iterator();
									int actNum = 0;
									while (actIr.hasNext()) {
										Activity act = (Activity) actIr.next();
										Node actNode = this.createActivityNode(act, entry.getName(), ++actNum);
										// Now get the calls from the phase and create the callNodes
										Iterator callIr = act.getCallsOut().iterator();
										while (callIr.hasNext()) {
											ActivityCall ac = (ActivityCall) callIr.next();
											Node callNode = this.createCallNode(ac);
											// add the call Node to the Activity/Phase
											actNode.appendChild(callNode);
										}//
											// End of Calls
										entActGraphNode.appendChild(actNode);
									}

									if (!(parentTask.getActivityConnections()).equals("")) { // we have the connection and need to set up Precedence

									}
									entryNode.appendChild(entActGraphNode);

								}
								taskNode.appendChild(entryNode);
							}
						}// Entry

						// Process the task Activities
						if (task.hasActivities()) {
							Node taskActNode = doc.createElement("task-activities");
							Iterator tActIr = task.getActivities().values().iterator();
							HashMap actWithBoun = task.getActivityBoundEnty();

							while (tActIr.hasNext()) {
								Activity act = (Activity) tActIr.next();
								Node actNode; // will be created in "if" or
												// "else"
								// check if this activity is bounded to an Entry
								if (actWithBoun.containsKey(act.getName())) {
									String entName = (String) actWithBoun.get(act.getName());
									actNode = this.createActivityNode(act, entName, 1);//
								}
								else
									actNode = this.createActivityNode(act, null, 1);// Passing null here as
								// a parameter will NOT
								// cause any trouble

								// Now get the calls from the phase and create
								// the callNodes
								Iterator callIr = act.getCallsOut().iterator();
								while (callIr.hasNext()) {
									GenericCall ac = (GenericCall) callIr.next();
									Node callNode = this.createCallNode(ac);
									// add the call Node to the Activity/Phase
									actNode.appendChild(callNode);
								}// End of Calls
								taskActNode.appendChild(actNode);
							}// end while (tActIr.hasNext())

							// Now process the Connection
							if (!task.getActivityConnections().equals("")) {
								this.activityConnectionHandler(task.getActivityConnections(), taskActNode);
							}
							taskNode.appendChild(taskActNode);
						}

						proNode.appendChild(taskNode);
					}
				}// Task
				proNodeList.add(proNode);
				// add the processors to root
				rootElement.appendChild(proNode);
			}

		}// Processor
		/*
		 * NIKHIL: There is no slots anymore, replaced by _task - Now process the Slot List
		 * 
		 * HashMap slH = model.getSlots(); Iterator si = slH.values().iterator(); while (si.hasNext()) { Slot sl = (Slot) si.next(); // create the slot Node Node slotNode = doc.createElement("Slot");
		 * 
		 * // Set its attributes Attr name = this.createAttrWithValue("name", sl.getID()); ((Element) slotNode).setAttributeNode(name); Attr desc = this.createAttrWithValue("description", sl .getDescription()); ((Element) slotNode).setAttributeNode(desc); //
		 * Now get the Interface from Slots
		 * 
		 * if (sl.getSlotInterface() != null) { Node interNode = doc.createElement("Interface"); // process the IN-Ports Iterator inports = sl.getSlotInterface().getInPorts().values() .iterator(); while (inports.hasNext()) { Port inPort = (Port)
		 * inports.next(); Element inPelem = (Element) this.createPortNode(true, inPort); interNode.appendChild(inPelem); } // //process the Out-Ports Iterator outports = sl.getSlotInterface().getOutPorts() .values().iterator(); while (outports.hasNext()) {
		 * Port outPort = (Port) outports.next(); Element outPelem = (Element) this.createPortNode(false, outPort); interNode.appendChild(outPelem); } slotNode.appendChild(interNode); }
		 * 
		 * // Process the parameters Iterator params = sl.getParameters().values().iterator(); while (params.hasNext()) { Parameter pa = (Parameter) params.next(); Element parEle = (Element) this.createParameter(pa); slotNode.appendChild(parEle); }
		 * 
		 * rootElement.appendChild(slotNode); }
		 */

		if (model.lqxString != null && !(model.lqxString.trim().isEmpty())) {
			Node lqxNode = doc.createElement("lqx");
			Node lqxNodeText = doc.createTextNode(model.getLqxString());
			lqxNode.appendChild(lqxNodeText);
			rootElement.appendChild(lqxNode);
		}
		return rootElement;
	}

	// Used for exporting CBML
	private Node createLQNsubcore(Model model, Node rootEl, Document doc) {
		Node rootElement = rootEl;
		HashMap processors = model.getProcessors();
		Vector proNodeList = new Vector();

		// If the model is submode, then append the interface to rootElement here
		// Generate Interface
		// Add inetrface to model
		if ((cbmlI.size() != 0) || (cbmlO.size() != 0)) {
			Node cbmlInterface = this.createCBMLInterface();
			rootElement.appendChild(cbmlInterface);
		}

		for (int i = 0; i < cbmlS.size(); i++) {
			Node cbmlSlot = this.createCBMLSlot(i);
			rootElement.appendChild(cbmlSlot);
		}

		// start from processor
		if (!processors.isEmpty()) {
			Iterator pi = processors.values().iterator();
			while (pi.hasNext()) {
				Processor p = (Processor) pi.next();
				Node proNode = this.createProcessorNode(p);
				// Go inside the Processor and get the Tasks
				if (p.getTasks() != null) {
					Vector tv = p.getTasks();
					Iterator ti = tv.iterator();
					while (ti.hasNext()) {
						Task task = (Task) ti.next();
						Node taskNode = this.createTaskNode(task);
						// Go inside the taks and get the Entries
						if (!task.hasNoEntries()) {
							Vector ev = task.getEntries();
							Iterator ei = ev.iterator();
							while (ei.hasNext()) {
								Entry entry = (Entry) ei.next();
								Node entryNode = this.createEntryNode(entry);
								// first set up the Forward calls
								Iterator fcI = entry.getForwarCalls().iterator();
								while (fcI.hasNext()) {
									GenericCall ec = (GenericCall) fcI.next();
									Node forwardN = this.createEntForwardingCall(ec);
									entryNode.appendChild(forwardN);
								}// End of Forward Calls
								if (!entry.hasStartActivity()) {
									Node enPhaseActNode = doc.createElement("entry-phase-activities");
									// get the Phase
									Iterator phaseIr = entry.getPhases().iterator();
									int numPhase = 0;
									while (phaseIr.hasNext()) {
										Phase ph = (Phase) phaseIr.next();
										Node entActNode = this.createActivityNode(ph, entry.getName(), ++numPhase);
										// Now get the calls from the phase and
										// create the callNodes
										Iterator callIr = ph.getCallsOut().iterator();
										while (callIr.hasNext()) {
											GenericCall ec = (GenericCall) callIr.next();
											Node callNode = this.createCallNode(ec);
											// add the call Node to the
											// Activity/Phase
											entActNode.appendChild(callNode);
										}// End of Calls
										enPhaseActNode.appendChild(entActNode);
									}// End of Phase
										// Now process the Calls in the phase:
										// forward/synch/asynch
									entryNode.appendChild(enPhaseActNode);
								}
								else {/*
									 * This need some modification DO NOT remove //Process for enty-activity-graph Node entActGraphNode = doc.createElement("entry-activity-graph"); Task parentTask = entry.getTask(); Iterator actIr
									 * =parentTask.getActivities().values().iterator(); int actNum =0; while(actIr.hasNext()){ Activity act= (Activity)actIr.next(); Node actNode= this.createActivityNode(act, entry.getName(), ++actNum); //Now get the calls from
									 * the phase and create the callNodes Iterator callIr= act.getCallsOut().iterator(); while(callIr.hasNext()){ ActivityCall ac= (ActivityCall)callIr.next(); Node callNode = this.createCallNode(ac); //add the call Node to the
									 * Activity/Phase actNode.appendChild(callNode); }// End of Calls entActGraphNode.appendChild(actNode); } if(!(parentTask.getActivityConnections()).equals(" ")){ //we have the connection and need to set up Precedence }
									 * entryNode.appendChild(entActGraphNode);
									 */
								}
								taskNode.appendChild(entryNode);
							}
						}// Entry

						// Process the task Activities
						if (task.hasActivities()) {
							Node taskActNode = doc.createElement("task-activities");
							Iterator tActIr = task.getActivities().values().iterator();
							HashMap actWithBoun = task.getActivityBoundEnty();

							while (tActIr.hasNext()) {
								Activity act = (Activity) tActIr.next();
								Node actNode;
								if (actWithBoun.containsKey(act.getName())) {
									String entName = (String) actWithBoun.get(act.getName());
									actNode = this.createActivityNode(act, entName, 1);//
								}
								else
									actNode = this.createActivityNode(act, null, 1);

								// Now get the calls from the phase and create
								// the callNodes
								Iterator callIr = act.getCallsOut().iterator();
								while (callIr.hasNext()) {
									GenericCall ac = (GenericCall) callIr.next();
									Node callNode = this.createCallNode(ac);
									// add the call Node to the Activity/Phase
									actNode.appendChild(callNode);
								}// End of Calls
								taskActNode.appendChild(actNode);
							}// end while (tActIr.hasNext())

							// Now process the Connection
							if (!task.getActivityConnections().equals("")) {
								this.activityConnectionHandler(task.getActivityConnections(), taskActNode);
							}
							taskNode.appendChild(taskActNode);
						}
						// NIKHIL: If the task node's name starts with _ then don't append
						if (!(task.getName().startsWith("_")))
							proNode.appendChild(taskNode);
					}
				}// Task

				if (p.getName() != "_") // NIKHIL: If the processor name is _ then don't append
				{
					proNodeList.add(proNode);
					rootElement.appendChild(proNode); // add the processors to root
				}
			}

		}// Processor
		/*
		 * NIKHIL TO DO - Replace this code Now process the Slot List
		 * 
		 * HashMap slH = model.getSlots(); Iterator si = slH.values().iterator(); while (si.hasNext()) { Slot sl = (Slot) si.next(); // create the slot Node Node slotNode = doc.createElement("Slot");
		 * 
		 * // Set its attributes Attr name = this.createAttrWithValue("name", sl.getID()); ((Element) slotNode).setAttributeNode(name); Attr desc = this.createAttrWithValue("description", sl .getDescription()); ((Element) slotNode).setAttributeNode(desc); //
		 * Now get the Interface from Slots
		 * 
		 * if (sl.getSlotInterface() != null) { Node interNode = doc.createElement("Interface"); // process the IN-Ports Iterator inports = sl.getSlotInterface().getInPorts().values() .iterator(); while (inports.hasNext()) { Port inPort = (Port)
		 * inports.next(); Element inPelem = (Element) this.createPortNode(true, inPort); interNode.appendChild(inPelem); } // //process the Out-Ports Iterator outports = sl.getSlotInterface().getOutPorts() .values().iterator(); while (outports.hasNext()) {
		 * Port outPort = (Port) outports.next(); Element outPelem = (Element) this.createPortNode(false, outPort); interNode.appendChild(outPelem); } slotNode.appendChild(interNode); }
		 * 
		 * // Process the parameters Iterator params = sl.getParameters().values().iterator(); while (params.hasNext()) { Parameter pa = (Parameter) params.next(); Element parEle = (Element) this.createParameter(pa); slotNode.appendChild(parEle);// I may I
		 * have to change // here... // Not sure where param Node is goine }
		 * 
		 * rootElement.appendChild(slotNode); }
		 */

		if (!(model.lqxString.trim().isEmpty())) {
			Node lqxNode = doc.createElement("lqx");
			Node lqxNodeText = doc.createTextNode(model.getLqxString());
			lqxNode.appendChild(lqxNodeText);
			rootElement.appendChild(lqxNode);
		}
		return rootElement;
	}

	private Node createCBMLInterface() {
		int i;

		String s1 = new String();
		String s2 = new String();

		Vector v = new Vector();

		Node interfaceNode = doc.createElement("Interface");

		for (i = 0; i < cbmlI.size(); i++) {
			v = (Vector) cbmlI.get(i);
			s1 = (String) v.get(0);
			s2 = (String) v.get(1);

			Node inportNode = doc.createElement("in-port");

			Attr inportNameAtt = doc.createAttribute("name");
			inportNameAtt.setValue(s1);
			((Element) inportNode).setAttributeNode(inportNameAtt);

			Attr inportConnectToAtt = doc.createAttribute("connect-to");
			inportConnectToAtt.setValue(s2.trim());
			((Element) inportNode).setAttributeNode(inportConnectToAtt);

			Attr inportDesAtt = doc.createAttribute("description");
			inportDesAtt.setValue(" ");
			((Element) inportNode).setAttributeNode(inportDesAtt);

			interfaceNode.appendChild(inportNode);
		}

		for (i = 0; i < cbmlO.size(); i++) {
			v = (Vector) cbmlO.get(i);
			s1 = (String) v.get(0);
			s2 = (String) v.get(1);

			Node inportNode = doc.createElement("out-port");

			Attr inportNameAtt = doc.createAttribute("name");
			inportNameAtt.setValue(s1);
			((Element) inportNode).setAttributeNode(inportNameAtt);

			Attr inportConnectToAtt = doc.createAttribute("connect-from");
			inportConnectToAtt.setValue(s2.trim());
			((Element) inportNode).setAttributeNode(inportConnectToAtt);

			Attr inportDesAtt = doc.createAttribute("description");
			inportDesAtt.setValue(" ");
			((Element) inportNode).setAttributeNode(inportDesAtt);

			interfaceNode.appendChild(inportNode);
		}

		for (i = 0; i < cbmlP.size(); i++) {
			s1 = (String) cbmlP.get(i);

			Node repNode = doc.createElement("Replaceable-Processor");

			Attr repNameAtt = doc.createAttribute("name");
			repNameAtt.setValue(s1);
			((Element) repNode).setAttributeNode(repNameAtt);

			interfaceNode.appendChild(repNode);
		}

		return interfaceNode;
	}

	private Node createCBMLSlot(int n) {
		int i;

		Vector v = (Vector) cbmlS.get(n);
		String s = (String) v.get(0);

		String s1 = new String();
		String s2 = new String();

		Vector v1 = new Vector();
		Vector v2 = new Vector();

		Node slotNode = doc.createElement("slot");

		Attr slotIdAtt = doc.createAttribute("id");
		slotIdAtt.setValue(s);
		((Element) slotNode).setAttributeNode(slotIdAtt);

		Attr slotBindAtt = doc.createAttribute("bind-target");
		slotBindAtt.setValue("   ");
		((Element) slotNode).setAttributeNode(slotBindAtt);

		Node interfaceNode = doc.createElement("Interface");

		v1 = (Vector) v.get(1);
		v2 = (Vector) v.get(2);

		for (i = 0; i < v1.size(); i++) {

			s1 = (String) v1.get(i);
			s2 = (String) v2.get(i);

			Node inportNode = doc.createElement("in-port");

			Attr inportNameAtt = doc.createAttribute("name");
			inportNameAtt.setValue(s1.trim());
			((Element) inportNode).setAttributeNode(inportNameAtt);

			Attr inportConnectToAtt = doc.createAttribute("connect-from");
			inportConnectToAtt.setValue(s2.trim());
			((Element) inportNode).setAttributeNode(inportConnectToAtt);

			Attr inportDesAtt = doc.createAttribute("description");
			inportDesAtt.setValue(" ");
			((Element) inportNode).setAttributeNode(inportDesAtt);

			interfaceNode.appendChild(inportNode);
		}

		v1 = (Vector) v.get(3);
		v2 = (Vector) v.get(4);

		for (i = 0; i < v1.size(); i++) {

			s1 = (String) v1.get(i);
			s2 = (String) v2.get(i);

			Node outportNode = doc.createElement("out-port");

			Attr outportNameAtt = doc.createAttribute("name");
			outportNameAtt.setValue(s1.trim());
			((Element) outportNode).setAttributeNode(outportNameAtt);

			Attr outportConnectToAtt = doc.createAttribute("connect-to");
			outportConnectToAtt.setValue(s2.trim());
			((Element) outportNode).setAttributeNode(outportConnectToAtt);

			Attr outportDesAtt = doc.createAttribute("description");
			outportDesAtt.setValue("  ");
			((Element) outportNode).setAttributeNode(outportDesAtt);

			interfaceNode.appendChild(outportNode);
		}

		slotNode.appendChild(interfaceNode);

		Node bindingNode = doc.createElement("Binding");

		v1 = (Vector) v.get(5);
		for (i = 0; i < cbmlA.size(); i++) {

			s = (String) cbmlA.get(i);
			if (v1.contains(s)) {
				Node pNode = doc.createElement("processor-binding");

				Attr sNameAtt = doc.createAttribute("source");
				sNameAtt.setValue(s);
				((Element) pNode).setAttributeNode(sNameAtt);

				Attr tNameAtt = doc.createAttribute("target");
				tNameAtt.setValue("  ");
				((Element) pNode).setAttributeNode(tNameAtt);

				bindingNode.appendChild(pNode);
			}
		}

		slotNode.appendChild(bindingNode);

		return slotNode;
	}

	private Node createProcessorNode(Processor p) {

		// create the new processor node
		Node proNode = doc.createElement("processor");
		// create the attributes and set therir values
		// name
		Attr processorNameAtt = doc.createAttribute("name");
		processorNameAtt.setValue(p.getName());
		((Element) proNode).setAttributeNode(processorNameAtt);

		// Multiplicity
		/***********************************************************************
		 * Modified by Jing Xu, Aug 29, 2005** only generate multiplicity attribute if it is other than 1(Default value) NIKHIL: Taking into account that multiplicity is now a String
		 */
		String mulS = p.getMultiServer();
		int mul = Integer.parseInt(mulS);
		if (mul != Processor.DFL_VAL_MULTISERVER) {
			Attr proMul = doc.createAttribute("multiplicity");
			proMul.setValue(mulS);
			((Element) proNode).setAttributeNode(proMul);
		}

		// speed-factor
		/***********************************************************************
		 * Modified by Jing Xu, Aug 29, 2005** only generate speed-factor if it is other than 1.0(Default value)
		 */
		float cpurate = p.getCpuRate();
		if (cpurate != Processor.DFL_VAL_RATE) {
			Attr proSpeedFact = doc.createAttribute("speed-factor");
			Float speedValue = new Float(cpurate);
			proSpeedFact.setValue(speedValue.toString());
			((Element) proNode).setAttributeNode(proSpeedFact);
		}

		// replication
		/***********************************************************************
		 * Modified by Jing Xu, Aug 29, 2005** only generate replication if it is greater than 1(Default value)
		 */
		int rep = p.getReplication();
		if (rep > 1) {
			Attr proReplication = doc.createAttribute("replication");
			proReplication.setValue((new Integer(rep)).toString());
			((Element) proNode).setAttributeNode(proReplication);
		}

		// scheduling
		/***********************************************************************
		 * Modified by Jing Xu, Aug 29, 2005** convert the char for scheduling into string f=first come first served, h= head of line, p=priority, r=random scheduling, s=processor sharing
		 */
		char psch = p.getScheduling();
		String sPsch = null;
		switch (psch) {
		case 'f':
			sPsch = "fcfs";
			break;
		case 'h':
			sPsch = "hol";
			break;
		case 'p':
			sPsch = "pp";
			break;
		case 'r':
			sPsch = "rand";
			break;
		case 's':
			sPsch = "ps";
			break;
		default:
			sPsch = "fcfs";
		}
		Attr proSched = doc.createAttribute("scheduling");
		proSched.setValue(sPsch);
		((Element) proNode).setAttributeNode(proSched);

		return proNode;
	}

	private boolean domToXMLTransformation(Document doc, File file) {
		// Serialize the document onto System.out
		try {
			TransformerFactory xformFactory = TransformerFactory.newInstance();
			Transformer idTransform = xformFactory.newTransformer();
			idTransform.setOutputProperty(OutputKeys.INDENT, "yes");
			Source input = new DOMSource(doc);
			Result output = new StreamResult(file);
			idTransform.transform(input, output);
		}
		catch (TransformerConfigurationException e) {
			System.err.println(e);
		}
		catch (TransformerException e) {
			System.err.println(e);
		}
		return true;
	}

	private Element createTaskNode(Task t) {

		// create the new processor node
		Element taskElem = doc.createElement("task");

		// create the attributes and set therir values
		Attr taskNameAtt = doc.createAttribute("name");
		taskNameAtt.setValue(t.getName());
		taskElem.setAttributeNode(taskNameAtt);

		// Multiplicity
		/***********************************************************************
		 * Modified by Jing Xu, Aug 29, 2005****** Generate multiplicity only when it is other than 1 NIKHIL: Changed to replfect the fact that multiplicity is now a String
		 */
		String mul = t.getMultiServer();
		int m = Integer.parseInt(mul);
		if (m != 1) {
			Attr taskMul = doc.createAttribute("multiplicity");
			taskMul.setValue(mul);
			taskElem.setAttributeNode(taskMul);
		}

		// Replication
		// Attr taskReplic = doc.createAttribute()

		// Scheduling
		Attr taskSchedAttr = doc.createAttribute("scheduling");
		if (t.getScheduling() == 'r') {
			taskSchedAttr.setValue("ref");
		}
		else if (t.getScheduling() == 'f') {
			taskSchedAttr.setValue("fcfs");
		}
		else if (t.getScheduling() == 'e') {
			taskSchedAttr.setValue("pri");
		}
		else if (t.getScheduling() == 'b') {
			taskSchedAttr.setValue("burst");
		}
		else if (t.getScheduling() == 'h') {
			taskSchedAttr.setValue("hol");
		}
		else if (t.getScheduling() == 'p') {
			taskSchedAttr.setValue("poll");
		}
		else if (t.getScheduling() == 'i') {
			taskSchedAttr.setValue("inf");
		}
		taskElem.setAttributeNode(taskSchedAttr);
		// Think-Time
		// Priority
		// Queue-length
		// Activity Graph
		return taskElem;
	}

	/*
	 * Method Name: createServiceNode This method will create a Service Node that is an element of Taks Node.
	 */
	private Node createServiceNode(String sName) {
		Node serviceNode = doc.createElement("service");
		Attr serviceName = this.createAttrWithValue("name", sName);
		((Element) serviceNode).setAttributeNode(serviceName);
		return serviceNode;
	}

	/**
	 * 
	 * This method will create a TaskActivity Node(and its child Nodes) that is an element of Taks Node. !!!!!!!!!!!!! NOT COMPLETE yet..... Need to add some more Attr nodes !!!!!
	 * 
	 * @param entName
	 *            String
	 * @param actName
	 *            String
	 * @return Node
	 */
	private Node createTaskActivityNode(String entName, String actName) {

		Node taskActivNode = doc.createElement("task-activities");
		// create the Grandchild
		Node replyActivityNode = doc.createElement("reply-activity");
		Attr repActName = this.createAttrWithValue("name", actName);
		((Element) replyActivityNode).setAttributeNode(repActName);
		// create the Child Node
		Node replyEntryNode = doc.createElement("reply-entry");
		Attr repEntName = this.createAttrWithValue("name", entName);
		((Element) replyEntryNode).setAttributeNode(repEntName);
		// Append the child and Grand Child
		replyEntryNode.appendChild(replyActivityNode);
		taskActivNode.appendChild(replyEntryNode);
		return taskActivNode;
	}

	/*
	 * Method Name: createEntryNode This method will create an Entry Node that is an element of Taks Node. precondition: doc != null Input: Entry Output: Node
	 */

	private Node createEntryNode(Entry e) {
		// create the new processor node
		Node entryNode = doc.createElement("entry");

		// create the attributes and set therir values
		Attr entryNameAtt = doc.createAttribute("name");
		entryNameAtt.setValue(e.getName());
		((Element) entryNode).setAttributeNode(entryNameAtt);

		// Opent Arrival Rate
		/***********************************************************************
		 * Modified by Jing Xu, Aug 29, 2005** Only generate open-arrival-rate when it is >0
		 */
		float arrivalRate = e.getArrivalRate();
		if (arrivalRate > 0) {
			Attr openArrivalRate = doc.createAttribute("open-arrival-rate");
			openArrivalRate.setValue((new Float(arrivalRate)).toString());
			((Element) entryNode).setAttributeNode(openArrivalRate);
		}

		// Type
		Attr type = doc.createAttribute("type");
		// if(e.hasStartActivity())
		// This needs further validation.
		type.setValue("PH1PH2");

		((Element) entryNode).setAttributeNode(type);

		return entryNode;
	}

	/*
	 * Method Name: forwardingNode This method will create a Forwarding Node that is an element of Entry Node. precondition: doc != null Input: dest string, prob value Output: Node
	 */

	private Node forwardingNode(String dest, double prob) {
		Node forwardNode = doc.createElement("forwarding");
		Attr destAttr = createAttrWithValue("dest", dest);
		Attr probAttr = createAttrWithValue("prob", (new Double(prob).toString()));
		((Element) forwardNode).setAttributeNode(destAttr);
		((Element) forwardNode).setAttributeNode(probAttr);
		return forwardNode;
	}

	/*
	 * Method Name: createEntryActGraphNode This method will create a entry-activity-graph Node and its child (reply-activity) that is an element of Entry Node. precondition: doc != null Input: Reply Activity Name Output: Node
	 */
	private Node createEntryActGraphNode(String repAcName) {
		// create the reply-activity Node first
		Node replyActNode = doc.createElement("reply-activity");
		Attr repActName = this.createAttrWithValue("name", repAcName);
		((Element) replyActNode).setAttributeNode(repActName);
		Node entryActGraphNode = doc.createElement("entry-activity-graph");
		entryActGraphNode.appendChild(replyActNode);
		return entryActGraphNode;
	}

	/*
	 * Method Name: createEntActivityNode
	 * 
	 * This method will create a ActivityNodee and set its attributes that is an element of Entry Node and Task-activities.
	 * 
	 * precondition: doc != null Inputs: Phase/Activity, ModelNode, int Output: Node
	 */

	private Node createActivityNode(Phase ph, String entName, int num) {
		// This method is not ready yet
		Node activityNode = doc.createElement("activity");
		if (ph instanceof Activity) {
			((Element) activityNode).setAttributeNode(this.createAttrWithValue("name", ((Activity) ph).getName()));
			if (entName != null)
				((Element) activityNode).setAttributeNode(this.createAttrWithValue("bound-to-entry", entName));

		}
		else {
			((Element) activityNode).setAttributeNode(this.createAttrWithValue("name", entName + "_ph" + num));
			((Element) activityNode).setAttributeNode(this.createAttrWithValue("phase", new Integer(num).toString()));
		}
		// These are common to both Activity and Phase

		/***********************************************************************
		 * Modified by Jing Xu, Aug 29, 2005****** Check for necessarity of generating attribute nodes
		 */
		// host-mean-demand
		((Element) activityNode).setAttributeNode(this.createAttrWithValue("host-demand-mean", ph.getServiceTimeString()));

		// host-demand-cvsq
		float cvsq = ph.getCoefVariation();
		if (cvsq < 1) {
			((Element) activityNode).setAttributeNode(this.createAttrWithValue("host-demand-cvsq", new Float(cvsq).toString()));
		}

		// think time
		float thinktime = ph.getThinkTime();
		if (thinktime > 0) {
			((Element) activityNode).setAttributeNode(this.createAttrWithValue("think-time", new Float(thinktime).toString()));
		}

		// max-service-time
		float maxServ = ph.getMaxServiceTime();
		if (maxServ > 0) {
			((Element) activityNode).setAttributeNode(this.createAttrWithValue("max-service-time", new Float(ph.getMaxServiceTime()).toString()));
		}

		// call-order type
		// there are 3 types defined in the xml schema
		// STOCHASTIC, DETERMINISTIC and LIST
		// I am not sure what does LIST type mean
		// and the jLQN core class doesn't support this type yet.
		if (!ph.isStochastic()) {
			((Element) activityNode).setAttributeNode(this.createAttrWithValue("call-order", "DETERMINISTIC"));
		}

		return activityNode;
	}

	/*
	 * Method Name: createEntForwardingCall
	 * 
	 * This method will create a Forward call Node and set its attributes that is an element of Entry Node.
	 * 
	 * precondition: doc != null Inputs: EntryCall Output: Node
	 */

	private Node createEntForwardingCall(GenericCall ec) {
		Node forwardNode = doc.createElement("forwarding");
		Attr destAtt = this.createAttrWithValue("dest", ec.getDestinationName());
		Attr probValAtt = this.createAttrWithValue("prob", new Float(ec.getProbForwarding()).toString());
		((Element) forwardNode).setAttributeNode(destAtt);
		((Element) forwardNode).setAttributeNode(probValAtt);

		return forwardNode;
	}

	/*
	 * Method Name: createCallNode
	 * 
	 * This method will create a call Node and set its attributes that is an element of Entry/Activity Node. A call can be of Synch or Asynch type. The first parmeter of this method will specify what type of call needs to be created. If type==TRUE create a
	 * synch-call else create asynch-call.
	 * 
	 * precondition: doc != null Inputs: type, dest, callMen, fanIn, fanOut Output: Node
	 */
	private Node createCallNode(GenericCall gc) {
		Node callNode;
		if (gc.isRendezvous())
			callNode = doc.createElement("synch-call");
		else
			callNode = doc.createElement("asynch-call");

		// destination entry
		Attr destAttr = this.createAttrWithValue("dest", gc.getDestinationName());
		((Element) callNode).setAttributeNode(destAttr);

		// calls-main
		Attr callMeanAttr = this.createAttrWithValue("calls-mean", gc.getMeanCallsString());
		;
		((Element) callNode).setAttributeNode(callMeanAttr);

		/*
		 * NIKHIL: Fan-In and Fan-Out have been moved to Tasks String fanS = gc.getFanIn(); int fan = Integer.parseInt(fanS); if (fan != 1) { Attr fanInAttr = this.createAttrWithValue("fanin", fanS); ((Element) callNode).setAttributeNode(fanInAttr); } fanS =
		 * gc.getFanOut(); fan = Integer.parseInt(fanS); if (fan != 1) { Attr fanOutAttr = this.createAttrWithValue("fanout", fanS); ((Element) callNode).setAttributeNode(fanOutAttr); }
		 */

		return callNode;
	}

	/**
	 * Name: createAttrWithValue This method will create an attribute Node and set given value. precondition: doc !=null
	 */
	private Attr createAttrWithValue(String attr, String value) {
		Attr attribute = doc.createAttribute(attr);
		attribute.setValue(value);
		return attribute;
	}

	/**
	 * Name: activityConnectionHandler This method will create the precedence and reply-entry Nodes that Represent Activity connection. precondition: doc !=null Input:
	 */

	private boolean activityConnectionHandler(String actConn, Node taskNode) {
		// remove the white space in the connection first
		String connection = actConn.trim();
		// Use the String Tokenizer to get each precedence lines
		String[] preLines = connection.split(";");
		for (int i = 0; i < preLines.length; i++) {
			String tempLine = preLines[i].trim();
			if (tempLine.endsWith("]")) { // Process the reply entries
				Node replyEntNode = doc.createElement("reply-entry");
				int startB = tempLine.indexOf('[');
				int endB = tempLine.indexOf(']');
				((Element) replyEntNode).setAttributeNode(this.createAttrWithValue("name", tempLine.substring(startB + 1, endB)));
				Node replyActNode = doc.createElement("reply-activity");
				((Element) replyActNode).setAttributeNode(this.createAttrWithValue("name", tempLine.substring(0, startB)));
				replyEntNode.appendChild(replyActNode);
				taskNode.appendChild(replyEntNode);
			}
			// Process the precedence
			else {
				String[] prePost = tempLine.split("->");
				if (prePost.length == 2) {
					Node preceNode = doc.createElement("precedence");
					preceNode.appendChild(processPRE(prePost[0].trim()));
					preceNode.appendChild(processPOST(prePost[1].trim()));
					taskNode.appendChild(preceNode);
				}
			}

		}
		return true;
	}

	private Node processPRE(String pre) {
		Node preNode;
		if (pre.indexOf('&') != -1) {// we have pre-AND
			String[] preAnds = pre.split("&");
			preNode = doc.createElement("pre-AND");
			for (int i = 0; i < preAnds.length; i++) {
				Node preActNode = doc.createElement("activity");
				((Element) preActNode).setAttributeNode(this.createAttrWithValue("name", preAnds[i]));
				preNode.appendChild(preActNode);
			}
			return preNode;
		}
		else if (pre.indexOf('+') != -1) {// pre-OR
			String[] preORs = pre.split("\\+");
			preNode = doc.createElement("pre-OR");
			for (int i = 0; i < preORs.length; i++) {
				Node preActNode = doc.createElement("activity");
				((Element) preActNode).setAttributeNode(this.createAttrWithValue("name", preORs[i]));
				preNode.appendChild(preActNode);
			}
			return preNode;
		}
		/*
		 * else if(pre.indexOf('+')!=-1){//pre-OR preNode= doc.createElement("pre-LOOP"); return preNode; }
		 */
		else {// pre
			preNode = doc.createElement("pre");
			Node preActNode = doc.createElement("activity");
			((Element) preActNode).setAttributeNode(this.createAttrWithValue("name", pre));
			preNode.appendChild(preActNode);

			return preNode;
		}

	}

	private Node processPOST(String post) {
		Node postNode;
		if (post.indexOf('&') != -1) {// we have pre-AND
			String[] postAnds = post.split("&");
			postNode = doc.createElement("post-AND");
			for (int i = 0; i < postAnds.length; i++) {
				Node preActNode = doc.createElement("activity");
				((Element) preActNode).setAttributeNode(this.createAttrWithValue("name", postAnds[i]));
				postNode.appendChild(preActNode);
			}
			return postNode;
		}
		else if (post.indexOf('+') != -1) {// pre-OR
			String[] postORs = post.split("\\+");
			postNode = doc.createElement("post-OR");
			for (int i = 0; i < postORs.length; i++) {
				Node preActNode = doc.createElement("activity");
				// we have to extract the prob values
				String pORs = postORs[i].trim();
				int startB = pORs.indexOf('(');
				int endB = pORs.indexOf(')');
				if (startB + 1 < endB) {// this will make sure there is atleast
										// one char between ().
					String probVal = pORs.substring(startB + 1, endB);
					String actName = pORs.substring(endB + 1);
					((Element) preActNode).setAttributeNode(this.createAttrWithValue("name", actName));
					((Element) preActNode).setAttributeNode(this.createAttrWithValue("prob", probVal));
				}
				else
					// if we don't have () then just make it as its name
					((Element) preActNode).setAttributeNode(this.createAttrWithValue("name", postORs[i]));

				postNode.appendChild(preActNode);
			}
			return postNode;
		}
		/*
		 * else if(pre.indexOf('+')!=-1){//for Post Loop preNode= doc.createElement("post-LOOP"); return preNode; }
		 */
		else {// post
			postNode = doc.createElement("post");
			Node postActNode = doc.createElement("activity");
			((Element) postActNode).setAttributeNode(this.createAttrWithValue("name", post));
			postNode.appendChild(postActNode);
			return postNode;
		}

	}

	/**
	 * This method creates either in-port or out-port depending on the passed type parameter. If the type is true, in-port element is created. Otherwise out-port is created.
	 */
	private Node createPortNode(boolean type, Port port) {
		Element portElem;
		if (type) {// in-port
			portElem = doc.createElement("in-port");
			Attr connTo = this.createAttrWithValue("connect-to", port.getConnection());
			portElem.setAttributeNode(connTo);
		}
		else {// out-port
			portElem = doc.createElement("out-port");
			Attr connFrom = this.createAttrWithValue("connect-from", port.getConnection());
			portElem.setAttributeNode(connFrom);
		}
		Attr nameAttr = this.createAttrWithValue("name", port.getName());
		portElem.setAttributeNode(nameAttr);
		Attr disAttr = this.createAttrWithValue("description", port.getDescription());
		portElem.setAttributeNode(disAttr);
		return portElem;
	}

	/**
	 * This method creates the parameter Node with its attributes
	 */
	private Node createParameter(Parameter par) {
		String name = par.getName();
		String defaul = par.getValue().toString();
		Element paramElem = doc.createElement("para");
		Attr nameAttr = this.createAttrWithValue("name", name);
		paramElem.setAttributeNode(nameAttr);
		Attr defaltAttr = this.createAttrWithValue("default", defaul);
		paramElem.setAttributeNode(defaltAttr);
		return paramElem;
	}

	/**
	 * This method creates the Replaceable Processor Node with its attributes
	 */
	private Node createRepProcessors(String name) {
		Element repProc = doc.createElement("Replaceable-Processor");
		Attr nameAttr = this.createAttrWithValue("name", name);
		repProc.setAttributeNode(nameAttr);
		return repProc;
	}
	/** ************* END of LQN to XML ************************************** */

}
