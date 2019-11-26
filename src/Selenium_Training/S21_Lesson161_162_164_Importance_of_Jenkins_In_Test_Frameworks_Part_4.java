package Selenium_Training;



public class S21_Lesson161_162_164_Importance_of_Jenkins_In_Test_Frameworks_Part_4 {
	/*
	 * 1. What is Jenkins: 
	 * - It is a continous integration tool
	 * - Helps to Automate daily builds
	 * - allows for off hours build and testing. (overnight build and test)
	 * 
	 * 2. Jenkins Installation (Lesson 162)
	 * -https://jenkins.io/download/
	 * -typically this would not be installed locally on your system rather on a server somewhere. 
	 * - Download the Jenkins.war file 
	 *  -run it by 'java -jar jenkins.war' in its working directory.
	 *   - alternatively you can define where what port to use  'java -jar jenkins.war -httpPort=8080'
	 *  
	 * 3. Configuring Global Settings in jenkins (Lesson 162)
	 *  - access jenkins via url localhost:8080
	 *   - you will be prompted to give credenials for the first time.
	 *  -Click on 'Manage Jenkins'
	 *  	- then 'Global Tool Configuration' this will help to define/configure tools, their locations and automatic installers.
	 *  	- go to 'jdk instalations' locations and point it to the jdk location on your system.
	 *  		- i.e: Name = jkd1.8.0_xxx, JAVA_HOME = C:\Program Files\Java\jdk1.8.0_xxx
	 *  	- Add JDK
	 *  	- go to 'Maven instalations'
	 *  	- add maven locations 
	 *  		- i.e Name = apache-maven-3-x.x, MAVEN_HOME = C:\work\apache-maven-3.x.x-bin\apache-maven-3.x.x
	 *  	- 'Add Maven'
	 *  
	 * 4. Understanding Jenkins Workspace. (Lesson 164)
	 * 	- Jenkins actions runs in the form of 'jobs'
	 *  
	 * 5. Configuring Jenkins job parameters
	 *  - In this example we will configure all projects to run off a git repository. 
	 *  
	 * 6. Post build action plugins
	 * 7. TestNG Jenkins plugin to generate Reports
	 * 8. Scheduling Jenkins builds.
	 * 
	 */



	// Note: There is nothing here to run. 
	

	
		
	}


