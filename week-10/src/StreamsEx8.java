import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEx8 {
    public static void main(String[] args) {
        List<Character> word = Arrays.asList('A','h','o','j');
        System.out.println(word.stream()
                .map(Object::toString)
                .collect(Collectors.joining()));
    }
}
