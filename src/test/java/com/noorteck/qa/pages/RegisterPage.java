package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class RegisterPage extends CommonUI {

	@FindBy(css = ".form-control.ng-pristine.ng-untouched.ng-invalid.ng-invalid-required")
	WebElement firstNameField;

	@FindBy(css = "#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input")
	WebElement lastNameField;

	@FindBy(css = "#eid > input")
	WebElement emailAddressField;

	@FindBy(xpath = "//*[@ng-model='Phone']")
	WebElement PhoneField;

	@FindBy(xpath = "//*[@value = 'Male']")
	WebElement genderMaleRadio;

	@FindBy(id = "countries")
	WebElement countryDropdown;

	@FindBy(id = "firstpassword")
	WebElement passwordField;

	@FindBy(id = "secondpassword")
	WebElement confirmPasswordField;

	@FindBy(name = "signup")
	WebElement signUpButton;

	@FindBy(id = "Button1")
	WebElement refreshButton;

	public RegisterPage() {
		PageFactory.initElements(driver, this);

	}

	public void enterFirstName(String firstName) {

		enter(firstNameField, firstName);
	}

	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);
	}

	public void enterEmailAddress(String email) {
		enter(emailAddressField, email);
	}

	public void enterPhoneNumber(String Phone) {
		enter(PhoneField, Phone);

	}

	public void clickGender() {
		click(genderMaleRadio);
	}

	public void clickSingUp() {
		click(signUpButton);
	}

	public void clickRefreshButton() {
		click(refreshButton);
	}

}
