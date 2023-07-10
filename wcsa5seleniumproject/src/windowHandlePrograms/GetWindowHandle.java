package windowHandlePrograms;




import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung s23");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    WebElement	product=driver.findElement(By.xpath("//span[text()='Samsung Galaxy S23 5G (Green, 8GB, 256GB Storage)' "
    		+ "and @class='a-size-medium a-color-base a-text-normal']"));
    product.click();
	
   Set<String> handles=driver.getWindowHandles();
   ArrayList arr=new ArrayList(handles);
   driver.switchTo().window((String)arr.get(1));
    
    
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	Thread.sleep(1000);
	jse.executeScript("window.scrollBy(0,300)");
	
	//select the Mobile Colour06
	driver.findElement(By.xpath("//button[@id='a-autoid-27-announce']")).click();
	
	//select the storage size
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='512GB']")).click();
	
	//Click on Add to Cart
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	//driver.switchTo().defaultContent();
	//driver.findElement(By.xpath("//span[text()='    Cart   ']")).click();

	
	
	
	
	}

}
