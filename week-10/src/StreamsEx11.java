import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsEx11 {
    public static void main(String[] args) {

            try {
                Files.lines(Path.of("fargo.txt"))
                        .flatMap(lin -> Arrays.stream(lin.split(" ")))
                        .filter(lin->!lin.isEmpty())
                        .filter(lin->!Character.isDigit(lin.charAt(0)))
                        .collect(Collectors.groupingBy(string -> string, Collectors.counting()))
                        .entrySet().stream()
                        .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue()))
                        .limit(100)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                        .entrySet().stream().sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue())).forEach(System.out::println);



            } catch (IOException e) {
                e.printStackTrace();
            }



        }
    }

