package com.child.Abstraction;

import com.parent.Abstraction.Shapes;

public class Triangle extends Shapes {

    @Override
    public void calculateArea() {
        double breadth = 3;
        double height = 4 ;
        final double halfValue  = 1/2 ;
        double areaOfTriangleFormula = halfValue * breadth * height;
        System.out.println("Area of triangle: "+areaOfTriangleFormula);
    }
}
