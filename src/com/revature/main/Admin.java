package com.revature.main;

public class Admin extends Employee{
    /*
     * loadAccount map here
     * then admin has all methods for each account
     * 
     * maybe have admin approve employee accounts
     */
    
    public static Account getAccount(String username) { //so customers can use for transfer
        /*
         * TODO
         * Load hashmap
         * return db.get(username);
         */
        return null; //only used to prevent ide errors, not for production
    }
    
    private void deleteAccount(String h) { //Cancel Account
        //Load hashmap
        //db.remove(hashcode);
        //write new hashmap db to file overwriting old file
    }
}
