public  class Sphere extends ThreeDimensional{

    protected double radius;

    public Sphere setRadius(double radius){

        this.radius = radius;
        onVolumeChange();
        return this;
    }

    public void onVolumeChange(){
        this.volume = (4.0/3.0) * Math.PI * (this.radius * this.radius * this.radius);
    }
}
