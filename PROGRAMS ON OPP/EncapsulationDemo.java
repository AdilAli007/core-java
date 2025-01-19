/* Encapsulation : Mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. It is used for security of data or to control data.
		   We can achieve encapsulation by declaring the variables of a class as private , provide public setter and getter methods to modify and view the variables values. 
*/

class EncapsulationDemo
{
	public static void main(String[] args)
	{
	Demo obj = new Demo();
	obj.setEmpId(101);
	System.out.println(obj.getEmpId());
	}
}
class Demo
{
	private int empId;
	public void setEmpId(int eid)
	{
	empId = eid;
	}
	public int getEmpId()
	{
	return empId;
	}
}