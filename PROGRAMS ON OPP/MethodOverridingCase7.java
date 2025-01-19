/* Case 6 : Invoiking Overridden method from parent class. We can call parent class method in overridden method using super keyword. Super Keyword refer to parent class method.


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

Case 7 : Synchronized or Stritfp Modifier with method have no effect on rule of overriding, it is possible that a synchronized or stritfp method can override non syn/stritfp method and 	 vice versa.
*/

class MethodOverridingCase7
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

class A extends MethodOverridingCase7
{
	synchronized void show()
	{
	super.show();
	System.out.println("123");
	}
}
	

