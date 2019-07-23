package com.revature.main;

import java.util.HashMap;

public class Admin extends Employee{

        protected void deleteAccount(String usr) { //Cancel Account
            HashMap<String, Account> db = (HashMap<String, Account>) Customers.ReadObjectFromFile(Driver.ACCOUNTLISTFILE);
            db.remove(usr);
            Customers.WriteObjectToFile(Driver.ACCOUNTLISTFILE, false, db);
            System.out.println("Account " + usr + " deleted.");
    }
}
