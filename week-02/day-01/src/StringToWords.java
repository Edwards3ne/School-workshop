import java.util.Arrays;
import java.util.Scanner;


public class StringToWords {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String str = userInput.next();

        //String str = "This is a simple sentence";
        String strgs[] = new String[500];
        strgs = str.split(" ");
        //String[]strgs = split(str," ");
        System.out.println(Arrays.toString(strgs));
        System.out.println(strgs[0]);
        System.out.println(strgs[1]);
        System.out.println(strgs[2]);
        System.out.println(strgs[3]);
        System.out.println(strgs[4]);
    }
}
