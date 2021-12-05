import StudentsAndTeachers.Student;
import StudentsAndTeachers.Teacher;

public class StudentTeacherMain {
    public static void main(String[] args) {
        Teacher Olda=new Teacher();
        Student John=new Student();
        Olda.teach(John);

        John.question(Olda);

    }
}
