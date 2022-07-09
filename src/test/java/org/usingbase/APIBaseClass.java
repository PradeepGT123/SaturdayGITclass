package org.usingbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class APIBaseClass {

	RequestSpecification reqSpec;
	Response response;

	public void addHeader(String key, String value) {
		reqSpec = RestAssured.given().header(key, value);
	}
	
	public void addHeaders(Headers headers) {
		reqSpec = RestAssured.given().headers(headers);
	}
	
	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+ "\\config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		Object object = properties.get(key);
		String value = (String) object;
		return value;
	}
	
	public void basicAuth(String username, String password) {
		reqSpec = reqSpec.auth().preemptive().basic(username, password);
	}

	public void queryParam(String key, String value) {
		reqSpec = reqSpec.queryParam(key, value);
	}

	public void pathParam(String key, String value) {
		reqSpec = reqSpec.pathParam(key, value);
	}

	public void addBody(String reqBody) {
		reqSpec = reqSpec.body(reqBody);
	}
	
	public void addBody(Object reqBody) {
		reqSpec = reqSpec.body(reqBody);
	}

	public Response requestType(String reqType, String endPoint) {
		switch (reqType) {
		case "GET":
			response = reqSpec.get(endPoint);
			break;

		case "POST":
			response = reqSpec.post(endPoint);
			break;

		case "PUT":
			response = reqSpec.put(endPoint);
			break;

		case "DELETE":
			response = reqSpec.delete(endPoint);
			break;

		default:
			break;
		}
		return response;
	}

	public int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;
	}
	
	public ResponseBody getResponseBody(Response response) {
		ResponseBody responsebody = response.getBody();
		return responsebody;
	}

	public String getasString(Response response) {
		String asString = getResponseBody(response).asString();
		return asString;
	}
	
	public String getasPrettyString(Response response) {
		String asPrettyString = getResponseBody(response).asPrettyString();
		return asPrettyString;
	}
}
