
package dao;

import java.util.List;
import model.Student;

public interface StudentDao {
    int addStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(int studentId);
    Student getSingleStudent(int studentId);
    List<Student> getAllStudents();
   
}
