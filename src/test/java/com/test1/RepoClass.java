package com.test1;

import org.testng.annotations.DataProvider;

public class RepoClass {
	
	@DataProvider(name="userdetails")	
	public Object[][] dataProvideMethod()
	{
		Object[][] UserDetails= new Object[5][2];
		
		UserDetails[0][0] = "Admin";
		UserDetails[0][1] = "admin123";

		UserDetails[1][0] = "Admin";
		UserDetails[1][1] = "admcin123";
		
		UserDetails[2][0] = "Admcin";
		UserDetails[2][1] = "admin123";
		
		UserDetails[3][0] = "Admcin";
		UserDetails[3][1] = "admcin123";
		
		UserDetails[4][0] = "Admcin";
		UserDetails[4][1] = "admcin123";
				
		return UserDetails;
	}
}
