package com.revature.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Customers {
	private static final String filepath = "appList.txt";
	private static Map<String, Account> db;

	//Must Instaciate Customer to load file
	public Customers() {
		super();
		//load file into HASH-MAP
		db = (HashMap)ReadObjectFromFile(filepath);
	}
	
	//To Test functionalities
	public static void main(String[] args) {
		Customers cu = new Customers();
		System.out.println(cu.getAllCustomers().toString());
	}

	public Set<String> getAllCustomers(){
		return db.keySet();
	}
	
	//delete Customer and his account
	public boolean deleteCustomer(String name) {
		return db.remove(name,db.get(name));
	}
	
	//Return ACCOUNT of a given Customer
	public Account getCustomerAccount(String name) {
		
		return db.get(name);
	}
	
	//Return TRUE if Customer exists
	public boolean checkCustomer(String name) {
		return db.containsKey(name);
	}

	// Reads from file and Returns ANY object
	public static Object ReadObjectFromFile(String filepath) {

		try {
			FileInputStream fileStream = new FileInputStream(filepath);
			ObjectInputStream objectStream = new ObjectInputStream(fileStream);

			Object obj = objectStream.readObject();

			// The Object has been read from the file"
			objectStream.close();
			return obj;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
