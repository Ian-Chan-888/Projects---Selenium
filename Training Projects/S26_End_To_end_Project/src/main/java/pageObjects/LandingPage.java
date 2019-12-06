package pageObjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Using Page factory for Page Object Model

public class LandingPage {
	
	public WebDriver driver;
	
	//constructor is needed here. Else you can get null point exception errors. 
	public LandingPage(WebDriver driver) {  
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(css = "a[href*='sign_in']") //login link
	WebElement signin;
	
	@FindBy(css =".text-center>h2")
	WebElement title;
	
	@FindBy(css ="#homepage > header > div.navbar.navbar-default.navbar-static-top > div > nav")
	WebElement navigationBar;

	
	   public WebElement getLoginPage()
	   {
		   //Element is present but having permanent Overlay. Use JavascriptExecutor to send the click directly on the element.
		   JavascriptExecutor executor = (JavascriptExecutor)driver;
		   executor.executeScript("arguments[0].click();", signin);
		   return signin;
		   
	   }
	   
	   public WebElement getTitle()
	   {
		   return title;
		   
	   }
	
	   public WebElement getNavigationBar()
	   {
		   return navigationBar;
		   
	   }
	   
}

