class CaseFour
{
	void show(String a , float b)
	{
	System.out.println("String float method");
	}

	void show(int a, float b)
	{
	System.out.println("int float method");
	}
	void show(float a, int b)
	{
	System.out.println("float int method");
	}

	public static void main(String args[])
	{
	CaseFour obj = new CaseFour();
	obj.show(10, 5674.67f);
	obj.show("abc", 20);
	obj.show(20, 10);
	}
}
	