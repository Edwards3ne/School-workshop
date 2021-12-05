public class Power {
    public static void main(String[] args) {
        System.out.println(power(8,2,0));

    }
    public static int power (int base,int nPower,int sum){
        if (nPower==0){
            return sum;
        }else {
            sum = (base*base)*nPower;
            return power(base,nPower-1,sum);
        }
    }
}
