import java.util.Arrays;
import java.util.Collections;


public class FunctionsBubble {
    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as parameter
        //  and returns an array where the elements are sorted in ascending numerical order
        //  When you are done, add a second boolean parameter to the function
        //  If it is `true` sort the array descending, otherwise ascending

        //  Example:
        System.out.println(Arrays.toString(bubble(new int[]{34, 12, 24, 9, 5})));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(Arrays.toString(advancedBubble(new int[]{34, 12, 24, 9, 5}, true)));
        //  should print [34, 24, 12, 9, 5]
    }

    public static int[] bubble(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int i2 = i + 1; i2 < a.length; i2++) {
                if (a[i] > a[i2]) {
                    int temp = a[i];
                    a[i] = a[i2];
                    a[i2] = temp;

                }
            }
        }
        return a;
    }


   public static int[] advancedBubble(int[] numbers, boolean b) {

       for (int i = 0; i < numbers.length; i++) {
           for (int i2 = i + 1; i2 < numbers.length; i2++) {
               if (numbers[i] > numbers[i2]) {
                   int temp = numbers[i];
                   numbers[i] = numbers[i2];
                   numbers[i2] = temp;

               }
           }
       }
       if (b == true){
           int[] numbers2 =  new int[numbers.length];
           int j =0;
           for (int a = numbers.length -1; a >=0; a--){

               numbers2[j] = numbers[a];
               j++;

           }
           return numbers2;
       }
        return numbers;
    }
}