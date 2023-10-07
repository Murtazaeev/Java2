package ArrayLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListPart2 {

    record GroceryItem(String name, String type, int count) {
        public GroceryItem(String name) {
            this(name, "Smoked", 1);
        }

        @Override
        public String toString() {
            return "GroceryItem{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", count=" + count +
                    '}';
        }
    }


    public static void main(String[] args) {

        ArrayList<GroceryItem> groceryList = new ArrayList<>();

        groceryList.add(new GroceryItem("Parowki"));
        groceryList.add(new GroceryItem("Yogurt", "Greak", 2));
        groceryList.add(0,new GroceryItem("Yogurt", "Greak", 2));

        System.out.println(groceryList);
        groceryList.remove(2);
        System.out.println(groceryList);
    }
}


