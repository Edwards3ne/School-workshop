import java.util.ArrayList;
import java.util.Arrays;

public class DataStructuresListInt2 {
    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList<>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        ArrayList<String> ListB = new ArrayList<>();
        ListB.addAll(ListA);
        System.out.println(ListA.contains("Durian"));
        ListB.remove("Durian");
        ListA.add(3,"Kiwifruit");
        if (ListA.size() == ListB.size()){
            System.out.println("ListA has same size as ListB");
        }
        if (ListA.size() > ListB.size()){
            System.out.println("ListA has bigger size than ListB");
        }if (ListA.size() < ListB.size()){
            System.out.println("ListA has smaller size than ListB");
        }
        System.out.println(ListA.indexOf("Avocado"));
        System.out.println(ListB.indexOf("Durian"));
        String[] dalsi= new String[]{"Passion Fruit","Pomelo"};
        ListB.addAll(Arrays.asList(dalsi));
        System.out.println(ListA.get(2));



    }
}
