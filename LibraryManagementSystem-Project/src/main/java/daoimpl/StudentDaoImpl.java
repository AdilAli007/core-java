
package daoimpl;

import dao.StudentDao;
import database.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Student;

public class StudentDaoImpl implements StudentDao {

@Override
public int addStudent(Student student) {
    String checkBook = "SELECT COUNT(*) FROM Books WHERE book_id = ?";
    String insert = "INSERT INTO Students (student_id, student_name, roll_number, book_id) VALUES (?, ?, ?, ?)";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement checkStmt = conn.prepareStatement(checkBook)) {

        checkStmt.setInt(1, student.getBookId());
        ResultSet rs = checkStmt.executeQuery();
        if (rs.next() && rs.getInt(1) == 0) {
            System.out.println("Book with ID " + student.getBookId() + " does not exist!");
            return 0; 
        }

        try (PreparedStatement stmt = conn.prepareStatement(insert)) {
            stmt.setString(1, student.getStudentId());
            stmt.setString(2, student.getStudentName());
            stmt.setString(3, student.getStudentRollNumber());
            stmt.setInt(4, student.getBookId());
            return stmt.executeUpdate();
        }

    } catch (SQLException e) {
        System.out.println("Error adding student: " + e.getMessage());
    }
    return 0;
}

    @Override
    public int deleteStudent(String studentId) {
        String sql = "DELETE FROM Students WHERE student_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, studentId);
            return stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
        return 0;    
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM Students";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                students.add(new Student(
                        rs.getString("student_id"),
                        rs.getString("student_name"),
                        rs.getString("roll_number"),
                        rs.getInt("book_id")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Error loading students: " + e.getMessage());
        }
        return students;
    } 
    
    @Override
    public Student getStudentById(String studentId) {
    String sql = "SELECT * FROM Students WHERE student_id = ?";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, studentId);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return new Student(
                rs.getString("student_id"),
                rs.getString("student_name"),
                rs.getString("roll_number"),
                rs.getInt("book_id") 
            );
        }
    } catch (SQLException e) {
        System.out.println("Error finding student: " + e.getMessage());
    }
    return null;
}
    
   }
    

