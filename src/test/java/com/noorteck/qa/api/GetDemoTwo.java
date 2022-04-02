package com.noorteck.qa.api;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.testng.asserts.SoftAssert;

import io.restassured.path.json.JsonPath;
public class GetDemoTwo {

	public static void main(String[] args) {

		String uri = "https://us-zipcode.api.smartystreets.com/lookup";
		int expStatuscode = 200;
		String expDefaultCity = "Reston";
		String expCounty = "Fairfax";
		
		Response response;
		response = given()
		                 .header("Content-Type","application/json")
                         .header("Accept","application/json")
                         .queryParam("auth-id", "2f828c29-285b-6168-c4c3-e8ad9e35c0f2")
                         .queryParam("auth-token", "ED96x3xSRNYQKHpBxxUa")
                         .queryParam("city", "Reston")
                         .queryParam("zipcode", "20190")
		
		              .when()
		                 .get(uri)
		              .then()
		                 .extract()
		                 .response();
		
		// print the response
		response.prettyPrint();
		
		int actStatusCode = response.getStatusCode();
		JsonPath jsonPath = response.jsonPath();
		
		String actDefaultCity = jsonPath.getString("[0].zipcodes[0].default_city");
		
		String actCounty = jsonPath.getString("[0].zipcodes[0].county_name");
		
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actStatusCode, expStatuscode);
		softAssert.assertEquals(actDefaultCity, expDefaultCity);
		softAssert.assertEquals(actCounty, expCounty);
		
		softAssert.assertAll();
	}

}
