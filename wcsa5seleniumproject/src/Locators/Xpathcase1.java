package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("shrenik123@gmail.com"); // case1 AV=AN
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();  // case 2  text() method 
	}

}
