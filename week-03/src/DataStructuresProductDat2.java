import java.util.ArrayList;
import java.util.HashMap;

public class DataStructuresProductDat2 {
    public static void main(String[] args) {
        var list = new HashMap<String,Integer>();
        list.put("Eggs",200);
        list.put("Milk",200);
        list.put("Fish",400);
        list.put("Apples",150);
        list.put("Bread",50);
        list.put("Chicken",550);

//      Which products cost less than 201? (just the name)

        ArrayList<Integer> prices = new ArrayList<Integer>();
        var names = new ArrayList<String>();


        for (var exp:list.entrySet()){
            if (exp.getValue()<201){
                names.add(exp.getKey());
            }
        }
        System.out.println("Product that cost less than 201 : "+ names);

//      Which products cost more than 150? (name + price)

        var names2 = new ArrayList<String>();
        for (var exp:list.entrySet()){
            if (exp.getValue()>150){
                names2.add(exp.getKey());
            }
        }
        System.out.println("Product that cost more than 150 : ");
        for (var more:list.entrySet()){
            if (names2.contains(more.getKey())){
                System.out.println(more.getKey() + "\t" + more.getValue());
            }
        }





    }
}
