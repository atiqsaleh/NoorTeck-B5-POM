package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangHRMStepDef extends ObjInitialize{

@Given("User is on OrangeHRM login page")

public void user_is_on_orange_hrm_login_page() {
	String url = "https://opensource-demo.orangehrmlive.com/";
	CommonUI.openBrowser("chrome");
	CommonUI.navigate(url);
	initializeClassObj();

}

@When("User enters username {string}")
public void user_enters_username(String username) {
	loginObj.enterUsername(username);
}

@When("User enters password {string}")
public void user_enters_password(String password) {
	loginObj.enterPassword(password);
}

@Then("User verifies page title {string}")
public void user_verifies_page_title(String title) {
	
	String actTitle = CommonUI.getTitle();
	System.out.println("Expeted Title: " + title);
	System.out.println("Actual Title: " + actTitle);
	
	CommonUI.quitBrowser();
}
@When("User enters  credentials {string} {string}")
public void user_enters_credentials(String username, String password) {
loginObj.enterUsername(username);
   loginObj.enterPassword(password);
}
}

