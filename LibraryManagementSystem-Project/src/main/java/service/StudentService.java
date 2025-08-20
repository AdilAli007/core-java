
package service;

import java.util.List;
import model.Student;

public interface StudentService {
    int addStudent(Student student);
    void deleteStudent(String studentId);
    List<Student> showAllStudents();
    Student getStudentById(String studentId);      
}
