public class Circle {
    //Instance Variable
    private double radius;

    //Constructor (Let op deze heeft een hoofdletter
    public Circle(double radius) {
        if(radius == 0.0) {
            this.radius = 0;
        }
        this.radius = radius;
    }
    //Getter instance method
    public double getRadius() {
        if(this.radius <= 0) {
            return 0.0;
        }
        return radius;
    }

    public double getArea() {
        double calculatedRadius = this.radius * this.radius * Math.PI;
        return calculatedRadius;
    }
}
