/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		int rnd = (int)(Math.random() * 3 + 1);
		Scanner sc = new Scanner(System.in);
		System.out.print("The goal of the game is to guess a word with two hints! (all inputs must be lowercase)");
		System.out.println();

		if(rnd == 1){ //PLANET!!!!!!!!!!!!
			System.out.println("Its a Planet");
			System.out.println("What is your guess?");
			String response = sc.nextLine();
			if(response.equals("earth")){
				System.out.println("You got it right!");
			}
			else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("Its the only one with life on it!");
				response = sc.nextLine();
				if(response.equals("earth")){
					System.out.println("CORRECT!!! You got it on your second try!");
				}else{
					System.out.println("Sorry, your wrong.The answer was earth");
				}
			}
			
		}
		
		if(rnd == 2){
			System.out.println("Its a Superhero");
			System.out.println("What is your guess?");
			String response = sc.nextLine();
			if(response.equals("iron man")){
				System.out.println("You got it right!");
			}
			else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("Its a rich guy that makes special suits");
				response = sc.nextLine();
				if(response.equals("iron man")){
					System.out.println("CORRECT!!! You got it on your second try!");
				}else{
					System.out.println("Sorry, your wrong.The answer was iron man");
				}
			}
		}
		
		if(rnd == 3){
			
			System.out.println("Its a snack");
			System.out.println("What is your guess?");
			String response = sc.nextLine();
			if(response.equals("goldfish")){
				System.out.println("You got it right!");
			}
			else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("its a snack that smiles back :)");
				response = sc.nextLine();
				if(response.equals("goldfish")){
					System.out.println("CORRECT!!! You got it on your second try!");
				}else{
					System.out.println("Sorry, your wrong.The answer was goldfish");
				}
			}
		}
	}
}
