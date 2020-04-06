/*
Name: ThreeDimensional.java
Author: Tyler Bell
Date: 29 March
Purpose: To create the ThreeDimensional class that is used as a parent class
for the three dimensional shapes created in the Shape.java class
 */

public abstract class ThreeDimensional {

    //class variables
    protected double volume;

    //method used to get the volume for all children classes
    public double getVolume(){
        return volume;
    }

    //method used to change the volume for all children classes
    protected abstract void onVolumeChange();
}
