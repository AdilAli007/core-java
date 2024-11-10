/* 	
	Required Output

	1 	1
	4	16
	9	81
	16	256
	25	625

*/

class DemoNumberPatternThree {
	public static void main(String args[]) {
	int i = 1;
	while( i <= 5 )
	{
	System.out.println((i*i)+"    "+(i*i)*(i*i));
	i++;
	}  
   }
}