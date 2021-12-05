public class ArraysSwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`
        String[] orders = {"first", "second", "third"};

        String first = orders[0];
        orders[0] = orders[2];
        orders[2] = first;
        System.out.println(orders[0]);
        System.out.println(orders[2]);
    }
}
