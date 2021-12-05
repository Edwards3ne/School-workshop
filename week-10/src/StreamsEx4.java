import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEx4 {
    public static void main(String[] args) {
        //Write a Stream Expression to get the average value of the odd numbers from the following list:

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> oddNumbers=numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(oddNumbers.stream().mapToDouble(n->n).average().orElse(0.0));



    }
}
