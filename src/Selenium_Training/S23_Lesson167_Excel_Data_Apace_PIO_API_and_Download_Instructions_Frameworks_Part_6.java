package Selenium_Training;



public class S23_Lesson167_Excel_Data_Apace_PIO_API_and_Download_Instructions_Frameworks_Part_6 {
	/*
	 * In this section we will be focusing on Data Driven Testing using Excel.
	 * 
	 * Apache POI API: - this is the api that enables the connection from your excel files to your java libraries. 
	 * 
	 * Data driven testing from Excel. 
	 * 
	 * Maven Dependencies setup:
	 * -poi-ooxml and poi
	 * 
	 * Strategy to access excel Data: 
	 * 1. create a Maven Project 
	 * 	- File/New/Maven Project/
	 * 	- check "Create a simple project(skip archetype selection), then click Next
	 * 	- Group id: Framework 
	 *  - Artifact id: ExcelDriven
	 *  - click on Finish
	 *  
	 *  2. Go to Google and search for 'poi ooxml' dependencies, this should take you to : https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml
	 *   - select the newest version and copy the xml snipt: 
	 *   	eg: 
	 *   			<dependency>
					    <groupId>org.apache.poi</groupId>
					    <artifactId>poi-ooxml</artifactId>
					    <version>4.1.1</version>
					</dependency>

	 *  - Paste this into the pom.xml of your Maven project. NOTE: dont forget to frame your snipts with <dependencies> ...</dependencies>
	 *  		eg: 
					<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
					  <modelVersion>4.0.0</modelVersion>
					  <groupId>Framework</groupId>
					  <artifactId>ExcelDriven</artifactId>
					  <version>0.0.1-SNAPSHOT</version>

						<dependencies>
						 
							<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
							<dependency>
							    <groupId>org.apache.poi</groupId>
							    <artifactId>poi-ooxml</artifactId>
							    <version>4.1.1</version>
							</dependency>
						
						
						</dependencies>
					
					[...]
  
	 *  	
	 *  3. Within the same https://mvnrepository.com/ location search for 'POI'
	 *  	- choose/click on the newest 'Apache POI'
	 *   	- copy : the <deendency> entry
	 *   	eg: 
				<dependency>
				    <groupId>org.apache.poi</groupId>
				    <artifactId>poi</artifactId>
				    <version>4.1.1</version>
				</dependency>
	 *
	 *  	- Paste this into your pom.xml below your 'poi ooxml' from above.
	 *  
	 *  eg: 
					<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
					  <modelVersion>4.0.0</modelVersion>
					  <groupId>Framework</groupId>
					  <artifactId>ExcelDriven</artifactId>
					  <version>0.0.1-SNAPSHOT</version>
					 
						<dependencies>
						 
							<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
							<dependency>
							    <groupId>org.apache.poi</groupId>
							    <artifactId>poi-ooxml</artifactId>
							    <version>4.1.1</version>
							</dependency>
							
							
							<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
							<dependency>
							    <groupId>org.apache.poi</groupId>
							    <artifactId>poi</artifactId>
							    <version>4.1.1</version>
							</dependency>
						
						</dependencies>
					
					[...]
  
	 *  
	 *  
	 *  4. Create a Excel document and fill in some data columms: 
	 *  	Testcases				Data1				Data2				Data3
	 *  	 Login					1aaa..				2aaa..				
	 *  	 Purchase				1bbb..				2bbb..
	 *  	 Add Profile			1ccc..				2ccc..
	 *  	 Delete profile			1ddd..				3ddd..
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 */



	// Note: There is nothing here to run. 
	

	
		
	}


