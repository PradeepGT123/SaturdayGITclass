package org.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Delete {

	
	static RequestSpecification reqSpec;
	public static void main(String[] args) {
		
		//Initialized RestAssured class	
			reqSpec = RestAssured.given();
		//Header,Params,Auth,Body --->Header details
			reqSpec = reqSpec.header("Content-Type", "application/json");
		//Pass the request type and Endpoint
			Response response = reqSpec.delete("https://reqres.in/api/users/2");
		//Get the response code/status code	
			int statusCode = response.getStatusCode();
			System.out.println(statusCode);
		//Get the response body
			ResponseBody body = response.getBody();
		//asString
			String asString = body.asString();
			System.out.println(asString);
		//asPrettyString
			String asPrettyString = body.asPrettyString();
			System.out.println(asPrettyString);
			
		}
}
