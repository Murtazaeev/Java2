package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallange3 {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("Min = " + returnedMin);

        System.out.println(("").repeat(30));

        reverse(returnedArray);
        System.out.println("Final = " + Arrays.toString(returnedArray));

        System.out.println(("-").repeat(30));
        System.out.println("Reversed of reversed array = " + Arrays.toString(reverseCopy(returnedArray)));

    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;

    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;

    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    private static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedArray[maxIndex--] = el;

        }
        return reversedArray;
    }
}
