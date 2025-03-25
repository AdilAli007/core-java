import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number whose factorial value you want:");
        int num = sc.nextInt();
        int i = 1;
        int fact = 1;
        while( i <= num)
        {
            fact = fact*i;
            i++;
        }
        System.out.println(num+"!="+fact);
    }
}

