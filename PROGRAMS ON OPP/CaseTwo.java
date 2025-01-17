/*
Method Overloading Case 2 : Automatic Promotion
Object is the parent class of all classes in java
Compiler always give precedence to child type argument then compared with parent type


class CaseTwo
{
	void show(Object a)
	{
	System.out.println("Object method");
	}
	void show(String a)
	{
	System.out.println("String method");
	}
	public static void main(String args[])
	{
	CaseTwo obj = new CaseTwo();
	obj.show('a');	
	obj.show("abcd");
	}
}

*/

class CaseThree 
{
	void show(StringBuffer a)
	{
	System.out.println("object method");
	}
	void show(String a)
	{
	System.out.println("string method");
	}
	public static void main(String args[])
	{
	CaseThree obj = new CaseThree();
	obj.show("abc");
	obj.show(new StringBuffer("xyz");
	obj.show(null);
	}
}