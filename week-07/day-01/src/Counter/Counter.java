package Counter;

public class Counter {
    private int counter =0;
    private int counter2=0;

    public Counter() {
    }

    public Counter(int counter) {
        counter2=counter;
        this.counter = counter;
    }
    public void add(){
        counter=counter+1;
    }
    public void add(int number){
        counter=counter+number;
    }


    public int get() {
        return counter;
    }
    public void reset(){

       counter=counter2;
    }

}
