import java.util.Scanner;
	class Factorial {
	public static void main(String args []) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number whose factorial value you want:");
	int num = sc.nextInt();
	int fact = 1;
	for(int i=1; i<=num; i++) 
	{
	System.out.println("5*"+i);
	fact = fact*i;
	}
	System.out.println(num+"!="+fact);
  }
} 
	