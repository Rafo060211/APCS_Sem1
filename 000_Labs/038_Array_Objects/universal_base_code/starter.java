/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int x = 0;
		int y = 0;
		Warrior[] Warriors = new Warrior[100];
		Wizard[] Wizards = new Wizard[100];
		
		for (int l = 0; l < Warriors.length; l++){
			Warriors[l] = new Warrior();
			Wizards[l] = new Wizard();
		}
		///WARRIORS ATTACKING WIZARDS
		
		while(x < 100 && y < 100){
			Wizards[x].attack(Warriors[y]);
		
			if(Warriors[y].isDead()){
				y++;
			}
			
			if(y == 100){
				break;
			}
			
			Warriors[y].attack(Wizards[x]);
			
			if(Wizards[x].isDead()){
				x++;
			}
		}
		if(y == 100){
			System.out.println("THE WIZARDS WON!!!!!");
			System.out.println("There are " + (100 - x) + " wizards left and 0 warriors left");
		}
		else if(x == 100){
			System.out.println("THE WARRIORS WON!!!!!");
			System.out.println("There are 0 wizards left and " + (100 - y)+ " warriors left");

		}
	}
}
