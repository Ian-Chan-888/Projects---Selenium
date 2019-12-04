package Selenium_Training;

public class S24_Lesson180_Testcase_logging_with_log4j_example_1 {
	/*
	 * 
	 *  Log4j can be integrated in any Java based testing frameworks (Selenium, Appium, Rest API)
	 *  
	 *  In this lesson we will look at logging into a file. 
	 *  
	 * To do this we edit the log4j.xml 
	 *  - This is added in the <Appenders> section. 
	 *  - we utilize the <RollingFile> and <PatternLayout> and <SizedBasedTrigger> tags to do this. 
	 *	- The <RollingFile> defines the name of the File and filepattern(name of the file when a roller event happens)
	 *	- <PatternLayout> defines the pattern of the log file in terms of, timestamp and log level
	 *  - <SizedBasedTrigger> defines the size of the file before it is rolls over to a new file
	 *  
	 *  eg: 
	 *  
				[...]
				<Appenders>
				      <RollingFile name="File" fileName="${basePath}/prints.log" filePattern="${basePath}/prints-%d{yyyy-MM-dd}.log">
				     <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
				      <SizeBasedTriggeringPolicy size="500" />
				          </RollingFile>
				    <Console name="Console" target="SYSTEM_OUT">
				      <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
				    </Console>
				  </Appenders>
				  [...]
	 *  
	 *  In this lesson we will: 
	 *  1. Create a Folder contain our logs 
	 *  	- from the your project folder create a new Folder and name it logs
	 *  	
	 *  2. Create a 'prints.log' file 
	 *  	- from the logs folder create a 'other'/General/File file and name it 'prints.log'
	 *  
	 *  3. Edit the log4j.xml file so that it points to the logs package/prints.log.
	 *    ${basePath} = the path starting at the Project level. Any text afterwards with help to define the exact location. 
	 *     - we do this so we can avoid having to hardcode the file paths within our code.
	 *    Therefore for our example: 
	 *    
	 *     <Property name="basePath">./logs</Property>
	 *     
	 *     - We will add this line but define it with the <Properties> tag. The location of this entry will be before the <Appenders> section. 
	 *     - we will then ensure that the fileName will include the name of the log file in the form of "${basePath}/prints.log"...
	 *     - we now change the Appender references to "File" from "Console" : 
	 *     			FROM: <AppenderRef ref="Console"/>     TO: <AppenderRef ref="File"/>
	 *     
	 *   
	 *     
	 *     i.e: 
	 *     
	 *     
	 *     		[...]
				<Properties>
					<Property name="basePath">./logs</Property>
				</Properties>
				
				<Appenders>
				      <RollingFile name="File" fileName="${basePath}/prints.log" filePattern="${basePath}/prints-%d{yyyy-MM-dd}.log">
				     <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
				      <SizeBasedTriggeringPolicy size="500" />
				          </RollingFile>
				 				 
			    <Console name="Console" target="SYSTEM_OUT">
			      <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
			    </Console>
			  </Appenders>
			  <Loggers>
			 	<Logger name = "alpha.Demo" level="error" additivity="false">
				 <AppenderRef ref="File"/>
				</Logger>
							      
			    <Root level="trace">
			      <AppenderRef ref="File"/>
			    </Root>
			  </Loggers>
			</Configuration>				 
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








