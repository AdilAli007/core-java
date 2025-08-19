
package serviceimpl;

import dao.DepartmentDao;
import daoimpl.DepartmentDaoImpl;
import java.util.List;
import java.util.Scanner;
import model.Department;
import service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    
     DepartmentDao departmentDao = new DepartmentDaoImpl();

    @Override
    public void addDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Department Code: ");
        String code = scanner.nextLine().trim();
        System.out.print("Enter Department Name: ");
        String name = scanner.nextLine().trim();

        Department dept = new Department();
        dept.setDepartmentCode(code);
        dept.setDepartmentName(name);

        int rows = departmentDao.addDepartment(dept);
        if(rows > 0){
            System.out.println("Department added successfully.");
        }else{
          System.out.println("Failed to add department");   
        }
        
    }

    @Override
    public void updateDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Department Code to Update: ");
        String code = scanner.nextLine().trim();
        System.out.print("Enter New Department Name: ");
        String name = scanner.nextLine().trim();

        Department dept = new Department();
        dept.setDepartmentCode(code);
        dept.setDepartmentName(name);

        int rows = departmentDao.updateDepartment(dept); 
        if(rows > 0){
            System.out.println("Department updated successfully.");
        }else{
          System.out.println("Failed to update department");   
        }
    }

    @Override
    public void deleteDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Department Code to Delete: ");
        String code = scanner.nextLine().trim();

        int rows = departmentDao.deleteDepartment(code); 
        if(rows > 0){
            System.out.println("Department deleted successfully.");
        }else{
          System.out.println("Failed to delete department");   
        }
    }

    @Override
    public void getSingleDepartment() {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Department Code: ");
        String code = scanner.nextLine().trim();

        Department dept = departmentDao.getSingleDepartment(code);
        if (dept != null) {
            System.out.println("Department Code: " + dept.getDepartmentCode());
            System.out.println("Department Name: " + dept.getDepartmentName());
        } else {
            System.out.println("Department not found.");
        }   
    }

    @Override
    public void getAllDepartment() {
    List<Department> departments = departmentDao.getAllDepartment();
    if (departments.isEmpty()) {
            System.out.println("No departments found.");
        } else {
            System.out.println("================ All Departments ================");
            for (Department dept : departments) {
            System.out.println("Department Code: " + dept.getDepartmentCode());
            System.out.println("Department Name: " + dept.getDepartmentName());   
            }
    }
   }
}
