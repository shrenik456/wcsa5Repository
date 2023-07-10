package Locators;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class flipkart_search_product_byxpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();  //popup windows close
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).
		sendKeys("Hp laptop");   //enter the hp laptop and open the window
		
		 
		
	
	
		
		
	}		

}

	
	
	