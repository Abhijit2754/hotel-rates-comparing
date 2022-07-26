package AllFormControl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverConfigClasss {
	public static WebDriver driver;
	
	public void methodDriverConfiguration()
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}	
}
