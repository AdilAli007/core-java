/*Task # 2
Create a class Temp. Write a temperature-conversion program that gives the user the option of
converting Fahrenheit to Celsius or vice versa. Then carry out the conversion. Use floating point
numbers:
Type 1 to convert Fahrenhiet to Celsius,
 2 to convert Celsius to Fahrenheit: 1
Enter temperature in Fahrenheit: 70
In Celsius: 21.111111
*/

import java.util.Scanner;

public class Temp {

    public void fahrenhietToCelsius(double fahrenhiet){
        double result = ((fahrenhiet-32)*5/9);
        System.out.println("In Celsius: "+result);
    }
    public void celsiusToFahrenhiet(double celsius){
        double result = (celsius*9/5)+32;
        System.out.println("In Fahrenhiet: "+result);
    }


    public static void main(String[] args) {
        Temp temp = new Temp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1 to convert Fahrenhiet to Celsius: ");
        System.out.println("Type 2 to convert Celsius to Fahrenhiet: ");
        int num = scanner.nextInt();
        if(num == 1){
            System.out.print("Enter temperature in Fahrenhiet: ");
            temp.fahrenhietToCelsius(scanner.nextDouble());
        }
        else if (num == 2)
        {
            System.out.print("Enter temperature in Celsius: ");
            temp.celsiusToFahrenhiet(scanner.nextDouble());
        }

    }
}
