package com.testing.qa.TugasAPI.Runner;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.testing.qa.TugasAPI.UsersAPI;
import com.testing.qa.TugasAPI.BasePages.UserEndpoints;

import io.restassured.response.Response;

public class RunnerAPI {

	Faker faker;
	UsersAPI usersPayload;

	@BeforeMethod
	public void signUp() {

		System.out.println("*****************USERNAME UNDER TEST**********************************");
		faker = new Faker();
		usersPayload = new UsersAPI();
		usersPayload.setFirstName(faker.name().firstName());
		usersPayload.setLastName(faker.name().lastName());
		usersPayload.setEmail(faker.internet().safeEmailAddress());
		usersPayload.setPassword(faker.internet().password(5, 10));
		usersPayload.setPhonenumber(faker.phoneNumber().cellPhone());
		usersPayload.setUserType("User");
		usersPayload.setCurrencyId(2);
		System.out.println("Some Random user genereated by Faker:\t" + usersPayload.getFirstName());
		System.out.println("**********************************************************************");

	}

	@Test
	public void postUserAPI() {
		Map<String, Object> bodyParams = new HashMap<String, Object>();
		bodyParams.put("firstName", usersPayload.getFirstName());
		bodyParams.put("lastName", usersPayload.getLastName());
		bodyParams.put("email", usersPayload.getEmail());
		bodyParams.put("password", usersPayload.getPassword());
		bodyParams.put("phone_number", "+62-8192345678");
		bodyParams.put("user_type", "User");
		bodyParams.put("currency_id", 2);
		String payload = new Gson().toJson(bodyParams);

		Response response = UserEndpoints.createUser(payload);
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);

		Assert.assertTrue(response.getStatusLine().contains("OK"));

//		Response responseCreate = given().spec(commonJsonSpec).body(payload).when().post("/users");
//		tokenSignUp = responseCreate.jsonPath().getString("user.authtoken");
//		System.out.println(tokenSignUp);
	}
}
