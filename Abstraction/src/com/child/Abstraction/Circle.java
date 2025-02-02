package com.child.Abstraction;

import com.parent.Abstraction.Shapes;

public class Circle extends Shapes {
    @Override
    public void calculateArea() {
       final double piValue = 3.14;
       double radius = 7 ;
       double areaOfRadiusFormula = piValue * (radius*radius);
        System.out.println("Area of circle: "+areaOfRadiusFormula);
    }
}
