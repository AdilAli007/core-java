class DemoAnimal {

	public static void main(String args[]) {
	Animal obj = new Animal();
	Cat obj1 = new Cat();
	obj.makeSound();
	obj1.makeSound();
 }
}

class Animal {
	public void makeSound()
	{
	System.out.println("Cat makes sound meaow mwaow");
	}
}

class Cat extends Animal {
	public void makeSound()
	{
	System.out.println("Cat makes sound meaow meaow meaow");
	}

 }

	