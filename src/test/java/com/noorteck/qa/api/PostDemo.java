package com.noorteck.qa.api;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class PostDemo {

	public static void main(String[] args) {
		String uri = "https://us-zipcode.api.smartystreets.com/lookup";
		int expStatuscode = 200;
		
		String expDefaultCity ="Reston";
		String expCounty = "Faifax";
		
		String requestBody = "[{\"city\": \"reston\", \"state\": \" VA\"}]";
				
				
		Response response;
		response = given()
		.header("Content-Type","application/json")
        .header("Accept","application/json")
        .queryParam("auth-id", "2f828c29-285b-6168-c4c3-e8ad9e35c0f2")
        .queryParam("auth-token", "ED96x3xSRNYQKHpBxxUa")
        .body(requestBody)
		.when()
		    .post(uri)
		.then()
		.extract()
		.response();
		// print the response
		response.prettyPrint();
		int actStatuscode = response.getStatusCode();

	}

}
