package org.usingbase;

import org.junit.Test;

import io.restassured.response.Response;

public class Delete extends APIBaseClass {

	@Test
	public void deleteUser() {
	//Header	
		addHeader("content-Type", "application/json");
	//Pass the endpoint
		Response response = requestType("DELETE", "https://reqres.in/api/users/2");
		int code = getStatusCode(response);
		System.out.println(code);
		String getasPrettyString = getasPrettyString(response);
		System.out.println(getasPrettyString);
		
	}
	
}
