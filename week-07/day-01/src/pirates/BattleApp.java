package pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship aurora = new Ship();
        aurora.fillShip();

        System.out.println("aurora");
        aurora.status();
        System.out.println();


        Ship titanic = new Ship();
        titanic.fillShip();
        System.out.println("titanic");
        titanic.status();
        System.out.println();
        titanic.battle(aurora);
        System.out.println("titanic");
        titanic.status();
        System.out.println();
        System.out.println("aurora");
        aurora.status();


    }
}
