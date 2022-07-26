package com.test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class data {
	
	@BeforeClass
	public void method5()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void method6()
	{
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void method1()
	{
		System.out.println("Before Method");		
	}
	
	@AfterMethod
	public void method2()
	{
		System.out.println("After Method \n");
	}
	
	@Test
	public void method3()
	{
		System.out.println("Welcome to method 3");
	}
	
	@Test
	public void method4()
	{
		System.out.println("Welcome to method 4");
	}
}
