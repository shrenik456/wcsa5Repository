package takesScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.grid.data.SessionRequestCapability;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotByDowncasting {

	public static void main(String[] args) throws IOException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	
	// Taking Screenshot by Downcasting  from webdriver to RemoteWebDriver 
	
	RemoteWebDriver rwd = (RemoteWebDriver) driver;
    File src =rwd.getScreenshotAs(OutputType.FILE);
    File dest = new File("./screenshots/fbLogin.png");
    Files.copy(src, dest);
		
		
	}

}
