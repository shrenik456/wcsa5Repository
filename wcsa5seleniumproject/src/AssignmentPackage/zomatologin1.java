package AssignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomatologin1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		// to click on signup link 
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/section[2]/section/div[1]/section/section/input")).sendKeys("shrenik");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/section[2]/section/section/section/input")).sendKeys("shrenik456@gmail.com",Keys.ENTER);
		//Thread.sleep(2000);
		
	   
		
	}

}
