class DemoEmployee1 {
	public static void main(String args[]) {
	Employee obj = new Employee();
	obj.information();
	Manager obj1 = new Manager();
	obj1.information();
	obj1.calculateBonus();
	Developer obj2 = new Developer();
	obj2.information();
	obj2.calculateBonus();
	Programmer obj3 = new Programmer();
	obj3.information();
	obj3.calculateBonus();
	
 }
}
class Employee {
	public void information()
	{
	String name ;
	String city ;
	String jobTitle ;
	double salary ;
	}
	public void calculateBonus()
	{
	double salary = 50000;
	double bonus = 2/100*salary;
	double salaryAfterBonus = bonus + salary;
	}
}
class Manager extends Employee {
	public void information()
	{
	String name = "Farhan" ;
	String city = "Karachi";
	String jobTitle = "Manager";
	double salary = 50000 ;
	System.out.println("Name: "+name);
	System.out.println("City: "+city);
	System.out.println("Job Title: "+jobTitle);
	System.out.println("Salary: "+salary);
	}
	public void calculateBonus()
	{
	double salary = 50000;
	double bonus = (2/100)*salary;
	double salaryAfterBonus = (bonus + salary);
	System.out.println("Salary After Bonus: "+salaryAfterBonus);
	}
}
class Developer extends Employee {
	public void information()
	{
	String name = "Dani" ;
	String city = "Hyd";
	String jobTitle = "Developer";
	double salary = 70000 ;
	System.out.println("Name: "+name);
	System.out.println("City: "+city);
	System.out.println("Job Title: "+jobTitle);
	System.out.println("Salary: "+salary);
	}
	public void calculateBonus()
	{
	double salary = 70000;
	double bonus = 2/100*salary;
	double salaryAfterBonus = bonus + salary;
	System.out.println("Salary After Bonus: "+salaryAfterBonus);
	}
}
class Programmer extends Employee {
	public void information()
	{
	String name = "Mudasir" ;
	String city = "Jamshoro";
	String jobTitle = "Programmer";
	double salary = 60000 ;
	System.out.println("Name: "+name);
	System.out.println("City: "+city);
	System.out.println("Job Title: "+jobTitle);
	System.out.println("Salary: "+salary);
	}
	public void calculateBonus()
	{
	double salary = 60000;
	double bonus = 2/100*salary;
	double salaryAfterBonus = bonus + salary;
	System.out.println("Salary After Bonus: "+salaryAfterBonus);
	}
}
