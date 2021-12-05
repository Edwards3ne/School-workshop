package pirates;

import java.util.ArrayList;

public class Ship {
    ArrayList <Pirate> crew=new ArrayList<Pirate>();
    ArrayList <Pirate> captain = new ArrayList<Pirate>();
    int random = (int) (Math.random()*112);
    boolean destroyed=false;


    public ArrayList fillShip(){
        for (int i = 0; i < random; i++) {
             crew.add(new Pirate());

        }
        captain.add(crew.get(0));
        return crew;
    }
    public void status(){
        int number=0;
        System.out.println("Captain consumed "+ captain.get(0).intoxicated +"  mugs of rum");
        if (!captain.get(0).death){
            System.out.println("Captain is alive");
        }
        if (captain.get(0).death){
            System.out.println("Captain is death :(");
        }
        for (int i = 0; i < crew.size(); i++) {
            if (!crew.get(i).death){
                number=number+1;
            }
        }
        System.out.println("On ship is "+number+" pirates alive");

    }
    public boolean battle(Ship ship){

        int scoreOur=0;

        int scoreOther=0;
        for (int i = 0; i <= (this.crew.size()-1); i++) {
            if (!this.crew.get(i).death){
                scoreOur=scoreOur+1;
            }
        }
        for (int i = 0; i <= (ship.crew.size()-1); i++) {
            if (ship.crew.get(i).death = false){
                scoreOther=scoreOther+1;
            }
        }
        scoreOur=scoreOur+this.captain.get(0).intoxicated;
        scoreOther=scoreOther+ship.captain.get(0).intoxicated;
        if (scoreOur>scoreOther){
            int random = (int) (Math.random()*(ship.crew.size()));

            for (int i = 0; i < random ; i++) {
                ship.crew.get(i).die();
            }
            for (int i = 0; i < this.crew.size(); i++) {
                this.crew.get(i).drinkSomeRum();
                this.captain.get(0).drinkSomeRum();
            }


            return true;
        }
        if (scoreOur<scoreOther){
            int random = (int) (Math.random()*(this.crew.size()));

            for (int i = 0; i < random ; i++) {
                this.crew.get(i).die();
            }
            for (int i = 0; i < ship.crew.size(); i++) {
                ship.crew.get(i).drinkSomeRum();
            }
            ship.captain.get(0).drinkSomeRum();
            return false;
        }
        return false;
    }
}
