import java.util.Scanner;
	class NaturalNumbers {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter numbers you want to sum:");
	int num = sc.nextInt();
	int sum=0;
	for(int i=1; i<=num; i++)
	{
	System.out.println(i);
	sum = sum+i;
	}
	System.out.println("Total sum of numbers: "+sum);
	
   }
}
	
	