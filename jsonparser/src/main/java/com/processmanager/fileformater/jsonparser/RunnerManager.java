package com.processmanager.fileformater.jsonparser;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RunnerManager {
	public static void main(String[] args) {
		getNameMethod2();
	}
	public static void getNameMethod2() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			// JSON from file to Object
			//mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
			Books obj = mapper.readValue(new File("book.json"), Books.class);
			System.out.println("AAAA ::: " + obj.toString());
			for(Book book:obj.getBooks()) {
				System.out.println("ISBN number ::: "+book.toString());
			}
			// JSON from String to Object
			//Book obj1 = mapper.readValue(jsonInString, Book.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void getNameMethod1() {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "{\"name\" : \"mkyong\"}";
		try {
			// JSON from file to Object
			Staff obj = mapper.readValue(new File("//home//psingaram//home2k19//file.json"), Staff.class);
			System.out.println("AAAA ::: " + obj.toString());
			// JSON from String to Object
			Staff obj1 = mapper.readValue(jsonInString, Staff.class);
			System.out.println("dfdjfddjf ::: " + obj1.toString());
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getNameMethod() {
	  
	  String json = "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"alias\":\"Jay\"," +
	  "\"age\":29,\"address\":{\"street\":\"100 Elm Way\",\"city\":\"Foo City\"," +
	  "\"state\":\"NJ\",\"zipCode\":\"01234\"},\"isMale\":true}"; 
	  ObjectMapper mapper = new ObjectMapper(); Person johnDoe; 
	  try {
	      mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
		  johnDoe = mapper.readValue(json, Person.class);
		  System.out.println(johnDoe); 
	  } catch (IOException e) {
		  e.printStackTrace();
		  }
	  }
}
