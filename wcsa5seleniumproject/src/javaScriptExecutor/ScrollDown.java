package javaScriptExecutor;

import java.awt.Button;
import java.awt.Window;
import java.time.Duration;

import javax.tools.JavaCompiler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.selenium.dev/");
	   
	   //To perform Scrolling operation
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   //Scroll Down
	   Thread.sleep(2000);
	   jse.executeScript("window.scrollBy(0,500)");
	   
	   WebElement  ButtonReadMore= driver.findElement(By.xpath("//a[contains(@class,'selenium-ide ')]"));
	   jse.executeScript("arguments[0].click();",ButtonReadMore);
	   
	   
	   
	}

}
