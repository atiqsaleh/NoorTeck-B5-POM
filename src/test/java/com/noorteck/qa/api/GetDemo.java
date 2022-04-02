package com.noorteck.qa.api;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.testng.asserts.SoftAssert;
import io.restassured.path.json.JsonPath;

public class GetDemo {
	public static void main(String[] args) {

		String uri = "https://reqres.in/api/users/2";
		int expStatusCode = 200;
		String expFirstName = "Janet";
		String expLastName = "Weaver";
		// step 1  create response object and set up the request call
		Response response;
		response = given()
		.when()
		.get(uri)
		.then()
		.extract()
		.response();
		
		response.prettyPrint();// print the response body
		int actStatusCode = response.getStatusCode();//get the status code and store in variable
		System.out.println("Status Code:" + actStatusCode);
		//Once we have response from server then we need to create JsonPath obj to access fields
		JsonPath jsonpath = response.jsonPath();
		//Using JsonPathObject.getString() method we will pass the JsonPath as parameter
		String actFirstName = jsonpath.getString("data.first_name");
		String actLastName = jsonpath.getString ("data.last_name");
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actStatusCode, expStatusCode);
		softAssert.assertEquals(actFirstName, expFirstName);
		softAssert.assertEquals(actLastName, expLastName);
		
		softAssert.assertAll();
		
	}

}
/**
     Given--->  pre-condition
     ---> queryParameter
     ---> Header
     ---> Request-Body
     
      When---> Action
      ---> the type of request we are sending
      ---> Get, Post, Put, Delete
      
      Then----> OutCome
      ---> Extracting the response and assigning to response object
 */









