/*
Name: Square.java
Author: Tyler Bell
Date: 29 March
Purpose: To create the Square shape and extend the TwoDimensional class.
 */

public class Square extends TwoDimensional {

    //class variables
    protected double side;

    //setting the side of a square
    //since a square has all sides the same length we don't need
    //to ask for height and width
    public Square setSide(double side){
        this.side = side;
        onAreaChange();
        return this;
    }

    //Method to calculate the area of a square
    public void onAreaChange() {
        this.area = this.side * this.side;
    }

}
