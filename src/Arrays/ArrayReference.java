package Arrays;

import java.util.Arrays;

public class ArrayReference {

    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] myIntArray2 = myIntArray;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(myIntArray2));

        myIntArray2[0] = 1;
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(myIntArray2));




    }
}
