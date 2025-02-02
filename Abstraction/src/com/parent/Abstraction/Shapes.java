package com.parent.Abstraction;

public abstract class Shapes {
    private String name ;
    private String totalSides ;

    public abstract void calculateArea();

    public void setName(String name){
        this.name = name ;
    }
    public void setTotalSides(String totalSides){
        this.totalSides = totalSides;
    }
    public void show (){
        System.out.println("Name: "+this.name);
        System.out.println("Total Sides: "+this.totalSides);
    }


}
