import java.util.Scanner;
	class PerfectExample 
{
	public static void main(String args []) 
   {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number :");
	int num = sc.nextInt();
	int temp = num;
	int result;
	int fact = 1;
	for(; num > 0 ;)
	{ 
		result = num % 10;	 	
		
		for(int i=1; i<= result; i++) 
		{
		fact = fact*i;
		}
		
		num = num / 10;
	}
	
	System.out.println(fact);
   }
} 
	