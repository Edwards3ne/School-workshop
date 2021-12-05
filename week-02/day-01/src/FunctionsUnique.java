import java.util.Arrays;

public class FunctionsUnique {
    public static void main(String[] args) {
              
        //  Create a function that takes an array of numbers as a parameter
        //  and returns an array of integers where every integer is unique (occurs only once)

        //  Example
        System.out.println(Arrays.toString(findUniqueItems(new int[]{1, 11, 34, 11, 52, 61, 1, 34})));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    public static int[] findUniqueItems(int[] a) {
        int[] newOne = new int[a.length];
        int i = 0;
        newOne[i] = a[i];
        i++;
        for (int c = 1; c < a.length; c++) {
            boolean found = false;
            for (int d = 0; d < i; d++) {
                if (newOne[d] == a[c]) {
                    found = true;

                }
            }if(!found){
                newOne[i] = a[c];
                i++;
            }


        }
        return Arrays.copyOfRange(newOne, 0, i);
    }
}
