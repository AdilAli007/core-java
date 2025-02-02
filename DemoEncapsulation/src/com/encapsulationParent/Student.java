package com.encapsulationParent;

public class Student {
    private String name ;
    private String city ;
    private String address;
    private String department;
    private int idNumber ;

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
    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }
    public int getIdNumber(){
        return idNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return  department;
    }
}
