package AssignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {
	
public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("shrenik456@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("shrenik@fb",Keys.ENTER);
		Thread.sleep(2000);
		
		
		

        
		
}
}