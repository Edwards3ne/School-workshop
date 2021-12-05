import java.util.Scanner;

public class Piramid {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("insert number");
        int number = ask.nextInt();

        for (int count = 1; count <= number;count ++){

            for (int count2 = count; count2 < number;count2 ++) {
                System.out.print(" ");

                for (int count3 = 1; count3 < (count * 2); count3++) {
                    System.out.print("*");
                    System.out.print("\n");
                }
            }






        }
    }
}
