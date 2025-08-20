
package serviceimpl;

import dao.StudentDao;
import daoimpl.StudentDaoImpl;
import java.util.List;
import model.Student;
import service.StudentService;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao = new StudentDaoImpl();    
    
    @Override
    public int addStudent(Student student) {
        int result = studentDao.addStudent(student);
        if (result > 0) {
            System.out.println("Student added successfully.");
        }    
        else System.out.println("Failed to add student.");   
        return 0;
    }

    @Override
    public void deleteStudent(String studentId) {
        int result = studentDao.deleteStudent(studentId);
        if (result > 0){
            System.out.println("Student deleted successfully.");
        }
        else System.out.println("Student not found.");  
    }

    @Override
    public List<Student> showAllStudents() {
    return studentDao.getAllStudents();
  }
    
    @Override
    public Student getStudentById(String studentId) {
    return studentDao.getStudentById(studentId);
}
    
}
