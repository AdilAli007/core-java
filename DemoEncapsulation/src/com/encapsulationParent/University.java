package com.encapsulationParent;

public class University {
    private String name ;
    private String city ;
    private String branches ;
    private int departments ;
    private double feesPerYear ;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public void setBranches(String branches){
        this.branches=branches;
    }
    public String getBranches(){
        return branches;
    }
    public void setDepartments(int departments){
        this.departments=departments;
    }
    public int getDepartments(){
        return departments;
    }
    public void setFeesPerYear(double feesPerYear){
        this.feesPerYear=feesPerYear;
    }
    public double getFeesPerYear(){
        return feesPerYear;
    }
}
