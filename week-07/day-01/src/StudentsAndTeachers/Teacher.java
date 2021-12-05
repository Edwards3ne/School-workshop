package StudentsAndTeachers;

public class Teacher {
    public Teacher() {
    }

    public  void teach(Student student){
        student.learn();
    }
    public  void giveAnswer(){
        System.out.println("the teacher is answering a question");
    }
}
