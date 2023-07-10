package NewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflicx_xpathcase4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		
		driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("shreniksutar456@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shrenik@netflix");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains (text(),'Sign')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
		
		
		
	}

}
