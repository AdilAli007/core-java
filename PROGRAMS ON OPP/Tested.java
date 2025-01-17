/* Method Overloading Case 1 : Automatic Promotion

class Tested 
{
	void show(int a)
	{
	System.out.println("int method");
	}
	void show(String a)
	{
	System.out.println("String method");
	}
	
	public static void main(String args[])
	{
	Tested t = new Tested();
	t.show('a');
	t.show(10);
	t.show("abc");
	}
}


