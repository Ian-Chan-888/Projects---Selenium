package Selenium_Training;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class S23_Lesson168_Access_Excel_Data {
	/*
	 * In this section we will be focusing on Data Driven Testing using Excel.
	 * 
	 * Apache POI API: - this is the api that enables the connection from your excel files to your java libraries. 
	 * 
	 * Data driven testing from Excel. 
	 * 
	 * Maven Dependencies setup:
	 * -poi-ooxml and poi
	 * 
	 * Strategy to access excel Data: This is an outline of how the frameworks will access data contained within a xls document. 
	 *   Create an object for XSSFWorkbook class
	 *   	- Create a xls workbook document
	 *   	- Get access to the 'sheet' withn the xls document
	 *   	- Get access in the rows within said 'sheet'. 
	 *   	- Get access to a specific row within said 'sheet'. 
	 *   	- Get access to all cells within the row.
	 *   	- Get access to the Data from Excel and define them into Arrays.
	 *   
	 *      eg: 
	 *      	Excel Document 
	 *      		|
	 *      		--sheet
	 *      			|
	 *      			--row
	 *      				|
	 *      				--cells
	 *      
	 *      1. Within the Maven Project (src/test/java), create a new class with a name 'dataDriven'
	 *      2. Open the 'dataDriven class
	 *      3. after the 'public static...' add:
	 *       FileInputStream fis=new FileInputStream("<Location of excel file>");
	 *       XSSFWorkbook workbook=new XSSFWorkbook();
	 *       	- import java.io.FileInputStream;
	 *  		- import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	 *  
	 *  	4. Build a loop to find and target the 'sheet' 
	 *  
	 *  		eg: 
	 *  
	 *  		int sheets=workbook.getNumberOfSheets()
				for (int i=0;i<sheets;i++)
				{
					//traverse each sheet and match to the target name
					if (workbook.getSheetName(i).equalsIgnoreCase("testdata"))
					{
						XSSFSheet sheet=workbook.getSheetAt(i);//import org.apache.poi.xssf.usermodel.XSSFSheet;
					}
					
				}
	 *  
	 *  
	 *  
	 *  
	 *  
	 */



	// Note: There is nothing here to run. 
	

	
		
	}


