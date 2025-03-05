/*
Start with the publication, book, and tape classes. Add a base class sales that holds an array of three
floats so that it can record the dollar sales of a particular publication for the last three months. Include a
getdata() function to get three sales amounts from the user, and a putdata() function to display the sales
figures. Alter the book and tape classes so they are derived from both publication and sales. An object of
class book or tape should input and output sales data along with its other data.
Write a main() function to create a book object and a tape object and exercise their input/output
capabilities.
 */


import java.util.Scanner;

class Sales {
    float [] array = new float[3];
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of each month of book sales: ");
        for(int i =0; i<array.length ; i++){
            System.out.println("Per Month Amount: ");
            array[i] = scanner.nextFloat();
        }
    }

    public void putData(){
            System.out.println("Sales for the each month:");
            for (int i = 0; i < array.length; i++) {
                System.out.println("Month: "+array[i]);
            }
    }

}

class Publication2 extends Sales {
    String title ;
    float price ;

    public void getData(){
        super.getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Title of Book:");
        title = sc.nextLine();
        System.out.println("Price of Book");
        price = sc.nextFloat();
    }
    public void putData(){
        super.putData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Title of Book: "+title);
        System.out.println("Price of Book: "+price);
    }
}

class Book2 extends Publication2 {
    int pageCount ;

    public void getData() {
        super.getData();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of pages");
        pageCount = scanner.nextInt();
        //super.getData();
    }

    public void putData() {
        super.putData();
        System.out.println("Number of pages: "+pageCount);
        //super.putData();
    }
}

class Tape2 extends Publication2{
    float playingTimeInMinutes ;
    public void getData() {
        super.getData();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter playing time in minutes: ");
        playingTimeInMinutes = scanner.nextFloat();
        //super.getData();
    }

    public void putData() {
        super.putData();
        System.out.println("Playing Time In Minutes: "+playingTimeInMinutes);
        //super.putData();
    }
}

class Test1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book2 book2 = new Book2();
        System.out.println("Enter Book Information: ");
        book2.getData();
        System.out.println("Book Details: ");
        book2.putData();

        System.out.println("<<<<<>>>>>");

        Tape2 tape2 = new Tape2();
        System.out.println("Enter Tape Information: ");
        tape2.getData();
        System.out.println("Tape Information: ");
        tape2.putData();

    }
}