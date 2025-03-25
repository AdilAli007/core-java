import java.sql.SQLOutput;
import java.util.*;



public class StudentManagementSystem {

    List<Student> studentList = new ArrayList<>();
    List<Department> departmentList = new ArrayList<>();

    public StudentManagementSystem(){
        Student student = new Student();
        Department department = new Department();

        student.setStudentName("ADIL ALI JAMALI");
        student.setStudentId(101);
        student.setStudentRollNumber("2K19/CSM/05");
        department.setDepartmentName("COMPUTER SCIENCE");
        department.setDepartmentCode("CSM");
        System.out.println("|||||||||||||||||||||||||||||||||||||   WELCOME TO STUDENT MANAGEMENT SYSTEM    ||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("================================================================================================================================");
        System.out.println("ID            NAME                          ROLL NUMBER                           DEPARTMENT NAME                 DEPARTMENT CODE");
        System.out.println(student.getStudentId()+"           "+student.getStudentName()+"               "+student.getStudentRollNumber()+"                           "+department.getDepartmentName()+"                "+department.getDepartmentCode());
        System.out.println("================================================================================================================================");
        student.setDepartment(department);

        studentList.add(student);

    }


    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("|||||||||||||||||||||||||||||||||||||||  ENTER YOUR CHOICE  ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("================================================================================================================================");
        System.out.println("1 : STUDENT MANAGEMENT DETAILS");
        System.out.println("2 : DEPARTMENT MANAGEMENT DETAILS");
        System.out.println("3 : EXIT");
        System.out.println("==================================");
        System.out.print("ENTER YOUR CHOICE OF NUMBER : ");
        int num = scanner.nextInt();
        if(num == 1){
            this.displayStudentMenu();
        } else if (num == 2) {
            this.displayDepartmentMenu();
        } else if (num == 3) {
            this.exit();
        }else {
            System.out.println("INVALID CHOICE");
        }
    }

    public void displayStudentMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("1 : ADD Student");
        System.out.println("2 : UPDATE Student");
        System.out.println("3 : DELETE Student");
        System.out.println("4 : GET SINGLE Student");
        System.out.println("5 : GET All Student");
        System.out.println("===================================");
        System.out.print("ENTER YOUR CHOICE OF NUMBER : ");

        int number = scanner.nextInt();
        if(number == 1){
            this.addStudent();
        } else if (number == 2){
            this.updateStudent();
        } else if (number == 3){
            this.deleteStudent();
        }else if (number == 4){
            this.getSingleStudent();
        } else if (number == 5) {
            this.getAllStudent();
        }else {
            System.out.println("INVALID CHOICE");
        }
    }

    public void addStudent(){
        
        System.out.println("===================================");
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        Department department = new Department();

        System.out.print("Enter Student ID: ");
        int number1 = scanner.nextInt();
        student.setStudentId(number1);

        System.out.print("Enter Student Name: ");
        String name = scanner.next();
        student.setStudentName(name);

        System.out.print("Enter Student Roll Number: ");
        String rollNumber = scanner.next();
        student.setStudentRollNumber(rollNumber);

        System.out.print("Enter Department Code: ");
        String departmentCode = scanner.next();
        department.setDepartmentCode(departmentCode);

        System.out.print("Enter Department Name: ");
        String departmentName = scanner.next();
        department.setDepartmentName(departmentName);

        student.setDepartment(department);

        studentList.add(student);

        System.out.println("Student Added Successfully");
        this.displayStudentMenu();
    }

    public void updateStudent(){
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        Department department = new Department();

        System.out.print("Enter Student ID to Update: ");
        int num2 = scanner.nextInt();
            for(int i=0 ; i<studentList.size(); i++){

            if(studentList.get(i).getStudentId() == num2){

                System.out.print("Enter Student Name: ");
                String name = scanner.next();
                student.setStudentName(name);

                System.out.print("Enter Student Roll Number: ");
                String rollNumber = scanner.next();
                student.setStudentRollNumber(rollNumber);

                System.out.print("Enter Department Code: ");
                String departmentCode = scanner.next();
                department.setDepartmentCode(departmentCode);

                System.out.print("Enter Department Name: ");
                String departmentName = scanner.next();
                department.setDepartmentName(departmentName);

                student.setDepartment(department);


                studentList.set(i,student);
                student.setStudentId(num2);
            }

        }

            System.out.println("Student Updated Successfully");
            this.displayStudentMenu();
    }

    public void deleteStudent(){
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter Student ID to Delete: ");
        int id = scanner.nextInt();

        List<Student> removeStudent = new ArrayList<>();
        for(Student s : studentList){
            if(id == s.getStudentId()){
                removeStudent.add(s);
            }
        }
        studentList.removeAll(removeStudent);

        System.out.println("Student Deleted Successfully");
        this.displayStudentMenu();
    }

    public void getSingleStudent(){
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student ID to get details of particular student: ");
        int id = scanner.nextInt();
        for(Student s : studentList) {
            if (s.getStudentId() == id)
            {
                System.out.println("Student Id: " + s.getStudentId()+"\nStudent Name: " + s.getStudentName()+"\nStudent Roll Number: " + s.getStudentRollNumber()+"\n"+s.getDepartment());
            }
        }
        this.displayStudentMenu();
    }

    public void getAllStudent(){
        System.out.println("ALL STUDENTS DETAILS");

        for(int i=0; i < studentList.size(); i++){
            System.out.println("=====================");
            System.out.println("STUDENT INDEX: "+i);
            System.out.println("STUDENT ID: "+studentList.get(i).getStudentId()+"\nSTUDENT NAME: "+studentList.get(i).getStudentName()+"\nSTUDENT ROLL NUMBER:"+studentList.get(i).getStudentRollNumber()+"\nDEPARTMENT DETAILS: "+studentList.get(i).getDepartment());
            System.out.println("=====================");
            }
        this.displayStudentMenu();


    }

    public void displayDepartmentMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("1 : ADD Department");
        System.out.println("2 : UPDATE Department");
        System.out.println("3 : DELETE Department");
        System.out.println("4 : GET SINGLE Department");
        System.out.println("5 : GET All Department");
        System.out.println("===================================");
        System.out.print("ENTER YOUR CHOICE : ");
        int number = scanner.nextInt();
        if(number == 1){
            this.addDepartment();
        } else if (number == 2){
            this.updateDepartment();
        } else if (number == 3){
            this.deleteDepartment();
        }else if (number == 4){
            this.getSingleDepartment();
        } else if (number == 5) {
            this.getAllDepartment();
        }else {
            System.out.println("INVALID CHOICE");
        }
    }

    public void addDepartment() {
        System.out.println("===================================");
        Scanner scanner = new Scanner(System.in);
        Department departmentObject = new Department();

        System.out.print("Enter Department Name: ");
        String deptName = scanner.nextLine();
        departmentObject.setDepartmentName(deptName);

        System.out.print("Enter Department Code: ");
        String departmentCode = scanner.nextLine();
        departmentObject.setDepartmentCode(departmentCode);

        System.out.println("Department Added Successfully");
        departmentList.add(departmentObject);

        this.displayDepartmentMenu();
    }

    public void updateDepartment() {

        Scanner scanner = new Scanner(System.in);
        Department departmentObject = new Department();

        System.out.print("Enter Department Code You Want To Update: ");
        String deptCode = scanner.nextLine();

        for(int i=0 ; i< departmentList.size(); i++) {
            if (departmentList.get(i).getDepartmentCode().equalsIgnoreCase(deptCode)) {
                System.out.print("Enter New Department Name: ");
                String departmentName = scanner.next();
                departmentObject.setDepartmentName(departmentName);

                System.out.print("Enter New Department Code: ");
                String departmentCode = scanner.next();
                departmentObject.setDepartmentCode(departmentCode);

                departmentList.set(i,departmentObject);
                departmentObject.setDepartmentCode(deptCode);

                System.out.println("Department Updated Successfully ");
            } else {
                System.out.println("This Department does not exist in List");
            }
        }
        this.displayDepartmentMenu();
    }

    public void deleteDepartment(){
        Scanner scanner = new Scanner(System.in);
        Department departmentObject = new Department();

        System.out.print("Enter Department Code You Want To Delete: ");
        String deptCode = scanner.next();

        List<Department> removeDepartment = new ArrayList<>();
        for(Department d : departmentList){
            if(deptCode.equals(d.getDepartmentCode())){
                removeDepartment.add(d);
            }
        }
        departmentList.removeAll(removeDepartment);

        System.out.println("Department Deleted Successfully");
        this.displayDepartmentMenu();
    }

    public void getSingleDepartment(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Department Code You Want: ");
        String deptCode = scanner.next();

        for(Department d : departmentList){
            if(deptCode.equalsIgnoreCase(d.getDepartmentCode())){
                System.out.println("Department Name: "+d.getDepartmentCode());
            }else{
                System.out.println("This Department doesn't present in the list");
            }
        }
        this.displayDepartmentMenu();
    }

    public void getAllDepartment(){
        System.out.println("ALL DEPARTMENT DETAILS");

        for(int i=0; i < departmentList.size(); i++){
            System.out.println("=====================");
            System.out.println("DEPARTMENT NAME: "+departmentList.get(i).getDepartmentName()+"\nDEPARTMENT CODE: "+departmentList.get(i).getDepartmentCode());
            System.out.println("=====================");
        }
        this.displayDepartmentMenu();
    }


    public void exit(){
        System.out.println("Program Exit");
    }
}
