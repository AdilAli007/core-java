package com.overriding;

import com.polymorphism.Birds;

public class Parrot extends Birds {
    @Override
    public void displayName(){
        System.out.println("Name : "+super.getName());
    }
    @Override
    public void displayColor(){
        System.out.println("Color : "+super.getColor());
    }
}
