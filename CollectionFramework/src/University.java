public class University {
    private String name ;
    private String city ;
    private String address;
    private String vcName ;
    private int totalDepartments ;
    private int totalFaculties ;
    private int totalHostels ;
    private int totalStudents ;
    private int totalTeachers ;
    private int fees ;

    public University(String name, String city, String address, String vcName, int totalDepartments, int totalFaculties, int totalHostels, int totalStudents, int totalTeachers, int fees) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.vcName = vcName;
        this.totalDepartments = totalDepartments;
        this.totalFaculties = totalFaculties;
        this.totalHostels = totalHostels;
        this.totalStudents = totalStudents;
        this.totalTeachers = totalTeachers;
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", vcName='" + vcName + '\'' +
                ", totalDepartments=" + totalDepartments +
                ", totalFaculties=" + totalFaculties +
                ", totalHostels=" + totalHostels +
                ", totalStudents=" + totalStudents +
                ", totalTeachers=" + totalTeachers +
                ", fees=" + fees +
                '}';
    }
}
