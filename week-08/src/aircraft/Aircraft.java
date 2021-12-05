package aircraft;

public class Aircraft {
    private int ammo;
    private int maxAmmo;
    private int dmg;
    public Aircraft(){
        ammo=0;
    }

    public int fight(){
        int allDmg=getDmg()*getAmmo();
        return allDmg;
    }
    public int refillAmmo(int ammoFromStation){
        int howEmpty=maxAmmo-ammo;
        if (ammo<maxAmmo){
            this.ammo=howEmpty;
            return ammoFromStation-(howEmpty);
        }else {
            return ammoFromStation;
        }
    }
    public void getStatus(){
        System.out.println("Type "+getName()+", Ammo: "+getAmmo()+", Base Damage: "+getDmg());
    }
    public boolean isPriority(){
        if (this.getName()=="F16"){
            return false;
        }else {
            return true;
        }
    }

    public void getType(){
        System.out.println("This aircraft is "+getName());
    }
    public String getName(){
        return "aircraft";
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
}
