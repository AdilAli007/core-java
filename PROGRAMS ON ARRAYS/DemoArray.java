class DemoArray 
{
	public static void main(String args[]) 
  {
	int sum = 0;
	int fact = 1;
	int emp_id [] = new int [5];
	emp_id [0] = 1;
	emp_id [1] = 2;
	emp_id [2] = 3;
	emp_id [3] = 4;
	emp_id [4] = 5;

	for(int index=0; index < emp_id.length; index++)
	{
		System.out.println(emp_id[index]); 
		sum=sum+emp_id[index];	
		fact=fact*emp_id[index];	
	}	
	 	System.out.println("sum = "+sum);
		System.out.println("fact = "+fact);

  }
}