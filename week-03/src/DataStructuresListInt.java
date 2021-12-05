import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class DataStructuresListInt {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        Iterator it = names.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        int i =0;
        for (String s:names){
            i++;
            System.out.println(i + ". " + s);
        }
        names.remove(1);

       names.sort(Comparator.reverseOrder());

        it = names.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }
       names.clear();




    }
}
