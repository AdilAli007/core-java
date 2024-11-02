import java.util.Scanner;
	class TableGenerator {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number whose table you want to generate:");
	int num = sc.nextInt();
	for(int i=1; i<=10; i++)
	{
	System.out.println(num+ "*" +i+ "=" + (num*i));
	}	
   }
}
	
	