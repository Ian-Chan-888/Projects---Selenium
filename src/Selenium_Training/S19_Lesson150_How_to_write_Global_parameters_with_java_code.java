package Selenium_Training;


import org.testng.annotations.Test;

public class S19_Lesson150_How_to_write_Global_parameters_with_java_code {
	/*
	 * The concept here is to globally define variables to be reused.
	 * This will allow one single place to define a resuable data set.
	 * 
	 */

	@BeforeSuite
	public void Login() {
		System.out.println("I am the First");
	}
		
	}


