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
	private static int nextAccountNumber = 100;
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
}
	

	// -------METHODS-------

