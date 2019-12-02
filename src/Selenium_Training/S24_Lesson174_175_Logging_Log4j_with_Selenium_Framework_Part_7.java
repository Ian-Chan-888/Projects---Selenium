package Selenium_Training;

public class S24_Lesson174_175_Logging_Log4j_with_Selenium_Framework_Part_7 {
	/*
	 * In this section we will look into Logging. 
	 * 
	 * What is Log4j? 
	 * -is a reliable, fast and felxible logging Framework(API's) wirtten in Java, which is distributed under the Apache Software License. 
	 * - can be integrated within the Selenium ecosystem.
	 * 
	 * Why Log4j?
	 * - Logs can give an idea of what happed during a test run. 
	 * 
	 * Logging Concepts: 
	 * 1. Sending the entire Logs of a file
	 * 
	 * 2. Scenario: We want to send only failures to a log file. 
	 *   - eg: differentiate Package A 30 tests failure vs Package B 50 tests failures 
	 *    or
	 *   - Log the entire messages for Package B
	 *   
	 * 3. I want logs with Timestamps
	 * 
	 * 4. I want the log file of last week. 
	 * 
	 * 5. How will I know if there is an error by just looking at logs. 
	 *   
	 * Lesson 145:
	 * Installation
	 * 1. Search for 'apache log4j" i.e :https://logging.apache.org/log4j/2.0/download.html  = newest one so far.
	 * 2. Download the latest file for your Platform. (i.e for windows apache-log4j-2.12.1-bin.zip)
	 * 3. Unzip the jars  into a known folder.
	 * 4. Create a New Project / Java Project / name=Log4jTutorial
	 * 5. import the newly downloaded jars into this project. (right click ->Properties/Libraries[Tab]/Add External Jars[Button])
	 *    - You only need 2 files :
	 *    		1. log4j-api-X.XX.X.jar
	 *    		2. log4j-core-X.XX.X.jar
	 * 
	 * Use: 
	 * 1. create 2 new 'Packages' under the 'src' folder
	 * 		- alpha
	 * 		- beta
	 * 
	 * 2. Create a Class Called Demo for alpha
	 *   - for further changes see Project Log4jTurtorial/alpha/Demo
	 *   
	 *  
	 *  
	 *  
	 */



	// Note: There is nothing here to run. 
	
	/*

	 
	package alpha;

	import org.apache.logging.log4j.*;

	public class Demo {

		private static Logger log = LogManager.getLogger(Demo.class.getName()); //import org.apache.logging.log4j.*;
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			log.debug("I am debugging");
			
			if(5>4)
			{
				log.info("Object is present");

				log.error("Object is not present");
				
				log.fatal("this is fatal");
			}
		}

	}








	*/