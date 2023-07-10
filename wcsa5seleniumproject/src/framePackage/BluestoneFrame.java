package framePackage;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneFrame {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	
	//Handle The pop up window
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	
	//switch into the new frame (Because chat icon is present in another frame )
	Thread.sleep(2000);
	driver.switchTo().frame("fc_widget");
	
	// click on chat icon (Rightside down position)
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
	
	// Switch the control again back to the main web page
	// and  Fill the Data
	driver.switchTo().defaultContent();
    WebElement	name=driver.findElement(By.xpath("//input[@id='chat-fc-name']"));
    name.sendKeys("Shrenik");
    WebElement	eId=driver.findElement(By.xpath("//input[@id='chat-fc-email']"));
    eId.sendKeys("shreniksutar456@gmail.com");
    WebElement	Mno=driver.findElement(By.xpath("//input[@id='chat-fc-phone']"));
    Mno.sendKeys("8308398437");
	Thread.sleep(2000);
	
	// clear all the filled data and close the child window
	name.clear();
	eId.clear();
	Mno.clear();
	driver.findElement(By.xpath("//span[text()='X']")).click();
	
	
	
	
	
	
	
	}

}
