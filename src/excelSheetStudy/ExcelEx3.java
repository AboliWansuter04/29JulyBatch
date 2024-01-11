package excelSheetStudy;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx3 {

	public static void main(String[] args) throws EncryptedDocumentException,IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\sagar\\OneDrive\\Documents\\Book1.xlsx"); 
				 	 	 
				 	 	Workbook myWorkbook = WorkbookFactory.create(myFile); 
				 	 	 
				 	 	Sheet mySheet = myWorkbook.getSheet("Sheet2"); 
				 	 	//how to read whole row 
				 	 	for(int i=0;i<=2;i++) 
				 	 	{ 
				 	 	 	 
				 	 	String value = mySheet.getRow(0).getCell(i).getStringCellValue();//0-->2 
				 	 	 
				 	 	System.out.print(value+" "); 
				 	 	} 
				 	 	System.out.println(); System.out.println("======================================"); 
				 	 	//how to read whole column (cell) 
				 	 	 
				 	 	for(int i=0;i<=3;i++) 
				 	 	{ 
				 	 	 	String value = mySheet.getRow(i).getCell(4).getStringCellValue(); 
				 	 	 	System.out.println(value); 
				 	 	} 
				 	 	 


	}

}
