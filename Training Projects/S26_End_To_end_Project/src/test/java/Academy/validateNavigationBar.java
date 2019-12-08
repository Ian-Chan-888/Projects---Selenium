package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

public class validateNavigationBar extends base {//call the initailzeDriver method from the base.java class by using the 'extends' notation.
	
	// import org.apache.logging.log4j.Logger; AND  import org.apache.logging.log4j.LogManager;
	Logger log = LogManager.getLogger(validateNavigationBar.class.getName());
	
	@BeforeTest //lesson 201
	public void initialization() throws IOException
	{
		driver=initializeDriver();//setting the Browser type i.e chrome,firefox..etc
		log.info("Driver is iniialized"); //injecting a log "INFO" message at this point 
	
		
		//driver.get(prop.getProperty("url"));// not hard coding url here. instead get url from data.properties file listed in 'base'
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		log.info("Validating Navigation Bar testing complete");
		log.info("Successufully Closed the Browser for 'validateNavigationBar'");
	}

	
	//Lesson 200
	@Test // This test should confirm if the Navigation bar is displayed
	public void NavigationBarValidate() throws IOException
	{

		LandingPage l=new LandingPage(driver);//creating object to that class and invoke methods of it. 
		
		// check to see if the Navigation bar is displayed.
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Confirmed Navigation Bar is displayed");
		System.out.println(l.getNavigationBar().getText());
		log.info("Successufully printed out the contents of the Navigation Bar");
	
	}
	


	
}
