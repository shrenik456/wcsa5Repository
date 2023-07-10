package popUpHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopHandling {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
    driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
    Thread.sleep(2000);
    
//  ========================(Pop up Handling By Robot Class)=============================
//    Robot  robot = new Robot();
//    robot.keyPress(KeyEvent.VK_ENTER);
//    robot.keyRelease(KeyEvent.VK_ENTER);
    
//  ===============(pop up handling by storing the value in reference variable)============
  
    Alert al=driver.switchTo().alert();
    al.accept();
//  al.dismiss();
    System.out.println(al.getText());
    

	}

}
