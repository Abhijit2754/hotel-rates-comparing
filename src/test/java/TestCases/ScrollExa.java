package TestCases;

import org.apache.logging.log4j.util.Chars;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.*;

import Config.BaseClass;
public class ScrollExa extends BaseClass {

	@BeforeMethod
	public void initii()
	{
		initilization();
	}
	
	@Test
	public void scrollmethod() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,2500)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,3000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,4000)");
	}	
	
}
