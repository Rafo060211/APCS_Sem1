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
		System.out.println("Enter how many rows you would like");
		int row = sc.nextInt();
		while(row <= 0){
			System.out.println("Thats an invalid number, please try again");
			row = sc.nextInt();
		}
		
		System.out.println("Great, now choose how many columbs you would like.");
		int columb = sc.nextInt();
		while(columb <= 0){
			System.out.println("Thats an invalid number, please try again");
			 columb = sc.nextInt();
		}
		int [][] arr = new int [row][columb];
		
		int x = 0;
	
		for (int rows = 0; rows < arr.length; rows++){
			for (int columbs = 0; columbs < arr[0].length; columbs++){
				arr[rows][columbs] = (int)(Math.random() * (10-1) + 1);
				System.out.print(arr[rows][columbs] + " ");
				
				x = x + arr[rows][columbs];
			}
			System.out.println("");
		}
	
		System.out.println("Choose which row you would like to get the avarage of");
		int chosenRow = sc.nextInt();
		
		rowAvarage(arr, (chosenRow - 1));
		
		int z = arr.length * arr[0].length;
	
		System.out.println("the avarage of the whole array is " + (x/z));
	
	}
	
	public static void rowAvarage(int[][] arr,int chosenRow){
		int sum = 0;
		
		for (int c = 0; c < arr[chosenRow].length; c++){
			sum+=arr[chosenRow][c];
		}
		
		double avj = (double) sum / arr[chosenRow].length;
		System.out.println("The avarage of the chosen row is " + avj);
	}
}
