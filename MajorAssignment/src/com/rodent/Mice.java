package com.rodent;

import com.sun.security.jgss.GSSUtil;

public class Mice extends Rodent{

    public void name(){
        System.out.println("Mice are rodent animals");
    }
    public void eat(){
        System.out.println("Mice favourite meal is cheese");
    }

    @Override
    public void nocturnal() {
        System.out.println("Mice are nocturnal animals");
    }

    @Override
    public void chew() {
        System.out.println("Mice chew mostly");
    }

    @Override
    public void size() {
        System.out.println("Mice are small in size");
    }

    @Override
    public void tail() {
        System.out.println("Mice have medium tail");
    }
}
