import java.util.ArrayList;

public class DataStructuresShopList {
    public static void main(String[] args) {
        var shopList = new  ArrayList <String>();
        shopList.add("eggs");
        shopList.add("milk");
        shopList.add("fish");
        shopList.add("apples");
        shopList.add("bread");
        shopList.add("chicken");
        if (shopList.contains("milk")){
            System.out.println("Yes we have milk on the list. ");
        }else System.out.println("No we don't have milk on our shopping list");

        if (shopList.contains("bananas")){
            System.out.println("Yes we have bananas on the list. ");
        }else System.out.println("No we don't have bananas on our shopping list");

    }
}
