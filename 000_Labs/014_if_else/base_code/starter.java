/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random() * 1001 + 1);
		System.out.print("Pick a number between 1 - 1000: "); 
		int num1 = sc.nextInt();
		if (num1 > 1000){
		System.out.println("That number is too big pick another one");
		num1 = sc.nextInt();
			
		}
		if (num1 == random){
			System.out.println("WOWWWW U GOT IT RIGHT!!!!");
		}
		else{
			System.out.println("Ur wrong the number was " + random);
		}
	}
}
