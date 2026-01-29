/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf d1 = new PooleDwarf("Tom", 10);
		PooleDwarf d2 = new PooleDwarf("Brady", 11);
		PooleDwarf d3 = new PooleDwarf("is", 12);
		PooleDwarf d4 = new PooleDwarf("a", 13);
		PooleDwarf d5 = new PooleDwarf("big", 14);
		PooleDwarf d6 = new PooleDwarf("knuckle", 15);
		PooleDwarf d7 = new PooleDwarf("head", 16);


	}
}
 