/* Runtime Polymorphism: Dynamic polymorphism , achieves through method overriding
Method Overriding: Same name of methods , present in different class, same arguments(no of args , sequence of args , type of args), Inheritance IS-A relationship
Case 1 : In method overriding we can change methods return type , but the parent class return type should always be the supper class of subclass return type :
*/

class MethodOverridingCase1
{
	void show(int a)
	{
	System.out.println("1");
	}
	
	public static void main(String args[]) 
	{
		B obj1 = new B();
		obj.show(10);
	}

	
}
class B extends MethodOverridingCase1
{
	void show(int a)
	{
	System.out.println("2");
	}
}
	
