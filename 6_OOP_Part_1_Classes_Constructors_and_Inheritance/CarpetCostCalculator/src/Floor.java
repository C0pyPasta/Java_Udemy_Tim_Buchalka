public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if(width < 0.0) {
            width = 0.0;
        }
        if(length < 0.0) {
            length = 0.0;
        }
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        double area = this.length * this.width;
        return area;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
