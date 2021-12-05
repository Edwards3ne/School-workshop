import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner ask = new Scanner(System.in);

        System.out.println("How manny chickens you have?");
        int chickens = ask.nextInt();
        System.out.println("How manny pigs you have?");
        int pigs = ask.nextInt();
        int legs = (chickens * 2) + (pigs * 4);
        System.out.println("Your animals has " + legs + " legs toegether.");
    }
}