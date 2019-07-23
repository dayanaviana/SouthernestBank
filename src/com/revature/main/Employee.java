package com.revature.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee extends Application{
    /*
     * verify login from an employee map
     * if login successful then call approveApplication()
     * else sysout "Access Denied";
     */
    //call approveApplication();
    
    protected void approveApplication() { //this probably shoudn't be public
        FileInputStream fin1 = null; //appList
        FileOutputStream fout = null;
        try {
            fin1 = new FileInputStream("appList.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            ObjectInputStream sin = new ObjectInputStream(fin1);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        

        
        try {
            fout = new FileOutputStream("Accounts.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            ObjectOutputStream sout = new ObjectOutputStream(fout);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        //Start loading in Account map
        /*
         * fin1.close();
         * fout.close();
         * sin.close();
         * sout.close();
        */
        
        /*
         * load in Accounts map
         * if key exists, deny //sysout denied
         * else approve and add to Accounts map
         * & rewrite (overwriting) accounts map to file
         */
        
        
        
    }
}
