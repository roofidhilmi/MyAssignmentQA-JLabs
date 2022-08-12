package com.testing.qa.JLabsAssignment.Assignment5;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class APITestAfterRefactor extends BaseAPITesting {

	@Test
	public void getNewUsersAPI() {
		Response responseNewUser = given().spec(loginJsonSpec).when().get("/user");
		System.out.println(responseNewUser);
		assertEquals(responseNewUser.statusCode(), 200);
	}

	@Test
	public void ConfigAPI() {
		Response responseUser = given().spec(commonJsonSpec).when().get("/help");

		assertEquals(responseUser.statusCode(), 404);
	}

}
