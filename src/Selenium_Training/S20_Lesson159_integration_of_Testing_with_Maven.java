package Selenium_Training;



public class S20_Lesson159_integration_of_Testing_with_Maven {
	/*
	 *
	 *  What is Maven: 
	 *  1. Maven is a software project managment and build management tool for Java Frameworks. (see Lesson 153)
	 *  2. Install Maven: (see Lesson 154)
	 *  3. Set System variables to recognize Maven (see Lesson 154)
	 *  4. Understanding Maven Terminologies (see Lesson 155)
 	 *  5. Creating Maven Project (see Lesson 155)
	 *  6. Integrate Maven with Eclipse (see Lesson 155)
	 *  7. Understading POM.xml file dependencies. 
	 *  8. How to find the dpendencies of the Software?
	 *  9. Maven Phases for Test Automation
	 *  10. Clean, compile, test (lesson 159)
	 *  11. Importance of Maven Surefire plugin.
	 *  	- until now we have exectured all tst cases from the Test folder by using 'mvn test'
	 *  	- How do we control a customized run thru Maven? 
	 *  	- While remembering that through TestNG we have a way of doing this thru an xml. we can now leverage this thru Maven as well. 
	 *   - create a xml file for the project. (see the file already created 'Lesson159_testing.xml'
	 *   
	 *   
	 *   12. Running Tests with Surefireplugin and 13. Integrating Testng into Maven	
	 *   Exectue the xml thru Maven: 
	 *   	(for syntax reference see 'Using Suite XML Files': https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html)

	 *   
	 *   From the POM xml you can add the 'Lesson159_testing.xml' reference within the 'maven-surefire-plugin' area: 
	 *   
	 *   eg: 
	 *   
	 *   <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
			  <modelVersion>4.0.0</modelVersion>
			  <groupId>Maven_Training</groupId>
			  <artifactId>S20_Maven</artifactId>
			  <packaging>jar</packaging>
			  <version>1.0-SNAPSHOT</version>
			  <name>S20_Maven</name>
			  <url>http://maven.apache.org</url>
			  
			  <build>
			    <pluginManagement>
			      <plugins>
			      
			        <plugin>
			          <groupId>org.apache.maven.plugins</groupId>
			          <artifactId>maven-surefire-plugin</artifactId>
			          <version>3.0.0-M4</version>
			          
	 *                  <configuration>
	 *			          <suiteXmlFiles>
	 *			            <suiteXmlFile>Lesson159_testng.xml</suiteXmlFile>
	 *			          </suiteXmlFiles>
	 *			        </configuration>
			          
			          
			        </plugin>
			        		        	        
			        
			        [...]

	 *  
	 *  after that you can now run: 
	 *  'nvm test' 
	 *  
	 *  NOTE if you get an error simular to : "org.apache.maven.surefire.booter.SurefireBooterForkException: 
	 *  										There was an error in the forked processsun.security.provider.certpath.SunCertPathBuilderException: 
	 *  										unable to find valid certification path to requested target"
	 *  
	 *  then see this for ref: https://stackoverflow.com/questions/57836499/maven-testng-with-surefire-plugin-unable-to-find-valid-certification-path-to-re
	 *  remove from the testng.xml '<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">'
	 * 	  
	 * 
	 * Running a Single Test

		During development, you may run a single test class repeatedly. To run this through Maven, set the test property to a specific test case.

    	'mvn -Dtest=AppiumTest test'
	 * 
	 * 
	 *
	 *
	 * 
	 */



	// Note: There is nothing here to run. 
	

	
		
	}


