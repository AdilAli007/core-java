package com.encapsulationChild;


import com.encapsulationParent.Car;

public class Test extends Car {
    public void display(){
        super.setName("Civic");
        super.setModelNo("Civic Turbo RS 2021");
        super.setPrice(9300000);
    }
    public void show(){
        System.out.println("Car Name : "+this.getName());
        System.out.println("Model Name : "+this.getModelNo());
        System.out.println("Belt No : "+this.getPrice());
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
        t.show();
    }
}
