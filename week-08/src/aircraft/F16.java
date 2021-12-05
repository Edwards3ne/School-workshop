package aircraft;

public class F16 extends Aircraft{
    private String name="F16";
    public F16(){
        super();
        setMaxAmmo(8);
        setDmg(30);

    }

    public String getName() {
        return name;
    }
}
