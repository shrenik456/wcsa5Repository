package sample;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodtoSetSize {

	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();
		Dimension sizeDimension =new Dimension(80,30);
		driver.manage().window().setSize(sizeDimension);
		
		
     
        
        
	}

}
