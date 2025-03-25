import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= num ; i++) {
            if (num % i == 0) {
                temp++;
            }
        }
        if (temp == 2) {
            System.out.println(num + "is prime no");
        } else {
            System.out.println(num + "is not prime no");
        }
    }
}
