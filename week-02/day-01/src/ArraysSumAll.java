public class ArraysSumAll {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
//   with the following content: `[// - Create an array variable named `numbers`
////   with the following content: `[3, 4, 5, 6, 7]`
//// - Print the sum of the elements of `numbers`]`
        int[] numbers = {3, 4, 5, 6, 7};
        int sum = 0;
        for (int a =0;a < numbers.length;a ++){
            sum = sum + numbers[a];
        }
        System.out.println(sum);

    }
}
