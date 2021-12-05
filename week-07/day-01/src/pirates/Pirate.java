package pirates;

public class Pirate {
    int intoxicated=0;
    boolean death = false;
    int random=(int) (Math.random()*3);




    public int drinkSomeRum(){
        if (death==true){
            System.out.println("he's dead");
            return 0;
        }
        intoxicated=intoxicated+1;
        return intoxicated;
    }

    public void howItGoingMate(){
        if (death==true) {
            System.out.println("he's dead");
        }

        if (intoxicated<4){
            System.out.println("Pour me anudder!");
        }
        if (intoxicated>=4){
            System.out.println("Arghh, I'ma pirates.Pirate. How d'ya d'ink its goin?");
            intoxicated=0;
        }

    }
    public boolean brawl(Pirate pirate) {
        if (this.death) {
            System.out.println("Our pirate is death.");
            return this.death;
        }
        if (pirate.death) {
            System.out.println("Second pirate is death.");
            return pirate.death;
        }
        if (random == 0) {
            System.out.println("Our pirate win brawl");

            return pirate.death;
        }
        if (random == 1) {
            System.out.println("Second pirate win brawl");
            return this.death = true;
        }
        if (random == 2) {
            System.out.println("Both Pirates pass out.");
            return this.death;
        }
        return this.death;
    }



    public boolean die(){
        return death=true;
    }

}
