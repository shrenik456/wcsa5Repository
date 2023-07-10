package drodowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class WithoutUsingSelectionMethod {

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/SHRENIK/Desktop/wcsa5/WebElement/multiselect_dropdown.html");
		
		    WebElement dropdownOptions= driver.findElement(By.id("menu"));
		    Select sel = new Select(dropdownOptions);
		    
		    List<WebElement> dropdownselement =sel.getOptions();

		   
		   
			for(int i=0; i<dropdownselement.size();i++)
		     {
		    	// if the option is burger  click that option
		    	 if (dropdownselement.get(i).getText().equals("misal pav"))
		    	 {
		    	    WebElement value = dropdownselement.get(i);
		    	    System.out.println(value.getText());
		    	   	break;
				 }
		    	 
		    	 
		    	 
		
	         }
	}
	
}


