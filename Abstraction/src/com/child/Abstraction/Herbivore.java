package com.child.Abstraction;

import com.parent.Abstraction.Animal;

public class Herbivore extends Animal {

    @Override
    public void numberOfLegs() {
        System.out.println("Rabbit Has:  Four Legs");
    }
}
