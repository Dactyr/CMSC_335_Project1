/*
Name: Rectangle.java
Author: Tyler Bell
Date: 29 March
Purpose: To create the Rectangle shape and extend the TwoDimensional class.
 */

public class Rectangle extends TwoDimensional {

    //class variables
    protected double height;
    protected double width;

    //setting the height of a rectangle
    public Rectangle setHeight(double height){
        this.height = height;
        onAreaChange();
        return this;
    }

    //setting the width of a rectangle
    public Rectangle setWidth(double width){
        this.width = width;
        onAreaChange();
        return this;
    }

    //Method to calculate the area of a rectangle
    public void onAreaChange() {
        this.area = this.height * this.width;
    }

}
