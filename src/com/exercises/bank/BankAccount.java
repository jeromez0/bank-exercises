package com.exercises.bank;

public class BankAccount {

	int accountNumber = 123456789;
	double balance = 500.0;
	String customerName;
	String emailAddress;
	String phoneNumber = "555-555-5555";
	double previousTransaction;		
			
	BankAccount(String cname, String email) {
		this.customerName = cname;
		this.emailAddress = email;
	}

	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	void withdraw(int amount) {
		if (amount != 0) {
			if (balance - amount > 0) {
				balance = balance - amount;
				previousTransaction = -amount;
			} else {
				System.out.println("Invalid withdrawal");
			}
		} else if (amount == 0)
			System.out.println("Account balance is at 0");
	}
	
	void getCustomerDetails() {
		System.out.println("\n*****");
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Customer Email: " + this.emailAddress);
		System.out.println("Customer Phone Number: " + this.phoneNumber);
		System.out.println("Customer Account Number: " + this.accountNumber);
		System.out.println("*****\n");
	}

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occured");
		}
	}
}
