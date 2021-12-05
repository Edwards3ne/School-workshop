import java.util.HashMap;


public class DataStructuresMapInt {
    public static void main(String[] args) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        System.out.println(hm.isEmpty());
        hm.put(97, 'a');
        hm.put(98, 'b');
        hm.put(99, 'c');
        hm.put(65, 'A');
        hm.put(66, 'B');
        hm.put(67, 'C');
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        hm.put(68, 'D');
        System.out.println();

        System.out.println(hm.size());
        System.out.println(hm.get(99));
        hm.remove(97);
        System.out.println(hm.containsKey(100));
        hm.clear();

    }


}

