import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DataStructuresMatchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(ArrayList Girls,ArrayList Boys){
        var newList = new ArrayList<String>();
        newList.addAll(Girls);

        int i =0;
        int size = (newList.size()+ Boys.size())-2;

        for (int j = 0; j < size; j++) {
            if (j< Boys.size()){
                newList.add(i,(String) Boys.get(j));
            }
            i=+1;
            if (j< Girls.size()){
                newList.add(i,(String) Girls.get(j));
            }
            i=+1;

        }




        return newList;
    }

}