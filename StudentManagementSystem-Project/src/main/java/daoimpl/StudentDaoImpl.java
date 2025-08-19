
package daoimpl;

import database.DatabaseConnection;
import dao.StudentDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Department;
import model.Student;

public class StudentDaoImpl implements StudentDao {

  
    
    @Override
    public int addStudent(Student student) {
    Department dept = student.getDepartment();
    try (Connection conn = DatabaseConnection.getConnection()) {
        
        // 1. Insert department if not exists
        String checkDept = "SELECT 1 FROM departments WHERE department_code = ?";
        try (PreparedStatement ps = conn.prepareStatement(checkDept)) {
            ps.setString(1, dept.getDepartmentCode());
            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.next()) {
                    String insertDept = "INSERT INTO departments (department_code, department_name) VALUES (?, ?)";
                    try (PreparedStatement psDept = conn.prepareStatement(insertDept)) {
                        psDept.setString(1, dept.getDepartmentCode());
                        psDept.setString(2, dept.getDepartmentName());
                        psDept.executeUpdate(); 
                    }
                }
            }
        }

        // 2. Insert student
        String insertStudent = "INSERT INTO students (student_id, student_name, roll_number, department_code) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps2 = conn.prepareStatement(insertStudent)) {
            ps2.setInt(1, student.getStudentId());
            ps2.setString(2, student.getStudentName());
            ps2.setString(3, student.getStudentRollNumber());
            ps2.setString(4, dept.getDepartmentCode());

            return ps2.executeUpdate(); 
        }

    } catch (SQLException ex) {
        Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }

    return 0;
}

    @Override
    public int updateStudent(Student student) {
        int rows = 0;
    String sql = "UPDATE students SET student_name = ?, roll_number = ?, department_code = ? WHERE student_id = ?";
    
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        ps.setString(1, student.getStudentName());              
        ps.setString(2, student.getStudentRollNumber());         
        ps.setString(3, student.getDepartment().getDepartmentCode()); 
        ps.setInt(4, student.getStudentId());                    
        
        rows = ps.executeUpdate();
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return rows;    
             
    }

    @Override
    public int deleteStudent(int studentId) {
    int rows = 0;
    String sql = "DELETE FROM students WHERE student_id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setInt(1, studentId);
        rows = ps.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return rows;
    }

    @Override
    public Student getSingleStudent(int studentId) {
    Student student = null;
    String sql = "SELECT s.student_id, s.student_name, s.roll_number, d.department_code, d.department_name " +
                 "FROM students s " +
                 "JOIN departments d ON s.department_code = d.department_code " +
                 "WHERE s.student_id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setInt(1, studentId);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                student = new Student();
                student.setStudentId(rs.getInt("student_id"));
                student.setStudentName(rs.getString("student_name"));
                student.setStudentRollNumber(rs.getString("roll_number"));

                Department dept = new Department();
                dept.setDepartmentCode(rs.getString("department_code"));
                dept.setDepartmentName(rs.getString("department_name"));
                student.setDepartment(dept);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return student;

     
    }

    @Override
    public List<Student> getAllStudents() {
       List<Student> students = new ArrayList<>();

    String sql = "SELECT s.student_id, s.student_name, s.roll_number, d.department_code, d.department_name " +
                 "FROM students s " +
                 "JOIN departments d ON s.department_code = d.department_code";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Student student = new Student();
            student.setStudentId(rs.getInt("student_id"));
            student.setStudentName(rs.getString("student_name"));
            student.setStudentRollNumber(rs.getString("roll_number"));

            Department dept = new Department();
            dept.setDepartmentCode(rs.getString("department_code"));
            dept.setDepartmentName(rs.getString("department_name"));
            student.setDepartment(dept);

            students.add(student);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return students;
    }

 
    
 }