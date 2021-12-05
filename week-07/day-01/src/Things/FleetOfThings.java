package Things;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Things.FleetOfThings.Things.Thing` class
        // - You have the `Things.Fleet` class
        // - You have the `Things.FleetOfThings` class with a `main()` method
        // - Download those, use those
        // - Create a fleet in the main() method
        fleet.add(new Thing("Get milk"));
        fleet.add(new Thing("Remove the obstacles"));
        Thing standup=new Thing("Stand up");
        fleet.add(standup);
        standup.complete();
        Thing eat= new Thing("Eat lunch");
        fleet.add(eat);
        eat.complete();



        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}
