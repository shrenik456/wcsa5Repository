package popUpHandling;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws IOException {
		
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("http://omayo.blogspot.com/");
      Actions act= new Actions(driver);
      WebElement uploadButton=driver.findElement(By.id("uploadfile"));
      act.click(uploadButton).build().perform();
     
      Runtime.getRuntime().exec("C:\\Users\\SHRENIK\\Documents\\newFile.exe");
      //C:\Users\SHRENIK\Documents\OmayoFileUpload1.exe
	}

}
