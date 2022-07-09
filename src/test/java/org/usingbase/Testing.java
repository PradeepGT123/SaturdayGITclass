package org.usingbase;

import org.junit.Test;

import io.restassured.response.Response;

public class Testing extends APIBaseClass {

	@Test
	public void create() {
		addHeader("content-Type", "application/json");
		addBody("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}");
		Response post = requestType("POST", "https://reqres.in/api/users");
		int code = getStatusCode(post);
		System.out.println(code);
		String getasPrettyString = getasPrettyString(post);
		System.out.println(getasPrettyString);
	}
	@Test
	public void update() {
		addHeader("content-Type", "application/json");
	}

}
