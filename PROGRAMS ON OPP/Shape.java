class Shape {

	public static void main(String args[]) {
	Rectangle obj = new Rectangle();
	DemoShape obj1 = new DemoShape();
	obj.getArea();
	obj1.getArea();
 }
}

class Rectangle {
	public void getArea()
	{
	int length = 5;
	int breadth = 6;
	int width = 7;
	System.out.println(length*breadth*width);
	}
}

class DemoShape extends Rectangle {
	public void getArea()
	{
	int length = 5;
	int breadth = 6;
	int width = 7;
	System.out.println("Total length : "+(length*breadth*width));
	}

 }

	