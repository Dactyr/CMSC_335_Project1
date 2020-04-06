/*
Name: Torus.java
Author: Tyler Bell
Date: 29 March
Purpose: To create the Torus shape and extend the ThreeDimensional class.
 */

public class Torus extends ThreeDimensional {

    //class variables
    protected double majRadius;
    protected double minRadius;

    //Setting the major radius of a torus
    public Torus setMajRadius(double majRadius){
        this.majRadius = majRadius;
        onVolumeChange();
        return this;
    }

    //setting the minor radius of a torus
    public Torus setMinRadius(double minRadius){
        this.minRadius = minRadius;
        onVolumeChange();
        return this;
    }

    //Method to do calculations for volume of torus
    public void onVolumeChange(){
        this.volume = 2 * (Math.PI * Math.PI) * majRadius * (minRadius * minRadius);
    }
}
