import java.util.Scanner;

class NthLargestElement
{
	public static void main(String args[]) 
 {
	System.out.println("Enter 1 for Largest element , 2 for Second Largest , 3 for 3rd Largest :");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int temp = 0;
	int [] myArray = {5,1,2,7,6};

	for(int i=0; i<myArray.length; i++)
	{
	  for(int j=i+1; j<myArray.length; j++)
	  { 
		if(myArray[i] < myArray[j])
		{
		temp = myArray[i];
		myArray[i] = myArray[j];
		myArray[j] = temp;
		}
	  }
		System.out.print(myArray[i]+" "); 
		
	}
		
		if(num == 1) 
		{
		System.out.println("\n1st Largest Element "+myArray[0]);
		}
		if(num == 2)
		{
		System.out.println("\n2nd Largest Element "+myArray[1]);
		}
		if(num == 3)
		{
		System.out.println("\n3rd Largest Element "+myArray[2]);
		}
	
 }
}
