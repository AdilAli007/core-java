
package serviceimpl;

import dao.StudentDao;
import daoimpl.StudentDaoImpl;
import java.util.List;
import java.util.Scanner;
import model.Department;
import model.Student;
import service.StudentService;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao = new StudentDaoImpl();
    
    @Override
    public void addStudent() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Student ID: ");
    int studentId = Integer.parseInt(scanner.nextLine().trim());
    System.out.print("Enter Student Name: ");
    String name = scanner.nextLine().trim();
    System.out.print("Enter Student Roll Number: ");
    String roll = scanner.nextLine().trim();
    System.out.print("Enter Department Code: ");
    String deptCode = scanner.nextLine().trim();
    System.out.print("Enter Department Name: ");
    String deptName = scanner.nextLine().trim();
    
    Department department = new Department();
    department.setDepartmentCode(deptCode);
    department.setDepartmentName(deptName);
    
    Student student = new Student();
    student.setStudentId(studentId);
    student.setStudentName(name);
    student.setStudentRollNumber(roll);
    student.setDepartment(department);
    int rows = studentDao.addStudent(student);
    if(rows > 0){
        System.out.println("Student added successfully!");
    }else{
        System.out.println("Failed to add student.");
    }
    
}

    @Override
    public void updateStudent() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Student ID to Update: ");
    int id = Integer.parseInt(scanner.nextLine().trim());
    System.out.print("Enter Student Name: ");
    String name = scanner.nextLine().trim();
    System.out.print("Enter Student Roll Number: ");
    String roll = scanner.nextLine().trim();
    System.out.print("Enter Department Code: ");
    String deptCode = scanner.nextLine().trim();

    
    Department department = new Department();
    department.setDepartmentCode(deptCode);
    
    
    Student student = new Student();
    student.setStudentId(id);
    student.setStudentName(name);
    student.setStudentRollNumber(roll);
    student.setDepartment(department);
    
    int rows = studentDao.updateStudent(student);
    if(rows > 0){
        System.out.println("Student updated successfully!");
    }else{
        System.out.println("Failed to update student.");
    }

    }
   @Override 
    public void deleteStudent(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Student ID to Delete: ");
    int id = Integer.parseInt(scanner.nextLine().trim());  
    int rows = studentDao.deleteStudent(id);
    if (rows > 0) {
        System.out.println("Student deleted successfully!");
    } else {
        System.out.println("Failed to delete student. Student ID not found.");
    }
    }

    @Override
    public void getSingleStudent() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter student ID to get details: ");
        int id = Integer.parseInt(scanner.nextLine().trim());

    Student student = studentDao.getSingleStudent(id);

    if (student != null) {
        System.out.println("===== Student Details =====");
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Name: " + student.getStudentName());
        System.out.println("Roll Number: " + student.getStudentRollNumber());
        System.out.println("Department Code: " + student.getDepartment().getDepartmentCode());
        System.out.println("Department Name: " + student.getDepartment().getDepartmentName());
        System.out.println("===========================");
    } else {
        System.out.println("No student found with ID: " + id);
    }
    
    }

    @Override
    public void getAllStudent() {
      List<Student> students = studentDao.getAllStudents();

    if (students.isEmpty()) {
        System.out.println("No students found.");
    } else {
        System.out.println("===== All Students =====");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId());
            System.out.println("Name: " + student.getStudentName());
            System.out.println("Roll Number: " + student.getStudentRollNumber());
            System.out.println("Department Code: " + student.getDepartment().getDepartmentCode());
            System.out.println("Department Name: " + student.getDepartment().getDepartmentName());
            System.out.println("-------------------------");
        }
    }
    
    }
}
