package synchronize;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_implecitwait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shrenik123@gmail.com"); // username
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");            // password
		driver.findElement(By.xpath("//div[text()='Log in']")).click();    
	}

}
