import java.util.HashMap;
import java.util.Scanner;

public class DataStructuresTelBook {
    public static void main(String[] args) {
        var telBook = new HashMap<String,String>();
        telBook.put("William A. Lathan","405-709-1865");
        telBook.put("John K. Miller","402-247-8568");
        telBook.put("Hortensia E. Foster","606-481-6467");
        telBook.put("Amanda D. Newland","319-243-5613");
        telBook.put("Brooke P. Askew","307-687-2982");
      //  var userImput = new Scanner(System.in);
      //  String input = userImput.next();
        System.out.println("John K. Miller's phone number is : " + telBook.get("John K. Miller"));

        for (var el2:telBook.entrySet()){
            if (el2.getValue().equals("307-687-2982")) {
                System.out.println("Phone number 307-687-2982 belong to " + el2.getKey());
                 }
            }
        if (telBook.containsKey("Chris E. Myers'")){
            System.out.println("Phone book contains Chris E. Myers' number");
        }
        System.out.println("We don't have Chris E. Myers' phone number in our list. :( ");
    }
}
