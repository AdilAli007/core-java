/*
Task # 5
Create an employee class. The member data should comprise an int for storing the employee number
and a float for storing the employee’s salary. Member functions should allow the user to enter this data
and display it. Write a main() that allows the user to enter data for three employees and display it.
 */

import java.util.Scanner;

public class Employee {
    int empNumber;
    float salary ;

    public void enterData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee number: ");
        empNumber = scanner.nextInt();
        System.out.println("Enter employee salary: ");
        salary = scanner.nextFloat();
    }
    public void display(){
        System.out.println("Employee Number: "+empNumber);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        System.out.println("Enter data for employee 1: ");
        employee1.enterData();
        employee1.display();

        System.out.print("\nEnter data for employee 2: ");
        employee2.enterData();
        employee2.display();

        System.out.print("\nEnter data for employee 3: ");
        employee3.enterData();
        employee3.display();
    }
}
