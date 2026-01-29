package pkg;
import java.util.*;

public class ShoppingCartItem {
    String itemName;
    double itemCost;
    int quantity;
    
    public ShoppingCartItem(){
        itemName = "Nothing";
        itemCost = 0.0;
        quantity = 0;
    }
    public ShoppingCartItem(String a, double c, int q){
         itemName = a;
         itemCost = c;
         quantity = q;
    }
    
    public void cartToString(){
        System.out.println("You have " + quantity + " of " + itemName + " for $" + itemCost + " each");
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getTotalCost(){
        double x = itemCost * quantity;
        return x;
    }
    
    public double getTotalWithTax(){
        double x = ((itemCost * quantity) * 0.12) + itemCost * quantity;
        return x;
    }
    
    public double quantityToCostCalculator(int m){
        quantity = m;
        double x = itemCost * quantity;
        return x;
    }
    
    public double getItemCost(){
        return itemCost;
    }
    
    public boolean compareItemCost(ShoppingCartItem a){
        if(itemCost < a.getItemCost){
            return a;
        }
        
        
    }
}

