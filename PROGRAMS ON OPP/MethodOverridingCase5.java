/* Case 5 : If we create abstract class then it contains abstract methods , so we have to overridden abstract method in derived concrete classes otherwise it will show compile time error.
	    We can not create abstract class object.
*/

abstract class MethodOverridingCase5
{
	abstract void display();
	void show()
	{
	System.out.println("1");
	}
	
	public static void main(String args[])
	{
	B obj = new B();
	obj.show();
	obj.display();
	}
}

class B extends MethodOverridingCase5
{
	void display()
	{
	System.out.println("1");
	}
	void show()
	{
	System.out.println("2");
	}
}
