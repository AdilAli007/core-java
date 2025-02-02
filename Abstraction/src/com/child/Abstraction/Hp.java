package com.child.Abstraction;

import com.parent.Abstraction.Laptop;

public class Hp extends Laptop {
    @Override
    public void maximumPrice() {
        System.out.println("HPs laptop price is 100000 Rupees");
    }
}
