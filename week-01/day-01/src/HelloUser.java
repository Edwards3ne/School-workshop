import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert your name : ");
        String userInput1 = input.nextLine();

        System.out.println("Hello, " + userInput1);
    }
}
