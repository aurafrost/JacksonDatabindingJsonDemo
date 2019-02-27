package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectMapper mapper=new ObjectMapper();
			//convert json to java
			Student student=mapper.readValue(new File("data/sample-full.json"), Student.class);
			System.out.println("First name: "+student.getfirstName());
			System.out.println("Last name: "+student.getlastName());
			Address address=student.getAddress();
			System.out.println("Street: "+address.getStreet());
			System.out.println("City: "+address.getCity());
			String[]list=student.getLanguages();
			System.out.print("Languages: ");
			for(String s:list) {
				System.out.print(s+", ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
