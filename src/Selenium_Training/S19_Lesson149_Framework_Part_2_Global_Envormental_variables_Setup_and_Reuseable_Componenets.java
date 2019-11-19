package Selenium_Training;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class S19_Lesson149_Framework_Part_2_Global_Envormental_variables_Setup_and_Reuseable_Componenets {
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


