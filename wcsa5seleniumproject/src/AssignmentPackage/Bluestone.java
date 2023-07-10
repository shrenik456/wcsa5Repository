package AssignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.xpath("//span[text()='Not now']")).click();
	Thread.sleep(2000);
	//Handle the frame by switch the controls to frame 
	driver.switchTo().frame("fc_widget");
	//click on chat box icon
	driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
	
	//switch the controls again back to main web page
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("Shrenik");
	driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("shreniksutar456@gmail.com");
	driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("8308398437");
		
		
	}

}
