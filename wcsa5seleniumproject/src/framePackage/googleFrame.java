package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleFrame {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//div[@class='gb_S gb_Pd gb_x']")).click();
    driver.switchTo().frame("app");
    driver.findElement(By.xpath("//span[text()='Maps']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("Dubai",Keys.ENTER);
    
	
	
	
	}

}
