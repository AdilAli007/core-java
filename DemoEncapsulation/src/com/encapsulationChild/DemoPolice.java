package com.encapsulationChild;

import com.encapsulationParent.Police;

public class DemoPolice extends Police {
    public void display(){
        super.setArea("Korangi Area");
        super.setName("Sohail");
        super.setBeltNo(102);
    }
    public void show(){
        System.out.println("Name :"+this.getName());
        System.out.println("Area of Charge : "+this.getArea());
        System.out.println("Belt No : "+this.getBeltNo());
    }

    public static void main(String[] args) {
        DemoPolice obj = new DemoPolice();
        obj.display();
        obj.show();
    }
}
