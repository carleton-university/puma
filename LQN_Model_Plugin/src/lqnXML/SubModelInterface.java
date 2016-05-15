package lqnXML;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */
import java.util.HashMap;

public class SubModelInterface extends SlotInterface {
	HashMap repProcessors;

	public SubModelInterface() {
		super();
		repProcessors = new HashMap();

	}

	public boolean addProcessor(String proName) {
		if (repProcessors.containsKey(proName))
			return false;
		repProcessors.put(proName, proName);
		return true;
	}

	public HashMap getRepProcessors() {
		return repProcessors;
	}

	public void setRepProcessors(HashMap repPros) {
		repProcessors = repPros;
	}
}
