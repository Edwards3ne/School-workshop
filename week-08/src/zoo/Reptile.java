package zoo;

public class Reptile extends Animal{
    public Reptile(String name) {
        this.setName(name);
    }

    @Override
    String breed() {
        return "laying eggs";
    }
}
