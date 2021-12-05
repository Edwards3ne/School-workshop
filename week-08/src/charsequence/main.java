package charsequence;

public class main {
    public static void main(String[] args) {
        Gnirts gnirts = new Gnirts("example");
        System.out.println(gnirts.chartAt(1));
        ShiftedCharSequence shifter= new ShiftedCharSequence("example",2);
        System.out.println(shifter.chartAt(0));
    }
}
