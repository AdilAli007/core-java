class DemoPerson {
	public static void main(String args[]) {
	Person obj = new Person();
	Employee obj1 = new Employee();
	obj1.getFirstName();
	obj.getLastName();
	obj1.employeeId();
	obj1.getLastName();
 }
}

class Person {
	public void getFirstName()
	{
	String firstName = "Muhammad Rayyan Khan";
	System.out.println("First Name:"+firstName);
	}
	public void getLastName()
	{
	String lastName = "Jamali";
	System.out.println("Last Name:"+lastName);
	}
}

class Employee extends Person {
	public void employeeId()
	{
	int employeeId = 05;
	System.out.println("Employee Id:"+employeeId);
	}
	public void getLastName()
	{
	String employeeJobTitle = "Managing Director";
	//String lastName = "Jamali";
	//System.out.println("Last Name:"+lastName);
	System.out.println("Jobs Title:"+employeeJobTitle);
	}
}
 