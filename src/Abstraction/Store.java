package Abstraction;

import java.util.ArrayList;


record OrderItem(int quantity, ProductForSale product) {

}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Haykal", 19.99, "Karzinkadan haykal"));
        storeProducts.add(new ArtObject("Qovoq", 29.99, "Karzinkadan qovoq"));
        storeProducts.add(new Kebab(" Fryto Kebab ", 28.00, " Bayka Kebab "));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 4);
        printOrder(order1);

        System.out.println("\n Order 2");
        var order2  = new ArrayList<OrderItem>();
        addItemToOrder(order2, 2, 2);
        printOrder(order2);

    }

    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> orderItems) {
        double salesTotal = 0;
        for (var item : orderItems) {
            item.product().printPricedLine(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.println("Sales total = " + salesTotal);
    }


}
