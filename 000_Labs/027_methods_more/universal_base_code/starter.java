/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		
		
	System.out.println("Welcome to the Rafo ATM!");
	System.out.println("We're going to create a bank account! What info do we know?");
	System.out.println("1 - Nothing");
	System.out.println("2 - Owner");
	System.out.println("3 - Owner and Initial Deposit");
	int in = sc.nextInt();
	sc.nextLine();
	if (in == 1){
		BankAccount x = new BankAccount();
		System.out.println("Alright! Do you want to check your cridentals? (yes/no)");
		
		String p = sc.nextLine();
		if(p.equals("yes")){
			System.out.println();
			x.checkEverything();
		}
	}
	else if(in == 2){
		System.out.println("Alright! Who is the owner of the account?");
		String n  = sc.nextLine();
		BankAccount x = new BankAccount(n);
		System.out.println("Perfect. Would you like to check your cridentals? (yes/no)");
		String p = sc.nextLine();
		if(p.equals("yes")){
			System.out.println();
			System.out.println("--- Account Info ---");
			System.out.println();
			x.checkEverything();
		}
	}
	else if(in == 3){
 m.
	}
}
}