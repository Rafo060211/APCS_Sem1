/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int [10];
		int x = 0;
		int y = 9;
		while (x < 10){
			arr[x] = y;
			x++;
			y--;
		}

		int t = 0;
		int q = 0;
		
		while(t < 10){
			System.out.println(arr[q]);
			t++;
			q++;
		}
		
	}
}
