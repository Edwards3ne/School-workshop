import java.util.Scanner;

public class countFromTo {
    public static void main(String[] args) {

        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one//

        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        Scanner ask = new Scanner(System.in);

        System.out.println("Insert two numbers : ");

        long first = ask.nextLong();
        long second = ask.nextLong();
        boolean smaller = first >= second;
        boolean bigger = second > first;

        if (smaller) {
            System.out.println("The second number should be bigger");
        }else {
            while (first < second){
                System.out.println(first);
                first ++;
            }
        }

    }
}