import java.util.Scanner;
	class ReverseNumber {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number you want to reverse: ");
	int num = sc.nextInt();
	int sum = 0;
	for( ; num > 0 ; ) 		
	{
	int result = num % 10;
	sum = sum * 10 + result;
	num = num / 10; 
	}
	System.out.print("After Reverse Number will be:"+sum);
    }
}
	