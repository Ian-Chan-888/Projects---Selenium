package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resoucres.base;

public class HomePage extends base {//call the initailzeDriver method from the base.java class by using the 'extends' notation.

	@Test
	public void basePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		
		//creating object to that class and invoke methods of it. 
		//LandingPage l=new LandingPage();
		//l.getLogin().click();
	}
	
	@Test
	public void login() throws IOException
	{
		LandingPage l=new LandingPage(driver);//creating object to that class and invoke methods of it. 
		l.getLogin();
	}
	
}
