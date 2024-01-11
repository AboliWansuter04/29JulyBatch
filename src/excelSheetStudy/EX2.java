package excelSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EX2 {

	public static void main(String[] args) throws EncryptedDocumentException,IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\sagar\\OneDrive\\Documents\\Book1.xlsx");

				//Workbook myWorkbook = WorkbookFactory.create(myFile);
				//Sheet mySheet1=(Sheet) myWorkbook.getSheet("Swara");
			   // Row myRow=mySheet1.getRows(2);
				//Cell myCell = myRow.getCell(0);
				//CellType myDataType = myCell.getCellType();
				//System.out.println(myDataType);
		
		Workbook myworkbk=WorkbookFactory.create(myFile);
		Sheet mysh=myworkbk.getSheet("Swara");
		Row myRow=mysh.getRow(2);
		Cell mycell=myRow.getCell(0);
	    CellType mydatatype=mycell.getCellType();
	    System.out.println(mydatatype);

	}

}
