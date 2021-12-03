package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import log4j.Log4j_Demo;

public class Log4j_Demo {
	
	private static Logger logger = LogManager.getLogger(Log4j_Demo.class);

	public static void main(String[] args) {
		

System.out.println("\n  Hello world ..!     \n");	

logger.info("This is information message");
logger.error("This is error message");
logger.warn("This is warn message");
logger.fatal("This is fatal message");


System.out.println("Completed");





	}

}
