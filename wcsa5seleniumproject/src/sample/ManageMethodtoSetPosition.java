package sample;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodtoSetPosition {

	public static void main(String[] args) {
		WebDriver driver=  new ChromeDriver();
		
		Point var=new Point(800,50);
		driver.manage().window().setPosition(var);
		

	}

}
