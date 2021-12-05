public class DataStructuresReverse {
    public static void main(String... args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String which is passed as parameter
        // Pass the toBeReversed variable to this method to check if it works well
        // Solve this task using charAt() function first
        // Try other solutions when you are done

        System.out.println(reverse(toBeReversed));

    }
    public static String reverse(String old){
        String newString = new String();
         for (int i=old.length() -1;i>0;i--){
             newString = newString+old.charAt(i);
         }return newString;

    }
}

