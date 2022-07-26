package AllFormControl;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void methodIng()
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("file:///home/admin1/Desktop/web/form.html");
	}	
	
	@Test(priority = 1)
	public void radioButtonMethod() throws InterruptedException
	{		
		WebElement radio1 = driver.findElement(By.id("radio2"));
		
		radio1.click();	
		
		Thread.sleep(2000);
		
		WebElement radio2 = driver.findElement(By.id("radio2"));
		
		radio2.click();
	}
	
	@Test(priority = 2)
	public void checkboxButtonMethod()
	{
		WebElement checkbox = driver.findElement(By.id("check3"));
		
		checkbox.click();
	}
	
	@Test(priority = 3)
	public void selectMethod()
	{
		Select select = new Select(driver.findElement(By.id("sel1")));
		
		select.selectByVisibleText("4");
	}	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}