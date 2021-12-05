import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        Scanner ask = new Scanner(System.in);
        System.out.println("insert number");
        int number = ask.nextInt();
        for (int count = 1; count <= number;count ++){

            for (int count2 = 1; count2 <= count;count2 ++) {
                System.out.print("*");
            }
            System.out.println();




        }

    }
}
