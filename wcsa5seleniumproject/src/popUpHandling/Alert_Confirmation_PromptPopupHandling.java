package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Confirmation_PromptPopupHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();

		driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
		Alert al1 = driver.switchTo().alert();
		System.out.println(al1.getText());
		al.dismiss();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Alert al2 = driver.switchTo().alert();
		al2.sendKeys("yes");
		System.out.println(al2.getText());
		al2.accept();
	}

}
