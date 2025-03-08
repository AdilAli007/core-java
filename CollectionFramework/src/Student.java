public class Student {
    private String name ;
    private String caste ;
    private String city ;
    private String address ;
    private String university ;
    private String department ;
    private int rollNumber ;
    private int age ;
    private double fees ;
    private int totalSemesters ;

    public Student(String name, String caste, String city, String address, String university, String department, int rollNumber, int age, double fees, int totalSemesters) {
        this.name = name;
        this.caste = caste;
        this.city = city;
        this.address = address;
        this.university = university;
        this.department = department;
        this.rollNumber = rollNumber;
        this.age = age;
        this.fees = fees;
        this.totalSemesters = totalSemesters;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", caste='" + caste + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", university='" + university + '\'' +
                ", department='" + department + '\'' +
                ", rollNumber=" + rollNumber +
                ", age=" + age +
                ", fees=" + fees +
                ", totalSemesters=" + totalSemesters +
                '}';
    }
}
