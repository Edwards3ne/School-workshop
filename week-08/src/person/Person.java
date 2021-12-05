package person;



public class Person {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String name, int age, String gender){
        this.name= name;
        this.age= age;
        this.gender=gender;
    }
    public Person(){
        this("Jane Doe",30,"female");

    }

    public void getGoal(){
        System.out.println("My goal is :Live for the moment!");
    }
    public void introduce(){
        System.out.println("Hi ,I'm "+name+ " a "+age+" year old "+gender+" .");
    }
}
