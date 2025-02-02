import com.encapsulationParent.Hostle;
import com.encapsulationParent.HostleOwner;
import com.encapsulationParent.Student;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hostle Information");

        Hostle obj = new Hostle();
        obj.setName("RJ HOSTLE");
        obj.setCity("Karachi");
        obj.setAddress("Defence view Phase 3");
        obj.setPostalCode(76200);
        obj.setRent(10000);

        System.out.println("Name : "+obj.getName());
        System.out.println("City : "+obj.getCity());
        System.out.println("Address : "+obj.getAddress());
        System.out.println("Postal Code : "+obj.getPostalCode());
        System.out.println("Rent : "+obj.getRent());

        System.out.println("Hostle Owner Information");

        HostleOwner obj1 = new HostleOwner();
        obj1.setName("MR KHAN");
        obj1.setCity("Karachi");
        obj1.setAddress("Defence View Phase 3");
        obj1.setAge(50);
        obj1.setSalary(30000);

        System.out.println("Name : "+obj1.getName());
        System.out.println("City : "+obj1.getCity());
        System.out.println("Age : "+obj1.getAge());
        System.out.println("Salary : "+obj1.getSalary());

        System.out.println("Student Information");

        Student obj2 = new Student();
        obj2.setName("Muhammad Rayyan");
        obj2.setCity("Karachi");
        obj2.setAddress("Gulshan e Iqbal ");
        obj2.setDepartment("Neurology Studies");
        obj2.setIdNumber(102);

        System.out.println("Name : "+obj2.getName());
        System.out.println("City "+obj2.getCity());
        System.out.println("Address : "+obj2.getIdNumber());
        System.out.println("Department : "+obj2.getAddress());
        System.out.println("ID Number : "+obj2.getDepartment());





    }
    }
