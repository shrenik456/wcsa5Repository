package drodowns;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiselectDropdown {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/SHRENIK/Desktop/wcsa5/WebElement/multiselect_dropdown.html");
		
		WebElement multiselectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectDD);
		
		
		// to select using Index
		sel.selectByIndex(1);
	
		
		// to select using visible text
		sel.selectByVisibleText("pizza");
		
		
		//  to select by using value 
		sel.selectByValue("v5");
		
		//To deselect using Index 
		sel.deselectByIndex(5);
		Thread.sleep(2000);
		
		// To deselect by using visibletext
		sel.deselectByVisibleText(" misal pav");
		Thread.sleep(2000);
		
		//To deselect by using value
		sel.deselectByValue("v5");
		Thread.sleep(1000);
		
		
		// to select multiple options 
		for(int i=0; i<5; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}	
		
		Thread.sleep(3000);
//		
//		for(int i=0; i<5; i++)
//		{
//			sel.deselectByIndex(i);
//			Thread.sleep(1000);
//		}
		
		// To deselect all option by using deselectAll()
		sel.deselectAll();
		
	}
	

}
