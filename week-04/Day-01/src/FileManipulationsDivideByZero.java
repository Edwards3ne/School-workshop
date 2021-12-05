import java.util.Scanner;

public class FileManipulationsDivideByZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number you want to divide:");
        int number = input.nextInt();
        try {
            System.out.println(divide(number));

        }catch (ArithmeticException e){
            System.out.println("fail");
        }

    }
    public static int divide (int number){
        int result = 10/number;
        return result;
    }
}
