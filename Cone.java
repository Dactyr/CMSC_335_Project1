/*
Name: Cone.java
Author: Tyler Bell
Date: 29 March
Purpose: To create the Cone shape and extend the ThreeDimensional class.
 */

public class Cone extends ThreeDimensional{

    //class variables
    protected double radius;
    protected double height;

    //setting the radius of the cone
    public Cone setRadius(double radius){
        this.radius = radius;
        onVolumeChange();
        return this;
    }

    //setting the height of the cone
    public Cone setHeight(double height){
        this.height = height;
        onVolumeChange();
        return this;
    }

    //Method to do calculations for volume of cone
    public void onVolumeChange(){
        this.volume = (1.0/3.0) * Math.PI * radius * radius * height;
    }
}
