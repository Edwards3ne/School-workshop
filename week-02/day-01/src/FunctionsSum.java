import java.util.Scanner;

public class FunctionsSum {
    // Create the usual class wrapper and main method on your own

    // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number");
        int number = userInput.nextInt();

        System.out.println(sumOfNumbers(number));

    }

    public static int sumOfNumbers(int number) {
        int sum =0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }


        return sum;
    }

}
