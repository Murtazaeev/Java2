package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("Temur");
        collection.add("MuhammadRizo");
        collection.add("Bobur");
        for (var item : collection) {
            System.out.println(item);
        }
        System.out.println(collection);

        Collections.addAll(collection, "Aziz", "Boboyor", "Umar");
        System.out.println(collection);
    }
}
