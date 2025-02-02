package com.child.Abstraction;

import com.parent.Abstraction.Laptop;

public class Dell extends Laptop {
    @Override
    public void maximumPrice() {
        System.out.println("Dells laptop price is 50000 Rupees");
    }
}
