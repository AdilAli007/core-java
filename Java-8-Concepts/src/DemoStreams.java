
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoStreams {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Adil","Saqlain","Haji","Shahryar","Sanaullah");
        List<Integer> numbersList = Arrays.asList(10,9,8,7,1,2,3,4,11,12,13,15);

        stringList.stream().sorted().forEach(string -> System.out.println("Sorted Strings: "+string));
        stringList.stream().filter(string -> string.length() > 5).forEach(string -> System.out.println("Strings with length greater than 5 : "+string));
        stringList.stream().filter(string -> string.contains("a")).forEach(string -> System.out.println("Strings that contains 'a' character : "+string));
        stringList.stream().filter(string -> string.length() < 5).forEach(string -> System.out.println("Strings with less than 5 : "+string));
        stringList.stream().filter(string -> string.length() % 2 == 0).forEach(string -> System.out.println("String with positive length : "+string));

        List<String> sortedList = stringList.stream().sorted().toList();
        System.out.println("Sorted String List: "+sortedList);

        numbersList.stream().sorted().forEach(n -> System.out.println("Sorted Numbers: "+n));
        numbersList.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println("Even Numbers: "+n));
        numbersList.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.println("Odd Numbers: "+n));
        numbersList.stream().filter(n -> n < 5).forEach(n -> System.out.println("Numbers less than 5: "+n));
        numbersList.stream().filter(n -> n > 10).forEach(n -> System.out.println("Numbers greater than 10: "+n));

        List<Integer> sorted = numbersList.stream().sorted().toList();
        System.out.println("Sorted Number List: "+sorted);

        List<Student> studentList = new ArrayList<>();
        Student student = new Student(4,"ADIL","KHI");
        Student student1 = new Student(1,"AAMIR","DADU");
        Student student2 = new Student(2,"YASIR","TURKEY");
        Student student3 = new Student(3,"ADNAN","KHI");
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        studentList.forEach(s-> System.out.println("Students: "+s));

        studentList.stream().sorted((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).forEach(s-> System.out.println("Sorted Students According To Id: "+s));
        studentList.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(s-> System.out.println("Sorted Students According To Name: "+s));
        studentList.stream().sorted((o1, o2) -> o1.getCity().compareTo(o2.getCity())).forEach(s-> System.out.println("Sorted Students According To City: "+s));
        studentList.stream().filter(s-> s.getId() > 2).forEach(s-> System.out.println("Students with ID > 2: "+s));
        studentList.stream().filter(s-> s.getId() < 2).forEach(s-> System.out.println("Students with ID < 2: "+s));

        List<Student> studentsSorted = studentList.stream().sorted(((o1, o2) -> o1.getName().compareTo(o2.getName()))).toList();
        System.out.println("Sorted Student List: "+studentsSorted);

        List<Employee> employees = new ArrayList<>();
        Employee object = new Employee(101,"TALHA","JACOMABAD",20000);
        Employee object1 = new Employee(20,"AHMED","LARKANA",30000);
        Employee object2 = new Employee(130,"JOSEPH","KARACHI",40000);
        employees.add(object);
        employees.add(object1);
        employees.add(object2);

        employees.
                stream().
                sorted(((o1, o2) -> Integer.compare(o1.getId(), o2.getId()))).
                forEach(employee -> System.out.println("Employees Sorted According To Id: " +employee));

        employees.
                stream().
                sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).
                forEach(employee -> System.out.println("Employees Sorted Acording To Name: "+employee));

        employees.
                stream().
                sorted((o1, o2) -> o1.getCity().compareTo(o2.getCity())).
                forEach(employee -> System.out.println("Employees Sorted According To City: "+employee));

        employees.
                stream().
                sorted((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())).
                forEach(employee -> System.out.println("Employees Sorted According To Salary: "+employee));

        employees.
                stream().
                filter(employee -> employee.getSalary() > 10000).
                forEach(employee -> System.out.println("Employee with salary > 10000: "+employee));

        employees.
                stream().
                filter(employee -> employee.getName().contains("AHMED")).
                forEach(employee -> System.out.println("Employee with name AHMED: "+employee));

        employees.
                stream().
                filter(employee -> employee.getCity().length() > 6).
                forEach(employee -> System.out.println("Employee with city names with more than 6 characters: "+employee));

        }
}
