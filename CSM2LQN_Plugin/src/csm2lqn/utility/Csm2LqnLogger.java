package csm2lqn.utility;

import java.util.logging.Logger;

public class Csm2LqnLogger {

	private static Csm2LqnLogger instance;
	private Logger logger = Logger.getLogger("InfoLogging");
	
	private Csm2LqnLogger(){
//		logger.info("Logging an INFO-level message");
	}
	
	public static synchronized Logger getLogger(){
		if (instance == null){
			instance = new Csm2LqnLogger(); 
		}
		
		return instance.logger; 
	}
	
//	public void log(String msg, boolean enabled){
//		if (enabled){
//			System.out.println(msg);
//			logger.info(msg); 
//		}
//	}
}
