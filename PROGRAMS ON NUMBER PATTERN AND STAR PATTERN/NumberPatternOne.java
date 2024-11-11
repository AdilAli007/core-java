/* 	
	Required Output

	1 	3
	2	8
	3 	13
	4	18
	5	23

*/

class NumberPatternOne {
	public static void main(String args[]) {
	int num = 5;
	for(int i=1; i<=5; i++)
	{
	System.out.println(i+"    "+(i*num-2));
	}  
   }
}