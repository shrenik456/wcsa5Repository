package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod1 {
    
	public static void main(String[] args) throws InterruptedException {
		
      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();  // pop up window handle
		
		Thread.sleep(3000);
		WebElement target=driver.findElement(By.xpath("//a[.='Coins ']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("(//span[text()='1 gram' and (@class='prcs-d')])[1]")).click();
		
		WebElement coin = driver.findElement(By.id("5920"));
		
		if(coin.isDisplayed())
		{
			System.out.println("Yes coin is displayed");
			Thread.sleep(3000);
			driver.quit();
		}
		
		else 
		{
			System.out.println("Exception!!!");
		}
		

	}

}
