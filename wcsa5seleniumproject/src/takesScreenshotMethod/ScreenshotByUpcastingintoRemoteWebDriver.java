package takesScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotByUpcastingintoRemoteWebDriver {

	public static void main(String[] args) throws IOException {
		
		// upcasting from chromeDriver to Remotewebdriver 
	    RemoteWebDriver rwd= new ChromeDriver();
        rwd.manage().window().maximize();
		rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		rwd.get("https://www.orangehrm.com/");
		
		
    	File src=rwd.getScreenshotAs(OutputType.FILE);
    	File dest = new File("./screenshots/orangehrm.png");
    	Files.copy(src, dest);
		

	}

}
