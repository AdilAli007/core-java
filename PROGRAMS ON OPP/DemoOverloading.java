/* Polymorphism : It means many forms , We can achive polymorphism by methods.
2 Types : Compile Time Polymorphism or Method Overloading , compiler handle it , also known as Static polymorphism
	  Runtime Polymorphism or Method Overriding , jvm handle it , also known as dynamic polymorphism	

Method Overloading : Same name of methods ,methods in Same class , Different Arguments(no of args, sequence of args, type of args)
*/

//Overloading java main method , it is bcz jvm always calls main() method which recieves String array as arg only 

class DemoOverloading 
{
	public static void main(int a)
	{
	System.out.println("2");
	}
	
	public static void main(String args[])
	{
	DemoOverloading t = new DemoOverloading();
	System.out.println("1");
	t.main(10);
	}
}