package sample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
		
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.instagram.com");
	String pageSource=driver.getPageSource();
	System.out.println(pageSource);
       
	}
	
	}


