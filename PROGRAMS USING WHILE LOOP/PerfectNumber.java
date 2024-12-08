import java.util.Scanner;
	class PerfectNumber {
	public static void main(String args []) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number : ");
	int num = sc.nextInt();
	int i = 1;
	int j = 0;
	int sum = 0;
	while( i < num) 
	{
		if(num%i == 0)
		{
		sum = sum + i;
		}
		i++;
	}
	if(sum == num)
	{
	System.out.println(sum+" Perfect Number");
	}
	else {
	System.out.println(sum+" Not Perfect Number");
	}
   }
} 
	 