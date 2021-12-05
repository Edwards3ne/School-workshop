package charsequence;

public class Gnirts implements CharSequence {
    private String string;

    public Gnirts(String string) {
        this.string = string;
    }

    @Override
    public char chartAt(int index) {
        String neew="";
        for (int i = (string.length()-1); i >= 0; i--) {
            neew=neew+string.charAt(i);
        }

        return neew.charAt(index);
    }
}
