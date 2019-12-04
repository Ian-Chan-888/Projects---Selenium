package SelnideTest;


import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junt.Assert.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class GoogleTest {
	
	  @Test
	  public void userCanSearch() {
	    open("https://google.com");//import static com.codeborne.selenide.Selenide.*;
	    $(By.name("q")).setValue("Selenide").pressEnter();//import static com.codeborne.selenide.Selenide.*;
	    
	    $$(By.className("S3Uucc")).shouldHave(size(9));  //import static com.codeborne.selenide.CollectionCondition.size;
	    $(By.className("S3Uucc")).shouldHave(text("Selenide: concise UI tests in Java")); //import static com.codeborne.selenide.Condition.text;


	  	}
	  
	  @Test
	  public void GoogleTestImage() {
	
		open("http://images.goggle.com.au");
		$("#1st-ib").setValue("glen smith java");
		$("imput[name-btnG]").click();
		$$(".rg_l").get(0).shouldBe(visible).click();
		$(By.partialLinkText("View image")).click();
		sleep(5000);
		}
}


