package AssignmentPackage;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {  // Close all the browser without using quit() mathod.

	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://omayo.blogspot.com/");  //Launch Parent Browser
    String parentAddres=driver.getWindowHandle();
    System.out.println("Parent Address" +parentAddres);
    
   
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,1500)");
	
	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();  // Launch the Child Browser
	
    Set<String>	wHandles=driver.getWindowHandles();
    System.out.println("Parent and Child Browser  Address" +wHandles);
    
   for (String string : wHandles)
   {
	  driver.close();
}
	
}
    
   
    
    
    
	
	
	
	
	}


