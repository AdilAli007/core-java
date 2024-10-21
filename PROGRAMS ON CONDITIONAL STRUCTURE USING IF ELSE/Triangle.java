import java.util.Scanner;
	class Triangle {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter length of triangle:");
	float length = sc.nextFloat();
	System.out.print("Enter breadth of triangle:");
	float breadth = sc.nextFloat();
	System.out.print("Enter width of triangle:");
	float width = sc.nextFloat();

	if((length == breadth) && (breadth == width)) {
	System.out.println("It is equilateral triangle");
	}
	else if ( (length == width) || (length == breadth) ) {
	System.out.println("It is Isosceles triangle");
	}
	else {
	System.out.println("It is Scalene triangle");
	}
 }
}