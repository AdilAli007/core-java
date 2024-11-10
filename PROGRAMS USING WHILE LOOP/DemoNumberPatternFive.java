/* 	
	Required Output

	10	5
	8	4
	6	3
	4	2
	2	1

*/

class DemoNumberPatternFive {
	public static void main(String args[]) {
	int num = 5;
	int i = 5;
	while( i >= 1 )
	{
	System.out.println((i*2)+"	  "+num);
	num --;
	i--;
	}  
   }
}