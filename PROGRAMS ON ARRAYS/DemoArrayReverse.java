import java.util.Scanner;

class DemoArrayReverse
{
	public static void main(String args[]) 
 {
	Scanner sc = new Scanner(System.in);
	int array[] = new int[5];
	System.out.println("Enter array elements:");
	for(int i=0; i<array.length; i++)
	{
	array[i]= sc.nextInt();	
	}
	
	System.out.println("ARRAY ELEMENTS ARE: ");
	for(int j=0; j<array.length; j++)
	{
	System.out.println(array[j]);
	}
	
	System.out.println("ARRAY REVERSE ELEMENTS ARE");
	for(int k=array.length-1; k>=0; k--)
	{
	System.out.println(array[k]);
	}
 }
}
