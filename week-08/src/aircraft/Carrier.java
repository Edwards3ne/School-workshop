package aircraft;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> aircraftList = new ArrayList<Aircraft>();
    private int ammoStore;
    private int hp;
    public Carrier(int ammoStore,int hp){
        this.ammoStore=ammoStore;
        this.hp=hp;
    }
    public void add(Aircraft aircraft){
        aircraftList.add(aircraft);
    }
    public void fill() throws CarierWithoutAmmoException {
        if (ammoStore==0){
            throw new CarierWithoutAmmoException();
        }
        int ammoNeeded=0;
        for (Aircraft aircraft : aircraftList) {
            ammoNeeded=ammoNeeded+(aircraft.getMaxAmmo()-aircraft.getAmmo());
        }
        if (ammoNeeded>ammoStore){

            for (Aircraft aircraft : aircraftList) {
                if (aircraft.isPriority()){
                   ammoStore= aircraft.refillAmmo(ammoStore);

                }
            }
            for (Aircraft aircraft : aircraftList) {
                if (ammoStore<=0){
                    return;
                }
                ammoStore= aircraft.refillAmmo(ammoStore);
            }

        }else {
            for (Aircraft aircraft : aircraftList) {
                ammoStore= aircraft.refillAmmo(ammoStore);
            }

        }
    }
    public int fight(Carrier carrier){
        int totalDmg=0;
        for (Aircraft aircraft : aircraftList) {
            totalDmg=totalDmg+aircraft.fight();
        }
        carrier.hp=carrier.hp-totalDmg;
        return carrier.hp;
    }
    public void getStatus(){
        if (this.hp<=0){
            System.out.println("It's dead Jim :(");
        }else {
            int totalDmgShip=0;
            for (Aircraft aircraft : aircraftList) {
                totalDmgShip=totalDmgShip+aircraft.fight();
            }
            System.out.println("HP: "+hp+", Aircraft count: "+aircraftList.size()+", Ammo Storage: "+ammoStore+", " +
                    "Total damage: "+totalDmgShip);
            System.out.println("Aircrafts");
            for (Aircraft aircraft : aircraftList) {
                aircraft.getStatus();
            }
        }
    }
}
