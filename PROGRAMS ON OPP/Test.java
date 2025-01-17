/* Initializing an object in java thorugh different ways:
 
3. Initializing through constructor:

Constructor : It is a block similar to method having same name as that of class , it dose not have any return type not even void , public, private, protected, default access modifier can 	      use with constructor , It executes automatic when we create object.

*/

class Test 
{
	String name ;
	int a ;
	Test(String name, int a)	//Parametrized Constructor
	{
		this.name = name;
		this.a =a;
	}

	void display()
	{
	System.out.println("Name : "+this.name+" "+"Id : "+this.a);
	}
 
	
/*	
int i;		// Compiler create default constructor itself 		
Test()		// No arg constructor , user create it itself
{
System.out.println("no arg constructor"); 
}
*/


	public static void main(String args[]) 
 {
	Test t = new Test("Muhammad Rayyan",06);
	t.display();
	
		
 }
}



 	


