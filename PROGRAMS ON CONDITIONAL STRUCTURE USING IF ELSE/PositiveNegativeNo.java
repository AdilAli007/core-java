import java.util.Scanner;
	class PositiveNegativeNo {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number:");
	int num = sc.nextInt();
	
	if(num > 0) {
	System.out.println("It is positive number");
	}
	else if(num < 0) {
	System.out.println("It is negative number");
	}
	else {
	System.out.println("It is zero ");
	}
 }
}