/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int [] arr){
			for(int x = 0; x < arr.length; x++){
				System.out.println(arr[x]);
			}
			
		}
		
	public static int getArrayAvarage(int [] arr){
			int y = 0;
			for(int x = 0; x < arr.length; x++){
				y += arr[x];
			}
			y = y / arr.length;
			return y;
	}
	
	public static int getArrayMax(int [] arr){
		int i = 0;
		for(int x = 0; x < arr.length; x++){
			if(arr[x] > i){
				i = arr[x];
			}
		}
		return i;
	}
	
	public static int getArrayMin(int [] arr){
		int x = Integer.MAX_VALUE;
		int i = 0;
		for (i = 0; i < arr.length; i++){
			if (arr[i] < x){
				x = arr[i];
			}
		}
			return i;
	}
	
	public static void main(String args[]) {
		int [] arr = new int[100];
		for(int x = 0; x < arr.length; x++){
			arr[x] = (int)(Math.random() * 100 + 1);
		}
		toStringArray(arr);
		System.out.println("The avarage is: " + getArrayAvarage(arr));
		System.out.println("The max is: " + getArrayMax(arr));
		System.out.println("The min is: " + getArrayMin(arr));

	}
}
