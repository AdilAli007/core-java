/* Abstraction : Abstraction is detail hiding or implementation hiding and just showing the interfaces to user. We can achieve abstraction through abstract class( 0-100% ) and with 			 interfaces( 100% ).
*/ 

abstract class AbstractVehicle
{
	
	abstract void start();
	void display()
	{
	System.out.println("Car");
	}
	
	public static void main(String args[])
	{
	Car obj = new Car();
	//obj.start();
	//obj1.start();
	//obj.display();
	
	Scooter obj1 = new Scooter();
	obj1.start();
	obj.display();
	obj.start();
	
	}
	
}

class Car extends AbstractVehicle
{
	void start()
	{
	System.out.println("Car starts with key");
	}
	void display()
	{
	System.out.println("Car and Scooter class are created which extends Vehicle");
	}	
}
class Scooter extends AbstractVehicle
{
	void start()
	{
	System.out.println("Scooter start with kick");
	}
}