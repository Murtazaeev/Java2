package Abstraction;

public class Kebab extends ProductForSale {


    public Kebab(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("this " + type + " is very tasty");
        System.out.println(" the price of the piece is " + price);
        System.out.println(description);
    }
}
