import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner ask = new Scanner(System.in);
        System.out.println("Insert two numbers : ");
        System.out.println("First : ");
        int first = ask.nextInt();
        int second = ask.nextInt();
        if (first > second) {
            System.out.println(first + " is bigger");
        }
        if (first < second) {
            System.out.println(second + " is bigger");
        }
        if (first == second) {
            System.out.println("Numbers are same");
        }
    }
}