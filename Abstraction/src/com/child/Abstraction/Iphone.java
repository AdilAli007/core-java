package com.child.Abstraction;

import com.parent.Abstraction.Mobile;

public class Iphone extends Mobile {
    @Override
    public void maximumRam() {
        System.out.println("Iphone Mobiles RAMs ranges from 32,64,128,256 Gbs");
    }
}
