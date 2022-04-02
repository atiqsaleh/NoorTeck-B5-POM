package com.noorteck.qa.utils;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.pages.RegisterPage;
import com.noorteck.qa.pages.SwitchToPage;

public class ObjInitialize extends Constants{
	
	
	public static void initializeClassObj() {
		
		
		homeObj = new HomePage();
		registerObj = new RegisterPage();
		switchToObj = new SwitchToPage();
		loginObj = new LoginPage();
		
	}
}
