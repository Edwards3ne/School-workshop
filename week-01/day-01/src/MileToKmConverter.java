import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanermile = new Scanner(System.in);

        System.out.println("Please insert your distace in miles : ");
        double distanceInMiles = scanermile.nextInt();
        double distanceInKm = distanceInMiles * 1.609344;
        System.out.println("Your distance in km is : " + distanceInKm + "km");
    }
}