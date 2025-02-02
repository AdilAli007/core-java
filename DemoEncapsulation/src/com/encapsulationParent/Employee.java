package com.encapsulationParent;

public class Employee {
    private String name ;
    private String city ;
    private String jobTitle ;
    private int empId ;
    private double salary ;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getEmpId(){
        return empId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
