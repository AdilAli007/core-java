import java.util.Scanner;

class DuplicateElement
{
	public static void main(String args[]) 
 {
	int [] myArray = {5,1,2,7,2,6,1};
	int max = myArray[0];

	for(int i=0; i<myArray.length; i++)
	{
		System.out.print(myArray[i]+" ");
	}
	
	System.out.println("\nFirst Duplicate elements is :");
	
	
	for(int i=0; i<myArray.length; i++)
	{
	  int count = 0;
	
	  for(int j=i+1; j<myArray.length; j++)
	 {
	  if(myArray[i] == myArray[j])
	   {
		count = count+1;
		System.out.println(myArray[j]);
		break;
	   }
         }
	if(count>0)
	{
	  break;
	}
      }	
   }
}
