/*
Imagine a publishing company that markets both book and audiocassette versions of its works. Create a
class publication that stores the title (a string) and price (type float) of a publication. From this class
derive two classes: book, which adds a page count (type int), and tape, which adds a playing time in
minutes (type float). Each of these three classes should have a getdata() function to get its data from the
user at the keyboard, and a putdata() function to display its data.
Write a main() program to test the book and tape classes by creating instances of them, asking the user
to fill in data with getdata(), and then displaying the data with putdata().
 */


import java.util.Scanner;

    class Publication {
    String title ;
    float price ;

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Title of Book:");
        title = sc.nextLine();
        System.out.println("Price of Book");
        price = sc.nextFloat();
    }
    public void putData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Title of Book: "+title);
        System.out.println("Price of Book: "+price);
    }
}
class Book extends Publication{
    int pageCount ;

    @Override
    public void getData() {
        super.getData();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of pages");
        pageCount = scanner.nextInt();
    }

    @Override
    public void putData() {
        super.putData();
        System.out.println("Number of pages: "+pageCount);
    }
}

class Tape extends Publication{
    float playingTimeInMinutes ;

    @Override
    public void getData() {
        super.getData();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter playing time in minutes: ");
        playingTimeInMinutes = scanner.nextFloat();
    }

    @Override
    public void putData() {
        super.putData();
        System.out.println("Playing Time In Minutes: "+playingTimeInMinutes);
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        Tape tape = new Tape();
        System.out.println("Enter book information: ");
        book.getData();
        System.out.println("Book Information");
        book.putData();

        System.out.println();

        System.out.println("Enter tape information: ");
        tape.getData();
        System.out.println("Tape Information");
        tape.putData();

    }
}
