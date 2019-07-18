package com.revature.main;

public class MenuSelection {
	public void redirect(int input) { //call method based off menu choice
		switch(input) {
		case 1:
			//Application
			break;
		case 2:
			//Customer Login
			break;
		case 3:
			//Employee Login
			break;
		default:
			System.out.println("Invalid option");
		}
	}

}
