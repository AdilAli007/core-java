import java.util.Scanner;
	class DemoPrimeNumber 
{
	public static void main(String args []) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number to find if its Prime Number or not:");
	int num = sc.nextInt();
	int i = 1;
	int count = 0;
	while( i <= num) 
	{
		if(num % i == 0) 
		{
			count++;
		}
		i++;
	}

	if(count ==  2) {
	System.out.println("It is Prime Number");
	}
	else{
	System.out.println("It is not Prime Number");
	}
	
	System.out.println("Total times given number is divided:"+count);
   }
}
	