/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?"); 
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		
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

		int points = 20;

		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.println("");
		System.out.println("Strength (1-10): ");
		int Strength = sc.nextInt();
		
		if (Strength > 10){
			System.out.println("You can only choose from a scale of 1 - 10. Please pick again!");
			Strength = sc.nextInt();
			
		}
		 points = points - Strength;
		System.out.println("You have " + points +" points left");
		
		System.out.println("");
		
		System.out.println("Dexterity (1-10): ");
		int Dexterity = sc.nextInt();
		if (Dexterity > 10){
			System.out.println("You can only choose from a scale of 1 - 10. Please pick again!");
			Dexterity = sc.nextInt();
		}
		
		 points = points - Dexterity;
		 System.out.println("You have " + points + " points left");
		 
		System.out.println("");
	   	System.out.println("Intelligence (1-10): ");

		
		int Intelligence = sc.nextInt();
		if (Intelligence > 10){
			System.out.println("You can only choose from a scale of 1 - 10. Please pick again!");
			Intelligence = sc.nextInt();
		}
		
		 points = points - Intelligence;
		 System.out.println("You have " + points + " points left");
		 
		System.out.println("");
		System.out.println("Charisma (1-10): ");

		
		int Charisma = sc.nextInt();
		if (Charisma > 10){
			System.out.println("You can only choose from a scale of 1 - 10. Please pick again!");
			Charisma = sc.nextInt();
		}
		
		 points = points - Charisma;
		 System.out.println("You have " + points + " points left");
		 
		 System.out.println("------------------------------------------------------------");
		 
		 System.out.println("You are " + name + " the " + title + " of CVHS");
		 System.out.println("You're a " + input + " with the following stats!");
		 System.out.println("Strength - " + Strength);
		 System.out.println("Dexterity - " + Dexterity);
		 System.out.println("Intelligence - " + Intelligence);
		 System.out.println("Charisma - " + Charisma);
	}
}
