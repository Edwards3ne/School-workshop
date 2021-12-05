package Sharpie;

public class Sharpie {
    private String color;
    private double width;
    private double inkAmount=100;

    public Sharpie() {
    }

    public Sharpie(String color, double width) {
        if (width<0){
            throw new IllegalArgumentException("Width cannot be negative number");
        }
        if (width==0){
            throw new IllegalArgumentException("Width cannot be zero");
        }
        this.color = color;
        this.width = width;
    }
    public void use(){
        inkAmount=inkAmount+10;
    }

    public double getInkAmount() {
        return inkAmount;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public void setInkAmount(double inkAmount) {
        if (inkAmount<0){
            throw new IllegalArgumentException("Number can't be negative");
        }
        this.inkAmount = inkAmount;
    }
}
