package com.rodent;

public class Hamster extends Rodent {
    public void name(){
        System.out.println("Hamster are rodent animals");
    }
    public void eat(){
        System.out.println("Hamster favourite meal is vegetables");
    }
    @Override
    public void nocturnal() {
        System.out.println("Hamster are nocturnal animals");
    }

    @Override
    public void chew() {
        System.out.println("Hamster chew mostly");
    }

    @Override
    public void size() {
        System.out.println("Hamster are small in size");
    }

    @Override
    public void tail() {
        System.out.println("Hamster have medium tail");
    }
}
