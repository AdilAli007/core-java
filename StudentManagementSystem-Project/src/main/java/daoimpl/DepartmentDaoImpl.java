
package daoimpl;


import dao.DepartmentDao;
import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Department;

public class DepartmentDaoImpl implements DepartmentDao {
    
    @Override
    public int addDepartment(Department department) {
        String sql = "INSERT INTO departments (department_code, department_name) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, department.getDepartmentCode());
            ps.setString(2, department.getDepartmentName());
            return ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateDepartment(Department department) {
    String sql = "UPDATE departments SET department_name = ? WHERE department_code = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, department.getDepartmentName());
            ps.setString(2, department.getDepartmentCode());
            return ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    
    }

    @Override
    public int deleteDepartment(String deptCode) {
    String sql = "DELETE FROM departments WHERE department_code = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, deptCode);
            return ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
 
    }
    
    @Override
    public Department getSingleDepartment(String deptCode) {
        Department dept = null;
        String sql = "SELECT department_code, department_name FROM departments WHERE department_code = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, deptCode);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    dept = new Department();
                    dept.setDepartmentCode(rs.getString("department_code"));
                    dept.setDepartmentName(rs.getString("department_name"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dept;
    }

    @Override
    public List<Department> getAllDepartment() {
        List<Department> departments = new ArrayList<>();
        String sql = "SELECT department_code, department_name FROM departments";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Department dept = new Department();
                dept.setDepartmentCode(rs.getString("department_code"));
                dept.setDepartmentName(rs.getString("department_name"));
                departments.add(dept);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departments;
    }
    }
    
    
    

