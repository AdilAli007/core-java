package com.parent.Abstraction;

public abstract class Laptop {
    private String name ;
    private String model ;

    public abstract void maximumPrice();

    public void setName(String name){
        this.name = name ;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void show (){
        System.out.println("Name: "+this.name);
        System.out.println("Model: "+this.model);
    }
}
