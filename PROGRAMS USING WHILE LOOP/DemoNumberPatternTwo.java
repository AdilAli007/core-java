/* 	
	Required Output

	1 	1
	2	4
	3 	9
	4	16
	5	25

*/

class DemoNumberPatternTwo {
	public static void main(String args[]) {
	int i = 1;
	while( i <= 5 )
	{
	System.out.println(i+"    "+(i*i));
	i++;
	}  
   }
}