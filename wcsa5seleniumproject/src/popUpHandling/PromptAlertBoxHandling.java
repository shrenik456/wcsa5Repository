package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertBoxHandling {

	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
	
	//=================(Pop up Handling By Robot class)================================
    
//	Robot robot = new Robot();
//	robot.keyPress(KeyEvent.VK_ENTER);
//	robot.keyRelease(KeyEvent.VK_ENTER);
	
	//================(Pop up Handling By Storing the value in variable)===============
	
    Alert al=driver.switchTo().alert();
    al.accept();
		
		
	}

}
