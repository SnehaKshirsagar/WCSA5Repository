package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Read data from IPL sheet..
		
		//Implementation of read the data from excel
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//Provide the path of file
		Workbook wb = WorkbookFactory.create(fis);//Make the file for ready to read //It is from Apache poi liberary
		Sheet sheet = wb.getSheet("IPL");//get into the sheet
		Row row = sheet.getRow(3);//get into the desired row
		Cell cell = row.getCell(1);//get into the desired cell/column
		String data = cell.getStringCellValue();//read the data from cell	
		System.out.println(data);
		
		
		
	}

}
