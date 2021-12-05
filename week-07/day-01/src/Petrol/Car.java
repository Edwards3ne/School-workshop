package Petrol;

public class Car {
    private int gasAmount=0;
    private int capacity=100;

    public Car() {
    }

    public Car(int gasAmount, int capacity) {
        this.gasAmount = gasAmount;
        this.capacity = capacity;
    }

    public int getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
