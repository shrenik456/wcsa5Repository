package drodowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/SHRENIK/Desktop/wcsa5/WebElement/Sinngle_select_dropdown.html");
		
		// identify dropdown on a web page 
	    WebElement dropdownElement=driver.findElement(By.id("menu"));
	  
	    // handle the dropdown by creating the obj of select...
	    Select sel=new Select(dropdownElement);
	    
	    // select the option from dropdown 
	    // using selection method 
	    Thread.sleep(2000);
	    sel.selectByIndex(2);  // fro single select dropdown 
	    
	    Thread.sleep(2000);
	    // try to deselect  option from dropdown
	    sel.deselectByIndex(3);	    

	}
	

}
