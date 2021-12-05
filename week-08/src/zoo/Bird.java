package zoo;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        this.setName(name);
    }

    @Override
    String breed() {
        return "laying eggs";
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }
}
