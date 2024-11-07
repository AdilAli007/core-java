/* 	
	Required Output

	5 	1
	4	2
	3	3
	2	4
	1	5

*/

class NumberPatternFour {
	public static void main(String args[]) {
	int num = 1;
	for(int i=5; i>=1; i--)
	{
	System.out.println(i+"	  "+num);
	num ++;
	}  
   }
}