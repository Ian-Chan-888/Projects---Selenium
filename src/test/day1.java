package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	/*
	 * 'import org.testng.annotations.Test;'
	 * 'Add TestNG library'
	 * 
	 */
	@Test  
	public void Day1_test1() {
		// TODO Auto-generated method stub

		System.out.println("Day1 (test1)");
	}
	
	//import org.testng.annotations.Parameters;
	@Parameters({"URL_Global"})
	@Test
	public void Parameter_example(String urlname) {
		System.out.println("This test should be able to port in the Parameter of URL at the 'Global/Suite' level - Day 1");
		System.out.println("The URL specified is : " + urlname);
	}
	

}
