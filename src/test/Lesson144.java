package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lesson144 {

	/*
	 * 'import org.testng.annotations.Test;'
	 * 'Add TestNG library'
	 * 
	 */
	

	
	//import org.testng.annotations.Parameters;
	@Parameters({"URL_Global","APIKey_usrname"})
	@Test
	public void Lesson144_Test2(String urlname, String key) {
		System.out.println("This test should be able to port in the Parameter of URL at the 'Global/Suite' level");
		System.out.println("The URL specified is : " + urlname);
		System.out.println("The APIKey/username specified is : " + key);
	}
	

}
