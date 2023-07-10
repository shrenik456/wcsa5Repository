package NewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRM_xpathcase3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username' and(@placeholder='Username')]")).sendKeys("shrenik123@gmail.com"); 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password' and (@placeholder='Password')]")).sendKeys("shrenik123@gmail.com"); 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit' and (@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')]")).click();
		
		
		

	}

}
