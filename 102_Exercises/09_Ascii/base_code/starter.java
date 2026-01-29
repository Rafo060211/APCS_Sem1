/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter what you want us to draw for you!"); 
		System.out.println("You can choose between a dog, a cat, or an face");
		String input = sc.nextLine();
		
		
		if (input.equals ("face") || input.equals ("Face")){
			System.out.println("");
			System.out.println("||||||||");
			System.out.println("| @  @ |");
			System.out.println("|  __  |");
			System.out.println("\\______/");
		}
		
		if (input.equals ("cat") || input.equals ("Cat")){
			System.out.println("");
			System.out.println(" /\\____/\\");
			System.out.println("| @   @ |");
			System.out.println("|  ---  |");
			System.out.println("|_______|");
		}
		
		if (input.equals ("dog") || input.equals ("Dog")){
			System.out.println("");
			System.out.println("/\\____/\\");
			System.out.println("|  @  @  |");
			System.out.println("|  woof  |");
			System.out.println("|________|");
		}
	}
}
