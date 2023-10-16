package Abstraction;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }



    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedLine(int quantity) {
        System.out.println(quantity + price + description + type);
    }

    public abstract void showDetails();
}
