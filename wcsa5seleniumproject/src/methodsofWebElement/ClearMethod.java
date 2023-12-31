package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClearMethod {

	public static void main(String[] args)  throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-1jmsjp3/login.do");
		
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		
//		Thread.sleep(2000);
//		driver.findElement(By.name("username")).clear();
//		driver.findElement(By.name("pwd")).clear();
//		
		
		WebElement usnTB = driver.findElement(By.name("username"));
		WebElement passTB = driver.findElement(By.name("pwd"));
		Thread.sleep(2000);
		usnTB.sendKeys("admin");
		passTB.sendKeys("MANAGER");
		Thread.sleep(2000);
		usnTB.clear();
		passTB.clear();

		
	}

}
