package com.revature.main;

import java.util.HashMap;

public class Admin extends Employee{

        protected void deleteAccount(String usr) { //Cancel Account
            HashMap<String, Account> db = (HashMap<String, Account>) Customers.ReadObjectFromFile("Accounts.txt");
            db.remove(usr);
            Customers.WriteObjectToFile("Accounts.txt", false, db);
            System.out.println("Account " + usr + " deleted.");
    }
}
