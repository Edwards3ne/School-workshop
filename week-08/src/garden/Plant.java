package garden;

public class Plant {
    private double waterAmount;
    private String color;
    private boolean needWater=true;

    public boolean isNeedWater() {
        return needWater;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Plant(String color){
        this.color=color;
        waterAmount=0;

    }
    public void waterNeed(){
        if (waterAmount<5){
            System.out.println("The "+color+" Flower needs water");
            needWater = true;
        }else {
            System.out.println("The "+color+" Flower doesn't need water");
            needWater=false;
        }
    }
    public void watering(double wateringAmount){
        waterAmount=waterAmount+((wateringAmount/4)*3);
    }
}
