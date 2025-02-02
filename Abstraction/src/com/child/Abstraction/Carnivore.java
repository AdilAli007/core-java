package com.child.Abstraction;

import com.parent.Abstraction.Animal;

public class Carnivore extends Animal {
    @Override
    public void numberOfLegs() {
        System.out.println("Leopards has:  Four Legs");
    }
}
