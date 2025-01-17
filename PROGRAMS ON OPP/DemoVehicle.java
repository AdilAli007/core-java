class DemoVehicle {

	public static void main(String args[]) {
	Vehicle obj = new Vehicle();
	//Car obj1 = new Car();
	obj.drive();
	//obj1.drive();
 }
}

class Vehicle {
	public void drive()
	{
	System.out.println("Car is repairing");
	}
}

class Car extends Vehicle {
	public void drive()
	{
	System.out.println("Car is repaired");
	}

 }

	