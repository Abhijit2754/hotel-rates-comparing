package opps.cross.browser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	WebDriver driver;	
	
	
	@BeforeMethod	
	
	public void method()
	{	String browser ="Data";
		switch(browser)
		{
			case "chrome":
				WebDriverManager.chromedriver().setup();				
				driver = new ChromeDriver();				
			    break;
			    
			case "firefox":
				WebDriverManager.firefoxdriver().setup();				
				driver = new FirefoxDriver();								
				break;				
		}				
	}
	
	@Test
	public void openUrl()
	{
		driver.get("https://www.google.com");
	}
}