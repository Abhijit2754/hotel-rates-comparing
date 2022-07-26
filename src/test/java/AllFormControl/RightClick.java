package AllFormControl;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClick extends DriverConfigClasss{
	
	@BeforeMethod
	public void method()
	{
		super.methodDriverConfiguration();
	}
	
	@Test
	public void method1()
	{
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void methodForSelect()
	{
		driver.get("file:///home/admin1/Desktop/web/form.html");
		
		Select select = new Select(driver.findElement(By.name("selliscccct1")));
		
		select.selectByVisibleText("4");
	}
	
	@Test(enabled = false)
	public void methodforTab() throws InterruptedException
	{
		driver.get("https://google.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://facebook.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.boostmedia.in");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://dreamwall.in/");
		
		Set<String> windows = driver.getWindowHandles();
		List<String> handle = new ArrayList<String>();
		handle.addAll(windows);
		
		driver.switchTo().window(handle.get(1));
	}
	
	@Test
	public void methodforaction()
	{
		driver.get("https://demoqa.com/buttons");
		
		WebElement doubleButton = driver.findElement(By.id("doubleClickBtn"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleButton).perform();
	}
	
	@AfterMethod
	public void methodForLogout() throws InterruptedException 
	{		
		Thread.sleep(3000);
		driver.close();
	}
}
