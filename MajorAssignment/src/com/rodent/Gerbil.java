package com.rodent;

public class Gerbil extends Rodent{

    public void name(){
        System.out.println("Gerbil are rodent animals");
    }
    public void eat(){
        System.out.println("Gerbil favourite meal is fruits and vegetables");
    }

    @Override
    public void nocturnal() {
        System.out.println("Gerbil are nocturnal animals");
    }

    @Override
    public void chew() {
        System.out.println("Gerbil chew mostly");
    }

    @Override
    public void size() {
        System.out.println("Gerbil are small in size");
    }

    @Override
    public void tail() {
        System.out.println("Gerbil have medium tail");
    }
}
