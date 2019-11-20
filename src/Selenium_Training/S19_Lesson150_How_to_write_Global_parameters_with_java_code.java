package Selenium_Training;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class S19_Lesson150_How_to_write_Global_parameters_with_java_code {
	/*
	 * The concept here is to globally define variables to be reused.
	 * This will allow one single place to define a resuable data set.
	 * 
	 *  - You need to define a separate datafile and then pass the name and location of the datafile to the class. 
	 *  
	 *  eg. 
	 *  -lets define a global data file(generic text file) and call it 'S19_globalVariable.properties'  (ensure you give the extention .properties)
	 *  - data file syntax:
						 *   key1=value1
						 *   key2=value2
						 *   ..etc
	 *   
	 *   
	 *  
	 * 
	 * 
	 */

	@Test
	public void Login() throws IOException {
		
		//define the Properties class: import java.util.Properties;
		Properties prop=new Properties();
		
		//define FileInputStream, will help point where the globalVariable file is : import java.io.FileInputStream;
		  //you need to find out where the file location is as well for 'new FileImputStream' you need to "Add argument to match 'FileImputStream(File)' 
		FileInputStream fis =new FileInputStream("O:\\Projects - Selenium\\src\\Selenium_Training\\S19_globalVariable.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("username")); // will print out the username from the S19gobalVariable.properties file. 
		
	}
	
	
	
	
	
	
	
		
	}


