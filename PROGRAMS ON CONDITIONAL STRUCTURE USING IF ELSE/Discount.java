import java.util.Scanner;
	class Discount {
	public static void main(String args []) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Total Amount in Rupees:");
	double amount = sc.nextDouble();
	
	if(amount > 100) 
	{
	System.out.println("You may get a discount of 10%: ");
	double discountedAmount = amount*0.10;
	double totalAmount = amount - discountedAmount; 
	System.out.println("Your price after discount is: "+totalAmount);
	} 
	else {
	System.out.println("Your total purchase amount is less than 100 Rupees, discount is unavailable");
 	}
}
}
	