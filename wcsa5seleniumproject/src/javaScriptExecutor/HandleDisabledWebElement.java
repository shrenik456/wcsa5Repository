package javaScriptExecutor;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-1jmsjp3/login.do");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//To generate alert popup 
	Thread.sleep(2000);
	jse.executeScript("alert('Hello There !!')");
	
	//To handle Disabled WebElement
	Thread.sleep(2000);
	jse.executeScript("document.getElementById('i2').value='manager'");
	
	}

}
