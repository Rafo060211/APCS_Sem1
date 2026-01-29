/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		 int x = (int)( Math.random() * 9);
		System.out.println("A number between 0 - 9: " + x);
		
		 int y = (int)( Math.random() * 11);
		System.out.println("A number between 1 - 10: " + y);
		
		 double z = Math.random() * 1 + 2.5;
		System.out.println("A number between 2.5 and 3.5: " + z);
		
		 double a = Math.random() * (589 - 14) + 14;
		System.out.println("A double between 14 and 589: " + a);
		 
		
		
	}
}
