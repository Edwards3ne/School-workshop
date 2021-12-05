public class ArraysReverse {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements of `numbers`
// - Print the elements of the reversed `numbers`
        int[] numbers = {3, 4, 5, 6, 7};
        for (int a = 0; a < numbers.length; a++) {
            System.out.print(numbers[a]);
        }
        System.out.println();
        for (int a = numbers.length - 1; a >=0; a--){
            System.out.print(numbers[a]);
        }

    }
}
