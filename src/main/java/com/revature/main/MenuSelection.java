package com.revature.main;

public class MenuSelection {
	
	//static: can be called directly, 
	//instead of implementing one object type MenuSelection
	static void redirect(int input) { //call method based off menu choice
		switch(input) {
		case 0:
			//Register Customer
			Customer cu = new Customer();
			cu.register();			
			break;
		case 1:
			//Application
			break;
		case 2:
			//Customer Login
			break;
		case 3:
			//Employee Login
			break;
		case 4:
			//Exit
			return;
		default:
			System.out.println("Invalid option");
		}
	}

}
