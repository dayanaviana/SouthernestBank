package com.revature.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Employee extends Application{
    
    protected void approveApplication() { //this probably shoudn't be public
         Object appList = Customers.ReadObjectFromFile("appList.txt");
         HashMap<String, Account> db = (HashMap<String, Account>) Customers.ReadObjectFromFile("accounts.txt");
         String appKey = null;
         
         for (String str: db.keySet()) {
             appKey = str;
             break; //Only need the first one, there should only ever be one
         }
         
         if (db.containsKey(appKey)) {
             System.out.println("Account Denied");
             System.exit(0);
         }
         else {
             Account acct = db.get(appKey);
             db.put(appKey, acct);
             Customers.WriteObjectToFile("Accounts.txt", false, db);
             System.out.println("Account Approved");
         }
    }
}
