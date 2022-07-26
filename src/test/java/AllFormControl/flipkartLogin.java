package AllFormControl;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkartLogin {
	
	public WebDriver driver ;
	
	@Test
	public void deta()
	{
		WebDriverManager.chromedriver().setup();
		
		String name = "Abhijit Paithane Data";
		
		StringBuilder name1 = new StringBuilder("Abhijit");
		
		StringBuilder dd = name1.reverse();
		
		System.out.println("Reverse is :"+dd);		
		
		
		
		
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		driver.get("https://www.flipkart.com/");
//		
//		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("Abhijit");
//		
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abhijit");
//		
//		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
//		
//		try 
//		{
//			Boolean status = driver.findElement(By.xpath("//span[contains(text(),'Please enter valid Email ID/Mobile number')]")).isDisplayed();	
//		}
//		catch(NoSuchElementException e)
//		{
//			System.out.println("Not element");
//		}
	}
}
