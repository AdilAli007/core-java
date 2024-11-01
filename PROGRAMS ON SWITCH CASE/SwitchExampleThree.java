import java.util.Scanner;
	
	class SwitchExampleThree {
	public static void main(String args []) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter an Alphabet: ");
	String vowel = sc.next();
	
	switch(vowel) {
		case "a":
		System.out.println("It is vowel character");
		break;
	
		case "A":
		System.out.println("It is vowel character");
		break;

		case "e":
		System.out.println("It is vowel character");
		break;

		case "E":
		System.out.println("It is vowel character");
		break;

		case "i":
		System.out.println("It is vowel character");
		break;

		case "I":
		System.out.println("It is vowel character");
		break;

		case "o":
		System.out.println("It is vowel character");
		break;

		case "O":
		System.out.println("It is vowel character");
		break;

		case "u":
		System.out.println("It is vowel character");
		break;

		case "U":
		System.out.println("It is vowel character");
		break;
		
		default:
		System.out.println("It is consonant character");
	}
  }
}