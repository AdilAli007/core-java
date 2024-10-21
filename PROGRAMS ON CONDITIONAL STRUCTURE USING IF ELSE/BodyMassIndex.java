// Formula for BMI = kg / m*m 
// Normal Ranges = 18.5 - 24.9 , Underweight = < 18.5 , Overweight = > 25

import java.util.Scanner;
class BodyMassIndex {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Weight in kgs:");
	float weight =sc.nextFloat();
	
	System.out.print("Enter your height in meters:"); 
	float height =sc.nextFloat();
	float bmi = weight / (height * height) ;
	
	System.out.println("Your BMI is "+bmi);
	
	if(bmi >= 18.5 && bmi <= 24.9) {
	System.out.println(" You are in healthy weight range");
	}
	else if(bmi < 18.5) {
	System.out.println(" You are in underweight range");
	}
	else {
	System.out.println("You are overweight");
	} 
	
 }
}