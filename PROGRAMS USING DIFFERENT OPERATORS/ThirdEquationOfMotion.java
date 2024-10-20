// Write a program to solve Third Equation Of Motion
// Formula for Third Equation of Motion v2 = u2 + 2as
// v = initialVelocity , u = finalVelocity , a = acceleration , s = distance

class ThirdEquationOfMotion {
	public static void main(String args[]) {
	
	float initialVelocity = 40f;
	float acceleration = 20f;
	float distance = 10f;
	double finalVelocity ;
	finalVelocity = initialVelocity * initialVelocity + 2 * acceleration * distance;
	
	System.out.println("RESULT IS "+finalVelocity);
 }
}
	 