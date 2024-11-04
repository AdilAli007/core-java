import java.util.Scanner;	
	class FibonacciSeries {
	public static void main(String args []) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number till you want to create a Fibonacci Series:");
	int num = sc.nextInt();
	
	int a = 1;
	int b = 1;
	System.out.print(a+" "+b+" ");
	
	for(int i=0; i<num; i++) 
	{
	int c = a+b;
	System.out.print(c+ " ");
	a = b;
	b = c;
	}
   }
}