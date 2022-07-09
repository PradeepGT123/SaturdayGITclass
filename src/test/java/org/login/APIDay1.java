package org.login;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APIDay1 {
	
	public static void main(String[] args) throws IOException, ParseException {
	//Mention the path of JSON
		FileReader file = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\API\\src\\test\\resources\\day1.json");
	//create object for JSONParser class
		JSONParser jsonParser = new JSONParser();
	//pass the JSON file to fetch values
		Object obj = jsonParser.parse(file);
	//convert object to JSON object --- classcast
		JSONObject j = (JSONObject) obj;
	//pass the key and return the value
		Object objName = j.get("name");
		//String name = (String) objName;
		System.out.println(objName);
		Object email = j.get("email");
		System.out.println(email);
		Object phNo = j.get("phoneNo");
		System.out.println(phNo);
		
		System.out.println("BujjiTask");
	}

}
