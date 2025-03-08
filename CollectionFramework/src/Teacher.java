public class Teacher {
    private String name ;
    private String caste ;
    private String city ;
    private String address ;
    private String subject ;
    private String experience ;
    private double salary ;
    private int age ;
    private int id ;
    private String department ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", caste='" + caste + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", subject='" + subject + '\'' +
                ", experience='" + experience + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", id=" + id +
                ", department='" + department + '\'' +
                '}';
    }
}

