package Animal;

public class Animal {
    private int hunger=50;
    private int thirst=50;


    public void eat(){
        hunger=hunger+1;
    }
    public void drink(){
        thirst=thirst+1;
    }
    public void play(){

        hunger=hunger-1;
        thirst=thirst-1;

    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }
}
