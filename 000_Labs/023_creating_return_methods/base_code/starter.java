/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is your base number? ");
		int first = sc.nextInt();
		System.out.println("What is your exponent number? ");
		int second = sc.nextInt();
		int ankap = pow(first, second);
		System.out.println(ankap);
		
	}
	
	public static int pow(int x, int y){
		int j = 1;
		int c = 0;
		while(y > 0){
			j = j * x;
			c = c + 1;
		}
		return j;
	}
}