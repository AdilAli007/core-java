package com.encapsulationChild;

import com.encapsulationParent.University;

public class DemoUniversity extends University {
    public void display(){
        super.setName("IQRA UNIVERSITY");
        super.setCity("Karachi");
        super.setBranches("Multiple branches in Pakistan");
        super.setDepartments(10);
        super.setFeesPerYear(100000);
    }
    public void show(){
        System.out.println("Name : "+this.getName());
        System.out.println("City : "+this.getCity());
        System.out.println("Branches : "+this.getBranches());
        System.out.println("Departments in university"+this.getDepartments());
        System.out.println("Fees per anum :"+this.getFeesPerYear());
    }

    public static void main(String[] args) {
        DemoUniversity obj = new DemoUniversity();
        obj.display();
        obj.show();
    }
}
