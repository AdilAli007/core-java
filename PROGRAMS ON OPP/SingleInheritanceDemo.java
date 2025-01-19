// Inheritance : It is known as inheriting properties of parent class into child class. Inheritance means IS-A relationship .

class SingleInheritanceDemo
{
	public static void main(String args[])
 {
	Room obj1 = new Room();
	Window obj2 = new Window();
	Door obj3 = new Door();
	Lock obj4 = new Lock();
	obj1.showA();
	obj2.showA();
	obj2.showB();
	obj3.showC();
	obj3.showA();
	obj4.showD();
	obj4.showC();
 }
}

class Room
{
	void showA()
	{
	System.out.println("A method");
	}
}

class Window extends Room 		// Single level Inheritance means parent have only one child class 
{
	void showB()
	{
	System.out.println("B method");
	}
}

class Door extends Room			// Hierarchical Inheritance means one parent class have multiple child classes
{
	void showC()
	{
	System.out.println("C method");
	}
}
class Lock extends Door			// Multilevel Inheritance means every child class have one parent class
{

	void showD()
	{
	System.out.println("D method");
	}
}