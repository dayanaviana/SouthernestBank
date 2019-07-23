package com.revature.main;

import java.io.Serializable;

//import java.math.BigDecimal; //better precision especially in financial app

public class Account implements Serializable{ //map each instance to a CustomerID
	//put id in separate class of hashmap stored in a file, then load that instance into memory
	private double balance = 0.00;
	private boolean jointAccount;
	
	//Should probably switch these to interfaces
	protected void deposit(double depositamt) {
		if (depositamt > 0) { //Make sure they are not depositing a negative number
			this.balance += depositamt;
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	
	protected void withdraw(double withdrawamt) {
		if (withdrawamt < 0) {
			System.out.println("Invalid amount"); //Make sure number is not negative
			System.exit(0); //exit method
		}
		else if (withdrawamt > this.balance) {
			System.out.println("NSF"); //Insufficient funds
			System.exit(0);
		}
		else {
			this.balance -= withdrawamt; //withdraw requested amount
		}
		
	
	}
	
	protected void getBalance() {
		System.out.println(this.balance);
	}
	
	protected void setJointAccount(boolean arg) {
	    this.jointAccount = arg;
	}
	
	protected void getIsJointAccount(boolean arg) {
	    System.out.println(jointAccount);
	}
	
	protected void transfer(String user, double amt) {
	    Account toAccount = Customers.getCustomerAccount(user);
	    this.withdraw(amt);
	    toAccount.deposit(amt);
	}
}