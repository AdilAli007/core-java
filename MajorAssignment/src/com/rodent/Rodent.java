/*
Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the base class, provide
methods that are common to all Rodents, and override these in the derived classes to perform different
behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with different
specific types of Rodents, and call your base-class methods to see what happens.
 */
package com.rodent;

public class Rodent {

    public void nocturnal(){
        System.out.println("Rodents are nocturnal");
    }
    public void size(){
        System.out.println("Rodents are small in size");
    }
    public void chew(){
        System.out.println("Rodents have habit of chewing continuously");
    }
    public void tail(){
        System.out.println("Rodents have small or large tails");
    }
}

