import java.util.Scanner;
	class ArmstrongNumber {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number : ");
	int num = sc.nextInt();
	int num1 = num ;
	int sum = 0 ;
	int result ;
	while( num > 0 ) 
	{
		result = num % 10;
		sum = sum + result * result * result;
		num = num / 10;
	}
	if(num1 == sum)
	{
	System.out.println(sum+" It is an Armstrong Number");
	}
	else {
	System.out.println(sum+" It is not an Armstrong Number");
	}
    }
}  
	
	 
	
      