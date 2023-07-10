package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.examples.CreateCell;

import com.google.j2objc.annotations.Property;


public class ReadDataFromProperty1 {

	public static void main(String[] args) throws IOException {
		// Read the data from config.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
	
		Properties prop = new Properties();
		
		//make the file ready for read
		prop.load(fis);
		
		// read the perticular property
	    String	data=prop.getProperty("url");
		System.out.println(data);
		
		
		
	}

}
