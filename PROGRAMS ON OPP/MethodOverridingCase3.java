/* Case 3 : If parent class overridden method doenn not throws an exception , subclass overriding method can only throws the unchecked exception , throwing checked exception will lead to 	    compile time error.
*/
class MethodOverridingCase3 
{
	void show()
	{
	System.out.println("1");
	}
	
	public static void main(String args[])
	{
	MethodOverridingCase3 obj = new MethodOverridingCase3();
	obj.show();

	B obj1 = new B();
	obj1.show();
	}

}

class A extends MethodOverridingCase3 
{
	void show() throws ArithmeticException
	{
	System.out.println("2");
	}
}