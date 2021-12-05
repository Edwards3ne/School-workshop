public class SumDigits {
    public static void main(String[] args) {
        int rem = 0;
        int sum = 0;
        System.out.println(addNumber(256,0,0));

    }

    public static int addNumber(int n,int rem,int sum) {

        if (n == 0) {

            return sum;
        } else {
            rem = n% 10;
            sum = sum+rem;

             return addNumber(n /10,rem,sum);
        }
    }

}
