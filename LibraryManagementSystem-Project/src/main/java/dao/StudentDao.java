
package dao;

import java.util.List;
import model.Student;

public interface StudentDao {
    int addStudent(Student student);
    int deleteStudent(String studentId);
    List<Student> getAllStudents();
    Student getStudentById(String studentId);
}
