package Arrays;

import java.util.*;

public class MyArray {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 41;
        myIntArray[5] = 50;

        int[] firstFiveSequence = {1, 2, 3, 4, 5};
        System.out.println(firstFiveSequence[3]);


        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[3]);


        int[] nextArrayItems = new int[10];
        for (int i = 0; i < nextArrayItems.length; i++) {
            nextArrayItems[i] = nextArrayItems.length - i;
        }
        for (int i = 0; i < nextArrayItems.length; i++) {
            System.out.print(nextArrayItems[i] + " ");
        }
        System.out.println();
        for (int element : nextArrayItems) {
            System.out.print(element + " ");
        }
        System.out.println();

        int[] firsArray = getRandomArray(10);
        System.out.println(Arrays.toString(firsArray));
        Arrays.sort(firsArray);
        System.out.println(Arrays.toString(firsArray));

    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);

        }
        return newInt;

    }
}
