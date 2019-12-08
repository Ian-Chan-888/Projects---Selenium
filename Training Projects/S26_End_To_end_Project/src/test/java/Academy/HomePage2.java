package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage2 extends base {//call the initailzeDriver method from the base.java class by using the 'extends' notation.
	
	Logger log = LogManager.getLogger(HomePage2.class.getName());
	
	@BeforeTest //lesson 201
	public void initialization() throws IOException
	{
		driver=initializeDriver();//setting the Browser type i.e chrome,firefox..etc
		log.info("Driver is iniialized"); //injecting a log "INFO" message at this point 		
	}
	
	@AfterTest //lesson 201
	public void teardown()
	{
		driver.close();
		log.info("Login Credentials testing complete");
		log.info("Successufully Closed the Browser for 'HomePage'");
		driver=null;// this is in place to save resources and avoid memory increases. 
	}
	
	
	@Test (dataProvider="getData")// getting data from the public Object[][]..
	public void basePageNavigation(String Username,String Password, String text) throws IOException
	{
		
		
		//driver.get(prop.getProperty("url"));// not hard coding url here. instead get url from data.properties file listed in 'base'
		driver.get(prop.getProperty("url"));
		log.info(text + " Navigated to Home Page");
		
		LandingPage l=new LandingPage(driver);//creating object to that class and invoke methods of it. 
		l.getLoginPage();//enters the login page
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username); //data[0][0].. then data[1][0]
		lp.getPassword().sendKeys(Password); //data[0][1].. then data[1][1]
		System.out.println(text); //data[0][2].. then data[1][2]
		log.info(text);
		lp.getLoginBtn().click();
		
	
	}
	

	
	
	@DataProvider  //Lession 198
	public Object[][] getData()
	{
		// Row stands for how man different data types should run
		// column stands for how many values for each test
		Object[][] data=new Object[2][3];
		//0th row
		data[0][0] = prop.getProperty("goodUser");//row 0, column 0
		data[0][1] = prop.getProperty("goodPass");//row 0, column 1
		data[0][2] = "Testing Non-Restricted user"; //row 0, column 2
		//1st row
		data[1][0] = prop.getProperty("badUser");//row 1, column 0
		data[1][1] = prop.getProperty("badPass");//row 1, column 1
		data[1][2] = "Testing Restricted user";//row 1, column 2	
		
		return data;
		

	}
	
	@Test
	public void printUsersInfo()
	{
		System.out.println("Good User = " + prop.getProperty("goodUser"));
		System.out.println("Good Password = " + prop.getProperty("goodPass"));
		
		System.out.println("Bad User = " + prop.getProperty("badUser"));
		System.out.println("Bad Password = " + prop.getProperty("badPass"));
	}

	
}
