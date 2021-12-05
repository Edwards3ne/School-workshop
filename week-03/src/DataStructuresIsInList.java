import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructuresIsInList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        System.out.println(checkNums(list));
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"
    }

    public static Boolean checkNums(List old){
        var are=new ArrayList<>();
        are.add(4);
        are.add(8);
        are.add(12);
        are.add(16);
        if(old.containsAll(are)){
            return true;
        }
        return false;
    }
}
