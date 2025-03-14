
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {

    Books objectOfBook = new Books();
    Student objectOfStudent = new Student();
    //Scanner scanner = new Scanner(System.in);

    List<Books> books = new ArrayList<>();
    List<Student> students = new ArrayList<>();


    public LibraryManagementSystem() {
        System.out.println("========================================");
        System.out.println("WELCOME TO LIBRARY MANAGEMENT SYSTEM");
        System.out.println("========================================");
        System.out.println("BOOK ID     BOOK NAME     BOOK ISBN     AUTHOR NAME     QUANTITY");
        System.out.println("========================================");
        System.out.println("101        JAVA BOOK      234JAVA         JOHN         10");
        System.out.println("102        C++ BOOK       12C++           JACOB        10");
        System.out.println("103        C# BOOK        101C#           MICHEAL      10");
        System.out.println("104        PYTHON BOOK    23PHY           CLARKE       10");
        System.out.println("105        .NET BOOK      14NET           POINTING     10");

        Books books1 = new Books("101", "JAVA BOOK", "234JAVA", "JOHN", 10);
        Books books2 = new Books("102", "C++ BOOK", "12C++", "JACOB", 10);
        Books books3 = new Books("103", "C# BOOK", "101C#", "MICHEAL", 10);
        Books books4 = new Books("104", "PYTHON BOOK", "23PHY", "CLARKE", 10);
        Books books5 = new Books("105", ".NET BOOK", "14NET", "POINTING", 10);

        books.add(books1);
        books.add(books2);
        books.add(books3);
        books.add(books4);
        books.add(books5);
    }


    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================================================");

        System.out.println("Choose any number of your choice to perform specific task");
        System.out.println("=========================================================");
        System.out.println("1. Add book into library");
        System.out.println("2. Issue book to student");
        System.out.println("3. Return book from student");
        System.out.println("4. Show all books");
        System.out.println("5. Show all students");

        System.out.println("=========================================================");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            this.addBook();
        } else if (choice == 2) {
            this.issueBook();
        } else if (choice == 3) {
            this.returnBook();
        } else if (choice == 4) {
            this.showAllBooks();
        } else if (choice == 5) {
            this.showAllStudents();
        } else {
            System.out.println("Invalid choice");
        }

    }

    public void addBook() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter book id: ");
        String bookId1 = scanner1.nextLine();
        for (Books b : books) {
            if (b.getBookId().equals(bookId1)) {
                System.out.println("This ID is already present , please enter new id ");
                this.showMenu();
            }
        }
        objectOfBook.setBookId(bookId1);

        System.out.print("Enter name of book: ");
        String bookName = scanner1.nextLine();
        objectOfBook.setBookName(bookName);


        System.out.print("Enter book ISBN: ");
        String bookISBN = scanner1.nextLine();
        objectOfBook.setBookISBN(bookISBN);

        System.out.print("Enter author name: ");
        String authorName = scanner1.nextLine();
        objectOfBook.setAuthorName(authorName);

        System.out.print("Enter quantity: ");
        long quantity = scanner1.nextLong();
        objectOfBook.setQuantity(quantity);

        books.add(objectOfBook);

        System.out.println("Book added successfully in the library");

        this.showMenu();
        System.out.println("==========================================");
    }


    public void issueBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student id: ");
        String studentId = scanner.nextLine();
        objectOfStudent.setStudentId(studentId);


        System.out.print("Enter name of student: ");
        String studentName = scanner.nextLine();
        objectOfStudent.setStudentName(studentName);

        System.out.print("Enter student roll number: ");
        String rollNumber = scanner.nextLine();
        objectOfStudent.setStudentRollNumber(rollNumber);

        System.out.print("Enter book ISBN: ");
        String bookISBN = scanner.nextLine();
        objectOfBook.setBookISBN(bookISBN);

        /*System.out.println("Student Id: "+objectOfStudent.getStudentId());
        System.out.println("Name of student: "+objectOfStudent.getStudentName());
        System.out.println("Enter student roll number: "+objectOfStudent.getStudentRollNumber());
        System.out.println("Enter book ISBN: "+objectOfBook.getBookISBN());
        System.out.println("Book issued successfully to this student: "+studentName);*/



        // List<Books> removeBook = new ArrayList<>();
        for (Books b : books) {
            if (b.getBookISBN().equalsIgnoreCase(bookISBN)) {
                if (b.getQuantity() > 0) {
                    b.setQuantity(b.getQuantity() - 1);
                }
            }
        }

        students.add(objectOfStudent);


        // books.removeAll(removeBook);
        //objectOfBook.setQuantity(objectOfBook.getQuantity() - 1);

        System.out.println("Book issued successfully to this student: "+studentName);

        this.showMenu();
        System.out.println("======================================================");

    }

    public void returnBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Id: ");
        String studentId = scanner.nextLine();
        objectOfStudent.setStudentId(studentId);

        System.out.print("Enter book ISBN you want to return: ");
        String bookISBN = scanner.nextLine();
        objectOfBook.setBookISBN(bookISBN);

        for (Books b : books) {
            if (b.getBookISBN().equalsIgnoreCase(bookISBN)) {
                b.setQuantity(b.getQuantity() + 1);
            }
        }

        ArrayList<Student> removeStudent = new ArrayList<>();
        for (Student s : students){
            if(s.getStudentId().equalsIgnoreCase(studentId)){
                removeStudent.add(s);
            }
        }
        students.removeAll(removeStudent);


        System.out.println("Book return successfully with this ISBN number: "+bookISBN);

        this.showMenu();
        System.out.println();

}
        public void showAllBooks(){
            System.out.println("ALL BOOKS PRESENT IN LIBRARY");

            for(int i=0; i<books.size(); i++){
                System.out.println(books.get(i));
            }

        this.showMenu();
        System.out.println("=========================================");
    }

    public void showAllStudents() {
        System.out.println("ALL STUDENTS WITH BOOKS ISSUED FROM LIBRARY");
        System.out.println("ID        NAME              ROLL NUMBER ");
        for(int i=0; i<students.size(); i++){
            System.out.println(students.get(i).getStudentId()+"       "+students.get(i).getStudentName()+"      "+students.get(i).getStudentRollNumber() );
        }
        this.showMenu();
        System.out.println("==============================================");
    }

}
