public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height == 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume(){
        double volume = this.height * this.getArea();
        return volume;
    }

}
