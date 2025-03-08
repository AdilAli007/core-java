import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("Shahid","Bugti","Khi","Punjab Colony","ZABIST","CS",210,21,50000,8 );
        students.add(s1);
        System.out.println("List of Student Object: "+students);
    }
}
