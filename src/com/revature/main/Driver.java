package com.revature.main;

import java.util.Scanner;

public class Driver {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1: Apply");
        System.out.println("2: Customer Login");
        System.out.println("3: Employee Login");
        System.out.println("4: Admin Login");
        
        int choice = input.nextInt();
        
        switch(choice) {
        case 1:
            System.out.println("Username: ");
            String username = input.next();
            System.out.println("Password: "); //make characters invisible/*
            String password = input.next();
            System.out.println("Joint account Y/N: ");
            char joint = input.next().charAt(0);
            joint = Character.toUpperCase(joint);
            boolean jointAccount = (joint == 'Y') ? true:false;
            Application app = new Application();
            app.applicationList(username, password, jointAccount);
            break;
        case 2:
            //TODO implement Customer Login
            break;
        case 3:
            //TODO implement Employee Login & create account
            break;
        case 4:
            //TODO implement admin login & create admin account
            break;
        default:
            System.out.println("Invalid option");
        }
    }
}