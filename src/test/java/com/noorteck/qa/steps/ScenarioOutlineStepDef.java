package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineStepDef extends ObjInitialize {

@Given("User is on Register Page")
public void user_is_on_register_page() {
	String url = "http://demo.automationtesting.in/Register.html";
	CommonUI.openBrowser("chrome");
	CommonUI.navigate(url);
	initializeClassObj();
}

@When("User enters firstname {string}")
public void user_enters_firstname(String firstName) {
   registerObj.enterFirstName(firstName);
}

@When("User enters lastname {string}")
public void user_enters_lastname(String lastName) {
	registerObj.enterLastName(lastName);
}

@When("User enters email {string}")
public void user_enters_email(String email) {
	registerObj.enterEmailAddress(email);
}

@When("User selects {string}")
public void user_selects(String gender) {
  System.out.println("Gender: " + gender);
}

@Then("User waits")
public void user_waits() throws InterruptedException {
	Thread.sleep(3000);
	CommonUI.quitBrowser();
  
}

}
