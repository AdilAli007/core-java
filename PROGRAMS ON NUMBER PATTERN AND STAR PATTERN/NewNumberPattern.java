/* 	
	Required Output

		1
      	      4   4
	     9  9  9
	   16 16 16 16
	  25 25 25 25 25
	

*/

class NewNumberPattern
{
	public static void main(String args[]) 
 {
	for(int i=1; i<=5; i++)
	{
	  for(int j=5; j>=i; j--)
	  {
	    System.out.print(" ");
	  }
		for(int k=1; k<=i; k++)
		{
		 System.out.print((i*i)+" ");
		}
	
		System.out.println();
	}
  }
		
 }