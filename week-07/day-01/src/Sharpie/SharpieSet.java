package Sharpie;

import java.util.*;

public class SharpieSet {
    ArrayList<Sharpie> SharpieList = new ArrayList<Sharpie>();

    public SharpieSet(){

    }

    public List add(Sharpie sharpie){
       SharpieList.add(sharpie);
       return SharpieList;
    }
    public void countUsable(){
        int count=0;
        for (int i = 0; i < SharpieList.size(); i++) {
            if(SharpieList.get(i).getInkAmount()>0){
                count++;
            }
        }
        System.out.println(count);
    }
    public void removeTrash(){
        int count=0;
        for (int i = 0; i < SharpieList.size(); i++) {
            if(SharpieList.get(i).getInkAmount()==0){
               SharpieList.remove(i);
            }
        }

    }
    public int size(){
       return SharpieList.size();
    }





}
