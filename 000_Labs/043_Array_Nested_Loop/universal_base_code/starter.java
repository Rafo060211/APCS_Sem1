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
		System.out.println("What symbol would you like to use? (not a number)");
		String sym = sc.nextLine();
		System.out.println("How many rows would you like?");
		int row = sc.nextInt();
		System.out.println("How many columbs would you like to have?");
		int columb = sc.nextInt();
		
		String [][] arr = new String [row][columb];
		
		for (int rows = 0; rows < row; rows++){
			for (int columbs = 0; columbs < columb; columbs++){
				
				arr[rows][columbs] = sym;
				System.out.print(arr[rows][columbs] + " ");
			}
			System.out.println("");
		}
		
	


		
	}
}
