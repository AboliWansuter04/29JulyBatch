package excelSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;



public class EXNo1 {

	

	public static void main(String[] args) throws  EncryptedDocumentException ,IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\sagar\\OneDrive\\Documents\\Book1.xlsx");
		
		
		 String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 System.out.println(value);
	}

}
