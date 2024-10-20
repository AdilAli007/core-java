// Write a program to solve First Equation of Motion
// Formula of First Equation of Motion v = u + at
// v = finalVelocity , u = initialVelocity , a = acceleration , t = time

class FirstEquationOfMotion {
	public static void main(String args[]) {
		
		float initialVelocity = 60f;
		float acceleration = 20;
		float time = 60;
		float finalVelocity = initialVelocity + acceleration*time;

		System.out.println("RESULT IS "+finalVelocity);

 }
}
	