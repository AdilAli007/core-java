package com.child.Abstraction;

import com.parent.Abstraction.Shapes;

public class Square extends Shapes {

    @Override
    public void calculateArea() {
    int area = 5 ;
    int  areaOfSquareFormula = area*area;
    System.out.println("Area of square: "+areaOfSquareFormula );
    }
}
