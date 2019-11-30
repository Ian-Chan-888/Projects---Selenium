package Selenium_Training;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class S23_Lesson173_Pracctise_Excercise_Excel_Driven_testing_3 {
	/*
	 * In this section we will be focusing on Data Driven Testing using Excel.
	 *   	 
	 *   Before the code will only work within the data type of Strings. but what if the values in the excel document are numeric? i.e cell c4 = 12654  (excelDriven_eg.xlsx)
	 *   
	 *   for that we need to rewrite lines : 115 to 124
	 *   
	 *   to : 
								//check if the data type is string or if it is integer
									if(cellValue.getCellType()==CellType.STRING)
									{
										a.add(cellValue.getStringCellValue()); // set as string
									}
									else
									{
										// set as numeric, but since the Array was defined as a <String> we need to convert the getNumericCellValue to a string
										a.add(NumberToTextConverter.toText(cellValue.getNumericCellValue()));
									}									 
	 *   
	 *   
	 *  
	 *  NOTE: Below the code does not work and thus will have errors because the class these notes are written in is not a Maven project and thus does not have any Maven Dependencies 
	 *  	See 'excelDriven' Project for working examples
	 *  
	 */



	// Note: There is nothing here to run. 
	
	public ArrayList<String> getData(String testcaseName) throws IOException
	{
		//getting access to the excel document
		
		/* import java.io.FileInputStream;
		 * import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		 * 
		 */
		
		//fileInputStream argument
		ArrayList<String> a = new ArrayList<String>();//import java.util.ArrayList;
		
		
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
				Iterator<Row> rows = sheet.iterator();  //import java.util.Iterator; and import org.apache.poi.ss.usermodel.Row;
				Row firstrow = rows.next();  // navigate to the next row
				
				
							//now read each cell of current row 
						Iterator <Cell> ce=firstrow.cellIterator(); // import org.apache.poi.ss.usermodel.Cell;  // row is a collection of cells
						
						
						
						int k=0;  // increment and check each coloumn
						int coloumn = 0; // defining a variable to store the coloumn number
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
							if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName))// get the cell value of the row and see if it matches to "Purchase"
							{
								// after you grab 'purchase' test case row, put all the data of that row and feed into test
								Iterator <Cell> cv=r.cellIterator();
								while (cv.hasNext()) // while there are cell values within the row run this loop
								{
									
									Cell cellValue = cv.next();    //.getStringCellValue();
									
									
									//check if the data type is string or if it is integer
									if(cellValue.getCellType()==CellType.STRING)
									{
										a.add(cellValue.getStringCellValue()); // set as string
									}
									else
									{
										// set as numeric, but since the Array was defined as a <String> we need to convert the getNumericCellValue to a string
										a.add(NumberToTextConverter.toText(cellValue.getNumericCellValue()));
									}									
									
									System.out.println(cellValue);
									
									
								}
								
							}
							
							
							
						}
					

			}
		
		}
							return a;
	}
		
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub



}
}
