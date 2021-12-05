import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        System.out.println("Write length height and depth of cuboid :");

        Scanner input = new Scanner(System.in);
        System.out.println("Lenght :");
        int userInput1 = input.nextInt();

        System.out.println("Height :");
        int userInput2 = input.nextInt();

        System.out.println("Depth :");
        int userInput3 = input.nextInt();


        double lenght = userInput1;
        double height = userInput2;
        double depth = userInput3;

        double surfaceArea = 2 * (lenght * height + lenght * depth + height * depth);
        double volume = lenght * height * depth;
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);

    }
}