package com.parent.Abstraction;

public abstract class Mobile {
    private String name ;
    private String color ;

    public abstract void maximumRam();

    public void setName(String name){
        this.name = name ;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void show (){
        System.out.println("Name: "+this.name);
        System.out.println("Color: "+this.color);
    }
}
