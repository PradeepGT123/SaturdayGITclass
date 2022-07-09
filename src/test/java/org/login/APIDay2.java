package org.login;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APIDay2 {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader file = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\API\\src\\test\\resources\\day2.json");
		JSONParser jsonParser = new JSONParser();
		Object obj = jsonParser.parse(file);
		JSONObject jd = (JSONObject) obj;
		Object objName = jd.get("name");
		//String name = (String) objName;
		System.out.println(objName);
		Object objEmail = jd.get("email");
		System.out.println(objEmail);
		Object objEmp = jd.get("empDetails");
		JSONArray jsonArray = (JSONArray) objEmp;
		for (int i = 0; i < jsonArray.size(); i++) {
			Object objArray = jsonArray.get(i);
			JSONObject details = (JSONObject) objArray;
			System.out.println(details.get("firstName"));
			System.out.println(details.get("address"));
			System.out.println(details.get("course"));
		}
		
	}
}
