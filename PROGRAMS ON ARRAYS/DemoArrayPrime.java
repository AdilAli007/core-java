import java.util.Scanner;

class DemoArrayPrime
{
	public static void main(String args[]) 
 {
	Scanner sc = new Scanner(System.in);
	int array[] = new int[10];
	int count = 0;
	System.out.println("Enter array elements:");
	for(int i=0; i<array.length; i++)
        {
	array[i] = sc.nextInt();
        }
	
	System.out.println("PRIME NUMBERS IN ARRAY ARE:");
	
	for(int j=0; j<array.length; j++)
	{
	  for(int k=1; k<=array[j]; k++)
	  {
	   if(array[j]%k==0)
	   count++;	    
	  }
           if(count == 2)
	   System.out.println(array[j]);
	   count = 0;    
	}
 }
}
