/*
Create an ArrayList<String> called groceryList.
Add 5 different items to the list (e.g., "Apples", "Bread", "Milk", "Eggs", "Coffee").
Remove one item from the list using its name (e.g., remove("Bread")).
Check if a specific item is in the list using the .contains() method and print a message based on the result (e.g., "Milk is on the list!").
Print the total number of items currently in the list using .size().
Finally, print all the items in the list using an enhanced for loop (for-each loop).*/
package array;

import java.util.ArrayList;

public class DynamicArray {
	  public static void main(String[] args) {
		  ArrayList<String> groceryList = new ArrayList<>();
      
      groceryList.add("Apples");
      groceryList.add("Bread");
      groceryList.add("Milk");
      groceryList.add("Eggs");
      groceryList.add("Coffee");

      groceryList.remove("Bread");

      if (groceryList.contains("Milk")) {
          System.out.println("Milk is on the list!");
      } else {
          System.out.println("Milk is not on the list.");
      }

      System.out.println("Total items: " + groceryList.size());


      System.out.println("Grocery List:");
      for (String item : groceryList) {
          System.out.println(item);
      }
}
}
