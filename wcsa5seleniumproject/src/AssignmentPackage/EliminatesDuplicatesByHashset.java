package AssignmentPackage;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminatesDuplicatesByHashset {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/SHRENIK/Desktop/wcsa5/WebElement/MultiSelectDropdown_DuplicateValues.html");

		// identify dropdown
		WebElement dropDownElement = driver.findElement(By.id("menu"));

		// handle dropDown
		Select sel = new Select(dropDownElement);
        
		 // Hashset does not allow duplicate value and does not maintain insertion order
		HashSet<String> hs = new HashSet<String>();    

		// To get options from dropDown 
		List<WebElement> allOpts = sel.getOptions();
		
		// to read options from dropDown
		for(int i=0;i<allOpts.size();i++)
		{
			WebElement op = allOpts.get(i);
			
			// get Text of webelement and add into set 
			String value = op.getText();
			
			// add the value into set that means duplicates will not be allowed 
			  // insertion order wont be maintained
			hs.add(value);
			
		}
		
		// Read the value from set
		for(String element:hs)
		{
			Thread.sleep(2000);
			System.out.println(element);
		}
	}

}
