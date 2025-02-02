package com.overriding;

import com.polymorphism.Human;

public class Teacher extends Human {
    @Override
    public void displayName(){
        System.out.println("Name : "+super.getName());
    }
    @Override
    public void displayAge(){
        System.out.println("Age : "+super.getAge());
    }

    @Override
    public void displayEmpNo(){
        System.out.println("EmpNo : "+super.getEmpNo());
    }
}
