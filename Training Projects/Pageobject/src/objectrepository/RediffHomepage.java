package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepage {

	WebDriver driver;
	public RediffHomepage(WebDriver driver) {  //constructor
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);  //this maps the driver that is being passed in from the testcases with the "this" driver for this class. 
	}
	
    
  
	By search = By.id("srchword");
	By submit = By.xpath("//input[@type='submit']");
  
 /* @FindBy(id="srchword")
  WebElement search;
  
  @FindBy(xpath="//input[@type='submit']")
  WebElement submit;*/
  
  
  
    
    public WebElement Search()
    {
    	return driver.findElement(search);
    }
   
    public WebElement Submit()
    {
    	return driver.findElement(submit);
    }
   
 
	

	
	
	
}