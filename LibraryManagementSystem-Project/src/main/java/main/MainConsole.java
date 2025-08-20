package main;

import java.util.List;
import java.util.Scanner;
import model.Books;
import model.Student;
import service.BookService;
import service.StudentService;
import serviceimpl.BookServiceImpl;
import serviceimpl.StudentServiceImpl;

public class MainConsole {
        private static final Scanner scanner = new Scanner(System.in);  
        private static final BookService bookService = new BookServiceImpl();
        private static final StudentService studentService = new StudentServiceImpl();
  
        public static void main(String[] args) {
        while (true) {
            showMenu();
        }
    }
    
        private static void showMenu() {
        System.out.println("=========================================================");
        System.out.println("Choose any number of your choice to perform specific task");
        System.out.println("=========================================================");
        System.out.println("1. Add book into library");
        System.out.println("2. Issue book to student");
        System.out.println("3. Return book from student");
        System.out.println("4. Show all books");
        System.out.println("5. Show all students");
        System.out.println("6. Exit");
        System.out.println("=========================================================");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();         
    
            switch (choice) {
            case 1 -> addBook();
            case 2 -> issueBook();
            case 3 -> returnBook();
            case 4 -> showAllBooks();
            case 5 -> showAllStudents();
            case 6 -> {
                System.out.println("Exiting program... Goodbye!");
                System.exit(0);
            }
            default -> System.out.println("Invalid choice. Try again.");
        }
    }    

    private static void addBook() {
        System.out.print("Enter book id: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name of book: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter book ISBN: ");
        String bookISBN = scanner.nextLine();

        System.out.print("Enter author name: ");
        String authorName = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        Books book = new Books(bookId, bookName, bookISBN, authorName, quantity);
        bookService.addBook(book);
    }
        
     private static void issueBook() {
        System.out.print("Enter student id: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter name of student: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter student roll number: ");
        String studentRollNumber = scanner.nextLine();

        System.out.print("Enter book Id: ");
        int bookId = scanner.nextInt();

        boolean issued = bookService.issueBook(bookId);
        if (issued) {
            Student student = new Student(studentId, studentName, studentRollNumber, bookId);
            studentService.addStudent(student);
        }
    }       
        
        private static void returnBook() {
        System.out.print("Enter student id: ");
        String studentId = scanner.nextLine();

        Student student = studentService.getStudentById(studentId);
        if (student == null) {
        System.out.println("Student not found.");
        return;
        }

        int bookId = student.getBookId();
        bookService.returnBook(bookId);   // 🔹 return by bookId
        studentService.deleteStudent(studentId);
        System.out.println("Book returned successfully!");
    }        
        
        private static void showAllBooks() {
        List<Books> books = bookService.showAllBooks();
        System.out.printf("%-8s %-20s %-15s %-15s %-8s%n", "ID", "Name", "ISBN", "Author", "Quantity");
        System.out.println("----------------------------------------------------------------");
        for (Books b : books) {
            System.out.printf("%-8d %-20s %-15s %-15s %-8d%n",
                    b.getBookId(), b.getBookName(), b.getBookISBN(),
                    b.getAuthorName(), b.getQuantity());
        }
    }    
        
        private static void showAllStudents() {
        List<Student> students = studentService.showAllStudents();
            System.out.printf("%-15s %-20s %-15s %-10s%n", "Student ID", "Name", "Roll No", "Book ID");
        System.out.println("-------------------------------------------------------------------");

        for (Student s : students) {
        System.out.printf("%-15s %-20s %-15s %-10d%n",
                s.getStudentId(),
                s.getStudentName(),
                s.getStudentRollNumber(),
                s.getBookId()   
        );
    }
    }
        
}
