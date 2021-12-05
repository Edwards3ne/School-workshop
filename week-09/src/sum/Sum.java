package sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    private List <Integer> list;

    public Sum() {
        this.list =new ArrayList<>();
    }
    public void add(Integer number){
        if (number==null){
            throw new IllegalArgumentException("Integer cant be null.");
        }
        list.add(number);

    }

    public int sumInt(){

        int sumNumber=0;
        for (Integer integer : list) {

            sumNumber = sumNumber+integer;
        }
        return sumNumber;
    }
}
