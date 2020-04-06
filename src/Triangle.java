/*
Name: Triangle.java
Author: Tyler Bell
Date: 29 March
Purpose: To create the Triangle shape and extend the TwoDimensional class.
 */

public class Triangle extends TwoDimensional{

    //class variables
    protected double base;
    protected double height;

    //setting the base of a triangle
    public Triangle setBase(double base) {
        this.base = base;
        onAreaChange();
        return this;
    }

    //setting the height of a triangle
    public Triangle setHeight(double height) {
        this.height = height;
        onAreaChange();
        return this;
    }

    //Method to calculate the area of a triangle
    public void onAreaChange(){
        this.area = 0.5 * this.base * this.height;
    }
}
