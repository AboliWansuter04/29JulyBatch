package excelSheetStudy;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEX5 {

	public static void main(String[] args) throws EncryptedDocumentException ,IOException 
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\sagar\\OneDrive\\Documents\\Book1.xlsx"); 
				 	 	 
				 	 	Workbook myWorkbook = WorkbookFactory.create(myFile); 
				 	 	 
				 	 	Sheet mySheet = myWorkbook.getSheet("Sheet2"); 
				 	 	 
				 	 	int totalNumberOfRows = mySheet.getLastRowNum(); 
				 
				 	 	System.out.println(totalNumberOfRows); 
				 	 	 
				 	 	System.out.println("============================"); 
				 	 	 
				 	 	short totalNumOfCells = mySheet.getRow(0).getLastCellNum(); 
				 	 	 
				 	 	System.out.println(totalNumOfCells); 


	}

}
