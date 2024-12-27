class DemoShape1 {
	public static void main(String args[]) {
	Shape obj = new Shape();
	Circle obj1 = new Circle();
	obj.getPerimeter();
	obj.getArea();
	obj1.getPerimeter();
	obj1.getArea();
 }
}

class Shape {
	public void getPerimeter()
	{
	System.out.println("Enter values to find Perimeter of Circle");
	}
	public void getArea()
	{
	System.out.println("Enter values to find Area of Circle");
	}
}
class Circle extends Shape {
	public void getPerimeter()
	{
	double lamda = 3.14;
	double radius = 3;
	System.out.println("Perimeter of Circle is: "+(2*lamda*radius));
	}
	public void getArea()
	{
	double lamda = 3.14;
	double radius = 5;
	System.out.println("Area of Circle is: "+(lamda*radius));
	}
}
	
	