/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers to create a range for your random number"); 
		System.out.println("Please enter an interger: ");
		
		int num1 = sc.nextInt();
		
		System.out.println("Please enter another integer (bigger than the first: ");
		
		int num2 = sc.nextInt();
		
		if (num2 <= num1){
			System.out.println("2nd input was not BIGGER than the first input, please enter another number: ");
		 num2 = sc.nextInt();
		}
		
		System.out.println("Your range iS " + num1 + "to " + num2 + "!");
		
		System.out.println("Here are 5 numbers generated in that range.");
		
		int num3 = (int)(Math.random() * (num2 - num1) + num1);
		int num4 = (int)(Math.random() * (num2 - num1) + num1);
		int num5 = (int)(Math.random() * (num2 - num1) + num1);
		int num6 = (int)(Math.random() * (num2 - num1) + num1);
		int num7 = (int)(Math.random() * (num2 - num1) + num1);
		
		System.out.println(num3 + ", " + num4  + ", " + num5  + ", " + num6 + ", " + num7 + ", ");

		
		
		
		
		
	}
}
