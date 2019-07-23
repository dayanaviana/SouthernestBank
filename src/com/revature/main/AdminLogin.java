package com.revature.main;

public class AdminLogin {
    public static Admin login(String username, String pswd) {
        if (username.equals("Ben") && pswd.equals("****")) {
            System.out.println("Access Granted comment me out");
            return new Admin();
        }
        else {
            System.out.println("Access Denied");
            System.exit(0);
            return null; //used to suppress IDE error
        }
    }
}
