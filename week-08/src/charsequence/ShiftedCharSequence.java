package charsequence;

public class ShiftedCharSequence implements CharSequence{
    private String string;
    private int number;

    public ShiftedCharSequence(String string, int number) {
        this.string = string;
        this.number = number;
    }

    @Override
    public char chartAt(int index) {
        String neew="";
        neew=string.substring(number);
        for (int i = 0; i < index; i++) {
            neew=neew+string.charAt(i);
        }
        return neew.charAt(index);
    }
}
