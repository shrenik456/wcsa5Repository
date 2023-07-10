package drodowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Single select dropdown 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/SHRENIK/Desktop/wcsa5/WebElement/Sinngle_select_dropdown.html");
		
		// identify dropdown on a web page 
	    WebElement dropdownElement=driver.findElement(By.id("menu"));
	  
	    // handle the dropdown by creating the obj of select...
	    Select sel=new Select(dropdownElement);
	    
	    // read all the option of dropdown 
	    List<WebElement> allOps =sel.getOptions();
	    
	    for(WebElement op: allOps )
	    {
	    	if(op.getText().equals("burger"))
	    	{
	    		Thread.sleep(2000);
	    		op.click();
	    		break;
	    		
	    	}
	    }
	    
	    
	    
	    

	}

}
