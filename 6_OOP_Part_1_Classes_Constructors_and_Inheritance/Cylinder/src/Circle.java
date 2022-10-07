public class Circle {
    private double radius;

    public Circle(double radius) {
        if(radius == 0.0) {
            this.radius = 0;
        }
        this.radius = radius;
    }

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
