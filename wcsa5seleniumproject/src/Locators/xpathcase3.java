package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpathcase3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
		// case 3:
		driver.findElement(By.xpath("//input[@id='email'or(@name='email')]")).
		sendKeys("shrenik123@gmail.com");  // here we can use AND as well as OR operator
		Thread.sleep(2000);   
		
		driver.findElement(By.xpath("//input[@id='pass'or(@name='pass')]")).
		sendKeys("123456789"); // here we can use AND as well as OR operator
     	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='loginbutton'or(@name='login')]")).click(); // here we can use AND as well as OR operator
		
		
				
		
	}

}
