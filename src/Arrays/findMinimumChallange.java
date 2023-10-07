package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class findMinimumChallange {


    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);
        int temp;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i] < sorted[i + 1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sorted[sorted.length - 1];
    }
}

