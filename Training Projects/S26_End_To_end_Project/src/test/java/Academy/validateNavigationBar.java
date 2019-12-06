package Academy;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resoucres.base;

public class validateNavigationBar extends base {//call the initailzeDriver method from the base.java class by using the 'extends' notation.
	
	
	//Lesson 200
	@Test // This test should confirm if the Navigation bar is displayed
	public void basePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage l=new LandingPage(driver);//creating object to that class and invoke methods of it. 
		
		// check to see if the Navigation bar is displayed.
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		System.out.println(l.getNavigationBar().getText());
	
	}
	
	

	
}
