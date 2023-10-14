package Abstraction;

public class ArtObject extends ProductForSale {


    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("this " + type + " is a beautiful reproduction");
        System.out.println(" the price of the piece is " + price);
        System.out.println(description);
    }
}
