package pirates;

import java.util.ArrayList;

public class Armada {
    ArrayList <Ship> fleet=new ArrayList<Ship>();
    int nonDestroyed=0;

    public boolean war(Armada armada){
        for (int i = 0; i < this.fleet.size(); i++) {
            if (this.fleet.get(i).destroyed!=true){
                this.nonDestroyed=nonDestroyed+1;
            }
        }
        for (int i = 0; i < armada.fleet.size(); i++) {
            if (armada.fleet.get(i).destroyed!=true){
                armada.nonDestroyed=nonDestroyed+1;
            }
        }
        int first=0;
        int second=0;
        while (this.nonDestroyed!=0 || armada.nonDestroyed!=0){

            if (this.fleet.get(first).battle(armada.fleet.get(second))){
                second=second++;
                armada.nonDestroyed=armada.nonDestroyed-1;
            }
            if (this.fleet.get(first).battle(armada.fleet.get(second))){
                first=first++;
                this.nonDestroyed=this.nonDestroyed-1;
            }
        }
        if (this.nonDestroyed==0){
            return false;
        }
        return true;
    }




}
