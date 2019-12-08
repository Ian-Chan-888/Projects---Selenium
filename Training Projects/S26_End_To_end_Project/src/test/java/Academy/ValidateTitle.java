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

public class ValidateTitle extends base {//call the initailzeDriver method from the base.java class by using the 'extends' notation.
	
	Logger log = LogManager.getLogger(ValidateTitle.class.getName());
	
	@BeforeTest //lesson 201
	public void initialization() throws IOException
	{
		driver=initializeDriver();//setting the Browser type i.e chrome,firefox..etc
		log.info("Driver is iniialized"); //injecting a log "INFO" message at this point 
	
		
		//driver.get(prop.getProperty("url"));// not hard coding url here. instead get url from data.properties file listed in 'base'
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
		
	}
	
	@AfterTest //lesson 201
	public void teardown()
	{
		driver.close();
		log.info("ValidateTitle testing complete");
		log.info("Successufully Closed the Browser for 'ValidateTitle'");
		driver=null;// this is in place to save resources and avoid memory increases. 
	}
	
	
	//Lesson 200
	@Test // This test should validate the title and Confirm if the proper title "FEATURED COURSES" is displayed 
	public void titleValidation() throws IOException
	{
		driver.get(prop.getProperty("url"));// not hard coding url here. instead get url from data.properties file listed in 'base'
		LandingPage l=new LandingPage(driver);//creating object to that class and invoke methods of it. 
		//compare the text from the browser with actual text. by using the Assert.
		
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Confirmed 'FEATURED COURSES'");
	
	}
	

	
}
