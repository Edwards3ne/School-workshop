package Petrol;

import Petrol.Car;

public class Station {
    private int gasAmount = 5000;

    public void refill(Car car){
            gasAmount=gasAmount-(car.getGasAmount()+car.getCapacity());
            car.setGasAmount(car.getGasAmount()+car.getCapacity());

    }

    public int getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }
}
