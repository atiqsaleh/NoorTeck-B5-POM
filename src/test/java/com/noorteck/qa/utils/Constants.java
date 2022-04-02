package com.noorteck.qa.utils;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.pages.RegisterPage;
import com.noorteck.qa.pages.SwitchToPage;

/**
 * In this class we declare our objects that will be shared among different classes
 * @author NoorTeck
 *
 */
public class Constants {
	
	
	public static WebDriver driver;
	// declare class objects and common objects
	public static HomePage homeObj;
	public static RegisterPage registerObj;
	public static SwitchToPage switchToObj;
    public static LoginPage loginObj;
}