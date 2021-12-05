public class Maximum {
    public static void main(String[] args) {
        int[] numbers = {1, 85, 96, 178, 5, 49,591};
        System.out.println(max(numbers, 0, 0));
    }

    public static int max(int[] aray, int count, int big) {
        if (count == aray.length) {
            return big;
        }
        if (aray[count] > big) {
            big = aray[count];

        }
        return max(aray, count + 1, big);

    }
}
