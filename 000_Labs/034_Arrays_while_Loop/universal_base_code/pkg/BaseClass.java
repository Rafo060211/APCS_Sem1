/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int [] arr = new int [1000];


	public BaseClass() {
		int i = 0;
		while (i < 1000){
			arr[i] = (int)(Math.random() * 1000);
			i++;
		}
		
	}

	public void printNumbers() {
		int x = 0;
		while(x < arr.length){
			System.out.println(arr[x]);
			x++;
		}
	}
}

