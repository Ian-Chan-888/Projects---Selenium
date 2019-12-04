package Selenium_Training;

public class S24_Lesson178_Importance_of_log4j_xml_file {
	/*
	 * 
	 * Defining a configuration file :
	 * what is the configuration file for?
	 * 
	 * REF: http://logging.apache.org/log4j/2.x/manual/configuration.html
	 * 
	 *  - the configuration file is a xml file that defines the format of that logging. 
	 *   	-in it, it 
	 *   		- relays a pattern layout eg: "<PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>"
	 *   		- Types of errors to output and where to output this data.
	 *   
	 *   - The default configurations log4j uses are as follows: 
	 *   
	 *   

					    <?xml version="1.0" encoding="UTF-8"?>
					    <Configuration status="WARN">
					      <Appenders>
					        <Console name="Console" target="SYSTEM_OUT">
					          <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
					        </Console>
					      </Appenders>
					      <Loggers>
					        <Root level="error">
					          <AppenderRef ref="Console"/>
					        </Root>
					      </Loggers>
					    </Configuration>
	 *   
	 *   
	 *   - We can customize the logger configurations to suit our needs such as
	 *   	1. Location to output: found in the <Appenders> tag
	 *          
	 *   		eg: output into the console and its pattern. 
	 *   				[...]
	 *   			<Appenders>
					        <Console name="Console" target="SYSTEM_OUT">
					        <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
					        </Console>
					</Appenders>
					    [...]
	 *   
	 *   	2. What to log and How to log can be found in the <Loggers>..</Loggers> tag
	 *   		
	 *   		eg: Only log errors type to the Console
	 *   
					      <Loggers>
					        <Root level="error">
					          <AppenderRef ref="Console"/>
					        </Root>
					      </Loggers>
	 *  
	 *  	other option for what to log are : 
	 *  			<Root level="trace">  - gives all the logs
	 *  			<Root level="error">  - gives all the "error" type logs
	 *  
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








