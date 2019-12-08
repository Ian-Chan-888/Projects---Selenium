package Selenium_Training;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
	 *    I. 
	 *    
	 *    
	 *    
	 *  
	 */



	// Note: There is nothing here to run. 
	
	

	 
	}


