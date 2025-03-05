/*
Create a class named Inventory. Your task is to maintain an inventory for a book store in which the
following data has to be entered by the user:
• Book id
• Book name
• Book author
• Stock of the book
• Book’s serial number
• Book’s genre
• Number of pages
1) You need to initialize the values using a constructor and a display method to print the
information.
2) A function name DuplicateRecord() must be formed which must stop the user from entering the
same book twice.
3) A function named DuplicateAuthor() must be formed which counts the number of books in the
inventory by the same author.
4) A menu should be formed allowing the user to choose from any of the above 3 mentioned conditions
 */

import java.util.Scanner;

public class Inventory {
    int bookId ;
    String bookName ;
    String booKAuthor ;
    String stockOfTheBook ;
    int serialNumber ;
    String bookGenre ;
    int numberOfPages ;

    public Inventory(int bookId, String bookName, String booKAuthor, String stockOfTheBook, int serialNumber, String bookGenre, int numberOfPages){
        this.bookId = bookId ;
        this.bookName = bookName ;
        this.booKAuthor = booKAuthor ;
        this.stockOfTheBook = stockOfTheBook ;
        this.serialNumber = serialNumber ;
        this.bookGenre = bookGenre ;
        this.numberOfPages = numberOfPages ;
    }

    public void display(){
        System.out.println("Book Inventory Information: ");
        System.out.println("Book Id: "+bookId);
        System.out.println("Book Name: "+bookName);
        System.out.println("Book Author: "+booKAuthor);
        System.out.println("Stock of the Book: "+stockOfTheBook);
        System.out.println("Book Serial Number: "+serialNumber);
        System.out.println("Book Genre: "+bookGenre);
        System.out.println("Number Of Pages in Book: "+numberOfPages);
    }

    public void duplicateRecord(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        String book = scanner.nextLine();
        int countBookAlreadyPresent = 1 ;

        if(book.equals(this.bookName)){
            System.out.print("This book is already present in Inventory: ");
            System.out.print("Enter new book: ");
            String book1 = scanner.nextLine();
            countBookAlreadyPresent ++ ;
        }else{
            System.out.print("New book added in Inventory, with name: "+ book);
            countBookAlreadyPresent ++ ;
        }
        System.out.println("\nTotal Books in Inventory: "+countBookAlreadyPresent);
    }

    public void duplicateAuthor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        int countSameBook = 0 ;
        int countAnotherBook = 0 ;

        if(author.equals(this.booKAuthor)){
            countSameBook ++ ;
        }else{
            countAnotherBook ++ ;
        }
        System.out.println("Books from same author: "+countSameBook);
        System.out.println("Books from new author: "+countAnotherBook);
    }

    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Choose 1: Book Inventory Information: \n Choose 2: Book Record Information: \n Choose 3: Book Author information: ");
        System.out.print("Enter your choice for further information about records: ");
        int choice = scanner.nextInt();
        if(choice == 1){
            this.display();
        } else if (choice == 2) {
            this.duplicateRecord();
        } else {
            this.duplicateAuthor();
        }

    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory(101,"DUA","Adil","Available",0021,"Spirtual",265);
        inventory.displayMenu();
    }
}
