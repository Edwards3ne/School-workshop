import java.util.Scanner;

public class FunctionsFactorio {
    //  Create the usual class wrapper and main method on your own

    // - Create a function called `calculateFactorial()`
//   that returns the factorial of its input
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("vložte číslo");
        int input = userInput.nextInt();
        System.out.println(calculateFactorial(input));

    }

    public static int calculateFactorial(int input) {
        int factorial=1;
        for (int i = 1; i <= input; i++){
            factorial =factorial*i;
        }
        return factorial;

    }

}
