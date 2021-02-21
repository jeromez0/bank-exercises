package com.exercises.bank;

import java.util.Scanner;

class Menu {

	Scanner scanner = new Scanner(System.in);
	String customerName;
	String emailID;

	public void showMenu() {
		System.out.println("Welcome to the CryptoBank!");
		System.out.print("Enter a name: ");
		this.customerName = this.scanner.next();
		System.out.print("Enter your email address please: ");
		this.emailID = scanner.next();
		BankAccount bank = new BankAccount(this.customerName, this.emailID);
		this.userInput(bank);
		scanner.close();
	}

	private void userInput(BankAccount bank) {
		char option = '\0';
		do {
			System.out.println("\n=====================================");			
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. Check Customer Details");
			System.out.println("E. Previous Transaction");
			System.out.println("Q. Exit");
			System.out.println("=====================================");
			System.out.print("Enter an option: ");
			option = this.scanner.next().charAt(0);
			System.out.println("\n");

			switch (option) {
			case 'A':
				System.out.println("----------------------");
				System.out.println("Balance = $" + bank.balance);
				System.out.println("----------------------");
				break;
			case 'B':
				System.out.println("----------------------");
				System.out.print("Enter an amount to deposit: ");
				int amount = scanner.nextInt();
				bank.deposit(amount);
				break;
			case 'C':
				System.out.println("----------------------");
				System.out.print("Enter an amount to withdraw: ");
				int amount2 = scanner.nextInt();
				bank.withdraw(amount2);
				break;
			case 'D':
				System.out.println("----------------------");
				bank.getCustomerDetails();
				System.out.println("----------------------");
				break;
			case 'E':
				System.out.println("----------------------");
				bank.getPreviousTransaction();
				System.out.println("----------------------");
				break;
			case 'Q':
				break;
			default:
				System.out.println("Invalid option; please try again");
			}
		} while (option != 'Q');
		System.out.println("Thank you for using our services");
	}
}
