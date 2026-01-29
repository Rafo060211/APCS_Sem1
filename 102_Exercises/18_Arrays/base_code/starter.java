/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [1001];
		int i = 0;
		int a = 1000;
		while(i != 1001){
			arr[i] = a;
			i++;
			a--;
		}
		
		int x = 0;
		int y = 0;
		int [] arr1 = new int [1001];
		while(x < 1001){
			arr1[x] = y + 3;
			x++;
			y = y + 3;
		}
		
		int z = 0;
		int c = 0;
		while(c < 1000){
			System.out.print(arr[z] + ", ");
			z++;
			c++;
		}
		
		int t = 0;
		int m = 0;
		while(m < 1000){
			System.out.print(arr1[t] + ", ");
			t++;
			m++;
		}
	}
}
