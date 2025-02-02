package com.child.Abstraction;

import com.parent.Abstraction.Mobile;

public class Samsung extends Mobile {
    @Override
    public void maximumRam() {
        System.out.println("Samsung Mobiles RAMs ranges from 32,64,128,256 Gbs");
    }
}
