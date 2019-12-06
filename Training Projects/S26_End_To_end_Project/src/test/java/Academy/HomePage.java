package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resoucres.base;

public class HomePage extends base {//call the initailzeDriver method from the base.java class by using the 'extends' notation.
	
	
	
	@Test (dataProvider="getData")// getting data from the public Object[][]..
	public void basePageNavigation(String Username,String Password, String text) throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage l=new LandingPage(driver);//creating object to that class and invoke methods of it. 
		l.getLoginPage();//enters the login page
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username); //data[0][0].. then data[1][0]
		lp.getPassword().sendKeys(Password); //data[0][1].. then data[1][1]
		System.out.println(text); //data[0][2].. then data[1][2]
		lp.getLoginBtn().click();
	
	}
	
	
	@DataProvider  //Lession 198
	public Object[][] getData()
	{
		// Row stands for how man different data types should run
		// column stands for how many values for each test
		Object[][] data=new Object[2][3];
		//0th row
		data[0][0] = "nonrestricteduser@qa.com";//row 0, column 0
		data[0][1] = "123456";//row 0, column 1
		data[0][2] = "restricteduser"; //row 0, column 2
		//1st row
		data[1][0] = "restricteduser@qa.com";//row 1, column 0
		data[1][1] = "456789";//row 1, column 1
		data[1][2] = "Non restricted user";//row 1, column 2	
		
		return data;
		

	}
	
}
