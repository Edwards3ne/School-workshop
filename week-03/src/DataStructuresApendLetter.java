import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructuresApendLetter {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "animals" list.
        // The parameter should be a list.

        System.out.println(appendA(animals));
    }
    public static List appendA(List<String> old){
       var newA= new ArrayList<String>();
       int i = 0;
        for (var app:old){
            newA.add(old.get(i)+"a");
            i++;
        }
        return newA;
    }

}
