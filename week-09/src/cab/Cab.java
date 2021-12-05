package cab;

public class Cab {
    private String secretNumber;
    private int counter;
    private String guessNumber;
    private boolean playing;


    public Cab(String secretNumber) {
        if (secretNumber.length()>4){
            throw new IllegalArgumentException("Number must have 4 digits");
        }
        this.secretNumber = secretNumber;
    }

    public void guess(String guessNumber){
        this.guessNumber=guessNumber;
        int bull=0;
        int cow=0;
        counter++;
        for (int i = 0; i < guessNumber.length(); i++) {
            if (guessNumber==secretNumber){
                cow=4;
                playing=false;
                System.out.println("count"+counter+" "+cow+" cow you are finished");
                return;
            }
            if (guessNumber.charAt(i)==secretNumber.charAt(i)){
                cow=cow+1;
            }
            if (guessNumber.charAt(i)!=secretNumber.charAt(i)) {
                for (int j = 0; j < secretNumber.length(); j++) {

                    if (guessNumber.charAt(i) == secretNumber.charAt(j)) {
                        bull = bull + 1;
                    }
                }
            }
        }

        if (guessNumber!=secretNumber){

            System.out.println("count"+counter+" "+cow+" cow "+bull+" bull you still playing" );
        }
    }



}
