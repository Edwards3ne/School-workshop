package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Plant> plantList;

    public Garden() {
        plantList = new ArrayList<>();
    }


    public void addFlower(String color) {
        plantList.add(new Flower(color));
    }


    public void addTree(String color) {
        plantList.add(new Tree(color));
    }
    public void info(){
        for (Plant plant : plantList) {
            plant.waterNeed();
        }
    }

    public void watering(double amount) {
        int needWater = 0;
        for (Plant plant : plantList) {
            if (plant.isNeedWater()) {
                needWater++;
            }
        }
        double waterSupply = amount / needWater;
        for (Plant plant : plantList) {
            plant.watering(waterSupply);
        }

    }
}
