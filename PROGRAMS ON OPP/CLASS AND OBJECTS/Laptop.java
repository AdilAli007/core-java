class Laptop {
	
	String name ;
	String color ;
	String modelNumber ;
	double price ;
	
	public static void main(String args[]) {

	Laptop hpLaptop = new Laptop() ;	
	
	hpLaptop.name = "HP LAPTOP";
	hpLaptop.color = "SILVER";
	hpLaptop.modelNumber = "HP TOUCH 2021";
	hpLaptop.price = 100000;
	
	System.out.println("*********************");
	
	System.out.println("Name : "+hpLaptop.name);
	System.out.println("Color : "+hpLaptop.color);
	System.out.println("Model Number : "+hpLaptop.modelNumber);
	System.out.println("Price: "+hpLaptop.price);
	
	System.out.println("*********************");
	
	}
}
	

	