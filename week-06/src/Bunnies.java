public class Bunnies {
    public static void main(String[] args) {
        System.out.println(bunies(10, 0));
    }

    public static int bunies(int number, int ears) {
        if (number == 0) {
            return ears;
        } else {
            ears += 2;
            return bunies(number - 1, ears);
        }
    }



}
