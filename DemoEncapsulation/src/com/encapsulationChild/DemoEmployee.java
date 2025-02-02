package com.encapsulationChild;

import com.encapsulationParent.Employee;

public class DemoEmployee extends Employee {
    public void display(){
        super.setName("Muhammad Ali");
        super.setCity("Karachi");
        super.setEmpId(101);
        super.setJobTitle("Radiologist");
        super.setSalary(100000);
    }
    public void show(){
        System.out.println("Name : "+this.getName());
        System.out.println("City : "+this.getCity());
        System.out.println("Emp Id : "+this.getEmpId());
        System.out.println("Job Title : "+this.getJobTitle());
        System.out.println("Salary : "+this.getSalary());
    }

    public static void main(String[] args) {
        DemoEmployee obj = new DemoEmployee();
        obj.display();
        obj.show();

    }
}
