public class Bunnies2 {
    public static void main(String[] args) {
        System.out.println(bunnies(10,0));
    }

    public static int bunnies(int number,int ears){
        if (number==0){
            return ears;
        }
        if (number%2==0){
            ears = ears +3;

        }
        if (number%2!=0){
            ears= ears+2;

        }
        return bunnies(number-1,ears);
    }
}
