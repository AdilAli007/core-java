import java.util.Scanner;
		
	class GradeCalculator {
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your marks:");
	int marks = sc.nextInt();
	
	if(marks >=80 && marks<=100) {
	System.out.println("You Secured 'A' Grade ");
	}
	else if(marks >=70 && marks<=79){
	System.out.println("You Secured 'B' Grade ");
	}
	else if(marks >=60 && marks<=69){
	System.out.println("You Secured 'C' Grade");
	}
	else if(marks >=50 && marks<=59){
	System.out.println("You Secured 'D' Grade ");
	}
	else{
	System.out.println("You are Fail");
	}
	
 }
}