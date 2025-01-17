/* Initializing an object in java thorugh different ways:
 
1. Initializing through reference variable:

*/

class Birds 
{
	public static void main(String args[]) 
 {
	DemoBirds obj1 = new DemoBirds();
	DemoBirds obj2 = new DemoBirds();

	obj1.id = 101;
	obj1.name = "Sparrow";
	
	obj2.id = 102;
	obj2.name = "Peacock";

	System.out.println(obj1.id+" "+obj1.name);
	System.out.println(obj2.id+" "+obj2.name);

 }
}

class DemoBirds
{
	int id;
	String name ;
}


	

