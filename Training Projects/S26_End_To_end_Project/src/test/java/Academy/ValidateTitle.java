package Academy;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resoucres.base;

public class ValidateTitle extends base {//call the initailzeDriver method from the base.java class by using the 'extends' notation.
	
	
	//Lesson 200
	@Test // This test should validate the title and Confirm if the proper title "FEATURED COURSES" is displayed 
	public void basePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage l=new LandingPage(driver);//creating object to that class and invoke methods of it. 
		//compare the text from the browser with actual text. by using the Assert.
		
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");

	
	}
	
	

	
}
