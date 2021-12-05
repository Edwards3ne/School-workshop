import java.util.Locale;
import java.util.Scanner;

public class FunctionsAnagram {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert first word: ");
        String input1 = userInput.next();
        System.out.println("Insert second word: ");
        String input2 = userInput.next();
        System.out.println(isAnagram(input1, input2));
    }

    public static boolean isAnagram(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        }
        if (lettersCount(input1, input2)) {
            return true;
        }
        return false;
    }

    public static boolean lettersCount(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();


        for (char c : b.toCharArray()) {
            if (!a.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;


    }


}
