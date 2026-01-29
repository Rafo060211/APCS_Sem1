/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int size = (int)(Math.random() * (200-51) + 51);
		int[] arr = new int[size];
		int q = arr.length;
		int i = 0;
		int v = Integer.MAX_VALUE;
		int p = 0;
		for(int x = 0; x < arr.length; x++){
		arr[x] = (int)(Math.random() * (100 - 1) + 1);
		}
		
		for(int x = 0; x < arr.length; x++){
			if(arr[x] > i){
				i = arr[x];
			}
		}
		
		for(int x = 0; x < arr.length; x++){
		if (arr[x] < v){
			v = arr[x];
		}
	}
	
	 
	 System.out.println("---------------------------------");
	 
	for(int x = 0; x < arr.length; x++){
	System.out.print(arr[x] + " ");
	}
	
	for(int x = 0; x < arr.length; x++){
		p = p + arr[x];
	}

	System.out.println("");
	System.out.println("---------------------------------");
		
	System.out.println("There are " + q + " number of elements");
	System.out.println("The maximum of " + q + " random numbers is: " + i);
	System.out.println("The minimum of " + q + " random numbers is: " + v);
	System.out.println("The avarage of " + q + " random numbers is: " + (p / arr.length));
	}
}
