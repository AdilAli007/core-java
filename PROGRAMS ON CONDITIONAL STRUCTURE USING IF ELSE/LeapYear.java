import java.util.Scanner;
	class LeapYear {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your desired year:");
	int year =sc.nextInt();
	
	if(year % 4 == 0)
	{
	System.out.println(year +" It is a Leap Year");
	} 
	else{
	System.out.println(year +" Its is not a Leap Year");
	}
 }
}