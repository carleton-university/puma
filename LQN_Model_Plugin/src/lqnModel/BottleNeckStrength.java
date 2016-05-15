package lqnModel;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */
import java.util.*;

public class BottleNeckStrength implements Cloneable {

	private double BNSValue;

	private String status;

	private String clasification;

	private String BNType;

	private HashMap callOutTasknameAndUtil;

	public static double SOFT_THRESHOLD = 2.0;

	/* */
	public static String UNKNOWN = "UNKNOWN";

	public static double DEFAULT_BNS_VALUE = 0.0;

	/* Static Variables for Bottleneck Status */
	public static String VALID_STAT = "VALID";

	public static String NOT_ENOUGH_PARAM_STAT = "NOT ENOUGH INFOR";

	public static String CORRUPTED_SAT = "CORRUPTED";

	/* Static Variables for clasification */
	public static String PROCESSOR_SUPPORTED_CLASI = "PROCESSOR SUPPORTED";

	public static String TASK_SUPPORTED_CLASI = "TASK SUPPORTED";

	/* Static for BNType */
	public static String STRONG_TYPE = "STRONG";

	public static String WEAK_TYPE = "WEAK";

	public static String NONE_TYPE = "NONE";

	public BottleNeckStrength() {
		BNSValue = DEFAULT_BNS_VALUE;
		status = UNKNOWN;
		clasification = UNKNOWN;
		BNType = UNKNOWN;
		callOutTasknameAndUtil = new HashMap(5);
	}

	public void setBNSValue(double inBNSValue) {
		BNSValue = inBNSValue;
	}

	public double getBNSValue() {
		return BNSValue;
	}

	public void setStatus(String inStatus) {
		status = inStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setClasification(String inClasif) {
		clasification = inClasif;
	}

	public String getClasification() {
		return clasification;
	}

	public void setBNType(String inType) {
		BNType = inType;
	}

	public String getBNType() {
		return BNType;
	}

	public HashMap getCallOutTaNameUtil() {
		return callOutTasknameAndUtil;
	}

	public String[] getCallOutTaskNames() {
		String[] taskNames = null;
		// Task Names are the Keys of the HashMap.
		// So, get the keys and cast them into Strings.
		Object[] objArray = callOutTasknameAndUtil.keySet().toArray();
		if (objArray != null) {
			taskNames = new String[objArray.length];
			for (int i = 0; i < objArray.length; i++) {
				String st = (String) objArray[i];
				taskNames[i] = new String(st);
			}
		}
		return taskNames;
	}

	/** ********Added by Jing Xu, Aug 25, 2005********** */
	public Object clone() {
		BottleNeckStrength bns = new BottleNeckStrength();
		bns.BNSValue = this.BNSValue;
		bns.BNType = this.BNType;
		bns.clasification = this.clasification;
		bns.status = this.status;
		bns.callOutTasknameAndUtil = (HashMap) this.callOutTasknameAndUtil
				.clone();
		return bns;

	}

}
