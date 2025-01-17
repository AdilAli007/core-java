/* Initializing an object in java thorugh different ways:
 
2. Initializing through method:

*/

class DemoCopy 
{
	String color ;
	int id ;
	void insertObj(String c , int a)
	{
	color = c;
	id = a;
	}
	
	void display()
	{
	System.out.println(color+" "+id);
	}

	public static void main(String args[])	
 {
	DemoCopy obj1 = new DemoCopy();
		
	obj1.insertObj("black", 100);
	obj1.display();
 }

}

	