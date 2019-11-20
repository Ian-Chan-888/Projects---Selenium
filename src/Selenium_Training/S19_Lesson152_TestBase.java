package Selenium_Training;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class S19_Lesson152_TestBase {
	/*
	/*
	 *  For this Practice we will be using the following Java classes so that we can use the "extends" to support a concept of Inheritance. 
	 *   - S19_Lesson152_TestBase
	 *   - S19_Lesson152_Inheritance
	 *   
	 *   
	 *   using the "extends" notation we can bring in information / meathods from other classes. Ie: 
	 *   
	 *   public class <classname> extends <classname>
	 * 
	 *  
	 * 
	 * 
	 *   
	 *   
	 *  
	 * 
	 * 
	 */
	


	
	
	// lets set Webdriver to null so that we have a common starting area and so that we are defining this variable globally.
	public WebDriver driver =null; 
	
		

	
	@Test
	public void Login() throws IOException {
		
		//define the Properties class: import java.util.Properties;
		Properties prop=new Properties();

		//define FileInputStream, will help point where the globalVariable file is : import java.io.FileInputStream;
		  //you need to find out where the file location is as well for 'new FileImputStream' you need to "Add argument to match 'FileImputStream(File)' 
		FileInputStream fis =new FileInputStream("O:\\Projects - Selenium\\src\\Selenium_Training\\S19_globalVariable.properties");
		prop.load(fis);
		
		//now lets define and load the browser to use that is specified fro the S19_globalVariable.properties file.
				if (prop.getProperty("browser").equals("firefox"))
				{
					System.setProperty("webdriver.gecko.driver", prop.getProperty("Firefox_driver_location"));  
					driver = new FirefoxDriver();
				}
				else if (prop.getProperty("browser").equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", prop.getProperty("Chrome_driver_location")); 
					driver = new ChromeDriver();
				}
				else
				{
					System.setProperty("webdriver.ie.driver", prop.getProperty("InternetExplorer_driver_location"));  
					driver = new InternetExplorerDriver();
				}
				
		
		driver.get(prop.getProperty("url"));
		System.out.println(prop.getProperty("url"));
		System.out.println("Your Test Browser is = " + prop.getProperty("browser"));
		System.out.println(prop.getProperty("Firefox_driver_location"));
		System.out.println(prop.getProperty("Chrome_driver_location"));
		System.out.println(prop.getProperty("InternetExplorer_driver_location"));
	}
	
	
	
	
	
	
	
		
	}


