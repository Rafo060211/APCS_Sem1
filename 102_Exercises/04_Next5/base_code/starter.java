/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Pretty please enter a number: ");
	int enterNumber = sc.nextInt();
	System.out.println("Here are the next five numbers!!!");
	
	int enternumber1 = enterNumber + 1;
	int enternumber2 = enterNumber + 2;
	int enternumber3 = enterNumber + 3;
	int enternumber4 = enterNumber + 4;
	int enternumber5 = enterNumber + 5;
	
	System.out.println(enternumber1 + ", " + enternumber2 + ", " + enternumber3 + ", " + enternumber4 + ", " + enternumber5);
	
	int multinumber1 = enterNumber * 2;
	int multinumber2 = enterNumber * 3;
	int multinumber3 = enterNumber * 4;
	int multinumber4 = enterNumber * 5;
	int multinumber5 = enterNumber * 6;
	
	System.out.println();
	System.out.println("Here are the next 5 multiples of " + enterNumber + " !!!");
	
	System.out.println(multinumber1 + ", " + multinumber2 + ", " + multinumber3 + ", " + multinumber4 + ", " + multinumber5);
	System.out.println();

    double hundo = (enterNumber/100);
    double tenzo = (enterNumber/10);
	System.out.println("Here is " + enterNumber + " divided by 100");
	System.out.println(hundo);
	
	System.out.println();
	
	System.out.println("Here is " + enterNumber + " divided by 10");
	System.out.println(tenzo);
	}
}
