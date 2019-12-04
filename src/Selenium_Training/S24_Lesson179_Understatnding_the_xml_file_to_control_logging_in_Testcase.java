package Selenium_Training;

public class S24_Lesson179_Understatnding_the_xml_file_to_control_logging_in_Testcase {
	/*
	 * 
	 *  Lets create our own configurations file: 
	 *  
	 *  1. Under the Project, create a Folder named 'resources' at the project level. Right click Project name / Folder.
	 *  2. In the resources folder, create a New 'other' xml file and name it 'log4j2.xml'
	 *  3. lets start off with a simple xml structure below and then start modifying it: 

				    <?xml version="1.0" encoding="UTF-8"?>
				    <Configuration status="WARN">
				      <Appenders>
				        <Console name="Console" target="SYSTEM_OUT">
				          <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
				        </Console>
				      </Appenders>
				      <Loggers>
				      
				        <Root level="trace">
				          <AppenderRef ref="Console"/>
				        </Root>
				      </Loggers>
				    </Configuration>

	 *  4. Now set the Build Path of the resources folder for your project. 
	 *  	- right click your project 'Log4jTutorial' ; click on Build Path--> Configure Build Path..
	 *  	- click on the 'Source' tab. 
	 *  	- click on 'Add Folder...'
	 *  	- select 'resources' folder checkbox and press OK
	 *  	- select apply
	 *  -if done correctly you should see the "Log4jTutorial/resources" entry in the 'Source' tab.
	 *  
	 *  5. Now if you run the Demo.java from the 'alpha' package you should get all the log messages 
	 *  		i.e : 
					17:14:00.471 [main] DEBUG alpha.Demo - I am debugging
					17:14:00.473 [main] INFO  alpha.Demo - Object is present
					17:14:00.473 [main] ERROR alpha.Demo - Object is not present
					17:14:00.473 [main] FATAL alpha.Demo - this is fatal
	 * 
	 * 	*************************************************************************************************
	 * 
	 *  Lets create a new java class in the 'beta' package and call it Demo1
	 *  paste in the following :
	 *  
						package beta;
						
						import org.apache.logging.log4j.*;
						
						public class Demo1 {
						
							private static Logger log = LogManager.getLogger(Demo1.class.getName()); //import org.apache.logging.log4j.*;
							
							public static void main(String[] args) {
								// TODO Auto-generated method stub
						
									log.debug("I am debugging");
								
									log.info("Object is present");
						
									log.error("Object is not present");
									
									log.fatal("this is fatal");
						
							}
						
						}
	 *
	 * Scenario: 
	 * What if I only want the Error type messages from alpha/Demo.java but all the log messages from beta/Demo1.java?
	 * 
	 * Well if we go back to the xml we can focus on the entry: 
	 * 			
	 * 			<Root level=...>
	 *  - here the 'Root' says to abide by all the packages within the Project.
	 *  	- but if re redifine the entry: 
	 *  from: 
				      <Loggers>
				      
				        <Root level="trace">
				          <AppenderRef ref="Console"/>
				        </Root>
				      </Loggers>
				    </Configuration>
	 *  To: 
	 *
				      <Loggers>
				      	<Logger name = "alpha.Demo" level="error" additivity="false">
				      	  <AppenderRef ref="Console/>
				        </Logger>
				      
				        <Root level="trace">
				          <AppenderRef ref="Console"/>
				        </Root>
				      </Loggers>
				    </Configuration>  
	 * 		
	 *  We can then say we only want the 'error' level logs for alpha.Demo. Then the Rest of the packages will be abide by the 'trace' level.
	 *  
	 *  additivity="false" -----> what does this mean? 
	 *  	- basically this will prevent duplication of messages from Ancesstor logs. for reference see : https://examples.javacodegeeks.com/enterprise-java/log4j/log4j-additivity-property-example/
	 *  
	 *  
	 *  
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


	*/
	}








