import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class DataStructuresPersonalFin {
    public static void main(String[] args) {
        var expenses = new ArrayList<Integer>();

        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);
        Integer Count =0;
        Iterator Int   = expenses.iterator();

        for (int i = 0; i < expenses.size(); i++) {
            Count += expenses.get(i);
        }
        System.out.println("We spend " + Count);
        expenses.sort(Comparator.reverseOrder());
        System.out.println("Our greatest expense was :" + expenses.get(0));
        expenses.sort(Comparator.naturalOrder());
        System.out.println("Our cheapest spend was :" + expenses.get(0));
        Integer average = Count / expenses.size();
        System.out.println("Average amount of our spendings was :" + average);
    }
}
