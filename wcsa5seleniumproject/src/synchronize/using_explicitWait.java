package synchronize;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class using_explicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.id("Electronic")).click();
		driver.findElement(By.id("Mobiles")).click();
		driver.findElement(By.xpath("//span[text()='realme cy']")).click();
		driver.findElement(By.xpath("//input[@name='Check Delivery']")).sendKeys("411033");
		
		
	}

}
