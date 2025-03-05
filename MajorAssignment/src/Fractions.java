/*
Task # 4
Create a class Fractions. Create an equivalent four function calculator for Fractions. When it finishes
calculation, the program should ask whether the user wants to do another calculation. The response can
be ‘y’ or ‘n’.
Addition: a/b + c/d = (a*d + b*c) / (b*d)
Subtraction: a/b - c/d = (a*d - b*c) / (b*d)
Multiplication: a/b * c/d = (a*c) / (b*d)
Division: a/b + c/d = (a*d) / (b*c)
The user should type the first fraction, an operator and a second fraction. The program should then
display the result and ask whether the user wants to continue
 */

import java.util.Scanner;

public class Fractions {

    public void add(double num1, double num2, double num3, double num4){
        double result = (num1 * num4 + num2 / num3) / (num2 * num4);
        System.out.println("Addition: a/b + c/d = "+result);
    }
    public void sub(double num1, double num2, double num3, double num4){
        double result = (num1 * num4 - num2 / num3) / (num2 * num4);
        System.out.println("Subtraction: a/b - c/d = "+result);
    }
    public void mul(double num1, double num2, double num3, double num4){
        double result = (num1 * num3)  / (num2 * num4);
        System.out.println("Multiplication: a/b * c/d = "+result);
    }
    public void div(double num1, double num2, double num3, double num4){
        double result = (num1 * num4)  / (num2 * num3);
        System.out.println("Division: a/b * c/d = "+result);
    }

    public static void main(String[] args) {
        Fractions fractions = new Fractions();
        Scanner scanner = new Scanner(System.in);
        String userChoice = "y";

        while (userChoice.equalsIgnoreCase("y")) {
            System.out.println("Enter first fraction, an operator and a second fraction: ");
            System.out.println("First Fraction Values Of a and b: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            System.out.println("Enter an operator (+,-,*,/)");
            char operator = scanner.next().charAt(0);

            System.out.println("Second Fraction Values  Of c and d: ");
            double num3 = scanner.nextDouble();
            double num4 = scanner.nextDouble();


            if(operator == '+'){
                fractions.add(num1,num2,num3,num4);
            } else if (operator == '-') {
                fractions.sub(num1,num2,num3,num4);
            } else if (operator == '*') {
                fractions.mul(num1,num2,num3,num4);
            }else if (operator == '/'){
                fractions.div(num1,num2,num3,num4);
            }else{
                System.out.println("Invalid Approach ");
            }
            System.out.println("Do you want to do another calculation (y/n)? ");
            userChoice = scanner.next();
        }
    }
}
