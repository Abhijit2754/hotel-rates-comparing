package TestCases;

import org.testng.annotations.*;
import Config.BaseClass;
import ObjectModel.ObjectHotelClass;

public class HotelTestCase extends BaseClass {

	@BeforeMethod
	public void init()
	{
		initilization();
	}
	
	@Test
	public void CompareHotelPrice() throws InterruptedException 
	{
		ObjectHotelClass obj = new ObjectHotelClass(driver);		
		obj.clickOnHotel("London, United Kingdom","2");
		obj.resultsValidation();
		obj.compareRate();
	}	
}
