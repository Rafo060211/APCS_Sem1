/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------\
	String accOwner;
	int accNumber;
	double accBalance;
	boolean isActive;
	// -------CONSTRUCTORS-------
	private static int nextAccountNumber = (int)(Math.random() * (1000-50) + 50);
	
	public BankAccount() {
		accOwner = "unknown";
		accNumber = nextAccountNumber;
		nextAccountNumber++;
		accBalance = 0;
		isActive = true;
	}
	public BankAccount(String owner) {
		accOwner = owner;
		accNumber = nextAccountNumber;
		nextAccountNumber++;
		accBalance = 0;
		isActive = true;
	}
	public BankAccount(String owner, int deposit) {
		accOwner = owner;
		accNumber = nextAccountNumber;
		nextAccountNumber++;
		accBalance = deposit;
		isActive = true;
	}
	
	// -------METHODS-------
	
	
	public void checkEverything(){
		System.out.println("Account owner: " + accOwner);
		System.out.println("Account balance: " + accBalance);
		System.out.println("Account number: " + accNumber);
		System.out.println("Account activity: " + isActive);
	}
	
	public void checkBalance(){
		System.out.println(accBalance);
	}
	
}