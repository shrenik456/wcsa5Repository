package AssignmentPackage;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElimitaesDuplicateByLinkedHashset {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/SHRENIK/Desktop/wcsa5/WebElement/MultiSelectDropdown_DuplicateValues.html");

		// identify dropdown
		WebElement dropDownElement = driver.findElement(By.id("menu"));

		// handle dropDown
		Select sel = new Select(dropDownElement);

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

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
			lhs.add(value);
			
    	}
		
		// Read the value from set
		for(String element:lhs)
		{
			Thread.sleep(2000);
			System.out.println(element);
		}
	}

}
