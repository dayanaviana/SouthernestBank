package com.revature.main;

import java.util.HashMap;
public class Temp extends Admin{
    public static void main(String[] args) {
        /* Init write Accounts
        HashMap db = new HashMap();
        db.put("Temp", new Account());
        Customers.WriteObjectToFile("Accounts.txt", false, db);
        */
        
        //Make sure we can read in hashmap
        HashMap<String, Account> applist = (HashMap<String, Account>) Customers.ReadObjectFromFile(Driver.ACCOUNTLISTFILE);
        System.out.println(applist);
        Account a = applist.get("anna");
        a.deposit(1);
        //Driver.db.replace("anna", a);
        Customers.WriteObjectToFile(Driver.ACCOUNTLISTFILE, false, applist);
        applist = (HashMap<String, Account>) Customers.ReadObjectFromFile(Driver.ACCOUNTLISTFILE);
        a = applist.get("anna");
        a.getBalance();
        //need to replace key, value in hashmap
        /*
         * Make sure we can delete accounts
        Admin admin = new Admin();
        admin.deleteAccount("a");
        admin.deleteAccount("b");
        HashMap acctList = (HashMap) Customers.ReadObjectFromFile("Accounts.txt");
        System.out.println(acctList);
        */
    }
}
