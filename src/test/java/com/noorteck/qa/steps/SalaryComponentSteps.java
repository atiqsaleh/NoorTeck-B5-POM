package com.noorteck.qa.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalaryComponentSteps {

@Given("User is on log in page")
public void user_is_on_log_in_page() {
     
    
}

@When("User enters {string} , {string}")
public void user_enters(String string, String string2) {
  //1
}

@When("User clicks Admin menu")
public void user_clicks_admin_menu() {
  //1
}

@When("User clicks Job menu")
public void user_clicks_job_menu() {
   //2
}

@When("User clicks Salary Components")
public void user_clicks_salary_components() {
    //3
}

@Then("User verifies the page title {string}")
public void user_verifies_the_page_title(String string) {
   
}

@When("User clicks plus  icon")
public void user_clicks_plus_icon() {
    //4
}

@When("User enters component name {string}")
public void user_enters_component_name(String string) {
   //2
}

@When("User clicks type {string} , {string} , {string}")
public void user_clicks_type(String string, String string2, String string3) {
 //5
}

@When("User clicks save button")
public void user_clicks_save_button() {
   //6
}

@Then("verify successful message {string}")
public void verify_successful_message(String string) {
   
}

@When("User clicks edit icon of the component name {string}")
public void user_clicks_edit_icon_of_the_component_name(String string) {
   //7
}

@When("User clicks {string}")
public void user_clicks(String string) {
 //8
}

@When("verify the message {string}")
public void verify_the_message(String string, io.cucumber.datatable.DataTable dataTable) {
  
   
}




}
