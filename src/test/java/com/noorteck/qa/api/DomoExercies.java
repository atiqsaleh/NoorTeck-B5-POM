package com.noorteck.qa.api;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.testng.asserts.SoftAssert;

import io.restassured.path.json.JsonPath;
public class DomoExercies {

	public static void main(String[] args) {

		String uri = "https://api.weatherstack.com/current";
		
		int expStatuscode = 200;
		
		String exptimezone = "EST";
		String expQuery = "Reston,USA";
		
		Response response;
		response = given()
		                 .header("Content-Type","application/json")
                         .header("Accept","application/json")
                         .queryParam("access_key", "593ac259ed84dda0039245d25820d900")                         
                         .queryParam("query", "Reston")
		
		                 .when()
		                 .get(uri)
		                 .then()
		                 .extract()
		                 .response();
		
		// print the response
		response.prettyPrint();
		
		int actStatusCode = response.getStatusCode();
		// create JsonPath to get the response
		JsonPath jsonPath = response.jsonPath();
		
		String actQuery = jsonPath.getString("request.query");
		
		String actTimezone = jsonPath.getString("location.timezone_id");
		
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actStatusCode, expStatuscode);
		softAssert.assertEquals(actQuery, expQuery);
		softAssert.assertEquals(actTimezone, exptimezone);
		
		
		softAssert.assertAll();
	}

}