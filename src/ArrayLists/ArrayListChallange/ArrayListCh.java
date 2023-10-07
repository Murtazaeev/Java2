package ArrayLists.ArrayListChallange;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListCh {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isAdding = true;
        List<String> groceryList = new ArrayList<>();
        while (isAdding) {
            printAction();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems((ArrayList<String>) groceryList);
                case 2 -> removeItems((ArrayList<String>) groceryList);
                case 3 -> System.out.println(groceryList);
                default -> isAdding = false;
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);
        }
    }

    private static void addItems(ArrayList<String> groceryList) {
        System.out.println("add items");
        String[] items = scanner.nextLine().split(",");

        if (groceryList.contains(items)) {
            System.out.println("ehh! this item exists already");
        } else {
            groceryList.addAll(List.of(items));
        }
    }

    private static void removeItems(ArrayList<String> groceryList) {
        System.out.println("remove items");
        String[] items = scanner.nextLine().split(",");
        if (groceryList.contains(items)) {
            System.out.println("no such item!!!!!!!");
        } else {
            groceryList.removeAll(List.of(items));
        }
    }

    private static void printAction() {
        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";

        System.out.println(textBlock + " ");
    }

}


