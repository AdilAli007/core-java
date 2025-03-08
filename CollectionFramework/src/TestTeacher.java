import java.util.ArrayList;
import java.util.List;

public class TestTeacher {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        Teacher t1 = new Teacher();
        t1.setName("ALI");
        t1.setCaste("JAMALI");
        t1.setCity("HYD");
        t1.setAddress("QASIMABAD HYD");
        t1.setExperience("TWO YEARS");
        t1.setSubject("COMPUTER SCIENCE");
        t1.setDepartment("IMCS");
        t1.setAge(30);
        t1.setId(101);
        t1.setSalary(60000);
        teachers.add(t1);
        System.out.println("List of Teacher Object: "+teachers);
    }
}
