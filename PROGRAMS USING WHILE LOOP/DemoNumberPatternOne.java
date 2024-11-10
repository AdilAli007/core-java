/* 	
	Required Output

	1 	3
	2	8
	3 	13
	4	18
	5	23

*/

class DemoNumberPatternOne {
	public static void main(String args[]) {
	int num = 5;
	int i = 1;
	while( i <= 5 )
	{
	System.out.println(i+"    "+(i*num-2));
	i++;
	}  
   }
}