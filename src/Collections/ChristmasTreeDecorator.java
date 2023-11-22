package Collections;

import java.util.*;

public class ChristmasTreeDecorator {

    public static List<String> processChristmasTrees(String[] data, int newOrnamentsToAdd) {
        Map<String, Integer> usedOrnamentsCount = new HashMap<>();
        Map<String, Integer> maxCapacityCount = new HashMap<>();

        // Parse the data and populate the maps
        for (String entry : data) {
            String[] parts = entry.split(" ");
            String treeId = parts[0];
            int count = Integer.parseInt(parts[1]);
            String infoType = parts[2];

            if (infoType.equals("used_ornaments")) {
                usedOrnamentsCount.put(treeId, count);
            } else if (infoType.equals("max_capacity")) {
                maxCapacityCount.put(treeId, count);
            }
        }

        List<String> result = new ArrayList<>();

        // Check for each tree if it can be decorated further
        for (String treeId : usedOrnamentsCount.keySet()) {
            int usedOrnaments = usedOrnamentsCount.get(treeId);
            int maxCapacity = maxCapacityCount.get(treeId);

            if (maxCapacity - usedOrnaments > newOrnamentsToAdd) {
                result.add(treeId);
            }
        }

        // Sort the result array in ascending order
        Collections.sort(result, Comparator.comparingInt(Integer::parseInt));

        return result;
    }

    public static void main(String[] args) {
        String[] data = {
                "30 99 used_ornaments",
                "30 105 max_capacity",
                "12 100 used_ornaments",
                "20 80 used_ornaments",
                "12 120 max_capacity",
                "20 101 max_capacity",
                "21 110 used_ornaments"
        };
        int newOrnamentsToAdd = 20;

        List<String> result = processChristmasTrees(data, newOrnamentsToAdd);

        System.out.println(result);
    }
}
