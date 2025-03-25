import java.util.Scanner;

public class PerfectNumber {

        public static void main(String args [])
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any number :");
            int num = sc.nextInt();
            int temp = num ;
            int arms = 0;
            int fact = 1;
            while (temp > 0) {
               int remainder = temp % 10;

                for(int i=1; i<= temp; i++)
                {
                    fact = fact*i;
                }
                arms = arms + fact;
                temp = temp / 10;
            }

            System.out.println(temp);
        }
    }



