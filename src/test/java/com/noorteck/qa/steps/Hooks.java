package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void setUp() {
		CommonUI.openBrowser("chrome");
		ObjInitialize.initializeClassObj();
	}
@After
public void tearDown() {
	CommonUI.quitBrowser();
}
}
