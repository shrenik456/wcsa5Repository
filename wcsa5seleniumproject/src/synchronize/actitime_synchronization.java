package synchronize;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class actitime_synchronization {

	public static void main(String[] args) {
		
	WebDriver driver =	new   ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-1jmsjp3/login.do");
	
	String titleForLoginPage= driver.getTitle();
	if (titleForLoginPage.equals("actiTIME - Login")) {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		System.out.println("Test case pass for login page ");
		
	}
	else {
		System.out.println("Test case fail for login page ");
		
	}
	
	// HOME PAGE
	// "actiTime- Enter Time - Track" 
	   
	    
	    	System.out.println("title is matched test case passed");
			
		}
	
	public static void explicitWaitMethod(WebDriver driver, int sec, String title)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains(title));
	}
	    
	   
	
	

	}


