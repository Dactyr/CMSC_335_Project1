public class Cube extends ThreeDimensional {

    private double side;

    public Cube setSide(double side){
        this.side = side;
        onVolumeChange();
        return this;
    }

    public void onVolumeChange(){
        this.volume = this.side * this.side * this.side;
    }
}
