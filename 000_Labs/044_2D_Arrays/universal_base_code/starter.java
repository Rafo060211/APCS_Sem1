/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
	int x = 0;
	
	int [][] arr = new int [3][3];
	
	arr[0][0] = 1;
	arr[0][1] = 2;
	arr[0][2] = 3;
	arr[1][0] = 1;
	arr[1][1] = 2;
	arr[1][2] = 3;
	arr[2][0] = 1;
	arr[2][1] = 2;
	arr[2][2] = 3;

	 x = x + arr[0][0] + arr[0][1] + arr[0][2] + arr[1][0] + arr[1][1] + arr[1][2] + arr[2][0] + arr[2][1] + arr[2][2];
	System.out.println("the avarage of my array is " + (x/9));
	
	
	


		
	}
}
