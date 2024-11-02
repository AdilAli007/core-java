import java.util.Scanner;
	class PrimeNumber {
	public static void main(String args []) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number to find if its Prime Number or not:");
	int num = sc.nextInt();
	int count = 0;
	for(int i=1; i<=num; i++) {
	if(num % i == 0) {
	count++;
		}
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
	