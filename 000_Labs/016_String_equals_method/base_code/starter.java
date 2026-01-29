/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? "); 
		String input = sc.nextLine();
	    if(input.equals("wizard") || input.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		
		else if(input.equals("warrior") || input.equals("Warrior")){
		System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(input.equals("rogue") || input.equals("Rogue")){
		System.out.println("You've chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("That wasnt a option :( pick again!");
			input = sc.nextLine();
			if(input.equals("wizard") || input.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		
		else if(input.equals("warrior") || input.equals("Warrior")){
		System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(input.equals("rogue") || input.equals("Rogue")){
		System.out.println("You've chosen the Rogue! How cunning!");
		}
		}

		
	}
}
