package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Using Page factory for Page Object Model

public class LoginPage {
	
	public WebDriver driver;
	

	
	//constructor is needed here. Else you can get null point exception errors. 
	public LoginPage(WebDriver driver) {  
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(css = "[id='user_email']") //email field 
	WebElement email;	
	
	@FindBy(css = "[type='password']") //password field 
	WebElement password;
	
	@FindBy(css = "[value='Log In']") //Login button 
	WebElement LoginBtn;

	
	   public WebElement getEmail()
	   {
		   return email;
	   }
	   
	   public WebElement getPassword()
	   {
		   return password;
	   }
	   
	   public WebElement getLoginBtn()
	   {
		   return LoginBtn;
	   }
	
	   
	   
}

