import java.util.Scanner;
	class SwitchExample {
	public static void main(String args[]) {
		
	Scanner sc =  new Scanner(System.in);
	System.out.print("Enter your shirt size: ");
	int size = sc.nextInt();

	switch(size) {
		case 30:
		System.out.println("Your shirt size is small");
		break;
		
		case 36:
		System.out.println("Your shirt size is medium");
		break;

		case 40:
		System.out.println("Your shirt size is large");
		break;

		default:
		System.out.println("Your size is unavailable");
		}
 }
}
		