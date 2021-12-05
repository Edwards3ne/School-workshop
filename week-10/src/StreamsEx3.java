import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEx3 {
    public static void main(String[] args) {
        //Write a Stream Expression to find which number squared value is more then 20 from the following list:
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> squaresList = numbers.stream().map( i -> i*i).collect(Collectors.toList());
        squaresList.stream()
                .filter(s->s>20)
                .forEach(System.out::println);
    }
}
