package com.child.Abstraction;

import com.parent.Abstraction.Laptop;

public class MacBook extends Laptop {
    @Override
    public void maximumPrice() {
        System.out.println("MacBooks laptop price is 500000 Rupees");
    }
}
