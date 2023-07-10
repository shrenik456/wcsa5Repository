package popUpHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadInILovePdf {

	public static void main(String[] args) throws IOException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.ilovepdf.com/");
	driver.findElement(By.xpath("//a[@title='PDF to Word']")).click();
    WebElement	file=driver.findElement(By.id("pickfiles"));
	file.click();
	
	if (file.isDisplayed()) 
	{
		System.out.println("Test case passs");
	}
	
	else
	{
		System.out.println("Test case fail");
	}
	
	Runtime.getRuntime().exec("C:\\Users\\SHRENIK\\Documents\\iLovePdfFileUpload.exe");
	
	}

}
