package Academy;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resoucres.base;

public class validateNavigationBar extends base {//call the initailzeDriver method from the base.java class by using the 'extends' notation.
	
	
	@BeforeTest //lesson 201
	public void initialization() throws IOException
	{
		driver=initializeDriver();//setting the Browser type i.e chrome,firfox..etc
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

	
	//Lesson 200
	@Test // This test should confirm if the Navigation bar is displayed
	public void NavigationBarValidate() throws IOException
	{
		//driver.get(prop.getProperty("url"));// not hard coding url here. instead get url from data.properties file listed in 'base'
		driver.get(prop.getProperty("url"));
		
		LandingPage l=new LandingPage(driver);//creating object to that class and invoke methods of it. 
		
		// check to see if the Navigation bar is displayed.
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		System.out.println(l.getNavigationBar().getText());
		driver.close();
	
	}
	


	
}
