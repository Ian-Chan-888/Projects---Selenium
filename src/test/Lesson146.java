package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lesson146{

	/*
	 * 'import org.testng.annotations.Test;'
	 * 'Add TestNG library'
	 * 
	 * USING @DataProvider
	 * 
	 */
	
	//import org.testng.annotations.DataProvider;
		@DataProvider
		public Object[][] getData() { 
			//1st datatype =  combination - username; password - good credit history
			//2nd datatype =  username; password - no credit
			//3rd datatype =  fraudelent credit history username; password
			
			//1st data set
			Object[][] data = new Object[3][2]; //defining an array with 3 rows with 2 columns as in 3 data types with max 2 values in the columns which are: username; password.
			data[0][0] = "1stsetusernam";
			data[0][1] = "1stpassword";
			// data[row number] [column number]
			//columns in the row are nothing but values for that particular combination(row)
			
			//2nd set
			// data[row number] [column number]
			data[1][0] = "2ndsetusernam";
			data[1][1] = "2ndpassword";
			
			//3nd set
			// data[row number] [column number]
			data[2][0] = "3rdsetusernam";
			data[2][1] = "3rdpassword";
			
			return data;

		}
	
	
	@Test(dataProvider = "getData") //this will run for each data set. i.e 3 times. 
	public void Lesson145_Test1(String username, String password) { //since getData has 2 values 'username' and 'password' you need to add 2 strings (String username, String password)
		System.out.println(username);
		System.out.println(password);
		//Assert.assertTrue(false);  //- this line is to add a failure point.
		

	}
	

}
