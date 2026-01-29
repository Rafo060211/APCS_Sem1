/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input you first number :");
		int first = sc.nextInt();
		
		System.out.println("Please input your second number :");
		int second = sc.nextInt();
		
		if (first == second){
			System.out.println("Your numbers are the same!");
		} else {
			System.out.println("Your numbers are different!");
		}
	}
}
