

package main;

import java.util.Scanner;
import serviceimpl.DepartmentServiceImpl;
import serviceimpl.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StudentServiceImpl studentService = new StudentServiceImpl();
    DepartmentServiceImpl deptService = new DepartmentServiceImpl();
    
     while (true) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Student Menu");
            System.out.println("2. Department Menu");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(sc.nextLine());
                
                switch (choice) {
                case 1 -> {
                    studentMenu(studentService);
                }
                case 2 -> {
                    departmentMenu(deptService);
                }
                case 0 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
                }
    
    }
    
    }
    
    private static void studentMenu(StudentServiceImpl studentService) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- STUDENT MENU ---");
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Get Single Student");
        System.out.println("5. Get All Students");
        System.out.print("Choose: ");
        int ch = Integer.parseInt(sc.nextLine());

        switch (ch) {
            case 1 -> studentService.addStudent();
            case 2 -> studentService.updateStudent();
            case 3 -> studentService.deleteStudent();
            case 4 -> studentService.getSingleStudent();
            case 5 -> studentService.getAllStudent();
            default -> System.out.println("Invalid!");
        }
    }   


        private static void departmentMenu(DepartmentServiceImpl deptService) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- DEPARTMENT MENU ---");
        System.out.println("1. Add Department");
        System.out.println("2. Update Department");
        System.out.println("3. Delete Department");
        System.out.println("4. Get Single Department");
        System.out.println("5. Get All Departments");
        System.out.print("Choose: ");
        int ch = Integer.parseInt(sc.nextLine());

        switch (ch) {
            case 1 -> deptService.addDepartment();
            case 2 -> deptService.updateDepartment();
            case 3 -> deptService.deleteDepartment();
            case 4 -> deptService.getSingleDepartment();
            case 5 -> deptService.getAllDepartment();
            default -> System.out.println("Invalid!");
        }
    }
}