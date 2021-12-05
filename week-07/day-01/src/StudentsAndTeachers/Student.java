package StudentsAndTeachers;

import StudentsAndTeachers.Teacher;

public class Student {
    public Student() {
    }

    public  void learn(){
        System.out.println("the student is actually learning");

    }
    public  void question(Teacher teacher){
        teacher.giveAnswer();
    }
}
