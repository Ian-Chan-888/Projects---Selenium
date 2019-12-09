package Selenium_Training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;

public class S26_Lesson195_To_Framework_building_from_scratch {
	/*
	 *     
	 * 1 Create a MAVEN PROJECT via command line
	 *  - syntax : 
	 *  mvn archetype:generate -DgroupId={} -DartifactId={} -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode-false
	 *  
	 *   A. from the command prompt, navigate to the target directory (assumes you have maven installed, see S20_Lesson154..)
	 *   	type:  mvn archetype:generate -DgroupId=Academy -DartifactId=S26_End_To_end_Project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
	 *    Note: this will create its own folder with the artifactId you specified.
	 *   
	 *   B. Connect this project directly to Eclipse: 
	 *   	Move to the project folder in command line 
	 *     type: mvn eclipse:eclipse
	 *   
	 *   C. Make the Project show up into Eclipse. 
	 *   	- From Eclipse go to File/import
	 *   	- Select Maven/Existing Maven Projects
	 *   	- Point to the project folder 
	 *   		- You should now ve able to view the new Maven project inside eclipse.
	 *             
	 *    D. Configure Framework dependencies in POM.xml
	 *    	- Go to https://mvnrepository.com/
	 *    	- The following repositorys to use(use latest): 
	 *    		- Selenium Java
	 *    		- Testng
	 *    		
	 *    E. Set up Page Object Model and build your Main and Test areas (see S26_End_To_end_Project)
	 *    	
	 * Main Sources (src/main/java)   
	 *    - Create a a package called resources 
	 *    		- Create Base.java class withing the src/main/java/resources  
     *    			- create a method called initializeDriver "public void initializeDriver"
     *    				- enter in the code that helps set the driver. 
     *    
     *    	- Create pageObjects a package in src/main/java/resources
     *    		- Create LandingPage.java	
     *    			- create a ojbect method : public WebElement getLogin() 
     *    			- create a ojbect method : public WebElement getTitle()
     *    			- create a ojbect method : public WebElement getNavigationBar()
     *    		- Create LoginPage.java 
     *    			- create the following methods:
     *    				public WebElement getEmail()
     *    				public WebElement getPassword()
     *    				public WebElement getLoginBtn()  
     *    			
	 * Tests sources (src/test/java) 		
	 *    	- Create HomePage.java Class within the src/test/java/Academy package
	 *    		-create a method : public void basePageNavigation(String Username,String Password, String text)
	 *    			-This will open the browwser based on what is set in the data.properties file and go to http://www.qaclickacademy.com/.
	 *    		-create public Object [][] getData(). Add notation @DataProvider
	 *    			-This will create a data set to be used. The idea behind this test is to use 2 data sets with one test.   
	 *    		-create a method : public void login() throws IOException
	 *    			- this will click on the Login link
	 *    		-create a method : public void enterCredentialsToLogin()
	 *    			- this will pass in the credentials and click on the login button.
	 *    
	 *    	-Create validateNavigationBar.java Class 
	 *    		-create method, public void NavigationBarValidate()
	 *    			- use Assert.assertTrue(l.getNavigationBar().isDisplayed())
	 *    
	 *    	-Create ValidateTitle.java Class
	 *    		-create method, titleValidation()
	 *    			- use Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
	 *    
	 *    
	 *    
	 *    F. Create a Textng xml file to run multiple tests [Lesson 201]
	 *    		- Cretate a xml file , right click on Project / Testng/convert to Test Ng
	 *    		- see /S26_End_To_end_Project/Lesson201_testng.xml
	 *    		- You can run the xml file as a Testng.xml and this will run all the tests listed inside the xm.
	 *    		- notice that the browser is not closing so what we can do is utilize the @beforeTest and @afterTest annotations. 
	 *    
	 *    			- create a @BeforeTest with public void initilazation()
	 *    				- we can then move the "driver=initializeDriver();" to this new method.
	 *    			- at the end of the class create a @AfterTest public voic teardown()
	 *    			
	 *    G. Integrate Testng to Maven(POM.xml) [Lesson 203]
	 *    		- Ensure you have maven installed - see S20 Lesson 154 to do this.
	 *    		- REF: https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html
	 *    		- you will need to add the surefire-plugin <plugin> into your POM.xml
	 *    			- by doing this it will then trigger the testng.xml file. 
	 *    			- The entrt to use is : 
	 *    				- TestNG suite XML files. Remember to frame it within the <build> tag
								  <build>
								      <plugins>
								        
								          <plugin>
								            <groupId>org.apache.maven.plugins</groupId>
								            <artifactId>maven-surefire-plugin</artifactId>
								            <version>3.0.0-M4</version>
								            <configuration>
								              <suiteXmlFiles>
								                <suiteXmlFile>Lesson201_testng.xml</suiteXmlFile>
								              </suiteXmlFiles>
								            </configuration>
								          </plugin>
								        
								    </plugins>
								  </build>    			
	 *    		When triggering the Maven command you will then trigger the testng.xml 
	 *    			i.e :  Open command prompt , navigate to the project directory. 
	 *    				type: mvn complie 
	 *    					  mvn test
	 *    
	 *    H. Integrating Log4J [Lesson 204]
	 *    		- adding logs (see S24 Lesson 175) for installation.
	 *    		- Add Log4j Maven dependencies into the POM.xml file. 
	 *    			REF: https://logging.apache.org/log4j/2.x/maven-artifacts.html
	 *    			type to use: "Using Log4j in your Apache Maven build"

					eg:
					    <dependencies>
					      <dependency>
					        <groupId>org.apache.logging.log4j</groupId>
					        <artifactId>log4j-api</artifactId>
					        <version>2.12.1</version>
					      </dependency>
					      <dependency>
					        <groupId>org.apache.logging.log4j</groupId>
					        <artifactId>log4j-core</artifactId>
					        <version>2.12.1</version>
					      </dependency>
					    </dependencies> 
	 *    
	 *    			- This will automatically download the jars into your project. 
	 *    
	 *    
	 *    		- insert your Log4j.xml file into your resources folder of your project. 
	 *    			eg: see S26_End_To_end_Project
	 *    		- Define the recources location by adding a "filtering recources plugin" into your POM.xml
	 *    		eg: 
				[...]
				  <build>
				  
					  <resources>
					  	<resource>
					  		<directory>src/main/resources</directory>
					        <filtering>true</filtering>
					  	</resource>	  
					  </resources>

	 *    			The reason for this is because it will define the location of the log4j.xml file
	 *    		
	 *    		- for your test java class, below your 'public class <testname>...' enter 
	 *    		
	 *    "Logger log = LogManager.getLogger(<name of test/class>.class.getName());"
	 *		// import org.apache.logging.log4j.Logger; AND  import org.apache.logging.log4j.LogManager;
	 *    
	 *    
	 *    		- Now you can enter in Log information messages at key points in your testing code. 
	 *    			eg: for the @Before Test areas
	 *    
							@BeforeTest 
							public void initialization() throws IOException
							{
								driver=initializeDriver();//setting the Browser type i.e chrome,firfox..etc
								log.info("Driver is iniialized");
								
								
								//driver.get(prop.getProperty("url"));// not hard coding url here. instead get url from data.properties file listed in 'base'
								driver.get(prop.getProperty("url"));
							}
	 *    		- When the tests are now run it will create a folder called 'logs' and a file called prints-yyyy-mm-dd.log which will contain the logs you just defined. 
	 *    
	 *    I. Fixing the Framework issues by tweaking Lesson201_testng.xml [Lesson 205]
	 *    	-noticed that when running the first browser that was opened did not close until all the rest of the tests were completed. 
	 *    		- all the tests listed in the .xml file is wrapped as one test i.e name = "All Tests" wraps around all the tests. 
	 *    			and thus the first test is still considered open till the rest of the tests are complete. 
	 *    		- to fix this we can wrap each test in its own test name. 
	 *    		
	 *    	Before we see: 
				  <test thread-count="5" name="All Tests">
				    <classes>
				      <class name="Academy.validateNavigationBar"/>
				      <class name="Academy.ValidateTitle"/>
				      <class name="Academy.HomePage2"/>
				    </classes>
				    
	 *    	After we can set: 
				  <test thread-count="5" name="Test1">
				    <classes>
				      <class name="Academy.validateNavigationBar"/>
				    </classes>
				  </test> <!-- Test -->
				  
				    <test thread-count="5" name="Test2">
				    <classes>
				      <class name="Academy.ValidateTitle"/>
				    </classes>
				  </test> <!-- Test -->
				  
				    <test thread-count="5" name="Test3">
				    <classes>
				      <class name="Academy.HomePage2"/>
				    </classes>
				  </test> <!-- Test -->
				  
	 *     J. Screenshots on failure - TestNG Listeners [Lesson 206]
	 *     	- Our aim here is to create a screen shot an any failures. 
	 *     	in your base.java create an new method: 
	 *     	public void getScreenshot() 
	 *     -with the help of testng listeners you can trigger a specific method such as the 'getScreenshot'
	 *     	- create a class called listeners in your src/test/java
	 *     		public class listeners implements ITestListener
	 *     	- add 'base b = new base(); // import resources.base;
	 *     	- Edit the 'public void onTestFailure(ITestResult result)'
	 *     		-add : b.getScreenshot();  // note you may want o surround this with 'try catch' when you mouse over it. 
	 *     
	 *     - edit the Lesson201_testing.xml and add: 
				
				[...]
				<suite name="Suite">
				
					<listeners><!-- Lesson 206 defining where the listeners class is -->
						<listener class-name="Academy.listeners" /> 
					</listeners>   
				
				[...]
	 *    
	 *    	- to ensure we customize the screenshot.png file name so we dont accidently overwrite the file on subsequent failures. 
	 *    		we want to make sure at : 	public void onTestFailure(ITestResult) 
	 *    		we have a 'result' added i.e : 	'public void onTestFailure(ITestResult result)'
	 *    		and then add 'result.getName()' into our b.getScreenshot();
	 *    		eg: 
	 *    				b.getScreenshot(result.getName());
	 *    	- Then we have to add 'String result' to the getScreenshot method in our base.java to complete the definition.
	 *    		eg: 
	 *    			public void getScreenshot(String result) throws IOException
	 *    	- Then we can append 'result' the name of the class to the screen shot file name
	 *    		eg: 
	 *    			FileUtils.copyFile(src, new File("C://Users//ION64-2017//Desktop//screen shots//"+result+"screenshot.png")); 
	 *    
	 *    K. HTML reports on Test Execution [Lesson 207]
	 *    	1. Proper reporting is important on test runs to utilize this we can use 'extent reports'
	 *    		REF: https://extentreports.com/
	 *      2. To use we and to import the Maven dependencies : Ref: http://extentreports.com/docs/versions/3/java/#maven
	 *       
				<dependency>
				    <groupId>com.aventstack</groupId>
				    <artifactId>extentreports</artifactId>
				    <version>3.1.5</version>
				</dependency>
	 *      
	 *      3. also add the following dependency:
	       		<dependency>
					<groupId>com.relevantcodes</groupId>
					<artifactId>extentreports</artifactId>
					<version>2.41.2</version>
				</dependency>
	 *      
	 *      4. install the ExtentReporterNG.java into your resources folder. included in this lesson (from Lesson 209 Code Download)
	 *      
	 *      5. edit your testng.xml to define the location of ExtentReporterNG. This will be of type 'listeners'
	 *      
	 *      	eg: <listener class-name="resources.ExtentReporterNG" /> 
	 *      6. once a test has run you can access the reports in the form of "ExtentReportsTestNG.html"
	 *       location: target/surefire-reports/'ExtentReportsTestNG.html'
	 *
	 *     L. Integratring Project to Jenkins CI tool [Lesson 208]
	 *      		for review Ref: S21_Lesson161_162_164_Importance_of_Jenkins_In_Test_Frameworks_Part_4
	 *       1. Start your Jenkins server 'jenkins.war'
	 *            java -jar jenkins.war -httpPort=8080
	 *            - open browswer and navigate to localhost:8080 'http://localhost:8080/'
	 *       2. Start a new item
	 *       3. Enter name  'S26_End_To_end_Project'
	 *       4. select Freestyle project'
	 *       5. This will be a local project so we will not use Git. 
	 *          Click on the 'Advanced...' button
	 *       6. Check box the 'Use custom workspace' and a Directory field should appear. 
	 *       7. type in the directory location to your project
	 *          	O:\Projects - Selenium\Training Projects\S26_End_To_end_Project
	 *       8. In the Build section click on 'Add build step' and then click on 'Invoke top-level Maven targets'
	 *       9. Choose the Maven version drop down and ensure a version exisits and is selected. 
	 *       10. in the goals section type 'test'
	 *       11. Click on the 'Save' button' 
	 *       12. you can run by selecting the Build Now. 
	 *            
	 *      
	 *  
	 */



	// Note: There is nothing here to run. 
	
	

	 
	}


