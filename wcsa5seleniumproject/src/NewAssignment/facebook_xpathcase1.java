package NewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_xpathcase1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shrenik123@gmail.com"); // case1 AV=AN
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");   // case1 AV=AN
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();      // case1 AV=AN
		
		
		
	}
	

}
