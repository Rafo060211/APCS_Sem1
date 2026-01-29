/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int rn = (int)(Math.random() * 999 + 1);
	System.out.print("Please enter a number between 1 and 1000: ");
	int input = sc.nextInt();
	
	while(true){
	if(input < rn){
	System.out.println("Your number was too low, guess again.");
	System.out.print("Please enter a number between 1 and 1000: ");
	input = sc.nextInt();
	}
	else if(input>rn){
		System.out.println("Your number was too high, guess again.");
	System.out.print("Please enter a number between 1 and 1000: ");
	input = sc.nextInt();
	}
	else if(input == rn){
	System.out.println("You got the number!!! Congrats!");
	break;
	}
	}
}
}
