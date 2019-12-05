package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class base {

	
	public void initializeDriver() throws IOException
	{
		
		//here we want a method to set the driver based on the browser type. We want to pass a browser name into this method and in turn it will set up the proper driver. 
		
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream("O:\\Projects - Selenium\\Training Projects\\S26_End_To_end_Project\\src\\test\\java\\Academy\\data.properties"); 
		//create a data.properties generic file. and link the location.
		
		prop.load(fis); // 
		String browserName = prop.getProperty("browser"); //getting the entry for browser in the data.properties file 
		
		if(browserName=="chrome")
		{
			//execute chrome driver
			WebDriver driver = new ChromeDriver();
		}
		else if (browserName=="firefox")
		{
			//execute firefox driver
			WebDriver driver = new FirefoxDriver();
		}
		else if (browserName =="IE")
		{
			//execute IE
			WebDriver driver = new InternetExplorerDriver();
		}
		else if (browserName =="edge")
		{
			//execute edge
			WebDriver driver = new EdgeDriver();
		}		
		else if (browserName =="safari")
		{
			//execute Safari
			WebDriver driver = new SafariDriver();
		}		
		
		
		
	}
	
	
}
