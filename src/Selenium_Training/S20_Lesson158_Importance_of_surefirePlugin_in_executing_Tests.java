package Selenium_Training;



public class S20_Lesson158_Importance_of_surefirePlugin_in_executing_Tests {
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
	 *  10. Clean, compile, test
	 *  
	 *    Clean:
	 *    'mvm clean' 	- cleans project and deletes any previous references in the build
	 *    				- use this if you see any build errors.
	 *    				- use this command within the project directory while in cmd.
	 *    
	 *    eg: 
	 *    O:\Projects - Selenium\src\Selenium_Training\Maven\Sample_Maven_Project\S20_Maven>mvn clean
			[INFO] Scanning for projects...
			[INFO]
			[INFO] ----------------------< Maven_Training:S20_Maven >----------------------
			[INFO] Building S20_Maven 1.0-SNAPSHOT
			[INFO] --------------------------------[ jar ]---------------------------------
			[INFO]
			[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ S20_Maven ---
			Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0/plexus-utils-3.0.jar
			Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0/plexus-utils-3.0.jar (226 kB at 270 kB/s)
			[INFO] Deleting O:\Projects - Selenium\src\Selenium_Training\Maven\Sample_Maven_Project\S20_Maven\target
			[INFO] ------------------------------------------------------------------------
			[INFO] BUILD SUCCESS
			[INFO] ------------------------------------------------------------------------
			[INFO] Total time:  1.932 s
			[INFO] Finished at: 2019-11-22T12:25:15-07:00
			[INFO] ------------------------------------------------------------------------
			
			Compile:
			'mvn compile'	- helps to determine if there are any syntax errors within your Java code.
							-
							
			eg: 
			O:\Projects - Selenium\src\Selenium_Training\Maven\Sample_Maven_Project\S20_Maven>mvn compile
			[INFO] Scanning for projects...
			[INFO]
			[INFO] ----------------------< Maven_Training:S20_Maven >----------------------
			[INFO] Building S20_Maven 1.0-SNAPSHOT
			[INFO] --------------------------------[ jar ]---------------------------------
			Downloading from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-java/3.141.59/selenium-java-3.141.59.pom
			Downloaded from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-java/3.141.59/selenium-java-3.141.59.pom (5.4 kB at 12 kB/s)
			Downloading from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-api/3.141.59/selenium-api-3.141.59.pom
			Downloaded from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-api/3.141.59/selenium-api-3.141.59.pom (2.6 kB at 31 kB/s)
			Downloading from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-chrome-driver/3.141.59/selenium-chrome-driver-3.141.59.pom
			.
			.
			.
			[INFO]
			[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ S20_Maven ---
			[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
			[INFO] skip non existing resourceDirectory O:\Projects - Selenium\src\Selenium_Training\Maven\Sample_Maven_Project\S20_Maven\src\main\resources
			[INFO]
			[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ S20_Maven ---
			[INFO] Changes detected - recompiling the module!
			[WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. build is platform dependent!
			[INFO] Compiling 1 source file to O:\Projects - Selenium\src\Selenium_Training\Maven\Sample_Maven_Project\S20_Maven\target\classes
			[INFO] ------------------------------------------------------------------------
			[INFO] BUILD SUCCESS
			[INFO] ------------------------------------------------------------------------
			[INFO] Total time:  19.436 s
			[INFO] Finished at: 2019-11-22T12:30:00-07:00
			[INFO] ------------------------------------------------------------------------		

			TEST:
			'mvn test'	- ***IMPORTANT , ENSURE YOU HAVE THE WORD 'Test' at the end of your java file .. i.e : SeleniumTest.java***
						- mvn test also runs tests based on the TestNG annotations. eg '@Test' 
						
						- Not only does it start your testes, it automatically runs clean and complie when this is used.
						- reads all your dependancies in your POM file. 
							-checks to see if repository is pre-existing befre downloading the repository.
						
						
			eg: 
			
			.
			.
			.
			Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-testng-utils/3.0.0-M4/surefire-testng-utils-3.0.0-M4.jar (14 kB at 99 kB/s)
			Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.0.0-M4/common-java5-3.0.0-M4.jar (33 kB at 146 kB/s)
			Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-grouper/3.0.0-M4/surefire-grouper-3.0.0-M4.jar (40 kB at 172 kB/s)
			[INFO]
			[INFO] -------------------------------------------------------
			[INFO]  T E S T S
			[INFO] -------------------------------------------------------
			[INFO] Running TestSuite
			IOSApps
			NatriveAppAndroid
			deleteTwitter
			postJira
			BrowserAUtomation
			elementsUi
			[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.849 s - in TestSuite
			[INFO]
			[INFO] Results:
			[INFO]
			[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
			[INFO]
			[INFO] ------------------------------------------------------------------------
			[INFO] BUILD SUCCESS
			[INFO] ------------------------------------------------------------------------
			[INFO] Total time:  13.097 s
			[INFO] Finished at: 2019-11-22T12:42:55-07:00
			[INFO] ------------------------------------------------------------------------
			
	 *  
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


