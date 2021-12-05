import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        Scanner ask = new Scanner(System.in);
        System.out.println("Insert your number: ");
        int number = ask.nextInt();
        boolean numberAsk = number % 2 == 0;

        if (numberAsk){
            System.out.println("Your number is odd");
        }else {
            System.out.println("Your number is even");
        }
    }

}