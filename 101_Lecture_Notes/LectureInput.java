/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        double item1Price = 5.99;
        double item2Price = 3.99;
        double item3Price = 3.95;
        
        System.out.println("🍔 Welcome to Rafos rough style burgers! 🍔");
        System.out.println("Here's our menu");
        System.out.println("1.🍔 Double Double $" + item1Price);
        System.out.println("2.🥛 Neopolitan Milkshake (15 oz) - $" + item2Price);
        System.out.println("3.🍟 Animal Fries - $" + item3Price);
        System.out.println();
        
        System.out.println("Whats the name for the order?");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How many Double Doubles would you like?");
        int quantity1 = sc.nextInt();
        System.out.println("How many Neopolitan Milkshakes would you like?");
        int quantity2 = sc.nextInt();
        System.out.println("How many Animal Fries would you like?");
        int quantity3 = sc.nextInt();
        
        double total1 = item1Price * quantity1;
        double total2 = item2Price * quantity2;
        double total3 = item3Price * quantity3;
        double total = total1 + total2 + total3;
        
        System.out.println();
        System.out.println("Your total before tip is: $" + total);
        System.out.println();
        System.out.println("What percent tip do you want to place?");
        System.out.println();
        double tipPercent = sc.nextInt();
        double tip = total * (tipPercent/100);
        System.out.println("Your Grand total is " + (total + tip));
	}
}
