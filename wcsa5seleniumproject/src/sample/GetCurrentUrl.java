package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String currentUrl= driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
	
	   
		
	   
	   
	 
			
		}
		
		

	}

