import java.util.Scanner;

class MaximumElement
{
	public static void main(String args[]) 
 {
	int [] myArray = {5,1,2,7,6};
	int max = myArray[0];

	for(int i=0; i<myArray.length; i++)
	{
		System.out.print(myArray[i]+" ");
	}
	
	for(int i=1; i<myArray.length; i++)
	{
	  if(max < myArray[i])
	  {
		max = myArray[i];
	  }
	}
	System.out.print(" Maximum Element is "+max);
 }
}
