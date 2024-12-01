class Sum
{
	public static void main(String args[])
  {
	int [] myArray = {12,4,1,6,3,2};
	int sum = 0;
	int targetNo = 11;
	
	System.out.println("Target No : "+targetNo);
	
	for(int i=0; i<myArray.length; i++)
	{
	  	sum = sum + myArray[i];
		
	}
	System.out.println("Total Sum : "+sum);
	System.out.print(myArray[1]+","+myArray[2]+","+myArray[3]+" = "+targetNo);
	
   }
}
