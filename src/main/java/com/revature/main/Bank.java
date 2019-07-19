package com.revature.main;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {		
		int choice=0;
		
		do {
			System.out.println("0: Register User");
			System.out.println("1: Apply for new account"); //Not yet implemente
			System.out.println("2: Customer Login");
			System.out.println("3: Employee Login"); //Not yet implemented, admin should inherit from employee class
			System.out.println("4: Exit Bank");
			
			//Get user choice
			System.out.print("\n Type your option: ");
			Scanner input = new Scanner(System.in); //Create scanner object to get user input
			 
			
			//call menuselection
			try {
				choice = input.nextInt();
				MenuSelection.redirect(choice);
			} catch (Exception e) {
				//Ignores wrong input
			}
			
		}
		while(choice != 4);


		System.out.println("\nThanks for your visit! bye!");
		
	}

}
