package Selenium_Training;



public class S20_Lesson155_Understanding_Terminologies_of_Maven {
	/*
	 *
	 *  What is Maven: 
	 *  1. Maven is a software project managment and build management tool for Java Frameworks. (see Lesson 153)
	 *  2. Install Maven: (see Lesson 154)
	 *  3. Set System variables to recognize Maven (see Lesson 154)
	 *  4. Understanding Maven Terminologies
	 *  
	 *  	- Artifact: syntaxed as 'artifactId' it is typically a JAR file that gets deploy to a Maven repository
	 *  
	 *  	- groupId: groupid will identify your project uniquely across all projects
	 *  
	 *  			eg: <groupId>org.seleniumhq.selenium</groupId> 
	 *  
	 *  				https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59
	 *  
					   <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
						<dependency>
						    <groupId>org.seleniumhq.selenium</groupId>
						    <artifactId>selenium-java</artifactId>
						    <version>3.141.59</version>
						</dependency>
	 *  
	 * 		- archetype:generate: Generates a new project from an archetype
	 * 
	 *  5. Creating Maven Project
	 *  
	 *  	from the command prompt, navigate to a project directory of your choice: 
	 *  
	 *  	"mvn archetype:generate -DgroupId=Maven_Training -DartifactId=S20_Maven -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false"
	 *  
	 *  		-DgroupId=	Maven_Training 	    // This is your unique Maven project name. In Selenium this is equal to Package Name
	 *  		-DartifactID=	S20_Maven		// This is the Jar file name that you choose for your Maven Project. In Selenium this is equal to Project Name
	 *  		-DarchetypeArtifactid=	maven-archetype-quickstart // This is the template style/folder structure you wish to use. This a common template\structure to use.
	 *  		-DinteractiveMode=false //project is created in batch mode. The batch-mode will automatically use default values instead of asking you via prompt for those values.
	 *  
	 * 
	 *  6. Integrate Maven with Eclipse
	 *  	- In the command prompt at the directory level of your project eg: O:\Projects - Selenium\src\Selenium_Training\Maven\Sample_Maven_Project\S20_Maven
	 *  	- type "mvn eclipse:eclipse"
	 * 		- two extra files are created:
	 * 			.classpath
	 * 			.project
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */



	// Note: There is nothing here to run. 
	

	
		
	}


