package com.revature.main;

public class SubMenu {
    //Used after login is successful
    public static void CustomerMenu(Account account) {
        System.out.println("1: Deposit");
        System.out.println("2: Withdraw");
        System.out.println("3: View Balance");
        int choice = 0;
        double amt = 0;
        do {
            choice = Driver.input.nextInt();
            switch(choice) {
            case 1:
                System.out.print("Deposit Amount: $");
                amt = Driver.input.nextDouble();
                account.deposit(amt);
                break;
            case 2:
                System.out.print("Withdrawal Amount");
                amt = Driver.input.nextDouble();
                account.withdraw(amt);
                break;
            case 3:
                account.getBalance();
                break;
            default:
                System.out.println("Please see teller for assistance");
                System.exit(0);
            }
        }while(choice>0 && choice <4); //As long as they chose a valid option before
    }
    
    public static void AdminSubMenu(Admin admin) {
        Customers c = new Customers();
        System.out.println("Customer username of Account");
        String get = Driver.input.nextLine(); //Consume /n of previous sysout
        get = Driver.input.nextLine();
        Account account = c.getCustomerAccount(get);
        System.out.println("1: Deposit");
        System.out.println("2: Withdraw");
        System.out.println("3: View Balance");
        System.out.println("4: Transfer"); //TODO
        System.out.println("5: Approve Applications");
        int choice = 0;
        double amt = 0;
        do {
            choice = Driver.input.nextInt();
            switch(choice) {
            case 1:
                System.out.print("Deposit Amount: $");
                amt = Driver.input.nextDouble();
                account.deposit(amt);
                break;
            case 2:
                System.out.print("Withdrawal Amount");
                amt = Driver.input.nextDouble();
                account.withdraw(amt);
                break;
            case 3:
                account.getBalance();
                break;
            case 4:
                //TODO
                System.out.println("Username of Account you are transferring to");
                Account toAccount = c.getCustomerAccount(Driver.input.nextLine());
                break;
            case 5:
                admin.approveApplication();
            default:
                System.out.println("Please do this manually at this time");
                System.exit(0);
            }
        }while(choice>0 && choice <6); //As long as they chose a valid option before
    }
}