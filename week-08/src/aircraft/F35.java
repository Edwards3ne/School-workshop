package aircraft;

public class F35 extends Aircraft{
    private String name="F35";
    public F35(){
        super();
        setMaxAmmo(12);
        setDmg(50);
    }

    @Override
    public String getName() {
        return name;
    }
}
