package com.noorteck.qa.steps;

import java.util.List;
import java.util.Map;

import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class DataTableStep extends ObjInitialize {

@When("User enters data")
public void user_enters_data(DataTable dataTable) {
	//converting datatable that is coming from feature file to list of Maps
	List<Map<String, String>> listMap = dataTable.asMaps();
	
	
	for(Map<String, String>map: listMap) {
		
		
		registerObj.enterFirstName(map.get("FirstName"));
		registerObj.enterLastName(map.get("LastName"));
		
	
		System.out.println("FirstName: " + map.get("FirstName"));
		System.out.println("LastName: "+ map.get("LastName"));
		System.out.println("Email: " + map.get("Email"));
		
		System.out.println("*************************");
	}	
}
}
