/*
Task # 1
Create a class Multiples. Assume that you want to generate a table of multiples of any given number.
Write a program that allows the user to enter the number and then generates the table, formatting it
into 10 columns and 20 lines. Interaction with the program should look like this (only the first two lines
are shown)
Enter a number: 7
7 14 21 28 35 42 49 56 63 70
77 84 91 98 105 112 119 126 133 140
*/


import java.util.Scanner;

public class Multiples {

    public void generateTable(int number)
    {

        int rows = 20 , columns = 10;

        for (int i = 1 ; i <= 20; i++)
        {
            for(int j = 1; j <=10; j++ )
            {
                System.out.print((number * ((i - 1) * columns + j)) + "\t");
            }
            System.out.println();
            if(i == 2){
                break;
            }
        }
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();

        Multiples multiples = new Multiples();
        multiples.generateTable(number);
    }
}