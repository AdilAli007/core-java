import java.util.Scanner;
	
	class SimpleCalculator {
	public static void main(String args[]){
	
	System.out.println("1. Addition:");
	System.out.println("2. Sutraction:");
	System.out.println("3. Multiplication:");
	System.out.println("4. Divison:");
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your choice: ");
	int choice = sc.nextInt();

	
	System.out.print("Enter First Number: ");
	int num1 = sc.nextInt();
	System.out.print("Enter Second Number: ");
	int num2 = sc.nextInt();
	
	if(choice == 1){
	System.out.println("Addition is: "+(num1+num2)); 
	}
	
	else if(choice == 2){
	System.out.println("Subtraction is: "+(num1-num2)); 
	}

	else if(choice == 3){
	System.out.println("Multiplication is: "+(num1*num2)); 
	}

	else if(choice == 4){
	System.out.println("Division is: "+(num1 / num2)); 
	}

	else {
	System.out.println("Your choice is invalid:");
	}
 }
}
		
	
	
	