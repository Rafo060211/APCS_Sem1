/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
			//Create a program that creates a crossword puzzle hiding 1 word given by the user!

			//1. Take a word from the user
				System.out.println("Please enter a word you would like me to hide in a crossword");
				String input = sc.nextLine();
			//2. Create a 2D String array with a size of 5 larger than the word size in both directions
				String[][] arr = new String [input.length + 5][input.length + 5];
			//3. Choose what direction the word should hide in
				int direction = (int)(Math.random() * 3);
				//- Vertical, Horizontal, Diagonal
				if (direction == 0){
						while(){
						String letter = input.substring(i, i + 1);
						System.out.println(letter);
					}
				}
				//- EXTRA: Choose if the word should hide forward or backwards
			//4. For each letter in the word, hide it into a spot in the 2D array
				//- This spot should be chosen randomly within the bounds of the 2D array
			//5. Once the word is stored in the array, fill up the rest of the array
				//- Note what value is stored in the String array and replacing non-filled values with random letters
				//- Given the letters array, choose a random letter to populate it with
			//6. Print out the crossword puzzle!
			//7. Ask a friend to find the word!
	

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };

		
	}
}
