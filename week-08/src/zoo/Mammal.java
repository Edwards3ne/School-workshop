package zoo;

public class Mammal extends Animal{
    public Mammal(String name) {
        this.setName(name);
    }

    @Override
    String breed() {
        return "pushing miniature versions out";
    }
}
