import java.util.Arrays;
import java.util.Scanner;

public class FunctionsSubInt {

    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as parameters
        //  It returns the indices of the integers of the array which contain the given number
        //  or returns an empty array (if the number is not part of any of the integers in the array)

        //  Examples:
        System.out.println(Arrays.toString(findMatchingIndexes(1, new int[]{1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(findMatchingIndexes(9, new int[]{1, 11, 34, 52, 61})));
        //  should print: '[]'
        System.out.println(Arrays.toString(findMatchingIndexes(0, new int[]{0})));

        // Note: We are using Arrays.toString() function to print the array returned
        // You could just as well iterate over the array and print its items one by one


    }

    public static int[] findMatchingIndexes(int input, int[] a) {
        int[] b = new int[a.length];
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (hasInteger(a[i],input))
            {
                b[c] = i;
                c++;
            }
        }
        return Arrays.copyOfRange(b,0,c);
    }
    public static boolean hasInteger (int a,int b){
        do {
            int c = a % 10;
            if (b == c) {
                return true;
            }
            a = a / 10;
        }while (a != 0 );
        return false;
    }


}
