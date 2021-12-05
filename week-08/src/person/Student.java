package person;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;
    public Student(String name,int age,String gender,String previousOrganization){
        super(name,age,gender);
        skippedDays=0;
        this.previousOrganization=previousOrganization;
    }
    public Student(){
        super();
        this.previousOrganization="The School of Life";
    }

   public Student clone(){
        Student student = new Student(this.getName(),this.getAge(),this.getGender(),this.previousOrganization);
       return student;
   }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce() {

        System.out.println("Hi ,I'm "+getName()+ " a "+getAge()+" year old "+getGender()+" from "+previousOrganization+
        " who skipped "+skippedDays+" days from the course already.");
    }
    public void skipDays(int numberOfDays){
        skippedDays=skippedDays+numberOfDays;
    }
}
