package TestCases;

import org.apache.logging.log4j.util.Chars;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.*;

import Config.BaseClass;
public class ScrollExa extends BaseClass {

//	@BeforeMethod
//	public void initii()
//	{
//		initilization();
//	}
//	
//	@Test
//	public void scrollmethod()
//	{
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("window.scrollTo(0,2500)");
//	}
	
	@Test
	public void scrollmethcod()
	{	        
	    String result="";
	    String str = "₹ 15,440";
	    
	    for(int i= 0; i< str.length(); i++)
        {
    	    if(Character.isDigit(str.charAt(i)))
    	    {
    	    	result+=str.charAt(i);
    	    }        
        }
	    
	    System.out.println(result);
	}
}
