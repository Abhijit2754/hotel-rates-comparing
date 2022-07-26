package com.test1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class assertClass {

	@Test
	public void method()
	{
		AssertJUnit.assertEquals("data", "data");
	}
	
	@Test
	public void method2()
	{
		AssertJUnit.assertEquals("A", "A");
	}
	
	@Test
	public void method3()
	{
		
			System.out.println("Welcome to databas");
			AssertJUnit.assertEquals("Welcome to baba", "Welcome to baba");
		
	}
}
