package takesScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class way3 {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver cDriver= new ChromeDriver();
		cDriver.manage().window().maximize();
		cDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cDriver.get("https://selenium.dev/");
		
	    RemoteWebDriver	rwd=(RemoteWebDriver)cDriver;
	    File src=cDriver.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./screenshots/selenium.jpg");
	    
	    Files.copy(src, dest);
	    
		
	}

}
