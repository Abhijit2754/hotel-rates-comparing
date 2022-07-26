package com.test1;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExample {
	
	public static WebDriver driver;
	
	@Test(priority = 1)
	public void method1() 
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}
	
	@Test(priority = 2)
	public void method2()
	{
		driver.findElement(By.name("q")).sendKeys("Welcome to boostmedia");
		
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).submit();
	}
	
	@Test(priority = 3)
	public void method3()
	{
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Repeat");

		driver.findElement(By.xpath("//a[@role='button']//div[contains(text(),'Website')]")).click();
	}
	

}
