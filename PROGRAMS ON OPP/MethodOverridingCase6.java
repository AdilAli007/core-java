// Case 6 : Invoiking Overridden method from parent class. We can call parent class method in overridden method using super keyword. Super Keyword refer to parent class method.


class MethodOverridingCase6
{
	void show()
	{
	System.out.println("abc");
	}
	
	public static void main(String args[])
	{
	A obj1 = new A();
	obj1.show();
	}
}

class A extends MethodOverridingCase6
{
	void show()
	{
	super.show();
	System.out.println("123");
	}
}