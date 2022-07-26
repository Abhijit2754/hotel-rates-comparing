package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvideDemo {
	
	public static WebDriver driver ;
	
	@Test(dataProviderClass = RepoClass.class, dataProvider = "userdetails")
	public void dataGetMethod(String username, String password) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		
		Thread.sleep(2000);	
		
	}
}
