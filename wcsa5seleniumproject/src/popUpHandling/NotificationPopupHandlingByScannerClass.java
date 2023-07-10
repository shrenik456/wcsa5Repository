package popUpHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopupHandlingByScannerClass {
        
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Broweser Type");
		String browserValue = sc.next();
		
		if (browserValue.equalsIgnoreCase("Chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/");
		}
		
		else if (browserValue.equalsIgnoreCase("Firefox")) 
		{
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			driver=new FirefoxDriver(fo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/");
			
		}
		
		else if (browserValue.equalsIgnoreCase("edge")) 
		{
			EdgeOptions  eo= new EdgeOptions();
			eo.addArguments("--disable-notifications");
			driver=new EdgeDriver(eo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/");
		}
		else 
		{
			System.out.println("Enter valid Browser type");
		}
		
	}

}
