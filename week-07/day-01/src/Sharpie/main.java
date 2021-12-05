package Sharpie;

public class main {
    public static void main(String[] args) {
        Sharpie titanic=new Sharpie("Blue",100);
        SharpieSet sharpieSet= new SharpieSet();
        sharpieSet.add(titanic);
        sharpieSet.countUsable();
        Sharpie britanic =new Sharpie("Black",123);
        sharpieSet.add(britanic);
        sharpieSet.countUsable();
        britanic.setInkAmount(0);
        sharpieSet.countUsable();
        System.out.println(sharpieSet.size());
        sharpieSet.removeTrash();
        System.out.println(sharpieSet.size());


    }
}
