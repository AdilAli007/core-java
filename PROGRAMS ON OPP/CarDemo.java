// Relationship are of two types : IS-A ( Inheritance ) , HAS-A (Association);
// Association is commonly used relationship, it achieves automatic and also with new keyword;
// Association is of two types Aggregation(Weak Bonding), Composition(Strong Bonding);

class CarDemo
{
	public static void main(String args[])
 {
	Engine e1 = new Engine();
	e1.showB();
 }
}
class Engine 		// Car HAS-A engine , HAS-A relationship
{
	void showB()
	{
	System.out.println("Engine class");
	}
}