package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {

	/*
	 * 'import org.testng.annotations.Test;'
	 * 'Add TestNG library'
	 * 
	 */
	@Test  
	public void Day2_test1() {
		// TODO Auto-generated method stub

		System.out.println("Day2 (test1)");
	}

	@Test  
	public void Day2_test2() {
		// TODO Auto-generated method stub

		System.out.println("Day2 (test2)");
	}
	
	//import org.testng.annotations.Parameters;
	@Parameters({"URL_test"})
	@Test
	public void Parameter_example(String urlname) {
		System.out.println("This test should be able to port in the Parameter of URL at the 'Day2 test' level");
		System.out.println("The URL specified is : " + urlname);
	}
}
