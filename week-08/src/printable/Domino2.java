package printable;

public class Domino2 implements Printable {
    private int aSide;
    private int bSide;

    public Domino2(int aSide, int bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino Aside : "+aSide+", B side: "+bSide);
    }
}
