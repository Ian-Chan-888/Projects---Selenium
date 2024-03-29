package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S08_Lesson54_Handling_Checkbox_and_getting_the_size_of_then_with_Selenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.westjet.com"); // URL in the browser
		driver.manage().window().maximize();// max browser window

		WebElement From = driver.findElement(By.xpath("//input[@id='origin-search']"));
		From.click();

		// clear field
		driver.findElement(By.xpath(
				"//form[@id='book-flight-form']//div[@class='col-xs-12 col-smv-6 col-lgv-12 wrapper airport origin']//i[@class='stamp remove-sign']"))
				.click();

		From.sendKeys("vA");
		From.sendKeys(Keys.ARROW_DOWN);
		From.sendKeys(Keys.ENTER);

		WebElement To = driver.findElement(By.xpath("//input[@id='destination-search']"));
		// clear field
		driver.findElement(By.xpath(
				"//form[@id='book-flight-form']//div[@class='col-xs-12 col-smv-6 col-lgv-12 wrapper airport destination']//button[@class='clear']"))
				.click();

		To.sendKeys("london");
		Thread.sleep(2000);
		To.sendKeys(Keys.ARROW_DOWN);// toggles to London, ON
		To.sendKeys(Keys.ARROW_DOWN);// toggles to London, United Kingdom
		To.sendKeys(Keys.ENTER);

		System.out.println("END PROGRAM");

		// driver.close();

	}
}