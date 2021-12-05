package cab;

public class main {
    public static void main(String[] args) {
        Cab cab = new Cab("4567");
        cab.guess("0004");
        cab.guess("4507");
        cab.guess("4567");
        cab.guess("4567");
    }
}
