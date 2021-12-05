import java.util.Scanner;

public class drawdiagonal {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("insert number");
        int number = ask.nextInt();

        for (int count = 1; count <= number;count ++){
            int count2 = 1;

            while (count2 <= number){
                System.out.print("*");
                count2++;


            }
            System.out.println();






        }
    }
}