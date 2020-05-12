package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    /*
    create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
     */

    public static void main(String[] args) {

        Item item1 = new Item("Toilet Paper", 25,2);
        Item item2 = new Item("Napkins", 6,2);
        Item item3 = new Item("T-Shirt", 15,3);
        Item item4 = new Item("Jean", 50,2);
        Item item5 = new Item("Pepsi", 6,4);
        Item item6 = new Item("Chips", 3,7);


        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3,item4,item5,item6));


        double totalCost = 0;

        /*
        //solution 1
        for (Item each : shoppingList){
            totalCost += each.calCost();

        }

         */


        //solution 2

        for (int i = 0; i <shoppingList.size(); i++){

          totalCost += shoppingList.get(i).calCost();

        }

        System.out.println("Total: "+totalCost);

    }
}
