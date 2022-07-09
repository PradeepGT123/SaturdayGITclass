package org.login;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APITest1 {
	
	public static void main(String[] args) throws IOException, ParseException {
	FileReader file = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\API\\src\\test\\resources\\apitest1.json");
	JSONParser jsonParser = new JSONParser();
	Object obj = jsonParser.parse(file);
	JSONObject jo = (JSONObject) obj;
	Object obj1 = jo.get("data");
	JSONObject jo1 = (JSONObject) obj1;
	System.out.println(jo1.get("id"));
	System.out.println(jo1.get("email"));
	System.out.println(jo1.get("first_name"));
	System.out.println(jo1.get("last_name"));
	System.out.println(jo1.get("avatar"));
	Object obj2 = jo.get("support");
	JSONObject jo2 = (JSONObject) obj2;
	System.out.println(jo2.get("url"));
	System.out.println(jo2.get("text"));
	
	}
}
