package Generics.challenge;

public class Main {

    public static void main(String[] args) {
        var nationalPark = new Park[]{
                new Park("Botaika Bog'i", "41.34496654551364, 69.31066343933534"),
                new Park("Eco park", "41.30984513381901, 69.2955803093259"),
                new Park("Amir Temur Square", "41.31125112919356, 69.27960597788416"),
        };

        Layer<Park> parkLayer = new Layer<>(nationalPark);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Mississippi",
                        "47.2160, -95.2348", "29.1566, -89.2495",
                        "35.1556, -90.0659"),
                new River("Missouri",
                        "45.9239, -111.4983", "38.8146, -90.1218")
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);

        riverLayer.addElements(
                new River("Colorado",
                        "40.4708, -105.8286", "31.7811, -114.7724"),
                new River("Delaware",
                        "42.2026, -75.00836", "39.4955, -75.5592"));

        riverLayer.renderLayer();
    }
}
