/* Runtime Polymorphism: Dynamic polymorphism , achieves through method overriding

Method Overriding: Same name of methods , present in different class, same arguments(no of args , sequence of args , type of args), Inheritance IS-A relationship

Case 1 : In method overriding we can change methods return type , but the parent class return type should always be the supper class of subclass return type :

class MethodOverridingCase1
{
	Object show()
	{
	System.out.println("1");
	return null;
	}
	
	public static void main(String args[]) 
	{
		MethodOverridingCase1 obj1 = new MethodOverridingCase1();
		obj1.show();
	
		B obj = new B();
		obj.show();
	}

	
}
class B extends MethodOverridingCase1
{
	String show()
	{
	System.out.println("2");
	return null;
	}
}
*/

//Case 2 : The access modifier for an overriding method can allow more, but not less, i.e protected instance method in superclass can be made public but not private in the subclass.
	
class MethodOverridingCase2
{
	protected void show()
	{
	System.out.println("1");
	}
	
	public static void main(String args[]) 
	{
		MethodOverridingCase2 obj1 = new MethodOverridingCase2();
		obj1.show();
	
		B obj = new B();
		obj.show();
	}

	
}
class B extends MethodOverridingCase2
{
	public void show()
	{
	System.out.println("2");
	}
}