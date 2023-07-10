package sample;

import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchedgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		EdgeDriver driver = new EdgeDriver(); 
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		driver.close();
	}

}
