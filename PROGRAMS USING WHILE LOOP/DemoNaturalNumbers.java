import java.util.Scanner;
	class DemoNaturalNumbers 
{
	public static void main(String args[]) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter numbers you want to sum:");
	int num = sc.nextInt();
	int sum = 0;
	int i = 1;
	while( i <= num )
	{
	System.out.println(i);
	sum = sum+i;
	i++;
	}
	System.out.println("Total sum of numbers: "+sum);
	
   }
}
	
	