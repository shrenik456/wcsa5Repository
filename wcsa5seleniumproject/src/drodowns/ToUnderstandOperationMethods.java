package drodowns;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ToUnderstandOperationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/SHRENIK/Desktop/wcsa5/WebElement/multiselect_dropdown.html");
		
		WebElement multiselectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectDD);
		
		
		
		// is multiple method 
        boolean	result=sel.isMultiple();
        System.out.println(result);		
        
        // getOptions Method
        List<WebElement> dropdownOptions =sel.getOptions();
        for(int i=0; i<dropdownOptions.size(); i++)
        {
         String	Options = dropdownOptions.get(i).getText();
        	System.out.println(Options);
        	Thread.sleep(1000);
        }
        
        // using for each loop
        List<WebElement> ops=sel.getOptions();
        for(WebElement we: ops)
        {
        	String textOfops =we.getText();
        	System.out.println(textOfops);
        }
        
        for(int i=2; i<=5; i++)
        {
        	sel.selectByIndex(i);
        }
        
        WebElement firstoption=sel.getFirstSelectedOption();
        System.out.println("firs selected option is:"+firstoption.getText());

	}
	

}
