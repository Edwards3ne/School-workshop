import java.util.Scanner;

public class ArraysDiagonalMatrix {
    public static void main(String[] args) {
        // - Create a two dimensional array dynamically with the following content.
        //   Note that a two dimensional array is often called matrix if every
        //   internal array has the same length.
        //   Use a loop!
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        //
        //   Its length should depend on a variable
        //
        // - Print this two dimensional array to the output
        Scanner ask = new Scanner(System.in);
        System.out.println("enter length of your matrix");
        int number = ask.nextInt();

        int[][] matrix = new int[number][number];

            for (int d = 0; d < number; d++)
            matrix[d][d] = 1;


        for (int i = 0; i < number; i++) {
            int[] numbersSet = matrix[i];
            for (int f = 0; f < numbersSet.length; f++) {
                System.out.print(" " + numbersSet[f]);
            }
            System.out.println();


        }
    }
}
