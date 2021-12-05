import java.util.HashMap;
import java.util.Iterator;

public class DataStructuresShopList2 {
    public static void main(String[] args) {
        var prices = new HashMap<String,Double>();
        prices.put("Milk",1.07);
        prices.put("Rice",1.59);
        prices.put("Eggs",3.14);
        prices.put("Cheese",12.60);
        prices.put("Chicken Breasts",9.40);
        prices.put("Apples",2.31);
        prices.put("Tomato",2.58);
        prices.put("Potato",1.75);
        prices.put("Onion",1.10);

        var bob = new HashMap<String,Integer>();
        bob.put("Milk",3);
        bob.put("Rice",2);
        bob.put("Eggs",2);
        bob.put("Cheese",1);
        bob.put("Chicken Breasts",4);
        bob.put("Apples",1);
        bob.put("Tomato",2);
        bob.put("Potato",1);

        var alice = new HashMap<String,Integer>();


        alice.put("Rice",1);
        alice.put("Eggs",5);
        alice.put("Chicken Breasts",2);
        alice.put("Apples",1);
        alice.put("Tomato",10);

        double bobCostDouble = 0;
        Double bobCost =  bobCostDouble;

        double aliceCostDouble = 0;
        Double aliceCost =  aliceCostDouble;


        Integer bobPieces = 0;


        Integer alicePieces = 0;


//      How much bob pay
        for (var i:prices.entrySet()){
           if (bob.containsKey(i.getKey())) {
               bobCost += (i.getValue() * bob.get(i.getKey()));
           }



//      How much alice pay
           if (alice.containsKey(i.getKey())){
               aliceCost += (i.getValue() * alice.get(i.getKey()));
           }
        }
        System.out.println("Bob pay : "+ bobCost);
        System.out.println("Alice pay : "+ aliceCost);


//      Who buys more Rice
        if (alice.containsKey("Rice") && bob.containsKey("Rice")) {
            if (bob.get("Rice") > alice.get("Rice")) {
                System.out.println("Bob buys more Rice");
            }
            if (bob.get("Rice").equals(alice.get("Rice"))) {
                System.out.println("Alice and Bob buys equal amount of Rice");
            }
            if (bob.get("Rice") < alice.get("Rice")) {
                System.out.println("Alice buys more Rice");
            }
        }

//      Who buys more Potato
        if (alice.containsKey("Potato") && bob.containsKey("Potato")){
            if (bob.get("Potato")>alice.get("Potato")){
                System.out.println("Bob buys more Potato");
            }
            if (bob.get("Potato").equals(alice.get("Potato"))){
                System.out.println("Alice and Bob buys equal amount of Potato");
            }
            if (bob.get("Potato")<alice.get("Potato")){
                System.out.println("Alice buys more Potato");
            }

        }else if(alice.containsKey("Potato")){
            System.out.println("Alice buys more Potato");
        }else if (bob.containsKey("Potato")){
            System.out.println("Bob buys more Potato");
        }

//      Who buys more different products?
        if (bob.size()>alice.size()){
            System.out.println("Bob buys more different products.");
        }
        if (bob.size()<alice.size()){
            System.out.println("Alice buys more different products.");
        }
        if (bob.size()==alice.size()){
            System.out.println("Both buys same amount of different products.");
        }

//      Who buys more products? (piece)
        for (var pieces :bob.entrySet()){
            bobPieces += bob.get(pieces.getKey());
        }
        for (var pieces2 :alice.entrySet()){
            alicePieces += alice.get(pieces2.getKey());
        }

        if (alicePieces>bobPieces){
            System.out.println("Alice buys more products.");
        }
        if (bobPieces>alicePieces){
            System.out.println("Bob buys more products.");
        }
        if (alicePieces==bobPieces){
            System.out.println("Both buys same amount of pieces.");
        }











    }

}
