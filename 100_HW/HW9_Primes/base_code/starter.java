/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number and we'll print out every prime until that number: ");
		int input = sc.nextInt();
		printPrime(input);
		
	}
	public static boolean checkPrime(int x){
		int y = 2;
		while(x > y){
			if(x % y == 0){
				return false;
			}
			y++;
		}
		return true;
		
	}
	
	public static void printPrime(int x){
		 int y = 2;
		 
		 while (y < x){
		 	if(checkPrime(y)){
		 	System.out.println(y);
		 	}
		 	y++;
		 }
	}
}
