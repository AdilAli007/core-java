package com.child.Abstraction;

import com.parent.Abstraction.Mobile;

public class Vivo extends Mobile {
    @Override
    public void maximumRam() {
        System.out.println("Vivo Mobiles RAMs ranges from 32,64,128,256 Gbs");
    }
}
