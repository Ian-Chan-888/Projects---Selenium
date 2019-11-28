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
	 * - Download the jenkins.war file +
	 * 	- navigate to the folder where the jenkins.war is located.
	 *  - run it by 'java -jar jenkins.war' in its working directory.
	 *   - alternatively you can define where what port to use  'java -jar jenkins.war -httpPort=8080'
	 *  
	 * 3. Configuring Global Settings in jenkins (Lesson 162)
	 *  - access jenkins via url localhost:8080
	 *   - you will be prompted to give credenials for the first time.
	 *  -Click on 'Manage Jenkins'
	 *  	- then 'Global Tool Configuration' this will help to define/configure tools, their locations and automatic installers.
	 *  	- go to 'jdk instalations' locations and point it to the jdk location on your system.
	 *  		- i.e: Name = jkd1.8.0_xxx, JAVA_HOME = C:\Program Files\Java\jdk1.8.0_xxx
	 *  	
	 *  	- go to 'Maven instalations'
	 *  	- add maven locations 
	 *  		- i.e Name = apache-maven-3-x.x, MAVEN_HOME = C:\work\apache-maven-3.x.x-bin\apache-maven-3.x.x
	 *  - Click on 'Save'
	 *  
	 * 4. Understanding Jenkins Workspace. (Lesson 164)
	 * 	- Jenkins actions runs in the form of 'jobs'
	 *  
	 * 5. Configuring Jenkins job parameters
	 *  - In this example we will configure all projects to run off a git repository. https://github.com/Ian-Chan-888/Maven_Instructor_Jenkins
	 *  a. Click on "New Item"
	 *  b. Specify an item name
	 *  c. Choose "Freestyle project" and press "ok"
	 *  d. Navigate down to the "Source Code Management" section and click on the "Git" radio button
	 *  e. enter the Repository URL eg: https://github.com/Ian-Chan-888/Maven_Instructor_Jenkins
	 *  f. Navigate down to the "Build" section and click on 'Add build step" dropdown then choose "Invoke top-level Maven targets"
	 *  g. Click on "Maven Version" and choose the selection of 'apache-maven-3.x.x' (this shoud be automatically available if you correctly set your 
	 *  	MAVEN_HOME Environment Variables prperly (see Lesson 154)
	 *  h. Click on the "Goals" field and type in 'test -PRegression' 
	 *  i. click on the "Save"
	 *  j. Click on the "Build Now" and notice an entry in the "Build History" section. click on the New build History item (in this case it is labled #1)
	 *	k. Click on the "Console Output" and notice the the test run ran successfully 
	 *  eg output: 
	 *  [...]
	 *  [INFO] Compiling 3 source files to C:\Users\ION64-2017\.jenkins\workspace\Canada\target\test-classes
		[INFO] 
		[INFO] --- maven-surefire-plugin:2.20.1:test (default-test) @ Mavenjava ---
		[INFO] 
		[INFO] -------------------------------------------------------
		[INFO]  T E S T S
		[INFO] -------------------------------------------------------
		[INFO] Running TestSuite
		BrowserAUtomation
		elementsUi
		deleteTwitter
		postJira
		IOSApps
		NativeAPpAndroid
		[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.46 s - in TestSuite
		[INFO] 
		[INFO] Results:
		[INFO] 
		[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
		[INFO] 
		[INFO] ------------------------------------------------------------------------
		[INFO] BUILD SUCCESS
		[INFO] ------------------------------------------------------------------------
		[INFO] Total time:  3.850 s
		[INFO] Finished at: 2019-11-26T18:42:06-07:00
		[INFO] ------------------------------------------------------------------------
		Finished: SUCCESS
	 *  
	 * 6. Post build action plugins
	 * 7. TestNG Jenkins plugin to generate Reports
	 * 8. Scheduling Jenkins builds.
	 * 
	 */



	// Note: There is nothing here to run. 
	

	
		
	}


