import java.util.Scanner;

public class FunctionGreet {

        public static void main(String[] args) {
        //  From now on, create the usual class wrapper
//  and main method on your own

// - Create a string variable named `al` and assign the value `Green Fox` to it
// - Create a function called `greet()` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear Green Fox`
// - Greet `al`

        String al = "Green Fox";

        greet(al);

        System.out.println(al);

    }

    public static String greet(String al){
        System.out.print("Greatings dear ");

          return "Greatings dear" + al;







    }
}
