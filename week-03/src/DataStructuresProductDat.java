import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class DataStructuresProductDat {
    public static void main(String[] args) {
        var database = new HashMap<String,Integer>();
        database.put("Eggs",200);
        database.put("Milk",200);
        database.put("Fish",400);
        database.put("Apples",150);
        database.put("Bread",50);
        database.put("Chicken",550);

//      How much is the fish?
        for (var fish:database.entrySet()){
            if (fish.getKey().equals("Fish")){
                System.out.println("Fish cost:" + fish.getValue());
            }
        }
//      What is the most expensive product?
        ArrayList<Integer> prices = new ArrayList<Integer>();

        for (var exp:database.entrySet()){

            prices.add(exp.getValue());
        }
        prices.sort(Comparator.reverseOrder());
        for (var exp2:database.entrySet()){
            if (exp2.getValue().equals(prices.get(0))){
                System.out.println("Most expensive is " +exp2.getKey());
            }
        }

//      What is the average price?
        Integer summ = 0;
        for (var sum:prices){
            summ += sum;
        }

        System.out.println("Average price is : "+ (summ / database.size()));

//      How many products' price is below 300?
        int bell=0;
        for (var bel:prices){
            if (bel < 300){
                bell ++;
            }
        }
        System.out.println("There is "+bell+" products bellow 300.");

//      Is there anything we can buy for exactly 125?

        boolean anyb = false;
        for (var any:prices){
            if (any == 125){
                anyb = true;
            }
        }
        if (anyb){
            System.out.println("There IS product witch we can buy for 125.");
        }
        System.out.println("There is NOT product witch we can buy for 125.");

//      What is the cheapest product?

        prices.sort(Comparator.naturalOrder());

        for (var exp3:database.entrySet()){
            if (exp3.getValue().equals(prices.get(0))){
                System.out.println("Most cheapest is " +exp3.getKey());
            }
        }



    }
}
