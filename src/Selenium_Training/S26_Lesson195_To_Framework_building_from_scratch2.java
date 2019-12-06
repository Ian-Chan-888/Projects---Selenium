package Selenium_Training;



public class S26_Lesson195_To_Framework_building_from_scratch2 {
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
	 *    E. Set up Page Object Model 
	 *    	- Create a a package called resources 
	 *    		- Create Base.java class withing the src/main/java/resources  
     *    			- create a method called initializeDriver "public void initializeDriver"
     *    				- enter in the code that helps set the driver. (see S26_End_To_end_Project)
     *    	- Create pageObjects a package in src/main/java/resources
     *    		- Create LandingPage
     *    			- create a 'click on login link' within the page. 
	 *    		
	 *    	- Create HomePage.java Class within the src/test/java/Academy package
	 *    		-create a method : public void basePageNavigation()
	 *    			-This will open the browwser based on what is set in the data.properties file and go to http://www.qaclickacademy.com/. 
	 *    		-create a method : public void login() throws IOException
	 *    			- this will click on the Login link
	 *    
	 *    F.
	 *    
	 *    
	 *    
	 *  
	 */



	// Note: There is nothing here to run. 
	
	

	 
	}


