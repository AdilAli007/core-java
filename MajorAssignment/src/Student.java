/*
Create a class called Student. It will contain member functions that will read and print student’s detail
using atleast 8 of the student’s attributes for example: his/her ID, First name, Last Name, Contact, City,
DOB, Current Semester, No. of courses enrolled etc.
The program should allow the user to enter his/her details and print them accordingly
 */

import java.util.Scanner;

public class Student {

         private String firstName;
         private String lastName;
         private String city;
         private String dateOfBirth;
         private String currentSemester;
         private int numberOfCourses;
         private int id ;
         private long contact ;

         public Student(String firstName, String lastName, String city, String dateOfBirth, String currentSemester,int numberOfCourses, int id, long contact){
             this.firstName = firstName;
             this.lastName = lastName;
             this.city = city;
             this.dateOfBirth = dateOfBirth;
             this.currentSemester = currentSemester;
             this.numberOfCourses = numberOfCourses;
             this.id = id;
             this.contact = contact;
         }

        public void studentInformation(){
        System.out.println("Student First name: "+firstName);
        System.out.println("Student Last name: "+lastName);
        System.out.println("Student city name: "+city);
        System.out.println("Student Date of Birth: "+dateOfBirth);
        System.out.println("Student Current Semester: "+currentSemester);
        System.out.println("Student Number of Courses Enrolled: "+numberOfCourses);
        System.out.println("Student Id Number: "+id);
        System.out.println("Student Contact Number: "+contact);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Student Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Student city: ");
        String city = scanner.nextLine();
        System.out.print("Enter Student Date of Birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Enter Student Current Semester: ");
        String currentSemester = scanner.nextLine();
        System.out.print("Enter Students Courses: ");
        int numberOfCourses = scanner.nextInt();
        System.out.print("Enter Student Id Number: ");
        int id = scanner.nextInt();
        System.out.print("Enter Student Contact Number: ");
        int contact = scanner.nextInt();

        Student student = new Student(firstName,lastName,city,dateOfBirth,currentSemester,numberOfCourses,id,contact);
        student.studentInformation();
    }
}
