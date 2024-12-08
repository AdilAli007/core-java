class Car {
	
	String name ;
	String color ;
	String modelNumber ;
	double price ;
	
	public static void main(String args[]) {

	Car civicCar = new Car() ;	
	
	civicCar.name = "Civic Car";
	civicCar.color = "Maroon";
	civicCar.modelNumber = "Civic Turbo RS 2021";
	civicCar.price = 7000000;
	
	System.out.println("*********************");
	
	System.out.println("Name : "+civicCar.name);
	System.out.println("Color : "+civicCar.color);
	System.out.println("Model Number : "+civicCar.modelNumber);
	System.out.println("Price: "+civicCar.price);
	
	System.out.println("*********************");
	
	}
}
	

	