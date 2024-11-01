import java.util.Scanner ;

	class SwitchExampleTwo {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Marks: ");
	int marks = sc.nextInt();

	switch(marks){
		case 40:
		System.out.println("You got 'D' Grade");
		
		System.out.println("Write a reason why you got D grade: ");
		String reason = sc.next();
		switch(reason){
			case "d":
			System.out.println("He was ill ");
			break;
			default:
			System.out.println("Invalid Approach");
			}
		break;

		case 60:
		System.out.println("You got 'B' Grade ");
		break;

		case 80:
		System.out.println("You got 'A' Grade ");
		break;

		default:
		System.out.println("Your choice is invalid");
		
	}
    }
}		