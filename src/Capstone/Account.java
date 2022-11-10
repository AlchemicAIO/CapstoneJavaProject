package Capstone;

public abstract class Account implements InterestRate {
	// List common properties for savings and checking accounts
	
	// Constructor to set base properties and initialize the account
	public Account(String name) {
		System.out.print("NEW ACCOUNT: ");
		System.out.println("NAME: " + name);
	}
	
	// List common methods
	
}
