package Animal;

public class Main {
    public static void main(String[] args) {
        Farm donaldsFarm=new Farm(5);
        donaldsFarm.breed();
        donaldsFarm.breed();
        donaldsFarm.breed();
        donaldsFarm.breed();
        System.out.println(donaldsFarm.animalsAtFarm.size());
        donaldsFarm.breed();
        donaldsFarm.breed();
        donaldsFarm.animalsAtFarm.get(0).eat();
        donaldsFarm.sell();
        System.out.println(donaldsFarm.animalsAtFarm.size());






    }
}
