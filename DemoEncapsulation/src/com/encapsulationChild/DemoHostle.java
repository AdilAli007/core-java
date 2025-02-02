package com.encapsulationChild;

import com.encapsulationParent.Hostle;

public class DemoHostle extends Hostle {
    public void display(){
        super.setName(" RJ HOSTLE");
        super.setCity("KHI");
        super.setAddress("Defence view phase 3");
        super.setPostalCode(7600);
        super.setRent(10000);
    }
    public void show(){
        System.out.println("Name of Hostle : "+this.getName());
        System.out.println("City : "+this.getCity());
        System.out.println("Address : "+this.getAddress());
        System.out.println("Postal code of area : "+this.getPostalCode());
        System.out.println("Rent per month : "+this.getRent());
    }

    public static void main(String[] args) {
        DemoHostle obj = new DemoHostle();
        obj.display();
        obj.show();
    }
}
