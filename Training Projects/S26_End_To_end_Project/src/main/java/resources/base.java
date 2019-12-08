package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	public static WebDriver driver; //define the Webdriver here so the access of this object is for the entire test case. 
	public Properties prop;  //define the Properties here so that this object can be passed onto other classes when you use "..extends base.."
	
	public WebDriver initializeDriver() throws IOException
	{
		
		
		//here we want a method to set the driver based on the browser type. We want to pass a browser name into this method and in turn it will set up the proper driver. 
		
		prop = new Properties();
		FileInputStream fis=new FileInputStream("O:\\Projects - Selenium\\Training Projects\\S26_End_To_end_Project\\src\\main\\java\\resources\\data.properties"); 
		//create a data.properties generic file. and link the location.
		FileInputStream usr=new FileInputStream("O:\\Projects - Selenium\\Training Projects\\S26_End_To_end_Project\\src\\main\\java\\resources\\Home2.properties"); 
		//loading mulitiple file properties.
		prop.load(fis); // 
		prop.load(usr);// This is for use in HomePage2.java
		
		String browserName = prop.getProperty("browser"); //getting the entry for browser in the data.properties file 
		
		if(browserName.equals("chrome"))
		{
			//execute chrome driver
			System.setProperty("webdriver.chrome.driver","O:\\Projects - Selenium\\Drivers\\Current\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			//execute firefox driver
			System.setProperty("webdriver.firefox.driver","O:\\Projects - Selenium\\Drivers\\Current\\Gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("IE"))
		{
			//execute IE
			System.setProperty("webdriver.ie.driver","O:\\Projects - Selenium\\Drivers\\Current\\IE\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if (browserName.equals("edge"))
		{
			//execute edge
			System.setProperty("webdriver.edge.driver","O:\\Projects - Selenium\\Drivers\\Current\\Edge\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // recommened good practice to add a wait at this golbal level.
		
		return driver; //pass driver object back
		
	}
	
	public void getScreenshot(String result) throws IOException
	{
		/*
		 * import java.io.File;
		 * import org.openqa.selenium.TakesScreenshot;
		 * import org.openqa.selenium.OutputType;
		 * mouseover and implement : 'Change to 'getScreenshotAS(...)'
		 * import org.apache.commons.io.FileUtils;
		 *  -This package may need to be added to your Java Build Path\Libraries manually
		 *   and can be downloaded here : http://commons.apache.org/proper/commons-io/
		 * 	- or in Maven can be added as a dependency in your POM.xml. see https://mvnrepository.com/artifact/commons-io/commons-io
		 */
				
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Users//ION64-2017//Desktop//screen shots//"+result+" screenshot.png")); 
		
	}
	
	
}
