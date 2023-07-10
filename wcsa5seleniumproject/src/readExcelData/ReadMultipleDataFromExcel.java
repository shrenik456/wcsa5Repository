package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		// Read data From IPL sheet
		//Read multiple values or data from excel sheet by using for loop
		for(int i=1; i<=10;i++)
	{
			
	FileInputStream	fis=new FileInputStream("./data/TestData.xlsx"); 
    Workbook	wb=WorkbookFactory.create(fis);
    Sheet sheet=wb.getSheet("IPL");
    Row row = sheet.getRow(i);
    Cell cell = row.getCell(0);
    String data=cell.getStringCellValue();
    Thread.sleep(1000);
    System.out.println(data);
    
  
	}
	}
}
