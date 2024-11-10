import java.util.Scanner;
	class DemoTableGenerator
{
	public static void main(String args[]) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number whose table you want to generate:");
	int num = sc.nextInt();
	int i = 1;
	while( i <= 10 )
	{
	System.out.println(num+ "*" +i+ "=" + (num*i));
	i++;
	}
	
   }
}
	
	