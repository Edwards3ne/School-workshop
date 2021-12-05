import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsEx10 {
    public static void main(String[] args) {
//        Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
//
//        Write a Stream Expression to find the foxes with green color!
//                Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//                Write a Stream Expression to find the frequency of foxes by color!
        List<Fox> foxes=new ArrayList<>();
        foxes.add(new Fox("Beth","blue",10));
        foxes.add(new Fox("John","blue",3));
        foxes.add(new Fox("Digy","yellow",15));
        foxes.add(new Fox("Peter","blue",7));
        foxes.add(new Fox("Joana","green",1));

        System.out.println("Write a Stream Expression to find the foxes with green color, and age less then 5 years!");
        foxes.stream()
                .filter(f->f.color=="green")
                .filter(f->f.age<5)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Write a Stream Expression to find the frequency of foxes by color!");
        Map<String,Long> frequencyOfFoxes=foxes.stream()
                .collect(Collectors.groupingBy(c -> c.color, Collectors.counting()));
        frequencyOfFoxes.entrySet().forEach(System.out::println);
    }

    public static class Fox{
        private String name;
        private String color;
        private int age;

        public Fox(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return  name ;
        }
    }
}
