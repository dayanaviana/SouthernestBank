package com.revature.main;
//import java.math.BigDecimal; //better precision especially in financial app

public class Account {
	private double balance = 0.00;
	
	public void deposit(double depositamt) {
		if (depositamt > 0) { //Make sure they are not depositing a negative number
			this.balance += depositamt;
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	public void withdraw(double withdrawamt) {
		if (withdrawamt < 0) {
			System.out.println("Invalid amount"); //Make sure number is not negative
			return; //exit method
		}
		else if (withdrawamt > this.balance) {
			System.out.println("NSF"); //Insufficient funds
		}
		else {
			this.balance -= withdrawamt; //withdraw requested amount
		}
	}
}