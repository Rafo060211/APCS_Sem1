/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman Tobey = new Spiderman("Tobey Maguire", 48);
		Tobey.setVillain("Green Goblin");
		
		Spiderman Andy = new Spiderman("Andrew Garfield", 40);
		Tobey.setVillain("Electro");
		
		Spiderman Tom = new Spiderman("Tom Holland", 27);
		Tobey.setVillain("The Vulture");
		
		Spiderman Porky = new Spiderman("Porky", 7123);
		Tobey.setVillain("Mega Night");
		
		String x = Tobey.getActor();
		int y = Tobey.getAge();
		String z = Tobey.getVillain();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		
	}
}
