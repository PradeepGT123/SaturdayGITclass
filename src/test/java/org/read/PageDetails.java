package org.read;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PageDetails {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	//Mention the path of json	
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\API\\src\\test\\resources\\apitest3.json");
	//Create object for ObjectMapper class	
		ObjectMapper mapper = new ObjectMapper();
		Root rc = mapper.readValue(file, Root.class);
		System.out.println(rc.getPage());
		System.out.println(rc.getPer_page());
		System.out.println(rc.getTotal());
		System.out.println(rc.getTotal_pages());
		ArrayList<Data> data = rc.getData();
		
		for (int i = 0; i < data.size(); i++) {
			Data data2 = data.get(i);
			System.out.println(data2.getId());
			System.out.println(data2.getEmail());
			System.out.println(data2.getFirst_name());
			System.out.println(data2.getLast_name());
			System.out.println(data2.getAvatar());
		}
		
		Support sup = rc.getSupport();
		System.out.println(sup.getUrl());
		System.out.println(sup.getText());
		
		
		
	}
	
}
