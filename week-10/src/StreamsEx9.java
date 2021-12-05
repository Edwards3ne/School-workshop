
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsEx9 {

    public static void main(String[] args) {
        //Write a Stream Expression to find the frequency of characters in a given string!
        String random = "ahoj ,hi how are you";
        Map<Character,Long> charInString = random.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        charInString.entrySet().forEach(System.out::println);



    }
}
