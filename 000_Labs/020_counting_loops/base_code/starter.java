/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int starter = 0;
		int number = 0;
		System.out.println("Please enter your name.");
		String name = sc.nextLine();
		System.out.println("");
		System.out.println("Please enter an interger.");
		int limmiter = sc.nextInt();
		System.out.println("");
		while (starter < limmiter){
			System.out.println(number + ". " + name);
			
			number++;
			starter++;
		}
	}
}
