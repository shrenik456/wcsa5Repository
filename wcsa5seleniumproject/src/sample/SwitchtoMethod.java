package sample;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =	new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	driver.switchTo().activeElement().sendKeys("8308398437",Keys.ENTER);
	
	//to perform the back operation
	
	
	

	}

}
