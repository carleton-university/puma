package lqnXML;

/**
 * <p>Title: SubModel</p>
 * <p>Description: This is representation of a SubModel.  Submodels are called as Slots when they are
 *   part of any Model</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author Vino Shanmugarajah
 * @version 1.0
 */
import lqnModel.*;
import java.util.*;

public class SubModel {
	private String subModelName;

	private SubModelInterface subInter;

	private HashMap parameters;

	private Model model;

	// This the generic constructor
	public SubModel(String name, Model inMod) {
		subModelName = name;
		subInter = new SubModelInterface();
		parameters = new HashMap();
		model = inMod;
	}

	/**
	 * 
	 * @return String
	 */
	public String getName() {
		return subModelName;
	}

	/**
	 * 
	 * @return Model
	 */
	public Model getSubModel() {
		return model;
	}

	/**
	 * 
	 * @return HashMap
	 */
	public HashMap getParameters() {
		return parameters;
	}

	/**
	 * 
	 * @return SubModelInterface
	 */
	public SubModelInterface getSubInterface() {
		return subInter;
	}

	/**
	 * 
	 * @param subInt
	 *            SubModelInterface
	 */
	public void setSubModInteface(SubModelInterface subInt) {
		subInter = subInt;
	}

	/**
	 * 
	 * @param inModel
	 *            Model
	 */
	public void setModel(Model inModel) {
		model = inModel;
	}

	/**
	 * 
	 * @param inName
	 *            String
	 */
	public void setName(String inName) {
		subModelName = inName;
	}

	/**
	 * 
	 * @param inParas
	 *            HashMap
	 */
	public void setParmeters(HashMap inParas) {
		parameters = inParas;
	}

}
