import java.util.HashMap;

public class DataStructuresMapInt2 {
    public static void main(String[] args) {
        HashMap<String,String> newMap = new HashMap<>();
        newMap.put("978-1-60309-452-8", "A Letter to Jo");
        newMap.put("978-1-60309-459-7", "Lupus");
        newMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        newMap.put("978-1-60309-461-0", "The Lab");

        for (var el: newMap.entrySet()){
            System.out.println(el.getValue() + "(ISBN: " + el.getKey() + ")");
        }
        newMap.remove("978-1-60309-444-3");

        for (var el2:newMap.entrySet()){
            if (el2.getValue().equals("The Lab")){
                newMap.remove(el2.getKey());
            }

        }
        newMap.put("978-1-60309-450-4", "They Called Us Enemy");
        newMap.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println(newMap.containsKey("478-0-61159-424-8"));
        System.out.println(newMap.get("978-1-60309-453-5"));




    }
}
