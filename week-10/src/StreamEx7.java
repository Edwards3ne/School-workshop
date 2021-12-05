import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamEx7 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        System.out.println(startsWith(cities,'N'));

    }
    public static List<String> startsWith (List<String> list,Character c){
        return  list.stream()
                .map(l->l.toUpperCase(Locale.ROOT))
                .filter(l->l.startsWith(c.toString().toUpperCase(Locale.ROOT)))
                .collect(Collectors.toList());

    }
}
