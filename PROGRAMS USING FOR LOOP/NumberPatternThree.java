/* 	
	Required Output

	1 	1
	4	16
	9	81
	16	256
	25	625

*/

class NumberPatternThree {
	public static void main(String args[]) {
	for(int i=1; i<=5; i++)
	{
	System.out.println((i*i)+"    "+(i*i)*(i*i));
	}  
   }
}