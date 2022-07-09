package org.login;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APITest2 {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader file = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\API\\src\\test\\resources\\apitest2.json");
		JSONParser jsonParser = new JSONParser();
		Object obj = jsonParser.parse(file);
		JSONObject jo = (JSONObject) obj;
		Object obj1 = jo.get("page");
		System.out.println(obj1);
		Object obj2 = jo.get("per_page");
		System.out.println(obj2);
		Object obj3 = jo.get("total");
		System.out.println(obj3);
		Object obj4 = jo.get("total_pages");
		System.out.println(obj4);
		Object obj5 = jo.get("data");
		JSONArray ja = (JSONArray) obj5;
		for (int i = 0; i < ja.size(); i++) {
			Object object = ja.get(i);
			JSONObject jo1 = (JSONObject) object;
			System.out.println(jo1.get("id"));
			System.out.println(jo1.get("email"));
			System.out.println(jo1.get("first_name"));
			System.out.println(jo1.get("last_name"));
			System.out.println(jo1.get("avatar"));
		}
		Object obj6 = jo.get("support");
		JSONObject jo1 = (JSONObject) obj6;
		System.out.println(jo1.get("url"));
		System.out.println(jo1.get("text"));
			
		
	}

}
