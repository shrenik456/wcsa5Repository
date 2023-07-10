package robotActionsMethod;

import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CombinationOfActionAndRobotclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		
	    WebElement	target=driver.findElement(By.xpath("//span[text()='Downloads']"));
	    
	    //=============(To perform Right Click We Need to create Action Class )=====================
	
	    Actions act=new Actions(driver);
	    Thread.sleep(2000);
        act.contextClick(target).perform();
        
        //=============(To press and release the pagedown button we need to create Robot Class)=====
        
        Robot robot = new Robot();
        
        for(int i=1; i<=6;i++)
        {
        
        		Thread.sleep(1000);
            	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            	robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            	
		}
        
   
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
             
	}

}
