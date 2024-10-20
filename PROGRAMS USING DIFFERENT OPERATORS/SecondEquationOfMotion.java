// Write a program to solve Second Equation Of Moition
// Formula for Second Equation Of Motion S = ut + (1/2) at square of 2
// S = distance , u = velocity , t = time , a = acceleration 

class SecondEquationOfMotion {
	public static void main(String args[]) {
	
	float distance ;
	float velocity = 30f;
	float acceleration = 20f;
	float time = 10f;
	distance = velocity * time + (1/2) * acceleration * time * time;

	System.out.println("RESULT IS "+distance);
	
 }
}
	
