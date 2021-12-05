import java.util.ArrayList;
import java.util.Arrays;

public class DataStructuresQuoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
    }
    public static ArrayList quoteSwap(ArrayList old){
        var newOne=new ArrayList<>();
        newOne.add(old.get(0));
        newOne.add(old.get(1));
        newOne.add(old.get(5));
        newOne.add(old.get(3));
        newOne.add(old.get(4));
        newOne.add(old.get(2));
        newOne.add(old.get(6));
        newOne.add(old.get(7));
        return newOne;

    }
}
