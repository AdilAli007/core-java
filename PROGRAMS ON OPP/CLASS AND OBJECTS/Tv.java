class Tv {
	
	String name ;
	String color ;
	String modelNumber ;
	double price ;
	
	public static void main(String args[]) {

	Tv samsungTv = new Tv() ;	
	
	samsungTv.name = "SAMSUNG TV ";
	samsungTv.color = "SILVER";
	samsungTv.modelNumber = "SAMSUNG 2021";
	samsungTv.price = 150000;
	
	System.out.println("*********************");
	
	System.out.println("Name : "+samsungTv.name);
	System.out.println("Color : "+samsungTv.color);
	System.out.println("Model Number : "+samsungTv.modelNumber);
	System.out.println("Price: "+samsungTv.price);
	
	System.out.println("*********************");
	
	}
}
	

	