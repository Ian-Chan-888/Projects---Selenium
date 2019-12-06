package Academy;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resoucres.base;

public class ValidateTitle extends base {//call the initailzeDriver method from the base.java class by using the 'extends' notation.
	
	@BeforeTest //lesson 201
	public void initialization() throws IOException
	{
		driver=initializeDriver();//setting the Browser type i.e chrome,firfox..etc
	}
	
	@AfterTest //lesson 201
	public void teardown()
	{
		driver.close();
	}
	
	
	//Lesson 200
	@Test // This test should validate the title and Confirm if the proper title "FEATURED COURSES" is displayed 
	public void titleValidation() throws IOException
	{
		driver.get(prop.getProperty("url"));// not hard coding url here. instead get url from data.properties file listed in 'base'
		LandingPage l=new LandingPage(driver);//creating object to that class and invoke methods of it. 
		//compare the text from the browser with actual text. by using the Assert.
		
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		driver.close();
	
	}
	

	
}
