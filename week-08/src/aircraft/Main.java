package aircraft;

public class Main {
    public static void main(String[] args) {

        Carrier ussEnterprise=new Carrier(200,5000);
        Carrier bismark=new Carrier(500,2500);
        ussEnterprise.add(new F16());
        ussEnterprise.add(new F35());
        ussEnterprise.add(new F16());
        ussEnterprise.add(new F35());
        ussEnterprise.add(new F16());
        bismark.add(new F16());
        bismark.add(new F16());
        bismark.add(new F16());
        bismark.add(new F16());
        try {
            ussEnterprise.fill();
            ussEnterprise.fill();
            ussEnterprise.fill();
            bismark.fill();
        }catch (CarierWithoutAmmoException e){
            System.out.println(e);
        }


      ussEnterprise.getStatus();
        bismark.getStatus();

        ussEnterprise.fight(bismark);
        ussEnterprise.getStatus();
        bismark.getStatus();
        ussEnterprise.fight(bismark);
        ussEnterprise.getStatus();
        bismark.getStatus();

    }
}
