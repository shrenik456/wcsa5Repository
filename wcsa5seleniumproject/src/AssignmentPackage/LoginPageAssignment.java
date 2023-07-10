package AssignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		// to identify WebEkenent we Useless FileDetector locators
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("shrenik456@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("abcefghijk",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.className("btn login-button btn-submit btn-small"));
		
		

	}

}
