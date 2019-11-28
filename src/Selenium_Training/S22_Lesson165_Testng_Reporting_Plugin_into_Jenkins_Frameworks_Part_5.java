package Selenium_Training;



public class S22_Lesson165_Testng_Reporting_Plugin_into_Jenkins_Frameworks_Part_5 {
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
	 * 3. Configuring Global Settings in jenkins (Lesson 162)
	 * 4. Understanding Jenkins Workspace. (Lesson 164)
	 * 5. Configuring Jenkins job parameters(Lesson 164)
	 * 6. Post build action plugins
	 *  - your HTML report can be accessed in Eclipse / Project name / target/index.html
	 *  - as well you have other files listed in xml as testng-results.xml
	 *  - you can integrate these reports into your Jenkins Job. 
	 *  
	 * 7. TestNG Jenkins plugin to generate Reports
	 *   - Jenkins / Manage Plugins/ (search for TestNG Results Plugin) 
	 *   - download and install 
	 *   - in the Jenkins job - click on the configure
	 *   - Navigate down to the "Post-build Actions" section
	 *   	- Add post-build action and choose "Publish TestNG results"
	 *   	- confirm '/testng-results.xml' and Save
	 *   - for the build that you ran you will see the "TestNG Results' link and resluts at the bottom. 
	 *   - Evenlutally a graph of the result should appear for the job. 
	 *   
	 * 8. Scheduling Jenkins builds.
	 *  in the "Build Triggers" you can set a schedule. 
	 *  - Set 'Build Periodically': 
	 *  	MINUTE	Minutes within the hour (0–59)
			HOUR	The hour of the day (0–23)
			DOM	The day of the month (1–31)
			MONTH	The month (1–12)
			DOW	The day of the week (0–7) where 0 and 7 are Sunday.
			
			M H D M DAYWeek
			* 7 * * *     - this will run daily at 7am
			 
			* = every value
	 *  	
	 */



	// Note: There is nothing here to run. 
	

	
		
	}


