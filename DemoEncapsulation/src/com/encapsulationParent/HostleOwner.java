package com.encapsulationParent;

public class HostleOwner{
    private String name;
    private String city;
    private int age;
    private double salary;
    private String address;

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
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
}