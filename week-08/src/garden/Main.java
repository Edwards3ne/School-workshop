package garden;

public class Main {
    public static void main(String[] args) {
        Garden botanicGarden=new Garden();
        botanicGarden.addFlower("yellow");
        botanicGarden.addFlower("blue");
        botanicGarden.addTree("purple");
        botanicGarden.addTree("orange");
        botanicGarden.info();
        System.out.println();
        botanicGarden.watering(40);
        botanicGarden.info();
        System.out.println();
        botanicGarden.watering(70);
        botanicGarden.info();
    }
}
