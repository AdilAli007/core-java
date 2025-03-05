/*
Create a class called tollbooth. The two data items are unsigned int to hold the total number of cars, and
a type double to hold the total amount of money collected. A constructor initializes both of these to 0. A
member function called payingCar() increments the car total and adds 0.50 to the cash total. Another
function called noPayCar(), increments the car total but adds nothing to the cash total. Finally, a
member function called display() displays the two totals. Make appropriate member functions.
The program should allow the user to push one key to count a paying car, and another to count a nonpaying car. Pushing the Esc key should cause the program to print out the total cars and total cash and
then exit.
 */

import java.util.Scanner;

public class TollBooth {
    private int totalNumberOfCars ;
    private double totalAmountOfMoney ;

    public TollBooth(){
        totalNumberOfCars = 0;
        totalAmountOfMoney = 0;
    }
    public void payingCar(){
        totalNumberOfCars ++;
        totalAmountOfMoney += 0.50;
    }
    public void noPayCar(){
        totalNumberOfCars ++;
    }
    public void display(){
        System.out.println("Total Number of Cars: "+totalNumberOfCars);
        System.out.println("Total Amount of Cash: "+totalAmountOfMoney);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TollBooth tollBooth = new TollBooth();
        System.out.println("Enter number of cars to be counted");
        int numOfCars = scanner.nextInt();

        for(int i = 1; i<=numOfCars; i++) {
            System.out.println("Enter 1 to count paid cars, 2 for unpaid cars and 3 for exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                tollBooth.payingCar();
                System.out.println("Paying car added");
            } else if (choice == 2) {
                tollBooth.noPayCar();
                System.out.println("No Paying car added");
            } else if (choice == 3) {
                tollBooth.display();
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}