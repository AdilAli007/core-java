/* 	
	Required Output

	10	5
	8	4
	6	3
	4	2
	2	1

*/

class NumberPatternFive {
	public static void main(String args[]) {
	int num = 5;
	for(int i=5; i>=1; i--)
	{
	System.out.println((i*2)+"	  "+num);
	num --;
	}  
   }
}