class DemoVehicle2 {
	public static void main(String args[]){
	Vehicle obj = new Vehicle();
	obj.basicInformation();
	
	Car obj1 = new Car();
	obj1.basicInformation();
	obj1.maxSpeed();
	obj1.calculateSpeed();
	obj1.distanceCovered();
	
	Truck obj2 = new Truck();
	obj2.basicInformation();
	obj2.maxSpeed();
	obj2.calculateSpeed();
	obj2.distanceCovered();
	
	Bike obj3 = new Bike();
	obj3.basicInformation();
	obj3.maxSpeed();
	obj3.calculateSpeed();
	obj3.distanceCovered();
 }
}

class Vehicle {
	public void basicInformation()
	{
	String vehicleName ;
	int vehicleModel ;
	String vehicleColor;
	String vehicleWheels;
	}
}
class Car extends Vehicle {
	public void basicInformation()
	{
	String vehicleName = "Civic" ;
	int vehicleModel = 2022 ;
	String vehicleColor = "BLACK";
	String vehicleWheels = "FOUR" ;
	System.out.println("Vehicle Name: "+vehicleName);
	System.out.println("Vehicle Model: "+vehicleModel);
	System.out.println("Vehicle Color: "+vehicleColor);
	System.out.println("Vehicle Wheels: "+vehicleWheels);
	}
	public void maxSpeed()
	{
	String maxSpeed = "240km/h";
	System.out.println("Maximun Speed of Car: "+maxSpeed);
	}
	public void calculateSpeed()
	{
	int distance = 200;
	int time = 2;
	System.out.println("Speed is: "+(distance/time));
	}
	public void distanceCovered()
	{
	int speed = 220;
	int time = 2;
	System.out.println("Distance covered is: "+(speed*time));
	}
	
}
class Truck extends Vehicle {
	public void basicInformation()
	{
	String vehicleName = "Hino Master Rocket" ;
	int vehicleModel = 2000 ;
	String vehicleColor = "BLACK";
	String vehicleWheels = "EIGHT" ;
	System.out.println("Vehicle Name: "+vehicleName);
	System.out.println("Vehicle Model: "+vehicleModel);
	System.out.println("Vehicle Color: "+vehicleColor);
	System.out.println("Vehicle Wheels: "+vehicleWheels);
	}
	public void maxSpeed()
	{
	String maxSpeed = "100km/h";
	System.out.println("Maximun Speed of Truck: "+maxSpeed);
	}
	public void calculateSpeed()
	{
	int distance = 100;
	int time = 2;
	System.out.println("Speed is: "+(distance/time));
	}
	public void distanceCovered()
	{
	int speed = 120;
	int time = 2;
	System.out.println("Distance covered is: "+(speed*time));
	}
}
class Bike extends Vehicle {
	public void basicInformation()
	{
	String vehicleName = "Honda" ;
	int vehicleModel = 2024 ;
	String vehicleColor = "BLACK";
	String vehicleWheels = "TWO" ;
	System.out.println("Vehicle Name: "+vehicleName);
	System.out.println("Vehicle Model: "+vehicleModel);
	System.out.println("Vehicle Color: "+vehicleColor);
	System.out.println("Vehicle Wheels: "+vehicleWheels);
	}
	public void maxSpeed()
	{
	String maxSpeed = "110km/h";
	System.out.println("Maximun Speed of Bike: "+maxSpeed);
	}
	public void calculateSpeed()
	{
	int distance = 120;
	int time = 2;
	System.out.println("Speed is: "+(distance/time));
	}
	public void distanceCovered()
	{
	int speed = 90;
	int time = 2;
	System.out.println("Distance covered is: "+(speed*time));
	}
}