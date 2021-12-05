import Petrol.Car;
import Petrol.Station;

public class StationAndCarMain {
    public static void main(String[] args) {
        Car skoda=new Car();
        Station shell= new Station();
        shell.refill(skoda);
        System.out.println(shell.getGasAmount());
        System.out.println(skoda.getGasAmount());

    }
}
