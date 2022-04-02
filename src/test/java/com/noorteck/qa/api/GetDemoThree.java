package com.noorteck.qa.api;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class GetDemoThree {

	public static void main(String[] args) {

		
	    String uri = "https://api.weatherstack.com/current";
		
        int expStatuscode = 200;
		
		String expDefaultID ="id";
		String expCounty = "USA";
		
		String requestBody = "[{\"city\": \"reston\", \"state\": \" VA\"}]";
				
				
		Response response;
		response = given()
		.header("Content-Type","application/json")
        .header("Accept","application/json")
        .queryParam("auth-id", "2f828c29-285b-6168-c4c3-e8ad9e35c0f2")
        .queryParam("auth-token", "ED96x3xSRNYQKHpBxxUa")
        .queryParam("access_key", "593ac259ed84dda0039245d25820d900")
        .queryParam("query", "id")
        .queryParam("city", "Reston")
       
		
		.when()
		    .get(uri)
		.then()
		.extract()
		.response();
		// print the response
		response.prettyPrint();
		int actStatuscode = response.getStatusCode();
		
	}

}
