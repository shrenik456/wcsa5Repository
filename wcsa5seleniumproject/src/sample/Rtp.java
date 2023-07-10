package sample;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rtp {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("which browser we want to open1");
		String browserValue = sc.next();
		if (browserValue.equalsIgnoreCase("Chrome"))
			{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedrivers.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
        } else if (browservalue.equals)

	}

}
