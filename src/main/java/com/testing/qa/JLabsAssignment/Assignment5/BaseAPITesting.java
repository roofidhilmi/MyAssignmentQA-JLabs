package com.testing.qa.JLabsAssignment.Assignment5;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseAPITesting extends UsersAPI {
	String baseURL = "https://api-staging-builder.engineer.ai";
	String tokenSignUp;

	RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri(baseURL).setContentType(ContentType.JSON)
			.build().log().all();
	RequestSpecification loginJsonSpec;

	@BeforeTest
	public void signUp() {

		String payload = "{\r\n" + "   	 \"user\":{\r\n" + "      \"first_name\":\"" + getFirstName() + "\"" + ","
				+ "      \"last_name\":\"" + getLastName() + "\"" + "," + "      \"email\":\"" + getEmail() + "\"" + ","
				+ "      \"password\":\"+62-" + getPassword() + "\"" + "," + "      \"user_type\":\"User\",\r\n"
				+ "      \"currency_id\":2\r\n" + "   }\r\n" + "}";

		Response responseSignUp = given().spec(commonJsonSpec).body(payload).when().post("/users");
		tokenSignUp = responseSignUp.jsonPath().get("user.authtoken");
		System.out.println(tokenSignUp);
		assertEquals(responseSignUp.statusCode(), 200);

		loginJsonSpec = new RequestSpecBuilder().setBaseUri(baseURL).setContentType(ContentType.JSON)
				.addHeader("authtoken", tokenSignUp).build().log().all();
	}
}
