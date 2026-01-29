/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String x = sc.nextLine();
		String y = "";
		
		while(x.indexOf(" ") != -1){
		String peanut = x.substring(0, x.indexOf(" "));
		int space = x.indexOf(" ");
		x = x.substring(space + 1);
		y = peanut + y;
		}
		System.out.println(" " + x + " " + y);
		
	}
	
}
