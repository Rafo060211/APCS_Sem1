/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rndm = (int)(Math.random() * 1001 + 1);
		System.out.print("Pick a number between 1 - 1000: "); 
		int inp = sc.nextInt();
		if (rndm > inp){
			System.out.print("Your number was smaller than the number. The number was " + rndm);
		}
		else if(rndm == inp){
			System.out.println("WOW!!! You were correct! the number was " + rndm);
		}
		else {
			System.out.println("Your number was larger than the number. The number was " + rndm);
		}
	}
}
