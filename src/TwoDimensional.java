/*
Name: TwoDimensional.java
Author: Tyler Bell
Date: 29 March
Purpose: To create the TwoDimensional class that is used as a parent class
for the two dimensional shapes created in the Shape.java class
 */

import java.text.DecimalFormat;

public abstract class TwoDimensional {

    //class variables
    protected double area;

    //method used to get the area for all children classes
    public double getArea(){
        return area;
    }

    //method used to change the area for all children classes
    protected abstract void onAreaChange();

}
