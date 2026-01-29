/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter an interger: ");
		int uno = sc.nextInt();
		
		System.out.print("Please enter a second interger: ");
		
		int dos = sc.nextInt();
		
		System.out.println();
		
		if (uno % 2 == 0){
		System.out.println(uno + " is even!");
		}
		
		else{
		System.out.println(uno + " is odd!");
		}
		
		if (dos % 2 == 0){
		System.out.println(dos + " is even!");
		}
		
		else{
		System.out.println(dos + " is odd!");
		}
		
		System.out.println();
		
		if (uno % 2 == 0) {
			System.out.println(uno + " is divisible by 2!");
		}
		else {
			System.out.println(uno + " is NOT divisible by 2");
		}

		if (uno % 3 == 0){
			System.out.println(uno + " is divisible by 3");
		}
		else if (uno % 4 == 0){
			System.out.println(uno + " is divisible by 4");
		}
		else if ( uno % 5 == 0){
			System.out.println(uno + " is divisible by 5!");
		}
		else {
			System.out.println(uno + " isnt divisible by 3, 4, or 5");
		}
		
		System.out.println();

		if (dos % 2 == 0) {
			System.out.println(dos + " is divisible by 2!");
		}
		else {
			System.out.println(dos + " is NOT divisible by 2");
		}

		if (dos % 3 == 0){
			System.out.println(dos + " is divisible by 3");
		}
		else if (dos % 4 == 0){
			System.out.println(dos + " is divisible by 4");
		}
		else if ( dos % 5 == 0){
			System.out.println(dos + " is divisible by 5!");
		}
		else {
			System.out.println(dos + " isnt divisible by 3, 4, or 5");
		}
		
		System.out.println();
	}
}
