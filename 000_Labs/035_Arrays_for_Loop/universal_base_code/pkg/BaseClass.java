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
		for(int i = 0; i < 1000; i++){
			arr[i] = (int)(Math.random() * 1000);
		}
	}

	public void printNumbers() {
		for(int x = 0; x < arr.length; x++){
			System.out.println(arr[x]);
		}
	}
}

