package Abstraction.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Oliy Majlis", UsageType.GOVERNMENT));
        mappables.add(new Building("JAR", UsageType.SPORTS));
        mappables.add(new Building("XONSAROY", UsageType.RESIDENTIAL));
        mappables.add(new Building("NestONE", UsageType.ENTERTAINMENT));

        mappables.add(new UtilityLine("Lyceum", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic", UtilityType.ELECTRICAL));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }


    }
}
