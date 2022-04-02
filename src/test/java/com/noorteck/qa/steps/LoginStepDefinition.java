package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends ObjInitialize {
	
	String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
	                                          
	@Given("User is on login page")
	public void user_is_on_login_page() {
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);                    
		initializeClassObj();

	}

	@When("User enters username")
	public void user_enters_username() {
     loginObj.enterUsername("admin");
	}
	@When("User enters password")
	public void user_enters_password() {
      loginObj.enterPassword("samer12345");
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
     loginObj.clickLogin();
	}

	@Then("User lands on dashboard page")
	public void user_lands_on_dashboard_page() {
     System.out.println(CommonUI.getTitle());
     CommonUI.quitBrowser();
	}


}
