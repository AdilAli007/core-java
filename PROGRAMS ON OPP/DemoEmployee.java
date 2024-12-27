class DemoEmployee {
	public static void main(String args[]) {
	Employee obj = new Employee();
	HRManager obj1 = new HRManager();
	obj.work();
	obj.salary();
	obj1.work();
	obj1.salary();
	obj1.addEmployee();
 }
}

class Employee {
	public void work()
	{
	System.out.println("100 workers are working here:");
	}

	public void salary()
	{
	int sal = 30000 ;
	int emploies = 100 ;
	System.out.println("Total Salary of emploies are: "+(sal*emploies));
	}
}

class HRManager {
	public void work()
	{
	System.out.println("100 workers are working here: ");
	}

	public void salary()
	{
	int sal = 30000 ;
	int emploies = 100 ;
	System.out.println("Total Salary of emploies are: "+(sal*emploies));
	}
	
	public void addEmployee()
	{
	System.out.println("Add new employess in company on required positions ");
	}
}