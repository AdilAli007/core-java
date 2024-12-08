class Bike {
	
	String name ;
	String color ;
	String modelNumber ;
	double price ;
	
	public static void main(String args[]) {

	Bike yamahaBike = new Bike() ;	
	
	yamahaBike.name = "Yamaha Bike";
	yamahaBike.color = "Red";
	yamahaBike.modelNumber = "Yamahan 125 2021";
	yamahaBike.price = 500000;
	
	System.out.println("*********************");
	
	System.out.println("Name : "+yamahaBike.name);
	System.out.println("Color : "+yamahaBike.color);
	System.out.println("Model Number : "+yamahaBike.modelNumber);
	System.out.println("Price: "+yamahaBike.price);
	
	System.out.println("*********************");
	
	}
}
	

	