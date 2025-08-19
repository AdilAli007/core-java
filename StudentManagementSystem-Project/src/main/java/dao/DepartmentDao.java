
package dao;

import java.util.List;
import model.Department;

public interface DepartmentDao {
    int addDepartment(Department department);
    int updateDepartment(Department department);
    int deleteDepartment(String deptCode);
    Department getSingleDepartment(String deptCode);
    List<Department> getAllDepartment();
}
