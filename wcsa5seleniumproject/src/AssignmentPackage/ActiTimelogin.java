package AssignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimelogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-1jmsjp3/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		

	}

}
