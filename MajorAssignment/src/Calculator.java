/*
Task # 3
Create a class calculator. Create an equivalent four function calculator. When it finishes calculation, the
program should ask whether the user wants to do another calculation. The response can be ‘y’ or ‘n’.
Enter first number, operator and second number: 10 / 3
Answer = 3.333333
Do another (y/n) ? y
Enter first number, operator and second number: 12 + 100
Answer = 112
Do another (y/n) ? n

 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "y";
        while (userChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter first number, operator and second number: ");
            double num1 = scanner.nextDouble();
            char operator = scanner.next().charAt(0);
            double num2 = scanner.nextDouble();
            double result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                    result = num1 / num2;
            } else {
                System.out.println("Invalid operator!");
                continue;
            }

            System.out.println("Answer = " + result);

            System.out.print("Do another (y/n)? ");
            userChoice = scanner.next();
        }
    }
}