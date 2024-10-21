import java.util.Scanner;
	
	class EvenOdd {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number:");
	int num = sc.nextInt();

	if(num % 2 == 0) 
	{
	System.out.println("It is Even number");
	
	}
	else {
	System.out.println("It is Odd Number");
	}
 }
}