package com.test1;

import org.testng.annotations.*;


public class TestNgPriority {
	
	@Test(priority = 1)
	public void methodp()
	{
		System.out.println("Welcome to method 1");
	}
	
	@Test (priority = 1)
	public void methoda()
	{
		System.out.println("Welcome to method 2");
	}
}
