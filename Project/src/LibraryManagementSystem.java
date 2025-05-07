
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class LibraryManagementSystem {

    List<Books> books = new ArrayList<>();
    List<Student> students = new ArrayList<>();


    public LibraryManagementSystem() throws IOException {

        defaultBooksFromFile();
        loadBooksFromFile();
        loadStudentsFromFile();

    }

    public void defaultBooksFromFile() throws IOException {
        File file = new File("Books.txt");
        if (!file.exists()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("Book ID, Book Name, Book ISBN, Author Name, Quantity\n");
            writer.write("101, JAVA BOOK, 234 JAVA, JOHN, 10\n");
            writer.write("102, C++ BOOK, 12C++, JOCOB, 10\n");
            writer.write("103, C# BOOK, 101C#, MICHEAL, 10\n");
            writer.write("104, PYTHON BOOK, 23PHY, CLARKE, 10\n");
            writer.write("105, .NET BOOK, 14NET, POINTING, 10\n");
            writer.close();
        }
        showAllBooks();
    }

    public void loadBooksFromFile() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("Books.txt"));
        String line;
        boolean isFirstLine = true;

        while ((line = reader.readLine()) != null) {
            if (isFirstLine) {
                isFirstLine = false;
                continue;
            }

            try {
                String[] arr = line.split(",\\s*");
                int bookId = Integer.parseInt(arr[0].trim());
                String bookName = arr[1].trim();
                String bookISBN = arr[2].trim();
                String authorName = arr[3].trim();
                int quantity = Integer.parseInt(arr[4].trim());

                books.add(new Books(bookId, bookName, bookISBN, authorName, quantity));
            } catch (Exception e) {
                System.out.println("Skipping invalid book line: " + line);
            }
        }

        reader.close();

    }

    public void loadStudentsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Students.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(",");
                if (arr.length >= 3) {
                    students.add(new Student(arr[0], arr[1], arr[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Unable to load students: " + e.getMessage());
        }
    }

    public void showMenu() throws IOException {
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

    public void addBook() throws IOException {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter book id: ");
        int bookId1 = scanner1.nextInt();

        /*        for (Books b : books) {
            if (b.getBookId() == (bookId1)) {
                System.out.println("This ID is already present , please enter new id ");
                return ;
            }
        }*/

        books.stream().filter(s-> s.getBookId() == bookId1).forEach(s-> System.out.println("This id is already present, please enter new id"));

        scanner1.nextLine();

        System.out.print("Enter name of book: ");
        String bookName = scanner1.nextLine();

        System.out.print("Enter book ISBN: ");
        String bookISBN = scanner1.nextLine();

        System.out.print("Enter author name: ");
        String authorName = scanner1.nextLine();

        System.out.print("Enter quantity: ");
        long quantity = scanner1.nextLong();

        Books objectOfBook1 = new Books(bookId1,bookName,bookISBN,authorName,quantity);
        books.add(objectOfBook1);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Books.txt",true));
        bufferedWriter.write(objectOfBook1.toString()+"\n");
        bufferedWriter.close();

        System.out.println("Book added successfully in the library");

        this.showMenu();
        System.out.println("==========================================");
    }


    public void issueBook() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student id: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter name of student: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter student roll number: ");
        String studentRollNumber = scanner.nextLine();

        System.out.print("Enter book ISBN: ");
        String bookISBN = scanner.nextLine();

/*        for (Books b : books) {
            if (b.getBookISBN().equalsIgnoreCase(bookISBN) && b.getQuantity() > 0){
                b.setQuantity(b.getQuantity() - 1);
            }
        }*/

        books.stream().filter(s-> s.getBookISBN().equalsIgnoreCase(bookISBN) && s.getQuantity() >0).forEach(b -> b.setQuantity(b.getQuantity() - 1));

        Student student1 = new Student(studentId,studentName,studentRollNumber);
        students.add(student1);

        saveAll();
        System.out.println("Book issued successfully to this student: "+studentName);

        this.showMenu();
        System.out.println("======================================================");

    }

    public void returnBook() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Id: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter book ISBN you want to return: ");
        String bookISBN = scanner.nextLine();

/*        for (Books b : books) {
            if (b.getBookISBN().equalsIgnoreCase(bookISBN)) {
                b.setQuantity(b.getQuantity() + 1);
            }
        }*/
        books.stream().filter(s-> s.getBookISBN().equalsIgnoreCase(bookISBN)).forEach(books1 -> books1.setQuantity(books1.getQuantity()+1));

        /*       for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(studentId)) {
                remove.add(s);
            }
        }*/
        List<Student> remove = students.stream().filter(s-> s.getStudentId().equalsIgnoreCase(studentId)).toList();

        students.removeAll(remove);

        saveAll();

        System.out.println("Book return successfully with this ISBN number: "+bookISBN);

        this.showMenu();
        System.out.println();

}

    public void showAllBooks() throws IOException {
        System.out.println("ALL BOOKS PRESENT IN LIBRARY");
        File myObj = new File("Books.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();

        this.showMenu();
        System.out.println("=========================================");
    }

    public void showAllStudents() throws IOException {
        System.out.println("ALL STUDENTS WITH BOOKS ISSUED FROM LIBRARY");
        File myObj = new File("Students.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();

        this.showMenu();
        System.out.println("==============================================");
    }

    public void saveAll() throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Books.txt",true))) {
            bw.write("Book ID, Book Name, Book ISBN, Author Name, Quantity\n"); // Header!
            for (Books b : books) {
                bw.write(b.toString() + "\n");
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Students.txt",true))) {
            for (Student s : students) {
                bw.write(s.toString() + "\n");
            }
        }
    }



}
