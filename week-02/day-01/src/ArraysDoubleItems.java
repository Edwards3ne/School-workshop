public class ArraysDoubleItems {
    public static void main(String[] args) {
        // - Create an array variable named `numberList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
        int[] numberList = {3, 4, 5, 6, 7};
        for (int a =0;a <numberList.length;a ++){
            numberList[a] = numberList[a] * 2;
        }
        for (int b = 0;b <numberList.length;b ++)
            System.out.println(numberList[b]);

    }
}
