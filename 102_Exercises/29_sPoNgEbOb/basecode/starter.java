/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a phrase");
	
	String x = sc.nextLine();

	String result = "";
 
	boolean startOfWord = true;
 
	for (int i = 0; i < x.length(); i++){
		
		String letter = x.substring(i, i + 1); //pulls out each letter
		
		if(letter.equals(" ")){
			 result += letter;
			 startOfWord = true;
			 
		} 
		
		else if (startOfWord) {
			result += letter.toLowerCase();
			startOfWord = false;
		}
		
		else if (i % 2 == 0){					   //coverts every OTHER letter into upper case and stores it in "letter"
			result += letter.toUpperCase();
			startOfWord = false;
		}
		else{
			result += letter.toLowerCase();
		}

	}
	System.out.println(result);
	}
}
