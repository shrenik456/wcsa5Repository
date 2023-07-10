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
		
		//Read data from IPL Sheet...
		//implementation of read the data frome excel 
		
	FileInputStream	fis=new FileInputStream("./data/TestData.xlsx"); // provide the path of file 
    Workbook	wb=WorkbookFactory.create(fis);  // Make the file for ready to read
     Sheet sheet = wb.getSheet("IPL");
     Row row = sheet.getRow(5);
    Cell cell = row.getCell(1);
    String data = cell.getStringCellValue();
    System.out.println(data);
   
    
	
	
	
		
		
	
	}

}
