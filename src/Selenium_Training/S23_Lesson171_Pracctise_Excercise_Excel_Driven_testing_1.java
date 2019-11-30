package Selenium_Training;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class S23_Lesson171_Pracctise_Excercise_Excel_Driven_testing_1 {
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
	 *  -At this point you have already targeted your sheet (see Lesson 168)
	 *  -Now lets target the rows and its cells with the sheet.
	 *    - new classes to use :  (for reference see: https://poi.apache.org/apidocs/dev/org/apache/poi/xssf/usermodel/XSSFWorkbook.html)
	 *    	- XSSFWorkbook
	 *    
	 * 		Methods within the Class:
	 * 		- XSSFSheet			- Create an XSSFSheet from an existing sheet in the XSSFWorkbook.
	 *      - iterator()		- Alias for sheetIterator() to allow foreach loops Note: remove() is not supported on this iterator.
	 *      
	 *  Next lets look at incrementing and defining the column numbers see line 85 to 99.
	 *  Once the coloumn number is identified then scan entire 'Testcase' coloumn to find  the 'Purchase' entry	       
	 *   	
	 *   
	 *   	 
	 *  
	 *  NOTE: Below the code does not work and thus will have errors because the class these notes are written in is not a Maven project and thus does not have any Maven Dependencies 
	 *  	See 'excelDriven' Project for working examples
	 *  
	 */



	// Note: There is nothing here to run. 
	
		//getting access to the excel document
		
				/* import java.io.FileInputStream;
				 * import org.apache.poi.xssf.usermodel.XSSFWorkbook;
				 * 
				 */
				
				// --using the excelDriven_eg.xls as a working example--
				FileInputStream fis=new FileInputStream("O:\\Projects - Selenium\\src\\ExcelDriven\\excelDriven_eg.xlsx");
				XSSFWorkbook workbook=new XSSFWorkbook(fis);
				
				//target the sheet within excel
				int sheets=workbook.getNumberOfSheets();
				for (int i=0;i<sheets;i++)
				{
					//traverse each sheet and match to the target name
					if (workbook.getSheetName(i).equalsIgnoreCase("testdata"))//looking for the sheet labled 'testdata'
					{
						XSSFSheet sheet=workbook.getSheetAt(i); //import org.apache.poi.xssf.usermodel.XSSFSheet;
						
						
						
						// Identify 'Testscases' coloumn by scanning the entire 1st row and iterate each row
						Iterator<com.sun.rowset.internal.Row> rows = sheet.iterator();  //import java.util.Iterator; and import org.apache.poi.ss.usermodel.Row; // sheet is a collection of rows
						Row firstrow = rows.next();  // navigate to the next row
						
						
									//now read each cell of current row 
								Iterator <Cell> ce=firstrow.cellIterator(); // import org.apache.poi.ss.usermodel.Cell; // sheet is a collection of cells
								int k=0;  // increment and check each coloumn
								int coloumn=0; // defining a variable to store the coloumn number
								while (ce.hasNext())
								{
									Cell value= ce.next();
									if (value.getStringCellValue().equalsIgnoreCase("Testcase")) //looking for the row containing "TestCasese"
									{
										//desired coloumn value
										coloumn=k; //coloumn number defined here.
									}
									
									k++;
								}
						
								System.out.println(coloumn); // print out which coloumn number "Testcase" is in.
								
						// once coloumn is identified then scan entire testscase column to identify 'Purchase' test case row
								
						
								while(rows.hasNext())	
								{
									Row r=rows.next();
									if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("Purchase"))// get the cell value of the row and see if it matches to "Purchase"
									{
										// after you grab 'purchase' test case row, put all the data of that row and feed into test
										Iterator <Cell> cv=r.cellIterator();
										while (cv.hasNext()) // while there are cell values within the row run this loop
										{
											String cellValue = cv.next().getStringCellValue();
											System.out.println(cellValue);
											
										}
										
									}

								}
					
					}
			}
		
			}

		}


