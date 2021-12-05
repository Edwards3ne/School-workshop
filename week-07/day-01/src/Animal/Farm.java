package Animal;

import java.util.*;

public class Farm {
    ArrayList <Animal> animalsAtFarm = new ArrayList<Animal>();
    public int howManyMax;

    public Farm(int howManyMax){
        if (howManyMax>=0){
            throw new IllegalArgumentException("Number cannot be zero or negative.");
        }
        this.howManyMax=howManyMax;

        }

    public List breed(){
        if(animalsAtFarm.size()<=howManyMax){
            animalsAtFarm.add(new Animal());
        }
        if (animalsAtFarm.size()>howManyMax){
            System.out.println("at farm is not enough place for another animal");
        }
        return animalsAtFarm;
    }
    public List sell(){
        int leastHunger= animalsAtFarm.get(0).getHunger();
        for (int i = 1; i < animalsAtFarm.size(); i++) {

            if (animalsAtFarm.get(i).getHunger()>leastHunger){
                leastHunger= animalsAtFarm.get(i).getHunger();
            }
        }
        for (int i = 0; i < animalsAtFarm.size(); i++) {
            if (animalsAtFarm.get(i).getHunger()==leastHunger){
                animalsAtFarm.remove(i);
                System.out.println(i);
            }
        }
        return animalsAtFarm;
    }
    public int size(){
        return animalsAtFarm.size();
    }




}
