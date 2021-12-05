package garden;

public class Tree extends Plant{
    public Tree(String color){
        super(color);
    }

    @Override
    public void waterNeed() {
        if (getWaterAmount()<10){
            System.out.println("The "+getColor()+" Tree needs water");
        }else {
            System.out.println("The "+getColor()+" Tree doesn't need water");
        }
    }

    @Override
    public void watering(double wateringAmount) {
        setWaterAmount(getWaterAmount()+((wateringAmount/10)*4));
    }
}
