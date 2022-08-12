package com.testing.qa.TugasAPI.BasePages;

import com.testing.qa.TugasAPI.Routes.RoutesAPI;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserEndpoints {

	public static Response createUser(String payload) {
		RestAssured.baseURI = RoutesAPI.base_uri;
		RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri(RoutesAPI.base_uri)
				.setContentType(ContentType.JSON).setAccept(ContentType.JSON).setBody(payload).build().log().all();

	}

	public static Response readUser(String userName)

	{

		RestAssured.baseURI = RoutesAPI.base_uri;

		Response response = RestAssured.

				given().pathParam("username", userName).

				when().get(RoutesAPI.get_put_delete_uri);

		return response;

	}

	public static Response updateUser(String userName, String payload)

	{

		RestAssured.baseURI = RoutesAPI.base_uri;

		Response response = RestAssured.

				given().contentType(ContentType.JSON).accept(ContentType.JSON).

				pathParam("username", userName).body(payload).

				when().put(RoutesAPI.get_put_delete_uri);

		return response;

	}

}
