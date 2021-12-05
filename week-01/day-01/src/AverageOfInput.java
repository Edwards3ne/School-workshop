import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner ask = new Scanner(System.in);

        System.out.println("insert first number");
        int first = ask.nextInt();

        System.out.println("insert second number");
        int second = ask.nextInt();

        System.out.println("insert third number");
        int three = ask.nextInt();

        System.out.println("insert fourt number");
        int four = ask.nextInt();

        System.out.println("insert fifth number");
        int five = ask.nextInt();

        int sum = (first+second+three+four+five) / 5;
        System.out.println("the average of your numbers is : " + sum);

    }
}