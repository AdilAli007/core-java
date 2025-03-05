/*
Create a new class named Clock. Class Clock should have the following attributes:
Hour (Integer 1..12)
Minutes (Integer 0..59)
Seconds (Integer 0//59) isAM (boolean)
These attributes are represented by data fields with private access protection. Class Clock should
support the following public extractor methods:
getHours ()
getMinutes ()
getSeconds ()
getisAM ()
An object of Class Clock may be constructed in any of the following ways:  -no parameters (sets clock to midnight)  -hour and isAM specified (sets minutes and seconds to zero) -all attributes specified
Class Clock should also support a setTime() method that sets all four attributes from argument values.
Compile the new class.
Using these three classes, design a program that will accept dimensions of a triangle or a rectangle
interactively and display area.ee class
 */

import java.util.Scanner;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    Clock(){
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }
    public Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public void displayTime(){
        String amPm = (this.hours<12)? "AM":"PM";
        int displayHours = (this.hours>12)? (this.hours-12):this.hours;
        if(displayHours == 0){
            displayHours = 12;
        }
        System.out.printf("%02d:%02d:%02d %s",displayHours,this.minutes,this.seconds,amPm );
    }

}

class Shapes{
    public static void main(String[] args) {
        Clock clock = new Clock(23,40,30);
        clock.displayTime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nChoose a shape to calculate Area:");
        System.out.println("Enter 1: Triangle & 2: Rectangle");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("Enter height of triangle");
            int height = scanner.nextInt();
            System.out.println("Enter base of triangle");
            int base = scanner.nextInt();
            double result = 0.5 * (base * height);
            System.out.println("Area of Triangle= "+result);
        } else if (choice == 2) {
            System.out.println("Enter length of rectangle");
            int length = scanner.nextInt();
            System.out.println("Enter width of rectangle");
            int width = scanner.nextInt();
            int result = length * width;
            System.out.println("Area of Rectangle = "+result);
        }else{
            System.out.println("Invalid Choice");
        }
    }
}
