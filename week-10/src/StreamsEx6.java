import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsEx6 {


    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!

        String strings ="ThisString has Some WoRds with Uppercase.";
        strings.chars()
                .mapToObj(i -> (char)i)
                .filter(Character::isAlphabetic)
                .filter(Character::isUpperCase)
                .forEach(System.out::println);



    }
}
