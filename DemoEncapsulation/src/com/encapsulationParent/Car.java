package com.encapsulationParent;

public class Car {
    private String name ;
    private String modelNo;
    private double price ;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setModelNo(String modelNo){
        this.modelNo = modelNo;
    }
    public String getModelNo(){
        return modelNo;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
