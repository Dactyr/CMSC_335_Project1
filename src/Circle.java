/*
Name: Circle.java
Author: Tyler Bell
Date: 29 March
Purpose: To create the Circle shape and extend the TwoDimensional class.
 */
import java.text.DecimalFormat;

public class Circle extends TwoDimensional {

    //class variables
    protected double radius;


    //setting the radius of a circle
    public Circle setRadius(double radius){
        this.radius = radius;
        onAreaChange();
        return this;
    }

    //Method to do the calculations of a circle
    public void onAreaChange() {
        this.area = this.radius * this.radius * Math.PI;
    }
}
