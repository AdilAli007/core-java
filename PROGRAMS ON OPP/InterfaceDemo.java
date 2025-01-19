/* Interface : Interface is the blue print of class , it specify what a class must do not how to do, it supports multiple inheritance in java, it is used to achieve abstraction in java
	       it contains abstract methods , since java 8 it has default and static method , since java 9 it has private methods also , it is implemented using implements keyword.
*/

interface I1
{
	void show();		// public abstract is by default in interface 
	default void display()
	{
	System.out.println("1");
	}
	static void displayed()	
	{
	System.out.println("2");
	}
		
	public static void main(String args[])
	{
	InterfaceDemo obj = new InterfaceDemo();
	obj.show();
	obj.display();
	I1.displayed();
	}

}

interface I2
{
	void show();
	default void display()
	{
	System.out.println("1");
	}
	static void displayed()	
	{
	System.out.println("2");
	}
		
	public static void main(String args[])
	{
	InterfaceDemo obj = new InterfaceDemo();
	obj.show();
	obj.display();
	I1.displayed();
	}

}

class InterfaceDemo implements I1,I2
{
	public void show()
	{
	System.out.println("2");
	}
	public void display()
	{
	System.out.println("2");
	}
	

}
	