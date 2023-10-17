package Abstraction.InterfaceChallenge;

enum UtilityType {ELECTRICAL, FIBER_OPTIC, GAS, WATER}

public class UtilityLine implements Mappable {
    private String name;

    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ELECTRICAL -> Color.GREEN + " " + LineMaker.DASHED;
            case FIBER_OPTIC -> Color.ORANGE + " " + LineMaker.DOTTED;
            case GAS -> Color.RED + " " + LineMaker.SOLID;
            case WATER -> Color.BLACK + " " + LineMaker.SOLID;
            default -> Color.BLACK + " " + LineMaker.SOLID;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                "name" : "%s", "utility": "%s"
                """.formatted(name, type);
    }
}
