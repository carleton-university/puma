/*
 * Module class
 *
 * Copyright the Real-Time and Distributed Systems Group,
 * Department of Systems and Computer Engineering,
 * Carleton University, Ottawa, Ontario, Canada. K1S 5B6
 *
 * October, 1999
 *
 * $Header: /opt/CVS/lqntools/common/lqnModel/Module.java,v 1.1.1.1.4.2 2005/04/29 02:33:41 vinoshan Exp $
 *
 * ------------------------------------------------------------------------
 * $Log: Module.java,v $
 * Revision 1.1.1.1.4.2  2005/04/29 02:33:41  vinoshan
 * *** empty log message ***
 *
 */

package lqnModel;

import java.util.*;
import java.io.*;

/**
 * A Layered Queueing Layered Network(LQN) containing LQN
 * sub-modules(components) and binding relationships.
 * <p>
 * <IMG SRC = Module.gif>
 * 
 * @author Real-time and Distributed Systems Group
 * @author Department of Systems and Computer Engineering
 * @author Carleton University
 * @author
 *         <li>D. McMullan
 */
public class Module extends Model {

	/**
	 * Collection of variable mappings.
	 * <p>
	 * Key: this module's variable string, Value: the variable's value
	 * <p>
	 * Both are string objects.
	 */
	private HashMap variableMap;

	/**
	 * Collection of module variables that are given a parameter value at
	 * creation of this module.
	 * <p>
	 * Key: this module's variable, Value: the variable's value
	 * <p>
	 * Both are string objects.
	 */
	private HashMap overriddenVariables;

	/**
	 * Collection of processor names that make up the processor interface of
	 * this module.
	 */
	private InterfaceList procInterface;

	/**
	 * Collection of entry names that make up the service interface of this
	 * module.
	 */
	private InterfaceList serviceInterface;

	/**
	 * Collection of entry names that make up the request interface of this
	 * module.
	 */
	private InterfaceList requestInterface;

	/**
	 * Map of the bindings between interface processors of this module and
	 * external processors.
	 * <p>
	 * Key: this module's processor, Value: external processor
	 * 
	 * @see Processor
	 */
	private HashMap procBindings;

	/**
	 * Map of the bindings between interface services of this module and
	 * external services.
	 * <p>
	 * Key: this module's service entry, Value: external service entry
	 * <p>
	 * External service is being replaced by module service, so all requests
	 * made to external service are redirected to module service when this
	 * module is installed into its parent.
	 * 
	 * @see Entry
	 */
	private HashMap serviceBindings;

	/**
	 * Map of the bindings between interface requests of this module and
	 * external entries.
	 * <p>
	 * Key: this module's test harness entry, Value: external entry
	 * <p>
	 * Requests made to module request by entries within this module are
	 * redirected to external entry when this module is installed into its
	 * parent.
	 * 
	 * @see Entry
	 */
	private HashMap requestBindings;

	/**
	 * Collection of the sub-modules of this module.
	 * <p>
	 * Key: this module's task that is replaced, Value: the replacement module.
	 */
	private HashMap components;

	/**
	 * Collection of this module's processors that are replaced by external
	 * processors
	 * 
	 * @see Processor
	 */
	private Vector replacedProcessors;

	/**
	 * Collection of this module's tasks that are replaced by components
	 * 
	 * @see Task
	 */
	private Vector replacedTasks;

	/**
	 * Collection of this module's harness entries that have been bound to
	 * external services
	 * 
	 * @see Entry
	 */
	private Vector replacedHarnessEntries;

	/**
	 * Parent module containing this module. If <code>null</code>, this
	 * module is not contained within any other module.
	 */
	private Module parent;

	/**
	 * The name of the abstract class of this module.
	 */
	private String className;

	/**
	 * Indicator as to whether the processor interface of this module is
	 * replicated. If <code>true</code>, processor interface is replicated
	 * when this module is installed into it's parent.
	 */
	private boolean replicateInterface;

	/**
	 * Collection of processor mappings indicating which external processor
	 * (Value) replaces copies of this module processor (Key).
	 * <p>
	 * Key: processor from this module, Value: external processor
	 * <p>
	 * This is valid only if replicateInterface is <code>true</code>.
	 * 
	 * @see Processor
	 */
	private HashMap replicationMap;

	/**
	 * Default class constructor.
	 */
	public Module() {
		this(null, (new String()), (new HashMap()), null);
	}

	/**
	 * Class constructor specifying the prefix to give all internal names.
	 * 
	 * @param classId
	 *            the className(type) of the module
	 * @param name
	 *            the string to be used as the name of the instance
	 */
	public Module(String classId, String name) {
		this(classId, name, (new HashMap()), null);
	}

	/**
	 * Class constructor specifying the prefix to give all internal names, the
	 * parameters to use for any variable values, and the parent(super-module)
	 * of this module
	 * 
	 * @param classId
	 *            the className(type) of the module
	 * @param name
	 *            the string to be used as the name of the instance
	 * @param parameters
	 *            hashmap of variables/values (<code>String</code> objects)
	 * @param p
	 *            the module that contains this module
	 */
	public Module(String classId, String name, HashMap parameters, Module p) {
		super();
		if (p != null)
			variableList = p.variableList; // this is a component so get
											// parent's list
		setNamePrefix(new String(name));
		if (classId != null)
			className = new String(classId);
		else
			className = new String();
		if (parameters != null)
			overriddenVariables = parameters;
		else
			overriddenVariables = new HashMap();
		variableMap = new HashMap();
		procInterface = new InterfaceList();
		serviceInterface = new InterfaceList();
		requestInterface = new InterfaceList();
		procBindings = new HashMap();
		serviceBindings = new HashMap();
		requestBindings = new HashMap();
		components = new HashMap();
		replacedProcessors = new Vector();
		replacedTasks = new Vector();
		replacedHarnessEntries = new Vector();
		parent = p;
		replicateInterface = false;
		replicationMap = new HashMap();
	}

	/**
	 * Sets indication that this module's service interface is automatically
	 * replicated when this module is installed into its parent.
	 * 
	 * @param replicate
	 *            <code>true</code> indicates that auto-replication should
	 *            occur
	 */
	public void setAutoReplication(boolean replicate) {
		replicateInterface = replicate;
	}

	/**
	 * Determine's if this module's service interface is automatically
	 * replicated
	 * 
	 * @return <code>true</code> if service interface is replicated,
	 *         <code>false</code> otherwise
	 */
	public boolean isReplicated() {
		return replicateInterface;
	}

	/**
	 * Gets the parent of this module.
	 * 
	 * @return parent of this module; <code>null</code> if there is no parent
	 */
	public Module getParent() {
		return parent;
	}

	/**
	 * Sets the name of the type(class) of this module
	 * 
	 * @param classId
	 *            the name of the module class
	 */
	public void setClassName(String classId) {
		className = new String(classId);
	}

	/**
	 * Gets the name of the type(class) of this module
	 * 
	 * @return the type name
	 */
	public String getClassName() {
		if (className != null)
			return className;
		else
			return new String();
	}

	/**
	 * Gets the instance name of this module. This is similar to getNamePrefix
	 * method except the returned string does not contain the trailing
	 * underscore. For example, if namePrefix is "Example_", this method returns
	 * a new string containing "Example".
	 * 
	 * @return the instance name
	 */
	public String getInstanceName() {
		int len = getNamePrefix().length() - 1;
		if (len < 0)
			len = 0;
		return getNamePrefix().substring(0, len);
	}

	/**
	 * Determines if a module type is part of the super-module hierarchy of this
	 * module. Use to prevent circular references. For example, if this module's
	 * class is "Class1" and its parent is a sub-module of "Class1",
	 * <p>
	 * this.isAncestorOf(this.getParent().getClassName());
	 * <p>
	 * returns <code>true</code>.
	 * 
	 * @param classId
	 *            name of class to test against
	 * @return <code>true</code> if the super-module heirachy contains the
	 *         module type, <code>false</code> otherwise
	 */
	public boolean isAncestorOfClass(String classId) {
		boolean found = false;
		if (this.className.equals(classId))
			found = true;
		else if ((this.getParent() != null)
				&& (this.getParent().isAncestorOfClass(classId)))
			found = true;
		return found;
	}

	/**
	 * Produces a trace of the containment classes of this module.
	 * 
	 * @return a trace of the containment beginning with the highest
	 *         module/model to this module. For example, if this module was of
	 *         class SimpleMod and it is a sub-module of an instance of class
	 *         NestedMod which is itself a sub-module of example.lqn, the trace
	 *         is: <ln> example.lqn <- NestedMod <- SimpleMod
	 */
	public String getModuleTrace() {
		String trace = new String();
		Module p = this.getParent();
		if (parent != null) {
			trace = trace.concat(parent.getModuleTrace());
			trace = trace.concat(new String(" <- "));
			trace = trace.concat(this.getClassName());
		} else {
			trace = trace.concat(this.getClassName());
		}
		return trace;
	}

	/**
	 * Gets the number of sub-mudules(components) contained in this module.
	 * 
	 * @return the number of sub-modules
	 */
	public int getNumberOfComponents() {
		return components.size();
	}

	/**
	 * Gets the collection of sub-mudules contained in this module.
	 * 
	 * @return the sub-mudules contained in this module
	 * @see #components
	 */
	public HashMap getComponents() {
		return components;
	}

	/**
	 * Gets the collection of processor bindings for this module.
	 * 
	 * @return the processor bindings of this module
	 * @see #procBindings
	 */
	public HashMap getProcessorBindings() {
		return procBindings;
	}

	/**
	 * Gets the collection of service bindings for this module.
	 * 
	 * @return the service bindings of this module
	 * @see #serviceBindings
	 */
	public HashMap getServiceBindings() {
		return serviceBindings;
	}

	/**
	 * Gets the collection of request bindings for this module.
	 * 
	 * @return the request bindings of this module
	 * @see #requestBindings
	 */
	public HashMap getRequestBindings() {
		return requestBindings;
	}

	// /**
	// * Adds a variable/value mapping to module.
	// * If value was passed via an argument, the variable will be set to that
	// * value, not the default value
	// *
	// * @param var the variable name
	// * @param value the default value
	// *
	// * @return <code>true</code> if mapping successfully added
	// * @return <code>false</code> if variable key already exists; mapping is
	// not added
	// */
	// public boolean addVariableDefinition(String variable, String value){
	// String mappedVariable = new String(variable);
	// String mappedValue = new String(value);
	// if(variableValues.size() > 0 && variableValues.size() >
	// variableMap.size()){
	// String storedValue =
	// (String)variableValues.elementAt(variableMap.size());
	// if(storedValue.length()!=0)
	// mappedValue = new String(storedValue);
	// }
	// return (variableMap.put(mappedVariable ,mappedValue) != null);
	// }

	/**
	 * Sets the entire collection of variable/value mappings for this module.
	 * Only those variables that are in both the passed hashMap parameter and
	 * this module's variableMap have the value changed. Used by parser.
	 * 
	 * @param map
	 *            the list of variable names and values
	 * @see #variableMap
	 */
	public void setVariableMappings(HashMap map) {
		variableMap = map;
		// insert the values for any overrriden variables
		Vector foundVariables = new Vector();
		for (Iterator i = (overriddenVariables.entrySet()).iterator(); i
				.hasNext();) {
			Map.Entry variableDef = (Map.Entry) i.next();
			if (variableMap.containsKey(variableDef.getKey())) {
				variableMap.put(variableDef.getKey(), variableDef.getValue());
				// overridden mapping was used
				foundVariables.add(variableDef.getKey());
			}
		}
		// remove used overridden mappings, there should be nothing left
		// if all the variable names were valid
		for (int i = 0; i < foundVariables.size(); i++) {
			overriddenVariables.remove((String) foundVariables.elementAt(i));
		}
	}

	/**
	 * Gets a listing of any unused overridden variables of this module. This
	 * function is called after an instance of the module is created. Used as a
	 * check that all the argument variables used when this module was created
	 * are correct. Used by parser.
	 * 
	 * @return a string representing the list of unused variable names,
	 *         <code>null</code> if all variables were used
	 */
	public String getBadVarDef() {
		if (!overriddenVariables.isEmpty()) {
			return overriddenVariables.keySet().toString();
		} else
			return null;
	}

	/**
	 * Gets the collection of variable/value mappings for this module.
	 * 
	 * @return this module's HashMap object of variable names and values
	 * @see #variableMap
	 */
	public HashMap getVariableMappings() {
		return variableMap;
	}

	/**
	 * Gets the value of a certain variable.
	 * 
	 * @param variable
	 *            the variable name to look up
	 * @return the value the variable; <code>null</code> if variable does not
	 *         exist or if the variable exists and is set to null
	 */
	public String getVariableValue(String variable) {
		return (String) variableMap.get(variable);
	}

	/**
	 * Adds a processor name to the processor interface of this module.
	 * 
	 * @param proc
	 *            the processor name
	 * @return <code>true</code> if name added to processor interface list;
	 *         <code>false</code> if name not added because name already part
	 *         of interface
	 */
	public boolean exportProcessorName(String proc) {
		return procInterface.add(new String(proc));
	}

	/**
	 * Determines if a processor is part of processor interface of this module.
	 * 
	 * @param proc
	 *            the processor's name
	 * @return <code>true</code> if processor is part of processor interface;
	 *         <code>false</code> otherwise
	 */
	public boolean isProcessorExported(String proc) {
		return (procInterface.contains(proc) && getProcessor(proc) != null);
	}

	/**
	 * Adds a service to the service interface of this module.
	 * 
	 * @param serv
	 *            the service entry's name
	 * @return <code>true</code> if name added to service interface list;
	 *         <code>false</code> if name not added because name already part
	 *         of interface
	 */
	public boolean exportServiceName(String serv) {
		return serviceInterface.add(new String(serv));
	}

	/**
	 * Determines if a service is part of the service interface of this module.
	 * 
	 * @param serv
	 *            the service entry's name
	 * @return <code>true</code> if entry is part of service interface;
	 *         <code>false</code> otherwise
	 */
	public boolean isServiceExported(String serv) {
		return (serviceInterface.contains(serv) && getEntry(serv) != null);
	}

	/**
	 * Determines if an interface service has a defined binding to an external
	 * service.
	 * 
	 * @param serv
	 *            the service entry's name
	 * @return <code>true</code> if entry is part of the service interface and
	 *         is bound to an outside entry; <code>false</code> otherwise
	 */
	public boolean isServiceBound(String serv) {
		return (serviceInterface.isBound(serv) && isServiceExported(serv));
	}

	/**
	 * Adds a request name to the request interface of this module.
	 * 
	 * @param req
	 *            the request entry's name
	 * @return <code>true</code> if name added to request interface list;
	 *         <code>false</code> if name not added because name already part
	 *         of interface
	 */
	public boolean exportRequestName(String req) {
		return requestInterface.add(new String(req));
	}

	/**
	 * Determines if a request is part of the request interface of this module.
	 * 
	 * @param req
	 *            the request entry's name
	 * @return <code>true</code> if entry is part of request interface;
	 *         <code>false</code> otherwise
	 */
	public boolean isRequestExported(String req) {
		return (requestInterface.contains(new String(req)) && getEntry(req) != null);
	}

	/**
	 * Adds a processor binding definition to this module.
	 * 
	 * @param compProc
	 *            the module processor
	 * @param modelProc
	 *            the external processor
	 * @return <code>null</code> if processor binding does not already exist
	 *         and is added, else the processor to which the module's processor
	 *         is already bound
	 */
	public Processor addProcessorBinding(Processor compProc, Processor modelProc) {
		if (procBindings.containsValue(modelProc))
			return modelProc;
		else {
			procInterface.setToBound(compProc.getName());
			return (Processor) procBindings.put(compProc, modelProc);
		}
	}

	/**
	 * Adds a service binding definition to this module.
	 * 
	 * @param compService
	 *            this module's interface service entry
	 * @param modelService
	 *            entry in parent module that is replaced by compService entry
	 * @return <code>null</code> if service binding does not already exist and
	 *         is added, else the entry to which the module's service is already
	 *         bound
	 */
	public Entry addServiceBinding(Entry compService, Entry modelService) {
		if (serviceBindings.containsValue(modelService))
			return modelService;
		else {
			serviceInterface.setToBound(compService.getName());
			return (Entry) serviceBindings.put(compService, modelService);
		}
	}

	/**
	 * Adds a request binding definition to this module.
	 * 
	 * @param compRequest
	 *            entry in test harness of module that is replaced by
	 *            modelService
	 * @param modelService
	 *            the external entry that satifies requests made to compRequest
	 * @return <code>null</code> if request binding does not already exist and
	 *         is added, else the entry to which the module's request is already
	 *         bound
	 */
	public Entry addRequestBinding(Entry compRequest, Entry modelService) {
		if (requestBindings.containsValue(modelService))
			return modelService;
		else {
			requestInterface.setToBound(compRequest.getName());
			return (Entry) requestBindings.put(compRequest, modelService);
		}
	}

	/**
	 * Determines if all service and request interface entries of this module
	 * have binding definitions. If not a string of the unbound interface items
	 * is returned.
	 * 
	 * @return a warning message containing a list of unbound service and
	 *         request interface items, <code>null</code> otherwise
	 */
	public String defaultInterface() {
		String result = new String();
		// check service interface
		HashMap list = serviceInterface.getList();
		for (Iterator i = (list.keySet()).iterator(); i.hasNext();) {
			String service = (String) i.next();
			if (!serviceInterface.isBound(service)
					&& (this.getEntry(service)).getArrivalRate() != Entry.DFL_VAL_ARRIVALRATE)
				result = result.concat("Warning: Service interface \""
						+ service + "\" not bound, harness defaults used\n");
		}
		list = requestInterface.getList();
		for (Iterator i = (list.keySet()).iterator(); i.hasNext();) {
			String request = (String) i.next();
			if (!requestInterface.isBound(request))
				result = result.concat("Warning: Request interface \""
						+ request + "\" not bound, harness defaults used\n");
		}
		if (result.length() == 0)
			return null;
		else
			return result;
	}

	/**
	 * Adds a module to this module's collection of sub-module's.
	 * 
	 * @param task
	 *            task that is replaced by the module
	 * @param module
	 *            module that replaces the task
	 */
	public void addComponent(Task task, Module module) {
		Module comp = (Module) components.put(task, module);
	}

	/**    */
	public void reconcilePromotedBindings() {
		Module parent = getParent();
		if (parent != null) { // if this is a sub-component
			// for each of my bound services
			// for(Iterator i = (serviceBindings.entrySet()).iterator();
			// i.hasNext();){
			// Map.Entry serviceBinding = (Map.Entry)i.next();
			// search my parent for equivalent transferred binding
			// serviceBinding.setValue(parent.getDemotedServiceBinding((Entry)serviceBinding.getValue()));
			// }
			// processor bindings may also be demoted
			for (Iterator i = (procBindings.entrySet()).iterator(); i.hasNext();) {
				Map.Entry procBinding = (Map.Entry) i.next();
				// search my parent for equivalent transferred binding
				procBinding.setValue(parent
						.getDemotedProcessorBinding((Processor) procBinding
								.getValue()));
			}
			// request bindings may also be demoted
			for (Iterator i = (requestBindings.entrySet()).iterator(); i
					.hasNext();) {
				Map.Entry reqBinding = (Map.Entry) i.next();
				// search my parent for equivalent transferred binding
				reqBinding
						.setValue(parent
								.getDemotedRequestBinding((Entry) reqBinding
										.getValue()));
			}
		}
	}

	/**    */
	public Processor getDemotedProcessorBinding(Processor previousBind) {
		Processor binding = (Processor) procBindings.get(previousBind);
		if (binding != null) { // the binding was demoted in this module
			// if(getParent()==null)
			// return binding; // this is the highest level so return the
			// binding
			// else
			// return getParent().getDemotedProcessorBinding(binding); // see if
			// binding demoted in parent
			return binding;
		} else
			return previousBind; // this module does not demote the binding
									// so return the passed binding
	}

	/**    */
	public Entry getDemotedServiceBinding(Entry previousBind) {
		Entry binding = (Entry) serviceBindings.get(previousBind);
		if (binding != null) { // the binding was demoted in this module
			if (getParent() == null)
				return binding; // this is the highest level so return the
								// binding
			else
				return getParent().getDemotedServiceBinding(binding); // see
																		// if
																		// binding
																		// demoted
																		// in
																		// parent
		} else
			return previousBind; // this module does not demote the binding
									// so return the passed binding
	}

	/**    */
	public Entry getDemotedRequestBinding(Entry previousBind) {
		Entry binding = (Entry) requestBindings.get(previousBind);
		if (binding != null) { // the binding was demoted in this module
			// if(getParent()==null)
			// return binding; // this is the highest level so return the
			// binding
			// else
			// return getParent().getDemotedRequestBinding(binding); // see if
			// binding demoted in parent
			return binding;
		} else
			return previousBind; // this module does not demote the binding
									// so return the passed binding
	}

	/**
	 * Reconciles conflicts between the request binding mappings of all this
	 * modules's sub-modules and the service bindings of its peers.
	 * Specifically, if a request binding of a sub-module is mapped to an entry
	 * of this module which is itself bound to a service binding of another
	 * sub-module, the value of the request binding is changed to the key of
	 * it's peer's service binding. This circumstance occurs where one task
	 * calls another task and both tasks are substituted by modules.
	 * <p>
	 * For example, entry e1 of task t1 calls entry e2 of task t2 and t1 is
	 * substituted by module Mod1 and t2 is substituted by module Mod2. The
	 * bindings section would include:
	 * <ul>
	 * <li>B t1 Mod1()
	 * <li>r e2 t1_request1
	 * <li>-1
	 * <li>B t2 Mod2()
	 * <li>s e2 t2_Service1
	 * <li>-1
	 * </ul>
	 * <p>
	 * After execution of this method, the request binding for t1 essentially
	 * becomes:
	 * <ul>
	 * <li>r t2_Service1 t1_request1
	 * </ul>
	 */
	public void reconcileSubModuleBindings() {
		// for each of my modules
		for (Iterator c = (components.values()).iterator(); c.hasNext();) {
			Module keyComp = (Module) c.next();
			HashMap keyCompReqBindings = keyComp.getRequestBindings();
			// for each of the sub-module's request bindings
			for (Iterator i = (keyCompReqBindings.entrySet()).iterator(); i
					.hasNext();) {
				Map.Entry keyRequestBinding = (Map.Entry) i.next();
				// for each of my other components
				for (Iterator j = (components.values()).iterator(); j.hasNext();) {
					Module peerComp = (Module) j.next();
					if (peerComp != keyComp) {
						// get peer sub-module's service bindings
						HashMap peerCompServiceBindings = peerComp
								.getServiceBindings();
						for (Iterator k = (peerCompServiceBindings.entrySet())
								.iterator(); k.hasNext();) {
							Map.Entry peerServiceBinding = (Map.Entry) k.next();
							if (peerServiceBinding.getValue() == keyRequestBinding
									.getValue())
								keyRequestBinding.setValue(peerServiceBinding
										.getKey());
						}
					}
				}
			}
		}
	}

	/**
	 * Determines if this module's bindings are compatible with a task. Two
	 * conditions must be satisfied:
	 * <p>
	 * 1) The number of bound interface services must equal the total number of
	 * entries in the task that are called by other entries/activities or that
	 * have non-zero open arrival rates.
	 * <p>
	 * 2) The number of bound interface requests must equal the number of
	 * different entries that are called from entries/activiies in the task.
	 * 
	 * @param task
	 *            task to be compared
	 * @return <code>true</code> if this module as defined, can replace the
	 *         task, <code>false</code> otherwise
	 */
	public boolean bindingsCompatible(Task task) {
		// determine that number of bound services equal to the number of called
		// entries in task
		Vector taskEntries = task.getEntries();
		int calledEntries = 0;
		for (int i = 0; i < taskEntries.size(); i++) {
			Entry taskEntry = (Entry) taskEntries.elementAt(i);
			if (taskEntry.hasCallers()
					|| (taskEntry.getArrivalRate() > Entry.DFL_VAL_ARRIVALRATE))
				calledEntries++;
		}
		if (serviceBindings.size() != calledEntries)
			return false;
		// determine that number of bound requests equal to number of entries
		// that are called from the entries in the task
		HashSet destinationEntries = new HashSet();
		for (int i = 0; i < taskEntries.size(); i++) {
			Entry entr = (Entry) taskEntries.elementAt(i);
			Vector phases = entr.getPhases();
			for (int j = 0; j < phases.size(); j++) {
				Vector callsOut = ((Phase) phases.elementAt(j)).getCallsOut();
				for (int k = 0; k < callsOut.size(); k++) {
					GenericCall call = (GenericCall) callsOut.elementAt(k);
					destinationEntries.add(call.getDestination());
				}
			}
		}
		HashMap taskActivities = task.getActivities();
		for (Iterator i = (taskActivities.values()).iterator(); i.hasNext();) {
			Activity act = (Activity) i.next();
			Vector callsOut = act.getCallsOut();
			for (int k = 0; k < callsOut.size(); k++) {
				GenericCall call = (GenericCall) callsOut.elementAt(k);
				destinationEntries.add(call.getDestination());
			}
		}
		return (destinationEntries.size() == requestBindings.size());
	}

	/**
	 * Replicates the processor interface of this module to the the desired
	 * number of replicas. Each replicated processor's tasks are also replicated
	 * 
	 * @param interfaceProc
	 *            the interface processor to be replicated
	 * @param copies
	 *            the desired total number of replicated processors
	 * @exception InstallException
	 */
	public void replicateInterfaceProcessor(Processor interfaceProc, int copies)
			throws InstallException {
		try {
			for (int index = 2; index <= copies; index++) {
				Processor procCopy = (Processor) ObjectCloner
						.deepCopy(interfaceProc);// create deep copy
				procCopy.setName(interfaceProc.getName() + "_" + index);
				Vector tasks = procCopy.getTasks();
				for (int i = 0; i < tasks.size(); i++) {
					Task tsk = (Task) tasks.elementAt(i);
					Task replacedTask = this.getTask(tsk.getName()); // has
																		// task
																		// already
																		// been
																		// replaced
																		// ?
					if (replacedTasks.contains(replacedTask)) { // task has
																// already been
																// replaced so
																// it is
																// redundant
						replacedTasks.add(tsk);
					}
					tsk.setName(tsk.getName() + "_" + index); // set task name
																// to the
																// correct index
					Vector entries = tsk.getEntries();
					for (int j = 0; j < entries.size(); j++) {
						Entry entr = (Entry) entries.elementAt(j);
						entr.setName(entr.getName() + "_" + index);
						Vector phases = entr.getPhases();
						for (int k = 0; k < phases.size(); k++) {
							Vector calls = ((Phase) phases.elementAt(k))
									.getCallsOut();
							for (int w = 0; w < calls.size(); w++) {
								EntryCall entrcall = (EntryCall) calls
										.elementAt(w);
								// if(entrcall != null){
								// System.out.println("Call source is:
								// "+entrcall.getSource().getName()+", call dest
								// is: "+entrcall.getDestination().getName());
								// String name = new String("Null Proc");
								// if(entrcall.getDestination().getTask().getProcessor()
								// != null)
								// name =
								// entrcall.getDestination().getTask().getProcessor().getName();
								// System.out.println("Source proc is:
								// "+entrcall.getSource().getTask().getProcessor().getName()+",
								// dest proc is: "+name);
								// }
								if (entrcall.getDestination().getTask()
										.getProcessor() != procCopy) { // only
																		// keep
																		// calls
																		// in
																		// between
																		// processor
																		// tasks
									// System.out.println("Call to
									// "+entrcall.getDestination().getName()+"
									// proc is not same, attempting to set
									// destination to
									// "+entrcall.getDestination().getName());
									Entry destEntry = null;
									Module model = this;
									while (destEntry == null) {
										destEntry = model.getEntry(new String(
												entrcall.getDestination()
														.getName()));
										if (destEntry == null) {
											model = model.getParent();
											if (model == null)
												throw new InstallException(
														"Entry \""
																+ entrcall
																		.getDestination()
																		.getName()
																+ "\"not found");
										}
									}

									entrcall.setDestination(destEntry);
									// entrcall.setDestination(this.getEntry(new
									// String(entrcall.getDestination().getName())));
									// System.out.println("Destination entry
									// found");
									// if(this.getEntry(new
									// String(entrcall.getDestination().getName()))==null)
									// System.out.println("Destination entry not
									// found in component");
									// if(this.getParent().getEntry(new
									// String(entrcall.getDestination().getName()))!=null)
									// System.out.println("Destination entry
									// found in parent");

									entrcall.setDestinationLink();
									// System.out.println("Setting destination
									// succeeded");
								}
							}
						}
					}
					for (Iterator actI = (tsk.getActivities().values())
							.iterator(); actI.hasNext();) {
						Activity act = (Activity) actI.next();
						act.setName(act.getName() + "_" + index);
						Vector calls = act.getCallsOut();
						for (int w = 0; w < calls.size(); w++) {
							ActivityCall actcall = (ActivityCall) calls
									.elementAt(w);
							if (actcall.getDestination().getTask()
									.getProcessor() != procCopy) {
								Entry destEntry = null;
								Module model = this;
								while (destEntry == null) {
									destEntry = model
											.getEntry(new String(actcall
													.getDestination().getName()));
									if (destEntry == null) {
										model = model.getParent();
										if (model == null)
											throw new InstallException(
													"Entry \""
															+ actcall
																	.getDestination()
																	.getName()
															+ "\"not found");
									}
								}
								actcall.setDestination(destEntry);
								actcall.setDestinationLink();
							}
						}
					}
				}
				this.addProcessor(procCopy); // add the copy to this module
				for (int i = 0; i < tasks.size(); i++) {
					this.addTask((Task) tasks.elementAt(i));
				}

			}
			if (copies > 1) { // rename the original processor system, if any
								// copies made
				this.processors.remove(interfaceProc.getName()); // remove
																	// originalName/processor
																	// mapping
																	// from
																	// model
				interfaceProc.setName(interfaceProc.getName() + "_1");
				this.processors.put(interfaceProc.getName(), interfaceProc); // add
																				// newName/processor
																				// mapping
																				// to
																				// model
				Vector taskVect = interfaceProc.getTasks();
				for (int i = 0; i < taskVect.size(); i++) {
					Task tsk = (Task) taskVect.elementAt(i);
					this.tasks.remove(tsk.getName()); // remove
														// originalName/task
														// mapping from model
					tsk.setName(tsk.getName() + "_1");
					this.tasks.put(tsk.getName(), tsk); // add newName/task
														// mapping to model
					Vector entryVect = tsk.getEntries();
					for (int j = 0; j < entryVect.size(); j++) {
						Entry entr = (Entry) entryVect.elementAt(j);
						this.entries.remove(entr.getName()); // remove
																// originalName/entry
																// mapping from
																// model
						entr.setName(entr.getName() + "_1");
						this.entries.put(entr.getName(), entr); // add
																// newName/entry
																// mapping to
																// model
					}
					HashMap activities = tsk.getActivities();
					HashMap newActivities = new HashMap();
					for (Iterator actI = (activities.values()).iterator(); actI
							.hasNext();) {
						Activity act = (Activity) actI.next();
						act.setName(act.getName() + "_1");
						newActivities.put(act.getName(), act);
					}
					tsk.setActivities(newActivities);
				}
			}
		} catch (Exception e) {
			throw new InstallException("Exception in processor \""
					+ interfaceProc.getName() + "\" replication = " + e);
		}
	}

	/**
	 * Determine if a particular processor has a bound interface service on it.
	 * 
	 * @param proc
	 *            the processor to be tested
	 * @return <code>true</code> if processor runs a bound interface service,
	 *         <code>false</code> otherwise
	 */
	public boolean processorProvidesInterfaceService(Processor proc) {
		Vector tasks = proc.getTasks();
		for (int i = 0; i < tasks.size(); i++) {
			Vector entries = ((Task) tasks.elementAt(i)).getEntries();
			for (int j = 0; j < entries.size(); j++) {
				if (serviceInterface.isBound(((Entry) entries.elementAt(j))
						.getName()))
					return true;
			}
		}
		return false; // processor didn't have any bound service entries
	}

	/**
	 * Determines if a processor may be replicated. Processors may be replicated
	 * only if it's tasks are not used by other processor's tasks
	 * 
	 * @param proc
	 *            the processor to be tested
	 * @return <code>true</code> if processor may be replicated,
	 *         <code>false</code> otherwise
	 */
	public boolean isProcessorReplicable(Processor proc) {
		Vector tasks = proc.getTasks();
		for (int i = 0; i < tasks.size(); i++) {
			Vector entries = ((Task) tasks.elementAt(i)).getEntries();
			for (int j = 0; j < entries.size(); j++) {
				Vector callers = ((Entry) entries.elementAt(j)).getCallers();
				for (int k = 0; k < callers.size(); k++) {
					if (callers.elementAt(k) instanceof Entry) {
						if (((Entry) callers.elementAt(k)).getTask()
								.getProcessor() != proc)
							return false;
					} else if (callers.elementAt(k) instanceof Activity) {
						if (((Activity) callers.elementAt(k)).getTask()
								.getProcessor() != proc)
							return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * Installs this module's sub-modules to this module.
	 * 
	 * @throws InstallException
	 *             if any sub-module could not be installed
	 * @exception InstallException
	 *                error occurs during intallation of components
	 */
	public void installComponents() throws InstallException {
		// reconcile any submodule peer-to-peer binding conflicts
		reconcileSubModuleBindings();

		for (Iterator i = (components.entrySet()).iterator(); i.hasNext();) {
			Map.Entry me = (Map.Entry) i.next();
			Module component = (Module) me.getValue();
			component.installComponents();
			component.install((Task) me.getKey());
			this.replacedProcessors.addAll(component.getReplacedProcessors());
			this.replacedTasks.addAll(component.getReplacedTasks());
			this.replacedHarnessEntries.addAll(component
					.getReplacedHarnessEntries());
		}
	}

	/**
	 * Installs this module to its parent module. NOTE: this method must only be
	 * called on a module that has a parent (super-module)
	 * 
	 * @throws InstallException
	 *             if the component cannot replace the task. This occurs when
	 *             the bindings are incompatible. The component is not
	 *             installed.
	 * @param task
	 *            task that is replaced by this module
	 * @exception InstallException
	 *                when component cannot be installed
	 */
	private void install(Task task) throws InstallException {
		if (!bindingsCompatible(task))
			throw new InstallException("Component of class \"" + getClassName()
					+ "\" cannot replace task \"" + task.getName()
					+ "\"\nBindings incompatible");

		reconcilePromotedBindings();

		// replicate processor interface, if indicated
		if (this.isReplicated()) {
			// for each interface processor
			for (Iterator i = procInterface.getList().keySet().iterator(); i
					.hasNext();) {
				Processor proc = this.getProcessor((String) i.next());
				if (processorProvidesInterfaceService(proc)) { // only
																// processors
																// running
																// service
																// entries may
																// be replicated
					// determine if interface can be replicated ie. has no
					// external callers
					if (!isProcessorReplicable(proc))
						throw new InstallException(
								"Replication of processor \"" + proc.getName()
										+ "\" not allowed: has client(s)");
					// determine the number of copies and processor index
					// mappings
					Vector extProc = new Vector();
					for (Iterator j = serviceBindings.entrySet().iterator(); j
							.hasNext();) {
						Map.Entry sb = (Map.Entry) j.next();
						if (((Entry) sb.getKey()).getTask().getProcessor() == proc) { // service
																						// is
																						// on
																						// this
																						// proc
							Entry origService = (Entry) sb.getValue();
							Vector callers = origService.getCallers(); // get
																		// callers
																		// of
																		// original
																		// service
							for (int k = 0; k < callers.size(); k++) {
								Processor bindProc = null;
								if (callers.elementAt(k) instanceof Entry)
									bindProc = ((Entry) callers.elementAt(k))
											.getTask().getProcessor();
								else if (callers.elementAt(k) instanceof Activity)
									bindProc = ((Activity) callers.elementAt(k))
											.getTask().getProcessor();
								if (bindProc != null
										&& !extProc.contains(bindProc))
									extProc.add(bindProc);
							}
						}
					}
					replicationMap.put(proc, extProc); // store mapping for
														// later reference
					replicateInterfaceProcessor(proc, extProc.size());
					// System.out.println("Replication map is
					// "+replicationMap.toString());
				}
			}
		}

		// bind component to the model
		bindServices(); // bind services first
		bindRequests(); // bind requests second
		bindProcessors(); // bind processors last
		// flag component's task for replacement
		replacedTasks.add(task);
		// add all remaining component objects to the model
		if (getParent() != null)
			getParent().mergeWith(this);
		String harness = defaultInterface();
		if (harness != null)
			System.out.print(harness);
	}

	/**
	 * Removes processors that have been replaced from this module.
	 */
	private void removeReplacedProcessors() {
		for (int i = 0; i < replacedProcessors.size(); i++) {
			removeProcessor((Processor) replacedProcessors.elementAt(i));
		}
		replacedProcessors.clear();
	}

	/**
	 * Gets list of processors that are replaced in this module.
	 * 
	 * @return vector of replaced processors
	 * @see #replacedProcessors
	 */
	public Vector getReplacedProcessors() {
		return replacedProcessors;
	}

	/**
	 * Removes tasks that have been replaced by sub-modules from this module.
	 */
	public void removeReplacedTasks() {
		for (int i = 0; i < replacedTasks.size(); i++) {
			removeTask((Task) replacedTasks.elementAt(i));
		}
		replacedTasks.clear();
	}

	/**
	 * Gets list of tasks that are replaced in this module.
	 * 
	 * @return vector of replaced tasks
	 * @see #replacedTasks
	 */
	public Vector getReplacedTasks() {
		return replacedTasks;
	}

	/**
	 * Gets list of harness entries that are replaced in this module.
	 * 
	 * @return vector of replaced entries
	 * @see #replacedHarnessEntries
	 */
	public Vector getReplacedHarnessEntries() {
		return replacedHarnessEntries;
	}

	/**
	 * Removes harness entries that have been substituted from this module. If
	 * harness task is emptied, the task is also removed.
	 */
	public void removeReplacedHarnessEntries() {
		for (int i = 0; i < replacedHarnessEntries.size(); i++) {
			Entry entr = (Entry) replacedHarnessEntries.elementAt(i);
			removeEntry((Entry) replacedHarnessEntries.elementAt(i));
			if (entr.getTask().hasNoEntries())
				removeTask(entr.getTask());
		}
		replacedHarnessEntries.clear();
	}

	/**
	 * Replaces processors with the processors found in procBindings list. The
	 * replaced processor is deleted from this module.
	 */
	protected void bindProcessors() {
		if (!this.isReplicated()) {
			for (Iterator i = (procBindings.entrySet()).iterator(); i.hasNext();) {
				Map.Entry me = (Map.Entry) i.next();
				bindProcessor((Processor) me.getKey(), (Processor) me
						.getValue());
			}
		} else { // get the automatic replicated processor bindings
			for (Iterator i = (replicationMap.entrySet()).iterator(); i
					.hasNext();) {
				Map.Entry me = (Map.Entry) i.next();
				Vector mappedProcs = (Vector) me.getValue();
				if (mappedProcs.size() > 1) {
					String origName = new String(((Processor) me.getKey())
							.getName());
					origName = origName.substring(0, origName.length() - 1); // we
																				// don't
																				// want
																				// the
																				// index
																				// "1"
					for (int j = 0; j < mappedProcs.size(); j++) {
						String procName = origName.concat((new Integer(j + 1))
								.toString());
						Processor proc = this.getProcessor(procName);
						bindProcessor(proc, (Processor) mappedProcs
								.elementAt(j));
					}
				} else // only one processor mapped to key so regular binding
				if (!mappedProcs.isEmpty())
					bindProcessor((Processor) me.getKey(),
							(Processor) mappedProcs.firstElement());
			}
			// bind any non-replicated processors
			for (Iterator i = (procBindings.entrySet()).iterator(); i.hasNext();) {
				Map.Entry me = (Map.Entry) i.next();
				if (!replicationMap.containsKey((Processor) me.getKey()))
					bindProcessor((Processor) me.getKey(), (Processor) me
							.getValue());
			}
		}
	}

	/**
	 * Replaces external service entries with this module's entries found in
	 * serviceBindings list.
	 */
	protected void bindServices() {
		for (Iterator i = (serviceBindings.entrySet()).iterator(); i.hasNext();) {
			Map.Entry me = (Map.Entry) i.next();
			bindService((Entry) me.getKey(), (Entry) me.getValue());

			Entry compServ = (Entry) me.getKey();
			Entry modServ = (Entry) me.getValue();

			Module p = this.getParent();
			if (p != null) {
				HashMap pServBindings = p.getServiceBindings();
				Entry pService = (Entry) pServBindings.get(modServ);
				if (pService != null) {
					pServBindings.put(compServ, pService); // add new binding
															// map
					pServBindings.remove(modServ); // remove old binding
				}
				Module nextP = p.getParent();
				if (nextP != null) {
					HashMap comps = nextP.getComponents();
					for (Iterator k = (comps.values()).iterator(); k.hasNext();) {
						Module comp = (Module) k.next();
						HashMap reqBindings = comp.getRequestBindings();
						for (Iterator z = (reqBindings.entrySet()).iterator(); z
								.hasNext();) {
							Map.Entry rme = (Map.Entry) z.next();
							Entry modReq = (Entry) rme.getValue();
							if (modServ == modReq)
								rme.setValue(compServ);
						}
					}
				}
			}
		}
	}

	/**
	 * Replaces request entries found in requestBindings list. The replaced
	 * request entry is deleted from this module.
	 */
	protected void bindRequests() {
		for (Iterator i = (requestBindings.entrySet()).iterator(); i.hasNext();) {
			Map.Entry me = (Map.Entry) i.next();
			bindRequest((Entry) me.getKey(), (Entry) me.getValue());
		}
	}

	/**
	 * Replaces an interface processor of this module with another processor.
	 * 
	 * @param moduleProc
	 *            processor of this module that is replaced
	 * @param replacementProc
	 *            the replacement processor
	 */
	private void bindProcessor(Processor moduleProc, Processor replacementProc) {
		Vector tasks = (Vector) moduleProc.getTasks().clone(); // make copy of
																// moduleProc
																// task Vector
		for (Enumeration e = tasks.elements(); e.hasMoreElements();) {
			Task tsk = (Task) e.nextElement();
			moduleProc.removeTask(tsk); // remove task reference from the module
										// processor
			replacementProc.addTask(tsk); // add task reference to the model's
											// processor
		}
		replacedProcessors.add(moduleProc); // finally indicate processor to be
											// removed from the module
	}

	/**
	 * Replaces an external model service with this module's interface service.
	 * All calls made the external model service are transferred to this
	 * module's interface service.
	 * 
	 * @param compService
	 *            this modules interface service entry
	 * @param modelService
	 *            external service entry
	 */
	public void bindService(Entry compService, Entry modelService) {
		// switch references to the entries
		switchCallReferences(modelService, compService, this.isReplicated());
		// remove test harness info
		if (compService.getCallers().size() > 0)
			compService.setArrivalRate(Entry.DFL_VAL_ARRIVALRATE);
	}

	/**
	 * Replaces this module's harness entry with external entry. All calls made
	 * to this module's harness entry are transferred to the external service.
	 * 
	 * @param compRequest
	 *            this modules harness entry
	 * @param modelService
	 *            external service
	 */
	private void bindRequest(Entry compRequest, Entry modelService) {
		// switch references to the entries
		switchCallReferences(compRequest, modelService, false);
		// remove the component test harness requestor
		replacedHarnessEntries.add(compRequest);
	}

	/**
	 * Switches calls made to an old service to a new service. If the processor
	 * interface of this module is replicated, calls are transferred to the
	 * appropriate service replicate.
	 * 
	 * @param oldService
	 *            the original service entry
	 * @param newService
	 *            the new service entry
	 * @param replication
	 *            replication indicator
	 */
	private void switchCallReferences(Entry oldService, Entry newService,
			boolean replication) {

		// get callers of the original entry
		Vector callers = oldService.getCallers();
		// for each caller
		for (Enumeration e = callers.elements(); e.hasMoreElements();) {
			Object caller = e.nextElement();
			if (caller instanceof Entry) {
				// if Entry caller
				Entry entr = (Entry) caller;
				// for each phase
				for (int j = 0; j < entr.getNumberOfPhases(); j++) {
					Phase entrPh = entr.getPhase(j);
					if (entrPh != null) {
						Vector calls = (Vector) entrPh.getCallsOut().clone();
						// for each call
						for (Enumeration ec = calls.elements(); ec
								.hasMoreElements();) {
							EntryCall entrCall = (EntryCall) ec.nextElement();
							// if call destination is original
							if (oldService == entrCall.getDestination()) {
								if (replication) {
									Vector mapIndex = (Vector) replicationMap
											.get(newService.getTask()
													.getProcessor());
									if (mapIndex != null && mapIndex.size() > 1) {
										String index = (new Integer((mapIndex
												.indexOf(entr.getTask()
														.getProcessor()) + 1)))
												.toString();
										String newServiceName = new String(
												newService.getName());
										newServiceName = newServiceName
												.substring(0, (newServiceName
														.length() - 1));
										newServiceName = newServiceName
												.concat(index);
										Entry replicaService = this
												.getEntry(newServiceName);
										// set destination to replacement
										entrCall.setDestination(replicaService);
										replicaService
												.setArrivalRate(Entry.DFL_VAL_ARRIVALRATE);
									} else { // only one client processor so
												// use original new service
										entrCall.setDestination(newService);
									}
								} else { // no replication so use original
											// new service
									// set destination to replacement
									entrCall.setDestination(newService);
								}
								// notify replacement entry of the existence of
								// this call
								entrCall.setDestinationLink();
							}
						}
					}
				}
			} else if (caller instanceof Activity) {
				// if Activity caller
				Activity act = (Activity) caller;
				Vector calls = (Vector) act.getCallsOut();
				// for each call
				for (Enumeration ac = calls.elements(); ac.hasMoreElements();) {
					ActivityCall actCall = (ActivityCall) ac.nextElement();
					// if call destination is original entry
					if (oldService == actCall.getDestination()) {
						if (replication) {
							Vector mapIndex = (Vector) replicationMap
									.get(newService.getTask().getProcessor());
							if (mapIndex.size() > 1) {
								String index = (new Integer(
										(mapIndex.indexOf(act.getTask()
												.getProcessor()) + 1)))
										.toString();
								String newServiceName = new String(newService
										.getName());
								newServiceName = newServiceName.substring(0,
										(newServiceName.length() - 1));
								newServiceName = newServiceName.concat(index);
								Entry replicaService = this
										.getEntry(newServiceName);
								// set destination to replacement
								actCall.setDestination(replicaService);
								replicaService
										.setArrivalRate(Entry.DFL_VAL_ARRIVALRATE);
							} else { // only one client processor so use
										// original new service
								actCall.setDestination(newService);
							}
						} else { // no replication so use original new
									// service
							// set destination to replacement
							actCall.setDestination(newService);
						}
						// notify replacement entry of the existence of this
						// call
						actCall.setDestinationLink();
					}
				}
			}
		}
	}

	// /** *
	// */
	// public void printInterface(){
	// System.out.println("Processor interface");
	// procInterface.print();
	// System.out.println("Service interface");
	// serviceInterface.print();
	// System.out.println("Request interface");
	// requestInterface.print();
	// }

	/**
	 * Determines if a particular entry name is part of either the service or
	 * request interface. Used by parser.
	 * 
	 * @param name
	 *            name of entry to be tested
	 * @return <code>true</code> if entry is part of the interface, otherwise
	 *         it is not.
	 */
	private boolean isInterfaceEntryPartOfModel(String name) {
		return (serviceInterface.isUsed(name) || requestInterface.isUsed(name));
	}

	/**
	 * Sets an indication that an service or request interface entry, as
	 * indicated by the passed argument, has been added to the model. If either
	 * interface does not contain the entry, nothing happens.
	 * 
	 * @param name
	 *            name of entry
	 */
	private void setInterfaceEntryAsPartOfModel(String name) {
		serviceInterface.setToUsed(name);
		requestInterface.setToUsed(name);
	}

	/**
	 * Add new entry to module. If the module already contains an entry by the
	 * same name, the original entry is returned, otherwise a new entry is
	 * returned.
	 * 
	 * @param name
	 *            entry name
	 * @return the entry object.
	 */
	public Entry addEntry(String name) {
		if (getEntries().containsKey(name)) {
			if (isInterfaceEntryPartOfModel(name)) {
				return null;
			} else {
				Entry entry = (Entry) getEntries().get(name);
				setInterfaceEntryAsPartOfModel(name);
				return entry;
			}
		} else {
			Entry entry = new Entry(name);
			getEntries().put(entry.getName(), entry);
			return entry;
		}
	}

	/**
	 * Converts the module object to LQNS input file format text representation.
	 * Sub-modules are installed before calling super.toString().
	 * 
	 * @return the LQNS input file format of the module
	 */
	public String toString() {
		// make deep copy -> not implemented
		try {
			this.installComponents();
			this.removeReplacedProcessors();
			this.removeReplacedHarnessEntries();
			this.removeReplacedTasks();
			return super.toString();
		} catch (InstallException e) {
			System.out.println(e.toString());
			return new String();
		}
	}

	/**
	 * List of interface items and their status. The status of an item concerns
	 * whether an object representing the item has been added to module and
	 * whether the item has been bound to an external item.
	 * 
	 * @author Real-time and Distributed Systems Group
	 * @author Department of Systems and Computer Engineering
	 * @author Carleton University
	 * @author
	 *         <li>D. McMullan
	 */
	class InterfaceList implements Serializable {
		/**
		 * Collection of interface items and their status.
		 * <p>
		 * Key: the name interface item, Value: interfaceItem object
		 * <p>
		 * 
		 * @see InterfaceItemInfo
		 */
		HashMap list;

		/**
		 * Inner class constructor.
		 * 
		 */
		InterfaceList() {
			list = new HashMap();
		}

		/**
		 * Gets the collection of items in this interface list.
		 * 
		 * @return items in this interface list
		 * @see #list
		 */
		public HashMap getList() {
			return list;
		}

		/**
		 * Adds an item to this interfaceList.
		 * 
		 * @param name
		 * @return <code>true</code> if item added to list, <code>false</code>
		 *         if item already in the list.
		 */
		public boolean add(String name) {
			String newId = new String(name);
			return (list.put(newId, new InterfaceItemInfo()) == null);
		}

		/**
		 * Gets the number of items in the list.
		 * 
		 * @return number of items in list
		 */
		public int size() {
			return list.size();
		}

		/**
		 * Gets the status of particular item
		 * 
		 * @param name
		 *            item name
		 * @return the status of item. If item is not in list, <code>null</code>
		 *         is returned.
		 */
		public InterfaceItemInfo get(String name) {
			return (InterfaceItemInfo) list.get(name);
		}

		/**
		 * Determines if the list contains an item
		 * 
		 * @param name
		 *            item name
		 * @return <code>true</code> if list contains the status of an item,
		 *         otherwise <code>false</code>.
		 */
		public boolean contains(String name) {
			return list.containsKey(name);
		}

		/**
		 * Determines if named item has been added to module.
		 * 
		 * @param name
		 *            name of the item
		 * @return <code>true</code> if item added, otherwise item not added
		 */
		public boolean isUsed(String name) {
			if (this.contains(name))
				return this.get(name).isUsed();
			else
				return false;
		}

		/**
		 * Sets the named item's "used" field to true.
		 */
		public void setToUsed(String name) {
			if (this.contains(name)) {
				this.get(name).use();
			}
		}

		/**
		 * Determines that item has been bound to something external to this
		 * module.
		 * 
		 * @param name
		 *            name of the item
		 * @return <code>true</code> if item bound, otherwise item not bound.
		 */
		public boolean isBound(String name) {
			if (this.contains(name))
				return this.get(name).isBound();
			else
				return false;
		}

		/**
		 * Sets the item's "bound" field to true.
		 */
		public void setToBound(String name) {
			if (this.contains(name)) {
				this.get(name).bind();
			}
		}

		// /** */
		// public void print(){
		// for(Iterator i = (list.keySet()).iterator(); i.hasNext();){
		// String name = (String)i.next();
		// InterfaceItemInfo info = (InterfaceItemInfo)list.get(name);
		// System.out.println(name+"(used: "+info.isUsed()+", bound:
		// "+info.isBound()+")");
		// }
		// }

	}

	/**
	 * Status of an interface item. An item has a used and a bound status. If
	 * used, an object representing the item has been added to the module. If
	 * bound, the item has been bound to an outside item.
	 * 
	 * @author Real-time and Distributed Systems Group
	 * @author Department of Systems and Computer Engineering
	 * @author Carleton University
	 * @author
	 *         <li>D. McMullan
	 */
	class InterfaceItemInfo implements Serializable {

		/**
		 * Indicates whether the interface item has been inserted into module.
		 * <p>
		 * <code>true</code>: item added, <code>false</code> item not
		 * added.
		 */
		protected boolean used; // indicates whether item has been added to
								// model at least once

		/**
		 * Indicates whether the interface item has been bound to an external
		 * item.
		 * <p>
		 * <code>true</code> item bound, <code>false</code> item not bound
		 */
		protected boolean bound; // indicates whether item has been bound to
									// outside item

		/**
		 * Inner class constructor.
		 */
		InterfaceItemInfo() {
			used = false;
			bound = false;
		}

		/**
		 * Determines if item has been added to module.
		 * 
		 * @return <code>true</code> if item added, otherwise item not added
		 */
		public boolean isUsed() {
			return used;
		}

		/**
		 * Sets used to true.
		 */
		public void use() {
			used = true;
		}

		/**
		 * Determines if item has been bound to something external to this
		 * module.
		 * 
		 * @return <code>true</code> if item bound, otherwise item not bound.
		 */
		public boolean isBound() {
			return bound;
		}

		/**
		 * Sets bound to true.
		 */
		public void bind() {
			bound = true;
		}

	}

}
