class DemoAnimal1 {
	public static void main(String args[]) {
	Animal obj = new Animal();
	Cheetah obj1 = new Cheetah();
	//obj.move();
	obj1.move();
 }
}
	

class Animal {
	public void move()
	{
	System.out.println("Cheetah is running");
	}
}
class Cheetah extends Animal {
	public void move()
	{
	System.out.println("Cheetah is running faster");
	}
}