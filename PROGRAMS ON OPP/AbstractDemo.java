/* Abstraction : Abstraction is detail hiding or implementation hiding and just showing the interfaces to user. We can achieve abstraction through abstract class( 0-100% ) and with 			 interfaces( 100% ).
*/ 

abstract class AbstractVehicle
{
	
	abstract void show();
	void display()
	{
	System.out.println("abc");
	}
	
	public static void main(String args[])
	{
	B obj = new B();
	obj.show();
	obj.display();
	}
	
}

class B extends AbstractDemo
{
	void show()
	{
	System.out.println("1");
	}
	void display()
	{
	System.out.println("def");
	}	
}