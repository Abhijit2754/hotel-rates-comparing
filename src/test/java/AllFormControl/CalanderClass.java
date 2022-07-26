package AllFormControl;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalanderClass {
	
	public static WebDriver driver;
	
	@BeforeMethod	
	public void method1()
	{		
		System.out.println("*********************");
	}
	
	@Test
	public void method2() throws InterruptedException
	{	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://facebook.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://instagram.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://boostmedia.in/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://yahoo.in/");
		
		
		
		Set<String> WindowHandle = driver.getWindowHandles();
		List<String> handle = new ArrayList<String>();
		handle.addAll(WindowHandle);
		
		driver.switchTo().window(handle.get(2));
		
		driver.switchTo().window(handle.get(1));			
	}
	
	@AfterMethod
	public void method3()
	{		
		driver.quit();
		System.out.println("*****************");
	}
}
