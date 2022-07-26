package AllFormControl;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ActionClassDemo {
	public static WebDriver driver ;
	
	@Test(groups = "sanity")
	public void method1()
	{
		System.out.println("First Method for santity 1");
	}
	
	@Test(groups = "sanity")
	public void method2()
	{
		System.out.println("First Method for santity 2");
	}
	
	@Test(groups = "sanity")
	public void method3()
	{
		System.out.println("First Method for santity 3");
	}
	
	
	@Test(groups = "smoke")
	public void method4()
	{
		System.out.println("First Method for Smoke 1");
	}
	
	@Test(groups = "smoke")
	public void method5()
	{
		System.out.println("First Method for Smoke 2");
	}
	
	@Test(groups = "smoke")
	public void method6()
	{
		System.out.println("First Method for Smoke 3");
	}
	
	@Test(groups = "regression")
	public void method7()
	{
		System.out.println("First Method for Regression 1");
	}
	
	@Test(groups = "regression")
	public void method8()
	{
		System.out.println("First Method for Regression 2");
	}
	
	@Test(groups = "regression")
	public void method9()
	{
		System.out.println("First Method for Regression 3");
	}
}
