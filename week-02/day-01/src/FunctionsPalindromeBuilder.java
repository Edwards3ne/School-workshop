import java.util.Scanner;

public class FunctionsPalindromeBuilder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert word of future Palindrome :");
        String input = userInput.next();
        System.out.println(createPalindrome(input));
    }
    public static String createPalindrome(String input ){
        String notPalindrome =  input;
        String halfPalindrome = "" ;
        String halfPalindromeBack = "" ;

        for (char c : notPalindrome.toCharArray()) {
            halfPalindrome = halfPalindrome + c ;
            }
        char[] goBackPldrm = input.toCharArray();

        for (int i = goBackPldrm.length-1;i >=0;i--){
            halfPalindromeBack = halfPalindromeBack + goBackPldrm[i];
        }
        return halfPalindrome + halfPalindromeBack;
        }





    }


