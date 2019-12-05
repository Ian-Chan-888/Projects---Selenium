package Selenium_Training;



public class S20_Lesson157_Understanding_POM_xml_file_and_its_dependencies {
	/*157_Understanding_POM_xml_file_and_its_dependencies
	 *
	 *  What is Maven: 
	 *  1. Maven is a software project managment and build management tool for Java Frameworks. (see Lesson 153)
	 *  2. Install Maven: (see Lesson 154)
	 *  3. Set System variables to recognize Maven (see Lesson 154)
	 *  4. Understanding Maven Terminologies (see Lesson 155)
 	 *  5. Creating Maven Project (see Lesson 155)
	 *  6. Integrate Maven with Eclipse (see Lesson 155)
	 *  7. Understading POM.xml file dependencies. 
			    The heart of Maven Projects is the POM.xml file. This is created automatically as part of the Maven project generatation. 
			   		Contains: 
			   			groupID
			   			artifactID
			   			dependancy
			   
			     FROM THS POINT THE PARACTICAL EXAMPLES WILL BE LOCATED IN A PROJECT CALLED "S20_Maven"
			     	- its local location is : O:\Projects - Selenium\src\Selenium_Training\Maven\Sample_Maven_Project\S20_Maven
			     		to Change location see ref: https://howtodoinjava.com/maven/change-local-repository-location/
			     	- This assumes you have installed Maven, created a Maven Project and imported it into Selenium.
			     
			     
	    	   a. Creating your first Maven Project : 
	   			  mvn archetype:generate -DgroupId=Maven_Training -DartifactId=S20_Maven -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
	   
			   b. In the new Project 'S20_Maven' and in the Package 'Maven_Training', create 4 new Java class files : 
				   	AppiumTest.java
				   	AppTest.java
				    RESTAPITest.java
				    SeleniumTest.java
				    
	    8. How to find the dpendencies of the Software?
			   c. We are using the following Maven repository for now but this may be different as new versions appear but for reference we will use : 
			   For Selenium Java dependancies files : 
			   https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59
			   - copy the Maven <dependenccy> snipet: 
			      <dependency>
				    <groupId>org.seleniumhq.selenium</groupId>
				    <artifactId>selenium-java</artifactId>
				    <version>3.141.59</version>
				  </dependency>
		
			   d. Paste snipt into the pom.xml within the <dependencies>...</dependencies> section. This will define where the dependant libraries need to be referenced from.
			   
			   e. Repeat steps 2 - 4  for TestNG; Rest assured (for api); and appium. This should allow for the current test cases we have defined with the 20_Maven Project.
			   
			   f. for reference see the Local POM file within this project (O:\Projects - Selenium\src\Selenium_Training\Maven\Sample_Maven_Project\S20_Maven\pom.xml)
			   
			   g. Lets run all the test cases within the 20_Maven Project
	 *  
	 *  
	 *  
	 *  9. Maven Phases for Test Automation
	 *  
	 *  10 Clean, compile, test
	 *  
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
	

	
		
	}


