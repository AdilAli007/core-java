/*
Create a class named ScientificCalculator. Your task is to construct a scientific calculator which contains
the following functions
• CalculateSin()
• CalculateCos()
• CalculateTan()
• CalcuateSumAvgMaxMin()
For the 4th function an array must be used.
 */

import java.util.Scanner;

public class ScientificCalculator {

    void calculateSin() {
        System.out.println("Please enter values of Perpendicular and Hypotenuse to calculate Sin() ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of Perpendicular: ");
        double valueOfPerpendicular = scanner.nextDouble();
        System.out.print("Enter value of Hypotenuse: ");
        double valueOfHypotenuse = scanner.nextDouble();
        double result = valueOfPerpendicular / valueOfHypotenuse;
        System.out.println("Sin() = Perpendicular / Hypotenuse: " + result);
    }

    void calculateCos() {
        System.out.println("Please enter values of Base and Hypotenuse to calculate Cos() ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of Base: ");
        double valueOfBase = scanner.nextDouble();
        System.out.print("Enter value of Hypotenuse: ");
        double valueOfHypotenuse = scanner.nextDouble();
        double result = valueOfBase / valueOfHypotenuse;
        System.out.println("Cos() = Base / Hypotenuse: " + result);
    }

    void calculateTan() {
        System.out.println("Please enter values of Perpendicular and Base to calculate tan() ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of Perpendicular: ");
        double valueOfPerpendicular = scanner.nextDouble();
        System.out.print("Enter value of Base: ");
        double valueOfBase = scanner.nextDouble();
        double result = valueOfPerpendicular / valueOfBase;
        System.out.println("Tan() = Perpendicular / Base: " + result);
    }

    void calculateSumAvgMaxMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice to perform any function you want: ");
        System.out.print("\nChoose 1: To Calculate Sum: ");
        System.out.print("\nChoose 2: To Calculate Avg: ");
        System.out.print("\nChoose 3: To Calculate Max: ");
        System.out.println("\nChoose 4: To Calculate Min: ");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            int sum = 0;
            System.out.print("Enter 5 Array elements: ");
            //int size = scanner.nextInt();
            //int [] array = new int[size];
            int[] array = new int[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                System.out.print(array[i]+" ");
                sum = sum + array[i];
            }
            System.out.println("\nSum of Array is: "+sum);
        }
        else if (choice == 2){
            int sum = 0 ;
            System.out.print("Enter 5 Array elements: ");
            //int size = scanner.nextInt();
            int[] array = new int[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                System.out.print(array[i]+" ");
            }
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            int result = sum / array.length ;
            System.out.print("\nAvg of Array is: "+result);
        }
        else if (choice == 3) {
            int max ;
            System.out.print("Enter 5 array elements: ");
            //int size = scanner.nextInt();
            int [] array = new int[5];
            for(int i =0; i < array.length; i++){
                array[i] = scanner.nextInt();
            }

            max = array[0];
            for(int i = 1; i < array.length; i++){
                    if(max < array[i]){
                        max = array[i];
                    }
            }
            System.out.println("Max number in Array is: "+max);
        }
        else if (choice == 4) {
            int min ;
            System.out.print("Enter 5 array elements: ");
           // int size = scanner.nextInt();
            int [] array = new int[5];
            for(int i =0; i < array.length; i++){
                array[i] = scanner.nextInt();
            }

            min = array[0];
            for(int i = 1; i < array.length; i++){
                if(min > array[i]){
                    min = array[i];
                }
            }
            System.out.println("Min number in Array is: "+min);
        }
    }

    void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To The Scientific Calculator");
        System.out.print("Enter 1, To Calculate sin() ");
        System.out.print("\nEnter 2, To Calculate cos() ");
        System.out.print("\nEnter 3, To Calculate tan() ");
        System.out.print("\nEnter 4, To Calculate Sum,Avg,Min,Max Number: ");

        int choice = scanner.nextInt();

        if(choice == 1){
            this.calculateSin();
        } else if (choice == 2) {
            this.calculateCos();
        } else if (choice == 3) {
            this.calculateTan();
        }else{
            this.calculateSumAvgMaxMin();
        }

    }

    public static void main(String[] args) {

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        scientificCalculator.displayMenu();

    }
}
