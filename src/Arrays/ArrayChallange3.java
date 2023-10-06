package Arrays;

import java.util.Scanner;

public class ArrayChallange3 {

    public static void main(String[] args) {


    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i=0; i<splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }


        return values;

    }
}
