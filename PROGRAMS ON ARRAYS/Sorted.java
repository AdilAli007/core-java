class Sorted
{
	public static void main(String args[])
  {
	int [] myArray = {5,7,3,2,1,9};
	int temp = 0;

	for(int i=0; i<myArray.length; i++)
	{
	  for(int j=i+1; j<myArray.length; j++)
	  { 
		if(myArray[i] > myArray[j])
		{
		temp = myArray[i];
		myArray[i] = myArray[j];
		myArray[j] = temp;
		}
	  }
		System.out.print(myArray[i]+" "); 
		
	}
   }
}
