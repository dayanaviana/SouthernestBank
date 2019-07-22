package com.revature.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Application implements Serializable {
    
    private static final long serialVersionUID = -4053030731958421013L;

    //Only Employee class should be able to approve/deny applications
    public void applicationList(String username, String pswd, boolean jointAccount) {
        //Write to file;
        Account application = new Account();
        String id = username+pswd.hashCode();
        application.setJointAccount(jointAccount);
        Map<String, Account> db = new HashMap<>();
        //load in map too
        db.put(id, application); //add id:account into hashmap
        
        
        try {
            FileOutputStream fout = new FileOutputStream("appList.txt");
            ObjectOutputStream sout = new ObjectOutputStream(fout);
            sout.writeObject(db);
            sout.close();
            fout.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
    }
}
    
    