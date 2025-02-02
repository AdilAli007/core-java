package com.child.Abstraction;

import com.parent.Abstraction.Animal;

public class Omnivore  extends Animal {
    @Override
    public void numberOfLegs() {
        System.out.println("Bear has:  Two Legs");
    }
}
