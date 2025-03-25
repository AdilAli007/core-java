import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int num1 = num;
        int length = 0;
        while (num1 > 0) {
            num1 = num1 / 10;
            length = length + 1;
        }
        int num2 = num;
        int remainder;
        int arms = 0;
        while (num2 > 0) {
            remainder = num2 % 10;
            int multiply = 1;
            for (int i = 1; i <= length; i++) {
                multiply = remainder * multiply;
            }
            arms = arms + multiply;
            num2 = num2 / 10;
        }

        if (num == arms) {
            System.out.println(num + " It is an Armstrong Number");
        } else {
            System.out.println(num + " It is not an Armstrong Number");
        }
    }
}