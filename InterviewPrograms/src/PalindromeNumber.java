import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int inputNumber = sc.nextInt();
        int sum = 0;
        int num1 = inputNumber;
        while (inputNumber > 0) {
            int result = inputNumber % 10;
            sum = sum * 10 + result;
            inputNumber = inputNumber / 10;
        }

        if (num1 == sum) {
            System.out.println(sum + " It is a palindrome number:");
        } else {
            System.out.println(sum + " It is not a palindrome number:");
        }
    }
}
