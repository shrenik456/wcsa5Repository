package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToMaximize {

	public static void main(String[] args) {
	  
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	}


