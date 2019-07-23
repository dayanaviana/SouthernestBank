package com.revature.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Customers {
	private static Map<String, Account> db = (HashMap)ReadObjectFromFile(Driver.ACCOUNTLISTFILE);;

	//Must Instantiate Customer to refresh
	public Customers() {
		super();
		//load file into HASH-MAP
		db = (HashMap)ReadObjectFromFile(Driver.ACCOUNTLISTFILE);
	}
	
	//To Test functionalities
	//Move to tests package
	public static void main(String[] args) {
		Customers cu = new Customers();
		System.out.println(cu.getAllCustomers().toString());
	}

	public Set<String> getAllCustomers(){
		return db.keySet();
	}
	
	public static void refreshDB() {
	    db = (HashMap)ReadObjectFromFile(Driver.ACCOUNTLISTFILE); 
	}
	
	//delete Customer and his account
	public boolean deleteCustomer(String name) {
		return db.remove(name,db.get(name));
	}
	
	//Return ACCOUNT of a given Customer
	public static Account getCustomerAccount(String name) {
		
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
	
	public static void WriteObjectToFile(String filepath, boolean append, Object obj) {

        try {
            FileOutputStream fileStream = new FileOutputStream(filepath, append);
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);

            objectStream.writeObject(obj);

            // The Object has been read from the file"
            objectStream.close();
            return;

        } catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
    }
}
