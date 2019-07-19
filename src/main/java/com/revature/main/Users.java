package com.revature.main;

import java.util.Scanner;

public abstract class Users {
	private String username;
	private String password;	

	protected void register(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void register() {
		 
		//Create scanner object to get user input
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Type your username: ");
		this.username = input.nextLine();
		
		System.out.print("Type your password: ");
		this.password = input.nextLine();
		
		System.out.print("User Registered! ");
		
	}
}
