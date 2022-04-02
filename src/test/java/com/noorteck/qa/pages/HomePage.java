package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {
	@FindBy(id = "#email")
	WebElement emailIdField;

	@FindBy(id = "#enterimg")
	WebElement enterButton;

	public  HomePage() {
		PageFactory.initElements(driver, this);
	}

	public  void enterEmailID(String emailID) {

		enter(emailIdField, emailID);
	}

	public  void clickEnter() {
		click(enterButton);
	}

}
