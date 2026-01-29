/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = 100;
		System.out.println("Slot Machine Rules: "); 
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println("");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
		String playornot = sc.nextLine();
		
		int money = 100;
		
		while (true){
		while(true){
		if (playornot.equals("Yes") || playornot.equals("yes") || playornot.equals("Y") || playornot.equals("y")) {
			break;
		}
		else {
			System.out.println("Wrong option choose again.");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
		playornot = sc.nextLine();
		}
		}
		
		
		int r1 = (int)(Math.random() * 9 + 1);
		int r2 = (int)(Math.random() * 9 + 1);
		int r3 = (int)(Math.random() * 9 + 1);
		
		System.out.print("You have $" + money + ". How much would you like to wager? ");
		int rp = sc.nextInt();
		
		while (true){
		
		
		if(rp > 100){
			System.out.println("You only have $100! Please enter a smaller number : ");
			rp = sc.nextInt();
		}
		else{
			break;
		}
		}
		
		System.out.println("");
		System.out.println("Great! Let's play!!!");
		System.out.println("Your rolls are: ");
		System.out.println("_______________________");
		System.out.println("|  " + r1 + "  |  " + r2 + "  |  " + r3 + "  |  ");
		System.out.println("_______________________");
		
		if(r1 == r2 && r3 == r2){
			System.out.println("You won! You're wager has now been tripled!");
			rp = rp * 3;
			money = money + rp;
			rp = 0;
		}
		else if(r1 == r2 || r2 == r3){
			System.out.println("You won! You're wager has now been doubled!");
			rp = rp * 2;
			money = money + rp;
			rp = 0;
		}
		else {
			System.out.println("Didn't win this time, better luck next time!");
			money = money - rp;
		}
		
		if(money == 0){
			System.out.println("You've run out of money! Thanks for coming! Come back soon!");
			break;
		}
		}
		
		
		
		

		
	}
}
