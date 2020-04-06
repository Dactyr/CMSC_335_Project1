/*
Name: Cylinder.java
Author: Tyler Bell
Date: 29 March
Purpose: To create the cylinder shape and extend the ThreeDimensional class.
 */

public class Cylinder extends ThreeDimensional {

    //class variables
    protected double radius;
    protected double height;

    //setting radius
    public Cylinder setRadius(double radius){
        this.radius = radius;
        onVolumeChange();
        return this;
    }

    //setting height
    public Cylinder setHeight(double height){
        this.height = height;
        onVolumeChange();
        return this;
    }

    //Method to do calculations for volume of cylinder
    public void onVolumeChange(){
        this.volume = Math.PI * this.radius * this.radius * this.height;
    }
}

