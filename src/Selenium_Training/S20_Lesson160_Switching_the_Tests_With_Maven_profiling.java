package Selenium_Training;



public class S20_Lesson160_Switching_the_Tests_With_Maven_profiling {
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
	 *	12.	Running Tests with Surefireplugin
	 *	13. Integrating Testng into Maven	
	 * 
	 * - Now lets say we have muliptle Testng xml files that we want to switch back and forth with. If we did that we would need to edit the pom.xml file several times 
	 *   throughout the testing cycle. 
	 *   
	 *  - by using the concepts of <profiles> we can then determine specific Testng.xml files within Maven pom.xml
	 *  	location: wrap your pofile around the  <build> of the pom
	 *  
	 *  eg: For the pom.xml below we define "Lesson159_testing.xml" to be a regression type xml. 
	 *  	AND
	 *  	testing.xml to be the smoke type xml.
	 *  
	 *  
	 *  
	 <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>Maven_Training</groupId>
  <artifactId>S20_Maven</artifactId>
  <packaging>jar</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>S20_Maven</name>
  <url>http://maven.apache.org</url>
  
<profiles>
  <profile>
  <id>Regression</id>
  
  <build>
    <pluginManagement>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.20.1</version>
           <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>Lesson159_testng.xml</suiteXmlFile>
          </suiteXmlFiles>
        </configuration>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
  </profile>
  <profile>
  
   <id>Smoke</id>
  
  <build>
    <pluginManagement>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.20.1</version>
           <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>testng.xml</suiteXmlFile>
          </suiteXmlFiles>
        </configuration>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
  
  </profile>
  </profiles>
  
  <dependencies>
  
	 <dependency>
		   <groupId>org.seleniumhq.selenium</groupId>
		   <artifactId>selenium-java</artifactId>
		   <version>3.141.59</version>
	 </dependency>
  
    <dependency>
	      <groupId>junit</groupId>
	      <artifactId>junit</artifactId>
	      <version>3.8.1</version>
	      <scope>test</scope>  
    </dependency>
    
    <dependency>
	      <groupId>org.testng</groupId>
	      <artifactId>testng</artifactId>
	      <version>6.14.3</version>
	      <scope>test</scope>
    </dependency>
    
	<dependency>
	    <groupId>io.rest-assured</groupId>
	    <artifactId>rest-assured</artifactId>
	    <version>4.1.2</version>
	    <scope>test</scope>
	</dependency>
	
	
	<dependency>
	    <groupId>io.appium</groupId>
	    <artifactId>java-client</artifactId>
	    <version>7.3.0</version>
	</dependency>
    
    
    
  </dependencies>
</project>

	 * 
	 * RUNNING FROM COMMAND Prompt :
	 * 
	 * mvn test -P Regression   //this will run the regression tests on the xml labled as Regression. (testng.xml)
	 * 
	 * mvn test -P Smoke   //this will run the smoke tests on the xml labled as Smoke. (Lesson159_testing.xml)
	 * 
	 * 
	 */



	// Note: There is nothing here to run. 
	

	
		
	}


