public class greatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(divisor(36,60,1,1));
    }

    public static int divisor(int first,int second,int count,int divisorNumber){
        if (count==first || count== second){
            return divisorNumber;
        }
        if (first%count==0 && second%count==0){
            divisorNumber=count;
        }
        return divisor(first,second,count+1,divisorNumber);
    }
}
