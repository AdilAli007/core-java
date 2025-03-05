/*
Write a program to read time in seconds and convert in time format (HH:MM:SS) using classes and
objects. The class must contain appropriate member functions and member variables.
The program should allow the user to enter seconds and print them in HH:MM:SS.
Example:
Enter time in seconds: 3666
The time is = 01:01:06
 */

import java.util.Scanner;

public class Time {
    private int hours ;
    private int minutes;
    private int seconds;
    private int remainingSeconds;

    public void timeConverter(int inputSeconds){
        hours = inputSeconds / 3600;
        remainingSeconds = inputSeconds % 3600;
        minutes = remainingSeconds / 60;
        seconds = remainingSeconds % 60;
    }
    public void displayTime(){
        System.out.println("The time is: "+ hours + ":" +minutes+ ":" +seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int inputSeconds = scanner.nextInt();
        Time time = new Time();
        time.timeConverter(inputSeconds);
        time.displayTime();
    }
}
