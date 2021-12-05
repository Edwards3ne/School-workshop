import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150
        Scanner ask = new Scanner(System.in);

        System.out.println("insert number : ");
        int number = ask.nextInt();
        int secondNumber = 1;
        while (secondNumber <= 10){

            int count = secondNumber * number;
            System.out.println(secondNumber + "*" + number + "=" + count );
            secondNumber ++;
        }
    }
}