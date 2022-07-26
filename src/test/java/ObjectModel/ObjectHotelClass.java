package ObjectModel;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectHotelClass {
	
	private WebDriver driver;
	List<WebElement> resultsHotel;
	WebDriverWait wait;
	int price[];	
	
	public ObjectHotelClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By hotelClick = By.xpath("//span[@class='chNavText darkGreyText'][normalize-space()='Hotels']");
	By countrySelect = By.xpath("//div[@class=\"hsw_inputBox selectHtlCity  \"]");
	By listCount = By.xpath("//*[@id=\"react-autowhatever-1\"]/div/ul//li//p[1]");
	By inputField = By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']");
	By dateToday = By.xpath("//div[@aria-label='Mon Jul 25 2022']");
	By enddate = By.xpath("//div[@aria-label='Thu Aug 25 2022']");
	By adult = By.xpath("//ul[@class=\"guestCounter font12 darkText\"][1]//li");
	By children = By.xpath("//ul[@class=\"guestCounter font12 darkText\"][2]//li");
	By apply = By.xpath("//button[normalize-space()='APPLY']");
	By search = By.xpath("//button[@id='hsw_search_button']");
	
	public void clickOnHotel(String country, String adults) throws InterruptedException  
	{	
		driver.findElement(hotelClick).click();		
		driver.findElement(countrySelect).click();		
		driver.findElement(inputField).sendKeys("London");		
		try
		{	
			Thread.sleep(2000);			
			List<WebElement> eles= driver.findElements(listCount);			
			for(WebElement i : eles)
			{
				if(country.contains(i.getText()))
				{
					i.click();
				}
			}
		}
		catch(StaleElementReferenceException e)
		{
			driver.findElement(dateToday).click();
			driver.findElement(enddate).click();
			List<WebElement> adultList = driver.findElements(adult);			
			for(WebElement q : adultList)
			{
				if(adults.contains(q.getText()))
				{
					q.click();
				}
			}			
			List<WebElement> childs = driver.findElements(children);			
			for(WebElement r : childs)
			{
				if("0".contains(r.getText()))
				{
					r.click();
				}
			}			
			driver.findElement(apply).click();
		}			
		driver.findElement(search).click();		
	}
	
	By results = By.xpath("//p[@id=\"hlistpg_hotel_shown_price\"]");
	
	public void resultsValidation() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		long iniitheight = (long)(js.executeScript("return document.body.scrollHeight"));		
		while(true)
		{
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			long currentheight = (long)(js.executeScript("return document.body.scrollHeight"));			
			if(iniitheight == currentheight)
			{
				break;
			}			
			iniitheight = currentheight;
		}		
		resultsHotel = driver.findElements(results);		
		System.out.println("Captured All result is :"+resultsHotel.size());
	}
	
	public void compareRate()
	{
		int j = 0;
		
		List<Integer> list_array=new ArrayList<Integer>();  
		
		for(WebElement d : resultsHotel)
		{
			String str = d.getText(),str2 = "";			
			for(int i= 0; i< str.length(); i++)
	        {
	    	    if(Character.isDigit(str.charAt(i)))
	    	    {
	    	    	str2+=str.charAt(i);
	    	    }        
	        }					
			list_array.add(Integer.parseInt(str2));			
		}		
		Collections.sort(list_array, Collections.reverseOrder());		
		int array[] = new int[2];		
		int rescount = 0;		
		for(int i: list_array)
		{	
			if(rescount < 2)
			{	
				array[rescount] = i;
			}
			else
			{
				break;
			}
			rescount++;
		}		
		System.out.println("Pricing of Top 2 hotels is");
		System.out.println("Hotel 1 is :"+ array[0]);
		System.out.println("Hotel 1 is :"+ array[1]);		
		System.out.println("***********************************");		
		if(array[0] == array[1])
		{
			System.out.println("Top 2 Hotel Rate are same");
		}
		else
		{
			System.out.println("Top 2 Hotel Rate are not same");
		}
	}
}
