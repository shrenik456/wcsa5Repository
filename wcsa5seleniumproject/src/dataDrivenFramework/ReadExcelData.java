package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-1jmsjp3/login.do");

		Flib flib = new Flib();

		for (int i = 1; i <= 5; i++) {
			String invaliUsername = flib.readExcelData(
					"C:\\Users\\SHRENIK\\Desktop\\wcsa5\\wcsa5seleniumproject\\data\\ActiTimeTestData.xlsx", "Invalid",
					1, 0);
			String invalidPassword = flib.readExcelData(
					"C:\\Users\\SHRENIK\\Desktop\\wcsa5\\wcsa5seleniumproject\\data\\ActiTimeTestData.xlsx", "Invalid",
					1, 1);

			driver.findElement(By.name("username")).sendKeys(invaliUsername);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
			

		}
	}

}
