package org.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class SingleUser {

	public static void main(String[] args) {
		
		//Initialized RestAssured class	
			RequestSpecification reqSpec = RestAssured.given();
		//Header,Params,Auth,Body --->Header details
			RequestSpecification header = reqSpec.header("Content-Type", "application/json");
		//Query param
			RequestSpecification pathParam = header.pathParam("Hi", "2");
		//Pass the request type and Endpoint
			Response response = pathParam.get("https://reqres.in/api/users/{Hi}");
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
